public class JaggedArray {
    public static void main(String args[]) {

        int nums[][] = new int[3][]; //jagged array - not specify columns in the array

        nums[0] = new int[3]; // we can mention seperately...not all has to be same size
        nums[1] = new int[4];
        nums[2] = new int[2];

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*10); // to get single digit - *10
            }
        }

        //enhanced for loop automatically detects where the values are

        for(int n[]:nums){
            for(int m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
