package loop;

import java.util.Scanner;

public class AtmPinCheck {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int correctpin =8544;
        int userpin = 0;

        while(userpin != correctpin){
            System.out.print("कृपया आफ्नो ४ अंकको पिन हाल्नुहोस्: ");
            userpin = sc.nextInt();

            if(userpin !=correctpin){
                System.out.println("गलत पिन ! फेरि प्रयास गर्नुहोस्।");

            }
            if(userpin>=10000){
                System.out.println("please Enter the 4-Digit number");

            }
        }
        System.out.println(" सफल ! तपाईंको खाता खुल्यो।");
    }
}
