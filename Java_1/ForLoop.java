public class ForLoop {
    public static void main(String args[]){

        // while loop doesn't support, so we use for
//        while(int i = 5;i<=4;i++){
//            System.out.println("hi "+i);
//            int j = 1;
//        }

        for(int i = 1;i<=4;i++){
            System.out.println("hi "+i);
        }

        System.out.println("_____________");

        for(int i = 4;i>=1;i--){
            System.out.println("hi "+i);
        }

        System.out.println("_____________");

        for(int i = 0;i<4;i++){
            System.out.println("hi "+i);
        }

        System.out.println("_____________");

        // printing time table

        for(int i = 1;i<=5;i++){
            System.out.println("Day "+i);

            for(int j=1;j<=9;j++){
                System.out.println(" "+ (j+8) + " -" +(j+9));
            }

        }



    }
}
