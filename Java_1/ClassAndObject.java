class Calculator{
    int a; //variable
    public int add(int n1, int n2){ // method add
        int r = n1+n2;
        return r;
    }
}

public class ClassAndObject {
    public static void main(String args[]){
        int n1 = 4;
        int n2 = 4;
        Calculator calc = new Calculator(); // create the obj
        int res = calc.add(4,5);
        System.out.println(res);

        int res1 = calc.add(n1,n2);
        System.out.println(res1);
    }
}
