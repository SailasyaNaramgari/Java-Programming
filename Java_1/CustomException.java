//custom exception by creating new class
//inherits exception

class LasyaException extends Exception{
    public LasyaException(String string){
        super(string);
    }
}

public class CustomException {
    public static void main(String a[]){
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
                throw new LasyaException("I don't want zero");
        }
        catch (LasyaException  e){
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
