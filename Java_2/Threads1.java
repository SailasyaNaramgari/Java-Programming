// extend runnable interface instead of thread class
//class H1 implements Runnable{
//    public void run(){
//        for (int i=0;i<=5;i++){
//            System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            }
//            catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class G1 implements Runnable{
//    public void run(){
//        for (int i=0;i<=5;i++){
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10); //after executing it waits and let next thread execute to get parallel alternatively
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//

public class Threads1 {
    public static void main(String a[]){

//        Runnable obj1 = new H1();
        //use lambda as runnable is a functional interface
        Runnable obj1 = () ->
        {
                for (int i=0;i<=5;i++){
                    System.out.println("Hi");
                    try {Thread.sleep(10);}
                    catch (InterruptedException e) {throw new RuntimeException(e);
                    }
                }
        };
//        Runnable obj2 = new G1();
        Runnable obj2 = () ->
        {
            for (int i=0;i<=5;i++){
                System.out.println("Hello");
                try {Thread.sleep(10);}
                catch (InterruptedException e) {throw new RuntimeException(e);
                }
            }
        };

        //runnable interface doesnot have thread methods, so we create seperater thread objects

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
