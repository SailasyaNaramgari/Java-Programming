//class inside a class

class L{  // cannot make outer class static
    int age;
    public void show(){
        System.out.println("In show");
    }

    static class M{ // static only works for inner class
        public void config(){
            System.out.println("In config");
        }

    }
}
public class InnerClass {
    public static void main(String a[]){
        L obj = new L();
        obj.show();

        //L.M obj1 = new obj.new M();
        L.M obj1 = new L.M(); // works only if we make inner class static
        obj1.config();

    }
}