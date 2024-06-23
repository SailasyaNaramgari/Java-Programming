class Mobile{
    String brand;
    int price;
    static String name; //change for all objects

    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }
}

public class StaticInJava {
    public static void main(String a[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
        Mobile.name = "smart phone"; // as name is static we use Mobile

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 20000;
        Mobile.name = "smart phone";

        obj1.show();
        obj2.show();

        obj1.name = "phone";
        obj1.show();
        obj2.show();
    }
}
