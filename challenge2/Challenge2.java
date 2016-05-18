import java.lang.System;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Challenge2{

    public static void main(String [] args){

        Map<String, String> keyboard = new HashMap<String,String>();
        try {
            Scanner keysFile = new Scanner(new File("keys.txt"));
            while (keysFile.hasNextLine()) {
                //System.out.println(keysFile.nextLine());
                String [] mapString = keysFile.nextLine().split("=");
                keyboard.put(mapString[0], mapString[1]);
            }

            keysFile.close();

        }catch(Exception e){
            System.out.println("cannot find keys.txt");
            System.exit(1);
        }

        try {
            Scanner inputFile = new Scanner(new File("challenge2_sample.txt"));


            List<String> lines = new ArrayList<String>();

            while (inputFile.hasNextLine()) {
                lines.add(inputFile.nextLine());
            }

            inputFile.close();

            for(String line: lines){
                String [] words = line.split(" ");
                for(String word: words){
                    String [] litters = word.split("\\.");

                    for(String litter: litters){
                        System.out.print(keyboard.get(litter));
                    }

                    System.out.print(" ");

                }
                System.out.println();
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("cannot find input.txt");
            System.exit(1);
        }

    }
}