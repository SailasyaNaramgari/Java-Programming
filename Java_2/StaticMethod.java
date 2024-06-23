class Mobiles{
    String brand;
    int price;
    static String name; //change for all objects

    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }

    public static void show1(Mobiles obj){
        System.out.println("In static method");
        //System.out.println(brand+":"+price+":"+name);
        // works fine with name as it is static variable..but remainin are non static
        // so we use obj reference for non static variables
        System.out.println(obj.brand+":"+obj.price+":"+name);
    }
}

public class StaticMethod {
    public static void main(String a[]){
        Mobiles obj1 = new Mobiles();
        obj1.brand = "Apple";
        obj1.price = 100000;
        Mobiles.name = "smart phone"; // as name is static we use Mobile

        Mobiles obj2 = new Mobiles();
        obj2.brand = "Samsung";
        obj2.price = 20000;
        Mobiles.name = "smart phone";

        obj1.show();
        obj2.show();

        obj1.name = "phone";
        obj1.show();
        obj2.show();

        Mobiles.show1(obj1); //call a static method with a class name
    }

}
