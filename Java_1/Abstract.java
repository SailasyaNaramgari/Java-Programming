//abstract method can only be defined by abstract class
//abstract class can have abstract and non abstract methods
//we cannot create object of abstract class, but create obj of concrete class

abstract class Car{
    public abstract void drive(); //here we are declaring drive as we use ;
    //we use abstract to give an idea on how it should be

    public abstract void fly(); // if we derive abstract method here , then we should compulsorily define it

    public void playMusic(){
        System.out.println("Play music");
    }

}

abstract class wagonR extends Car{
    public void drive(){ //here we are defining drive as we use {}
        System.out.println("driving");
    }
}

class UpdatedWagonR extends wagonR{ //concrete class

    public void fly(){
        System.out.println("flying");
    }
}

public class Abstract {
    public static void main(String a[]) {

        //Car obj = new Car(); - cannot create object of abstract class
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }

}
