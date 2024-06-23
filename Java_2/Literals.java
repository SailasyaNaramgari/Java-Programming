public class Literals {
    public static void main(String[] args){

        int num1 = 0b101; //binary format
        System.out.println(num1);
        int num2 = 0x7E; //hexadecimal format
        System.out.println(num2);
        int n = 10_00_00_000; //to differentiate like comas in programming
        System.out.println(n);
        double m = 56; //convert to double
        System.out.println(m);

        double b = 12e10;
        System.out.println(b);

        // int cannot be converted to boolean
        // boolean a = 1;

        char c = 'l';
        c++; // char can be int so it can be incremented
        System.out.println(c);




    }
}
