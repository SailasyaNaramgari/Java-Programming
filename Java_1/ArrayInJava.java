public class ArrayInJava {
    public static void main(String args[]){
        int nums[] = {3,7,2,4};
        System.out.println(nums[3]);

        //updating value
        nums[1]=6;
        System.out.println(nums[1]);
        System.out.println("-------------");
        int num[] = new int[4]; //we get 4 boxes..but since no values..all are 0
        System.out.println(num[1]);
        System.out.println("-------------");
        num[0]=4;
        num[1]=8;
        num[2]=3;
        num[3]=9;

//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]); so we use a loop

        for (int i=0;i<=3;i++){
            System.out.println(num[i]);
        }
    }
}
