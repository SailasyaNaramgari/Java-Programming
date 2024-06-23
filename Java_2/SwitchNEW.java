public class SwitchNEW {

    public static void main (String a[]){
        String day = "monday";
        String result = "";

//        switch(day){
//            case "saturday","sunday":
//                System.out.println("6am");
//                break;
//            case "monday":
//                System.out.println("8am");
//                break;
//            default:
//                System.out.println("7am");
//        }

//        switch(day){
//            case "saturday","sunday" -> System.out.println("6am");
//
//            case "monday" -> System.out.println("8am");
//
//            default -> System.out.println("7am");
//        }

//        switch(day){
//            case "saturday","sunday" -> result = "6am";
//
//            case "monday" -> result = "8am";
//
//            default -> result = "7am";
//        }
//


//        result = switch(day){
//            case "saturday","sunday" -> "6am";
//
//            case "monday" -> "8am";
//
//            default ->  "7am";
//        }; //since its an expressionnow we use ;

        result = switch(day){
            case "saturday","sunday": yield "6am";

            case "monday": yield "8am";

            default : yield "7am";
        };
        System.out.println(result);
    }
}

