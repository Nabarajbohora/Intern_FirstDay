package loop;

public class WhileMeanExa {
    public static void main(String[] args) {
        int password = 111;  // यहाँ १२३ नभई अरु कुनै नम्बर राखौं (जस्तै: 111)

        while( password != 123 ) {   // अब 111 != 123 भनेको 'सत्य (True)' हो, इसो भए भित्र पस्छ।
            System.out.println("पासवर्ड मिलेन। फेरि हाल्नुहोस्। हालको मान: " + password);
            password++;   // अब password 111 बाट 112, 113... हुँदै 123 पुग्छ।

            if (password == 123) {
                System.out.println("सफलता ! तपाईंको पासवर्ड मिल्यो।");
            }
        }
    }
}