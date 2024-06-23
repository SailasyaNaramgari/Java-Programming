public class EnhancedForLoop {
    public static void main(String args[]){

        int num[] = new int[4];
        num[0]=4;
        num[1]=8;
        num[2]=3;
        num[3]=9;
//
//        for (int i=0;i<=num.length;i++){
//            System.out.println(num[i]);
//        }
        // enhanced
        for(int n:num){ // not using counter i
            System.out.println(n);
        }
    }
}
