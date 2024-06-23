public class SwitchStatementsOLD {
    public static void main (String a[]){
        int n = 5;

        switch(n){
            case 1:
                System.out.println("Sunday");
                break; //to come out of the case
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            //if none of the cases are matching
            default:
                System.out.println("Enter a valid number");
        }

    }
}
