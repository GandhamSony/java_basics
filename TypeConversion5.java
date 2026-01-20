public class TypeConversion5 {
    public static void main(String[]args){
        /*// implicit conversion 
        int x = 9;
        double myDouble = x; //Automatic casting : int -double 
        System.out.println(x); // 9
        System.out.println(myDouble); //9.0 no data loss */

        //explicit conversion
        double myDouble = 9.78d;
        int myInt =(int) myDouble; //manual casting: double -int 
        System.out.println(myDouble); //9.78
        System.out.println(myInt); //9 data loss 

    }
}
