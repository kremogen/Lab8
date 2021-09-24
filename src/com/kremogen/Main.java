package com.kremogen;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("/Users/kremogen/Desktop/labJava/Lab8/text.txt", false)) {
            Scanner scan = new Scanner(System.in);
            writer.write(scan.next());
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
