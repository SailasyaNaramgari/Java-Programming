public class LogicalOperators {
    public static void main(String[] args){
        int x = 7;
        int y = 5;

        int a = 5;
        int b = 9;

        boolean res = x>y && a>b;
        System.out.println(res);

        boolean res1 = x>y || a>b;
        System.out.println(res1);

        boolean res2 = x>y || a>b || x!=y; //we can add more pipes
        System.out.println(res2);

        System.out.println(!res2);


    }
}
