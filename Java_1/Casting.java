class E{
    public void show1(){
        System.out.println("In E show");
    }

}

class F extends E{
    public void show2(){
        System.out.println("In F show");
    }

}

public class Casting {
    public static void main(String a[]) {
        double d =4.5;
        int i = (int) d; //type casting - converting the type , even if loose data

        System.out.println(i);
        System.out.println("-----------------");

        //dynammic method dispatch
        //E obj = (E) new F(); //upcasting - works implicitly behind

        E obj = new F();
        obj.show1();

        System.out.println("-----------------");

        F obj1 = (F) obj; //downcasting - to child reference
        obj1.show2();


    }
}
