package myapp;

import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestEnv{
    public static void main(String[] args){
        Console cons = System.console();
        String keyboardInput = cons.readLine("Enter hobbies in a row");
        Scanner scan = new Scanner(keyboardInput);
        while(scan.hasNext()){
            System.out.println(scan.useDelimiter(":").next());

        }
        

        
    }
}