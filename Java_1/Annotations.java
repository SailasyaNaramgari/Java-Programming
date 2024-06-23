//@Deprecated //if some on uses this class..they will know its deprecated
class A1{
    public void showDataBelongingToThisClass(){
        System.out.println("in A show");
    }
}

class B1 extends A1{
    @Override //Built in annotation
    public void showDataBelongingToThisClass(){
        System.out.println("in B show");
    }
}

public class Annotations {
    public static void main(String a[]){
        B1 obj = new B1();
        obj.showDataBelongingToThisClass();
    }
}
