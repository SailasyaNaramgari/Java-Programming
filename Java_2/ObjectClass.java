//ObjectClass - every class in java extends object class


import java.util.Objects;

class Laptop{
    String model;
    int price;

    public String toString(){
        return model + ":" + price;
    }

//    public boolean equals(Laptop that){
//            return this.model.equals(that.model) && this.price==that.price;
//    }

    //by clicking generate , so it check all condtions/checks
    //same we can do with toString()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class ObjectClass {
    public static void main(String a[]) {
        Laptop obj = new Laptop();
        obj.model = "ASUS";
        obj.price = 1000;

        System.out.println(obj); // it gives Laptop@5f184fc6
        //System.out.println(obj.toString()); // every it calls toString method even if not mentioned as it is in Object class
        //if we create toString method seperately , it return the value in it
        System.out.println(obj.toString());

        Laptop obj1 = new Laptop();
        obj1.model = "ASUS";
        obj1.price = 1000;

        //boolean result = obj.equals(obj1); //equal also there in Object class - so implement it yourself to get answer you want
        boolean result = obj.equals(obj1);
        System.out.println(result);
    }
}
