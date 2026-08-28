package BitManupulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SqaureWritter {
    public static void main(String[] args) {
        String fileName = "/BitManupulation/squares.txt";

        // Try-with-resources ensures the writer is automatically closed and flushed
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (long i = 1; i <= 1_000_000; i++) {
                long square = i * i;
                writer.write(i + " ^ 2 = " + square);
                writer.newLine();
            }
            System.out.println("Finished! File saved as " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing the file: " + e.getMessage());
        }
    }
}
