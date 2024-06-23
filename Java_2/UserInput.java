import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String a[]) throws IOException {


//        System.out.println("Enter a number : ");
//        int num = System.in.read();  // it gives ascii value
//        // we should throw the exception or compiler will not allow it to run
//        //better to use try catch than this
//
//        System.out.println(num - 48); //we can manage it
//
//        System.out.println("-----------------------");


        // so instead of this java uses BufferedReader

//        System.out.println("Enter a number : ");
//
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);// can take input from any where like files
//
//        int num1 = Integer.parseInt(bf.readLine());
//        System.out.println(num1);
//
//        bf.close();

        //instead of using buffer reader we can use scanner
        System.out.println("Enter a number : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
