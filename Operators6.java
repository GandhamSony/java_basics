public class Operators6 {
    public static void main(String[]args){

        /*Arithmetic operators 
        + : Addition 
        - : Subtraction 
        * : multiplecation 
        / : Division 
        % : modulo
        */

        int a = 10;
        int b = 3;
        System.out.println("a + b = "+(a + b));
        System.out.println("a - b = "+(a - b));
        System.out.println("a * b = "+(a * b));
        System.out.println("a / b = "+(a / b));
        System.out.println("a % b = "+(a % b));
        
        /*Assignment operator
        += : Add and assign 
        -= : Subtract and assign 
        *= : multiply and assign 
        /= : Divide and assign 
        %= : Modulo and assign 
        */

        int f = 1; // each opeartion updating f value 
        System.out.println("f += 3: " + (f += 3)); // f=f+3=4
        System.out.println("f -= 1: " + (f -= 1)); // f=4-1=3
        System.out.println("f *= 4: " + (f *= 4)); // f=3*4=12
        System.out.println("f /= 2: " + (f /= 2)); // f=12/2=6
        System.out.println("f %= 5: " + (f %= 5)); // f=6%5=1
    
        /* Realational Operator 
        > : Greater than 
        < : Less than 
        >= : Greater than or equal to 
        <= : less than or equal to 
        == : equal to 
        != : not equal to 
         */

        //default values true or false 
        int x = 10;
        int y = 3;
        int z = 5;
        System.out.println("x > y : " +(x > y));
        System.out.println("x < y : " +(x < y));
        System.out.println("x >= y : " +(x >= y));
        System.out.println("x <= z : " +(x <= z));
        System.out.println("z == y : " +(z == y));
        System.out.println("x != z : " +(x != z));
        

        /*Logical operators 
        && : logical AND
        || : logical OR
        !, :logical NOT
         */

        boolean A = true;
        boolean B = false;
        System.out.println("A && B: " + (A && B));
        System.out.println("A || B: " + (A || B));
        System.out.println("!A: " + (!B));

        /*Unary operator 
        ++ : increment by 1 
            post-increment : use value first, then increment
            pre-increment : increment first, then uses value 
        -- : decrement by 1
            post-decrement : use value first, then decrement 
            pre-decrement : decrement first,then uses value 
         */

        int s = 10;
        int p = 10;
        System.out.println("Postincrement:" + (s++));
        System.out.println("Preincrement:" + (++s));
        System.out.println("Postdecrement:" + (p--));
        System.out.println("Predecrement:" + (--p));

       
        /*Ternary operator 
        condition ? if true : if false 
         */

        int n1 = 5, n2 = 10, max;
        System.out.println("First num:" + n1);
        System.out.println("Second num:" + n2);
        //largest among n1 & n2 
        max = (n1 > n2 )? n1 : n2;
        System.out.println("Maximum is : "+max);

    }
    
}
