class Aa{ // every class in java extends Object class even if not metnioned
    public Aa(){
        super(); // Every constructor has a method which is there always even if not mentioned– super()
        System.out.println("in Aa");
    }

    public Aa(int n){
        super();
        System.out.println("in Aa int");
    }

}

class Bb extends Aa{
    public Bb(){
        super();
        System.out.println("in Bb");
    }

    public Bb(int n){
        //super(); //calls the superclass
        // super(n); if we want to call parameterised constructor
        this(); //executes constructor for same class
        System.out.println("in Bb int"); //prints only when we pass parameter
    }
}

public class ThisAndSuper {
    public static void main(String a[]){
        Bb obj = new Bb(); // calls constructor of both subclass and superclass
        System.out.println("------------");
        Bb obj1 = new Bb(2);
        System.out.println("------------");
    }
}
