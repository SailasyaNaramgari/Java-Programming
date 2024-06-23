public class ThreeDarray {
    public static void main(String args[]) {

        int nums[][][] = new int[3][4][5]; //to increase dimention extra[] and extra loop        nums[0] = new int[3]; // we can mention seperately...not all has to be same size

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                for (int k=0;k<5;k++){
                    nums[i][j][k] = (int)(Math.random()*10); // to get single digit - *10
                }

            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                for (int k=0;k<5;k++){
                    System.out.print(nums[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}
