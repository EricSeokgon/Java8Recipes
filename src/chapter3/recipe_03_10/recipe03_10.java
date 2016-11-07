package chapter3.recipe_03_10;

/**
 * Project: Java8Recipes
 * FileName: recipe03_10
 * Date: 2016-11-07
 * Time: 오전 9:11
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class recipe03_10 {
    public static void main(String[] args) {
        String filename = "abc.txt";

        if(filename.endsWith(".txt")){
            System.out.println("Text file");
        } else if (filename.endsWith(".doc")){
            System.out.println("Document file");
        } else if (filename.endsWith(".xls")){
            System.out.println("Excel file");
        } else if (filename.endsWith(".java")){
            System.out.println("Java source file");
        } else {
            System.out.println("Other type of file");
        }
    }
}
