public class Conditions7{
    public static void main(String[]args){

        //java control statements | control flow in java

        /*I.Decision Making Statements
             1.Simple if statement
             2.if-else statement
             3.if-else-if ladder
             4.nested-if statement 
         */


        //simple if-else statement
        int x = 10;
        int y = 12;
        if(x + y > 20){
            System.out.println("x + y is greater than 20");
        }else{
            System.out.println("x + y is not greater than 20");
        }


        //if-else-if ladder
        String city = "Hyd";
        if(city=="Hyd"){
            System.out.println("city is Hyd");
        }else if(city=="vizag"){
            System.out.println("city is vizag");
        }else if(city=="chinnai"){
            System.out.println("city is chinnai");
        }else{
            System.out.println("Bangalore");
        }


        //nested if statement 
        int a = 10;
        int b = 20;
        //outer if condition 
        if(a==10){
            //inner if condition 
            if(b == 10){
                System.out.println("statement true");
            }else{
                System.out.println("I am inside");
            }
        }else{
            System.out.println("I am outside");
        }

        //Switch case
        int number = 5;
        switch(number){
            case 1:
                System.out.println("one");
            break;
            case 2:
                System.out.println("two");
            break;
            case 3:
                System.out.println("three");
            break;
            case 4:
                System.out.println("Four");
            break;
            case 5:
                System.out.println("Five");
            break;
            default:
                System.out.println("number not found");
        }
    }
}
