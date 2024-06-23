public class DoWhile {
    public static void main(String args[]){
//        while(true){
//            System.out.println("hi");
//        }
        // we need to stop the iteration somewhere so add condition

        int i = 5; //i - iterator

        do{
            System.out.println("hi "+i);
            int j = 1;
            i++;
        }while(i<=4);  // executes atleast once
    }
}
