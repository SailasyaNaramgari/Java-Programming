
// to make it a thread we inherit
class H extends Thread{
    public void run(){
        for (int i=0;i<=50;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10); //after executing it waits and let next thread execute to get parallel alternatively
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class G extends Thread{
    public void run(){
        for (int i=0;i<=50;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10); //after executing it waits and let next thread execute to get parallel alternatively
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Threads {
    public static void main(String a[]){
        H obj1 = new H();
        G obj2 = new G();

//        System.out.println(obj1.getPriority());
        // the range pf priority goes from 1 to 10 ... 1 - least priority and 10 - highest, 5 - default or normal priority
//        obj2.setPriority(Thread.MAX_PRIORITY);

        //to run them in parallel
        obj1.start();//start belongs to Thread class
        try {
            Thread.sleep(5); //after executing it waits and let next thread execute to get parallel alternatively
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
        //things are running in parallel but not alternate
        //scheduler of os allows which threads to execute
    }
}
