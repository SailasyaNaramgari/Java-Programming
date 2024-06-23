import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String a[]) throws IOException {

        int i = 0;
        int j = 0;

        int num = 0;
        BufferedReader bf = null;

       try{
//            j = 18/i;
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            num = Integer.parseInt((bf.readLine()));
            System.out.println(num);

//            System.out.println("Bye");
        }


//        catch(Exception e){
//            System.out.println("something went wrong");
////            System.out.println("Bye");
//        }


        //if we don't want to deal with catch for handling exception we can use finally
        //to get few statments rrespective of the exception we can use finally
        //always used for closinng the resources


        finally{
//            System.out.println("Bye");
            bf.close();
        }

       //try with resources in latest version of java
        //once this try is over it automatically closes
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//
//            num = Integer.parseInt((br.readLine()));
//            System.out.println(num);
//        }
    }
}
