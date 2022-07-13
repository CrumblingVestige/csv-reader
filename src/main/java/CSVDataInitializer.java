package main.java;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVDataInitializer {
    public static ArrayList<String> getCSVasArray() {
        ArrayList<String> data = new ArrayList<String>();
        try{
            Scanner reader = new Scanner(new File("homes.csv"));
            while(reader.hasNextLine()) {
                data.add(reader.nextLine());
            }
            reader.close();
        } catch (IOException e){
            System.out.println("homes.csv does not exist");
        }
        return data;
    }
}
