/*
 * Copyright 2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.saiyan.dlock.utils;

/**
 * A Runnable-like interface which allows throwing any Throwable.
 * Checked exceptions are wrapped in an IllegalStateException.
 *
 * @param <E> the throwable type.
 * @author Artem Bilan
 * @since 6.2
 */
@FunctionalInterface
public interface CheckedRunnable<E extends Throwable> {

    void run() throws E;

    default Runnable unchecked() {
        return () -> {
            try {
                run();
            } catch (Throwable t) {
                if (t instanceof RuntimeException) {
                    throw new RuntimeException(t);
                } else if (t instanceof Error) {
                    throw new Error(t);
                } else {
                    throw new IllegalStateException(t);
                }
            }
        };
    }

}
