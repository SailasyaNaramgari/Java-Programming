
@FunctionalInterface //to get one method only
interface A2{
    void show(int i); //if we write another method ,it shows error
}

//class B2 implements A2{
//
//    public void show() {
//        System.out.println("in show");
//    }
//}


public class Functional_Interface {
    public static void main(String a[]){

        //A2 obj = new B2();

//        A2 obj = new A2(){
//            public void show() {
//                System.out.println("in show");
//            }
//        };  // instead of using seperate class we can use annonymous inner class

        // using lamda
//        A2 obj = () -> System.out.println("in show");
//        obj.show();

        A2 obj = (i) -> System.out.println("in show "+ i);  // (int i) we don't need to mention type as we already did above
        obj.show(22);
    }
}
