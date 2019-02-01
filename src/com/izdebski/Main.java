package com.izdebski;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        execute(() -> {
                    System.out.println("Corvette class");
                });

        consume(System.out::println, "Corvette class");
    }

    private static void execute(Runnable runnable){
        System.out.println("Start runner");
        runnable.run();
        System.out.println("End runner");
    }

    private static <String> void consume(Consumer<String> consumer, String out){
        System.out.println("Start consume");
        consumer.accept(out);
        System.out.println("End runner");
    }
}