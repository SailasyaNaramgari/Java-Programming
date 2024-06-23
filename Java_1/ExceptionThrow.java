public class ExceptionThrow {
    public static void main(String a[]){
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("I don't want zero"); //call catch block with help of throw
            // to get a message , put it in constrcutor
        }
        catch (ArithmeticException  e){
            //if we enter denominator 0 , we handle it instaed of printing exception
            j = 18/1;
            System.out.println("It's default output " + e);
        }

        catch (Exception e){
            System.out.println("Something went wrong : "+e );
        }

        System.out.println(j);

        System.out.println("done");
    }
}
