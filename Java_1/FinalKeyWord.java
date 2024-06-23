//FinalKeyWord - used with variable, method, class

//final class - for not inheriting or extending
final class d{

    //final method = cannot override
    public final void show() {
        System.out.println("In calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

public class FinalKeyWord {
    public static void main(String a[]) {
        //final variable
        int num = 22;
        num = 9; //we can change it
        System.out.println(num);
        System.out.println("---------");
        final int num1 = 22;
        // num1 = 9; //we can't change it
        System.out.println(num1);

        System.out.println("................");

        //final class
        d obj = new d();
        obj.show();
        obj.add(2, 2);
    }
}
