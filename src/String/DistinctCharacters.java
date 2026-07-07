package String;

import java.util.Scanner;
public class DistinctCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String str = sc.nextLine();

//        char[] result = new char[str.length()];
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            boolean found = false;
//            for (int j = 0; j < count; j++) {
//                if (result[j] == ch) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                result[count++] = ch;
//            }
//            System.out.println("Distinct character:");
//            for (i = 0; i < count; i++){
//            System.out.println(result[i]);
//        }
//
//    }
        char[]result = new char[str.length()];
        int count = 0;
        for(int i = 0; i< str.length();i++) {
            char ch = str.charAt(i);
            boolean found = false;

            int j;
            for (j = 0; j < count; j++) {
                if (result[j] == ch) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                result[count++] = ch;
            }
            System.out.println("Distinct character");
            for (j = 0; j < count; j++) {
                System.out.println(result[j]);
            }
        }
}
}