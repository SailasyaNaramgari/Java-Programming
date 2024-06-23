// lamda expression only works with functional interface

@FunctionalInterface
interface A3{
    int add(int i, int j);
}


public class LambdaWithReturn  {
    public static void main(String a[]){

//        A3 obj = new A3(){
//            public int add(int i, int j) {
//                return i+j;
//            }
//        } ;

        A3 obj = (int i, int j) ->  i+j;

        int result = obj.add(2,2);
        System.out.println(result);
    }
}


