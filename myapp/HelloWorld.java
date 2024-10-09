package myapp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World ...");


        // console
        Console console = System.console();
        String name = console.readLine("What is your name?");
        System.out.println("your name is ..." + name);


        //if else
        String sport = console.readLine("What is the sport that you like to do?");

        if (sport.toUpperCase().equals("SWIMMING")) {
        System.out.println("That's a nice water sports");
        } else if (sport.toUpperCase().equals("SOCCER")) {
        System.out.println("It's a worldy accepted sports");
        } else {
        System.out.println("I am not sure about the sports you like.");
        }

        //string replace
        String replacedName = name.replace('a', 'e');
        System.out.printf("your name ... %s \n", replacedName);
        
        
        //case statement
        String mark = console.readLine("What is your mark");
        Integer markInt = Integer.parseInt(mark);
        switch (markInt) {
            case 100:
                System.out.println("Perfect Score");
                break;
            case 50:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
                break;
        }

        //while loop
        System.out.println("WHILE LOOP TEST");
        int i=0;
        while (i<markInt) {
            System.out.println(i + ",");
            i++;
        }


        //do while loop
        System.out.println("DO WHILE LOOP TEST");

        do {
            System.out.print(i + ",");
            i++;
            } while (i < markInt);

        
        //arrays and for loops
        Integer[] numbers = new Integer[5];

        for(int j = 0; j < numbers.length; j++) {
        Integer inputNumber = Integer.parseInt(console.readLine("Enter your %d number:", j));
        numbers[j] = inputNumber;
        }

        for(Integer pI : numbers) {
        System.out.println(pI);
        }


        //command line arguements IMPTT
        if (args.length > 0) {
        String[] names = new String[5];

        int x = 0;
        while (x < args.length) {
        names[x] = args[x];
        x++;

        if (x > 4) {
        break;
        }
        }

        for(int y = 0; y < names.length; y++) {
        System.out.printf("Name[%d]: %s\r\n", y, names[y]);
        }
        } else {
        System.out.println("No argument passed");
        }


        ////Console, Scanner, ArrayList

        //Console console = System.console();
        List<String> words = new ArrayList<String>();
        String keyboardInput = "";
        keyboardInput = console.readLine("Enter a new line ");

        Scanner scan = new Scanner(keyboardInput);
        while (scan.hasNext()){
            words.add(scan.next()); //default delimiter is " ", can change delimiter with scan.useDelimiter(",") to change to comma.
        }
        scan.close();

        //another way to do this without console is
        //Scanner scan = new Scanner (System.in);
        //This wont show a prompt string. Have to manually print
        //this method also seems not work with the while looping

        for (int z = 0 ; z < words.size(); z++){
            System.out.printf("%d : %s \n",z+1, words.get(z));


        //DateTime
        Date currentdate = new Date();
        System.out.println(currentdate.toString());
        

        }
    }
}