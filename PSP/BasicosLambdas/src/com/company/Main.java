package com.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        IntStream.rangeClosed(1,1000)
                .filter(x -> x % 2 == 0 && x % 3 == 0)
    }
}
