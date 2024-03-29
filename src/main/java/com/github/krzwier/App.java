package com.github.krzwier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String greet(String name) {
        if (name == null) {
            return "Hello, my friend.";
        } else if (name.equals(name.toUpperCase())){
            return "HELLO " + name + "!";
        } else {
            return "Hello, " + name + ".";
        }
		
	}

	public static String greet(String[] arr) {
        ArrayList<String> lowerCaseNames = new ArrayList<>();
        boolean flag = false;
        String upperCaseName = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arr[i].toUpperCase())) {
                upperCaseName = arr[i];
                flag = true;
            } else if (arr[i].indexOf('\"') == 0) {
                lowerCaseNames.add(arr[i].substring(1,arr[i].length() - 1));
            } else if (arr[i].indexOf(',') >= 0) {
                String[] temp = arr[i].split(",\\s*");
                for (int j = 0; j < temp.length; j++) {
                    lowerCaseNames.add(temp[j]);
                }
            } else {
                lowerCaseNames.add(arr[i]);
            }
        }
        String output = "Hello, ";
        if (lowerCaseNames.size() == 1) {
            output = greet(lowerCaseNames.get(0));
        } else {
            if (lowerCaseNames.size() == 2) {
                output = output + lowerCaseNames.get(0) + " ";
            } else {
                for (int i = 0; i < lowerCaseNames.size() - 1; i++){
                    output = output + lowerCaseNames.get(i) + ", ";
                }
            }
            output = output + "and " + lowerCaseNames.get(lowerCaseNames.size() - 1) + ".";
        }
        if (flag) {
            output = output + " AND " + greet(upperCaseName);
        }
		return output;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("> ");
        String rawInput = in.nextLine();
        while (!rawInput.equals("exit")) {
            if (rawInput.equals("")) {
                String nullString = null;
                System.out.println(greet(nullString));
            } else if (rawInput.contains(" ")) {
                String[] stringArray = rawInput.split(" ");
                System.out.println(greet(stringArray));
            } else {
                System.out.println(greet(rawInput));
            }
            System.out.print("> ");
            rawInput = in.nextLine();
        }
        in.close();
    }

    
}