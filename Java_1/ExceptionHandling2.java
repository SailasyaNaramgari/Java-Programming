
//Try with multiple catches

public class ExceptionHandling2 {
    public static void main(String a[]){
        int i = 2;
        int j = 0;

        int nums[] = new int[5];
        String str = null;

        try{
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException  e){ // we specify the exception
            System.out.println("Cannot divide by zero");
        }

        //Multiple catch blocks
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in the limit");
        }

        //when we don't know what type of exception arises
        catch (Exception e){ //handle all exceptions
            System.out.println("Something went wrong : "+e );
        }
        //Exception is the parent class , so it should be at last in order

        System.out.println(j);

        System.out.println("done");
    }
}
