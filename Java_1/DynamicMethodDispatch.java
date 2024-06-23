//Run time polymorphism

class Aaa{
    public void show(){
        System.out.println("In A show");
    }

}

class Bbb extends Aaa{
    public void show(){
        System.out.println("In B show");
    }

}

class Ccc extends Bbb{
    public void show(){
        System.out.println("In C show");
    }

}


public class DynamicMethodDispatch {
    public static void main(String a[]){
        Aaa obj = new Aaa();
        //Aaa obj = new Bbb(); //works due to inheritance - ref of super class..object of subclass
        obj.show();

        System.out.println("------------");

        obj = new Bbb();
        obj.show();

        System.out.println("------------");

        obj = new Ccc();
        obj.show(); //behaving diff with diff objects - run time polymorphism


    }
}
