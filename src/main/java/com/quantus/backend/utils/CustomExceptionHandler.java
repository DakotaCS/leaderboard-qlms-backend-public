package com.quantus.backend.utils;

/**
 * @author Dakota Soares
 * @version 2024.1
 * @since 2024-08-02
 */
public class CustomExceptionHandler extends RuntimeException {

        public CustomExceptionHandler(String message) {
            super(message);
        }

        public CustomExceptionHandler() {
            this("An Internal Server Exception has occurred.");
        }
}