package main.java;

public class CellChecker {
    public static boolean hasBlank(String cell){
        return cell.equals("");
    }
    public static boolean hasNull(String cell){
        return cell.equals("null");
    }
    public static boolean hasValue(String cell, String wantedValue){
        return cell.equals(wantedValue);
    }
}
