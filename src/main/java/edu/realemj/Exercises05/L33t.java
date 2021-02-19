package edu.realemj.Exercises05;

import java.util.*;

public class L33t {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        do {
            System.out.println("Enter message:");
            line = input.nextLine();

            // Convert string...
            String outline = "";
            for(int i = 0; i < line.length(); i++) {
                char letter = line.charAt(i);
                switch(letter) {
                    case 'a':
                    case 'A':
                        outline += '4';
                        break;
                    case 'e':
                    case 'E':
                        outline += '3';
                        break;
                    case 'i':
                    case 'I':
                        outline += '1';
                        break;
                    case 'o':
                    case 'O':
                        outline += '0';
                        break;
                    default:
                        outline += letter;
                        break;
                }
            }

            System.out.println(outline);

        }while(!line.equals(""));
        // }while(line.length() != 0);

    }
}
