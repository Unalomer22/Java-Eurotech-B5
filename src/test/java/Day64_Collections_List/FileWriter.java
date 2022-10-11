package Day64_Collections_List;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {

    public static void main(String[] args) throws IOException {
        //Directory daha önce oluşturulmamışsa önce directory oluşturulur.

        File file = new File("C:\\Employee");

        if(!file.exists()) {
            System.out.println("Creating folder...");
            file.mkdir();
        }
        //Directory oluşturulduktan sonra file oluşturulur.
        file = new File("C:\\Employee\\Data.html");

        if(!file.exists()) {
            System.out.println("Creating file...");
            if(file.createNewFile()) {
                System.out.println("Succesfully created file.");
            } else{
                System.out.println("Failed to create file");
            }
        }
        System.out.println("file.getPath() = " + file.getPath()); //full path and file name
        System.out.println("file.getName() = " + file.getName()); //just file name.

        // PrintWriter printWriter = new PrintWriter("C:\\Employee\\Data123.html");

        System.out.println(file.length());
        PrintWriter printWriter = new PrintWriter(file.getPath());


        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");

        printWriter.println("<h1>Bu bir html texttir. </h1>");
        printWriter.println("<p>Bu bir html texttir. </p>");
        printWriter.println("<p>Bu bir html texttir. </p>");
        printWriter.println("<h2>Bu bir html texttir. </h2>");
        printWriter.println("</html>");

        printWriter.close();
        System.out.println("Total size of " + file.getName() + " is " + file.length() + " in bytes.");

    }

}
