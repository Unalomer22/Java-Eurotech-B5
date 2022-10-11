package Day64_Collections_List;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadingScanner {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Employee\\Data.txt");

        FileReader fileRead = new FileReader(file.getPath());

        //Reading file line by line with scanner
        FileInputStream fis=new FileInputStream(file.getPath());
        Scanner sc=new Scanner(fis);    //file to be scanned
        //returns true if there is another line to read

        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());      //returns the line that was skipped
        }
        sc.close();
        fileRead.close();
    }

}
