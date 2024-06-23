public class TernaryOperators {
    public static void main(String[] args){
        int n = 4;
        int r = 0;

        if(n%2 == 0)
            r = 10;
        else r =20;

        System.out.println(r);

        //using ternary operator - ? :

        r = n%2 ==0 ? 10 : 20;


        System.out.println(r);

    }
}
