

public class ExceptionalHandling {
    public static void main(String a[]){
        int i = 0; //normal statement

        int j = 0; //critical statement

        // give exception handling(ArithmeticException) and stops here , it won't continue further execution

        //to handle the exception

        try{
            j = 18/i;
        }
        catch (Exception e){ //exception class with obj object
            System.out.println("Something went wrong : " + e);
        } //catch block only exceutes if there is exception


        System.out.println(j);

        System.out.println("done");
    }
}
