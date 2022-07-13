package main.java;

import java.util.ArrayList;
import java.util.Arrays;

public class AnalyzationManager {
    public static void analyze(ArrayList<String> data) {
        for (int i = 0; i < data.size(); i++) {
            String currentRowString = data.get(i);
            String[] currentRow = currentRowString.split(",");
            if (i > 0){
                System.out.println(Arrays.toString(currentRow));
                for(String cell: currentRow){
                    if(CellChecker.hasBlank(cell)){
                        System.out.println("has Blank");
                    }
                    if(CellChecker.hasNull(cell)){
                        System.out.println("has Null");
                    }
                    if (CellChecker.hasValue(cell,"8")){
                     System.out.println("has 8!");
                    }
                }
            }
        }
    }
}
