public class Loops8 {
    public static void main(String[]args){  

    /*Looping statements 
        1.for-loop
        2.while-loop
        3.do-while loop
    */

    //for loop 
    int n = 5;
    for(int i = 1; i<=n; i++){
        System.out.println("Java is fun i =" + i);
    }


    //while loop 
    int i = 0;
    while (i < 5){
        System.out.println(i);  //repeated loop 
        i++; 
    }


    //do-while loop 
    int x = 0;
    do{
        System.out.println(x);
        x++;
    }
    while(x<0);

    }    
}
