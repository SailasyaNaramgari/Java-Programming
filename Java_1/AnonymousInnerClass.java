//which has no name


class S{
    public void show(){
        System.out.println("In S show");
    }
}

//class T extends S{
//    public void show(){ //overrides show in S - changes behaviour of show
//        System.out.println("In T show");
//    }
//}
// instead of creating new class for overriding only for once - we can use another method
public class AnonymousInnerClass {
    public static void main(String a[]){
        S obj = new S(){
            public void show(){
                System.out.println("In new show");
            }
        };  //Anonymous inner class
        obj.show(); // calls show of new immplementation
    }
}
