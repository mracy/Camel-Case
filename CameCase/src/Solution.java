import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String inputLine = scanner.nextLine();
            String[] parts = inputLine.split(";");
            if (parts.length >= 3) {
                String operation = parts[0];
                String type = parts[1];
                String words = parts[2];

                String result = "";

                if (operation.equals("S")) {
                    result = splitCamelCase(words, type);
                } else if (operation.equals("C")) {
                    result = combineWords(words, type);
                } else {
                    System.out.println("Invalid operation: " + operation);
                    continue;  // Skip to the next iteration
                }

                System.out.println(result);
            } else {
                System.out.println("Invalid input format: " + inputLine);
            }
        }
    }

    private static String splitCamelCase(String camelCase, String type) {
        StringBuilder sb = new StringBuilder();
        if (type.equals("M") && camelCase.endsWith("()")) {
            camelCase = camelCase.substring(0, camelCase.length() - 2);
        }
        for (int i = 0; i < camelCase.length(); i++) {
            char c = camelCase.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(" ");
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

    private static String combineWords(String words, String type) {
        StringBuilder sb = new StringBuilder();
        String[] wordArray = words.split(" ");
        if (type.equals("M")) {
            sb.append(wordArray[0]);
            for (int i = 1; i < wordArray.length; i++) {
                sb.append(Character.toUpperCase(wordArray[i].charAt(0)));
                sb.append(wordArray[i].substring(1));
            }
            sb.append("()");
        } else if (type.equals("C")) {
            sb.append(Character.toUpperCase(wordArray[0].charAt(0)));
            sb.append(wordArray[0].substring(1));
            for (int i = 1; i < wordArray.length; i++) {
                sb.append(Character.toUpperCase(wordArray[i].charAt(0)));
                sb.append(wordArray[i].substring(1));
            }
        } else if (type.equals("V")) {
            sb.append(wordArray[0]);
            for (int i = 1; i < wordArray.length; i++) {
                sb.append(Character.toUpperCase(wordArray[i].charAt(0)));
                sb.append(wordArray[i].substring(1));
            }
        } else {
            System.out.println("Invalid type: " + type);
            return words; // Return the input as-is for unknown types
        }
        return sb.toString();
    }
}