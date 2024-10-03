package myapp;

import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TestEnv{
    public static void main(String[] args){
/*         Integer markInt = 0;

        int i = 0;
        do {
            System.out.print(i + ",");
            i++;
            } while (i < markInt); */

        /* Console cons = System.console();
        Integer [] todo = new Integer[5];

        for (int i = 0 ; i< todo.length; i++){
            int x = Integer.parseInt(cons.readLine("What is digit " + (i+1) + " of your password?"));
            todo[i] = x;
        }

        for (int j : todo){
            System.out.printf("Password is %d \n", j);
        } */


        //Console, Scanner, ArrayList
        Console console = System.console();
        List<String> words = new ArrayList<String>();
        String keyboardInput = "";
        keyboardInput = console.readLine("Enter a new line");

        Scanner scan = new Scanner(keyboardInput);
        while (scan.hasNext()){
            words.add(scan.next());
        }
        scan.close();

        //another way to do this without console is
        //Scanner scan = new Scanner (System.in);
        //This wont show a prompt string. Have to manually print
        //this method also seems not work with the while looping

        for (int i = 0 ; i < words.size(); i++){
            System.out.printf("%d : %s \n",i+1, words.get(i));
        }







    }
}