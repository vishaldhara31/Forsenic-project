package forensic;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter file name to analyze: ");
        String fileName = sc.nextLine();

        try {
            // File handling
            File file = new File(fileName);

            // Writing output to file
            FileWriter writer = new FileWriter("forensic_report.txt");

            writer.write("Digital Forensics Toolkit Report\n");
            writer.write("File Name: " + file.getName() + "\n");
            writer.write("File Path: " + file.getAbsolutePath() + "\n");

            System.out.println("Output written to forensic_report.txt");

            writer.close();
        } catch (Exception e) {
            System.out.println("Error in file operation");
        }

        sc.close();
    }
}
