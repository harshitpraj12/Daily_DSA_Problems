package BitManupulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TableWriting {
    public static void main(String[] args) {
        String file = "D:/Java/BitManupulation/Table.txt";
        
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(file))){
            long t1 = System.currentTimeMillis();
            bf.write("TABLE FROM 1 to 10_000_000");
            bf.newLine();
            for(long i=1; i<=10_000_000; i++){
                bf.write("Table of "+ i + " = ");
                for(int j=1; j<=10; j++){
                    long a = i*j;
                    bf.write(a+", ");
                }
                bf.newLine();
            }
            long t2 = System.currentTimeMillis();
            System.out.println("File saved on loccation "+ file);
            System.out.println("Total time taken "+ (t2-t1)/1000+ " second");
            Path path = Paths.get("D:/Java/BitManupulation/Table.txt");
            try{
                long size = Files.size(path);
                System.out.printf("Size in MB: %.2f MB%n", size / (1024.0 * 1024.0));
            }catch(IOException e){
                System.out.println("File not found "+ e.getMessage());
            }
        }catch(IOException e){
            System.out.println("Some error occurs : "+ e.getMessage());
        }
    }
}
