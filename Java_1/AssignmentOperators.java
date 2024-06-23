public class AssignmentOperators {
    public static void main(String args[]){
        int a = 7;
        int b = 5;

        int res = a+b;
        System.out.println(res);
        int res1 = a-b;
        System.out.println(res1);
        int res2 = a*b;
        System.out.println(res2);
        int res3 = a/b; // you will get quotient
        System.out.println(res3);
        int res4 = a%b; // you will get remainder
        System.out.println(res4);

        System.out.println("**************");

        a = a+1;
        System.out.println(a+"*");

        System.out.println("**************");

        //a = a+2;
        a +=2;
        System.out.println(a+"*");
        a-=2;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a/=2;
        System.out.println(a);

        System.out.println("**************");

        a++; //post increment
        //++num --> pre increment
        System.out.println(a+"*");
        a--; //decrement
        System.out.println(a);

        System.out.println("**************");

        // differ when fetched
        System.out.println(a);
        int r = ++a;
        System.out.println(r); //first fetch then increment
        int r1 = a++;
        System.out.println(r1); //first increment then fetch
        // ++a increments the value of a at the same instant as its executed ,but a++ will increment the value of a after its used once.
    }
}
