package edu.realemj.Exercises19;

import java.io.*;

public class FileIOExample {
    public static void main(String [] args) {
        try {
            String filename = "test.dat";
            try (
                    FileOutputStream output = new FileOutputStream(filename);
                    )
            {
                for(int i = 0; i <= 10; i++) {
                    output.write(i);
                }
            }

            try (
                    FileOutputStream output
                            = new FileOutputStream(filename, true);
            )
            {
                for(int i = 11; i <= 16; i++) {
                    output.write(i);
                }
            }

            try (
                    FileInputStream input = new FileInputStream(filename);
                    )
            {
                int value = input.read();
                while(value != -1) {
                    System.out.println(value);
                    value = input.read();
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
