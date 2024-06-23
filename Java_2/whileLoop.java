public class whileLoop {
    public static void main(String args[]){
//        while(true){
//            System.out.println("hi");
//        }
        // we need to stop the iteration somewhere so add condition

        int i = 1; //i - iterator

        while(i<=6){
            System.out.println("hi "+i);
            int j = 1;
            while(j<=3){
                System.out.println("hello "+j);
                j++;
            }
            i++;
        }
        System.out.println("bye "+i); //since i is declared out of loop it becomes the next number like 7
    }
}
