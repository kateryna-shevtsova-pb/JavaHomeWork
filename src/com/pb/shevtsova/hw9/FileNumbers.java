package com.pb.shevtsova.hw9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;


public class FileNumbers {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("files/numbers.txt");
        Path path1 = Paths.get("files/odd-numbers.txt");

        try {
            createNumbersFile(path);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error with file1 write: " + e);
        }

        try {
            createOddNumbersFile(path, path1);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error with file2 write: " + e);
        }


    }

    public FileNumbers() throws IOException {
    }

    public static void createNumbersFile(Path path) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(path);
        int l;
        int n = 99;
        Random random = new Random();
        while (n >= 0) {
            l = (int) (Math.random() * 100);
            writer.write(l + " ");
            if (n % 10 == 0) {
                writer.newLine();
            }
            n--;
        }
        writer.close();
    }

    public static void createOddNumbersFile(Path path, Path path1) throws IOException {
        BufferedReader reader = Files.newBufferedReader(path);
        BufferedWriter writer1 = Files.newBufferedWriter(path1);
        System.out.println("----------------------------------");
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            int[] numArr = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < 10; i++) {
                if (numArr[i]%2  == 0) {
                    numArr[i] = 0;
                }
                writer1.write(numArr[i] + " ");
                if (i == 9) {
                    writer1.newLine();
                }

            }
            System.out.println("----------------------------------");
        }
        writer1.close();
    }
}
