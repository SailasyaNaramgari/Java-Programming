public class ConditionalStatements {
    public static void main(String[] args){
        int x = 18;
        int y = 10;

        //if else

        if (x>10){
            System.out.println("hello");
        }

        if (true)
            System.out.println("Hi");

        if (x>50)
            System.out.println("hi");
        else
            System.out.println("bye");

        if (x>y)
            System.out.println(x);
        else System.out.println(y);

        System.out.println("----------------");

        // if elseif

        int z = 28;

        if (x>y && x>z)
            System.out.println(x);
        else if (y>x && y>z)
            System.out.println(y);
        else
            System.out.println(z);

    }
}
