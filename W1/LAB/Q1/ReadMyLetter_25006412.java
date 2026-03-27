package W1.LAB.Q1;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadMyLetter_25006412 {
    public static void main (String [] args){
        try{
            System.out.println("Pls enter second part here & enter DONE to stop: ");
            Scanner input = new Scanner (System.in);
            FileWriter fw = new FileWriter(new File("W1/LAB/Q1/JunBin_25006412.txt"),true);
            PrintWriter output = new PrintWriter(fw);
            while (true){
                String line = input.nextLine();
                if (line.equalsIgnoreCase("DONE")){
                    break;
                }
                output.println(line);
            }
            output.close();
            input.close();
        }catch (IOException e) {
            System.out.println("Error: Could not write to the file.");
            e.printStackTrace();
        }
            
        try{
            Scanner in = new Scanner (new File ("W1/LAB/Q1/JunBin_25006412.txt"));
            while (in.hasNextLine()){
                System.out.println(in.nextLine());
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found!");
            e.printStackTrace();
        }
    }
}