package constructor;

import java.util.Scanner;

class Complex{
    int real1, imag1;
    int real2,imag2;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of First Number..");
        real1 = sc.nextInt();
        System.out.print("Enter Imaginary Part of First Number: ");
        imag1 = sc.nextInt();

        System.out.print("Enter Real Part of Second Number: ");
        real2 = sc.nextInt();

        System.out.print("Enter Imaginary Part of Second Number: ");
        imag2 = sc.nextInt();
    }


void sum() {
    int real = real1 + real2;
    int imag = imag1 + imag2;

    System.out.println("Sum = " + real + " + " + imag + "i");
}
void difference() {
    int real = real1 - real2;
    int imag = imag1 - imag2;

    System.out.println("Difference = " + real + " + " + imag + "i");
}

void product() {
    int real = (real1 * real2) - (imag1 * imag2);
    int imag = (real1 * imag2) + (imag1 * real2);

    System.out.println("Product = " + real + " + " + imag + "i");
}
}
public class ComplexOperations {
    public static void main(String[] args) {
        public

        Complex c = new Complex();
        c.input();

        c.sum();
        c.difference();
        c.product();
    }
}