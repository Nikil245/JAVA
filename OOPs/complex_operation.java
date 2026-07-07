class Complex {

    int real, imaginary;

    // Default Constructor
    Complex() {
    }

    // Parameterized Constructor
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    Complex addComp(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }

    // Method to subtract two complex numbers
    Complex subtractComp(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real - c2.real;
        temp.imaginary = c1.imaginary - c2.imaginary;
        return temp;
    }

    // Method to display complex number
    void printComplexNumber() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class complex_operation {

    public static void main(String[] args) {

        Complex C1 = new Complex(4, 8);
        Complex C2 = new Complex(5, 7);

        System.out.print("First Complex Number: ");
        C1.printComplexNumber();

        System.out.print("Second Complex Number: ");
        C2.printComplexNumber();

        Complex C3 = new Complex();

        C3 = C3.addComp(C1, C2);
        System.out.print("Sum: ");
        C3.printComplexNumber();

        C3 = C3.subtractComp(C1, C2);
        System.out.print("Difference: ");
        C3.printComplexNumber();
    }
}