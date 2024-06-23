public class MultiDimensionalArray {
    public static void main(String args[]){
        int nums[][] = new int[3][4];

        //int nums[][] = new int[3][]; - jagged array - not specify columns in the array


        //math class which gives random values - it returns double
        int random = 0;

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random()*10); // to get single digit - *10
            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("---------------");

        //enhanced for loop..it gives the same as above
        for(int n[]:nums){
            for(int m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
