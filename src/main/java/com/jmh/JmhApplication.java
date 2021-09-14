package com.jmh;

import java.io.IOException;

import org.openjdk.jmh.annotations.Benchmark;

public class JmhApplication {

    @Benchmark
    public void init() {
        // Do nothing
    }

    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
    }
}
