public class OperatorsRunner{
    public static void main(String[]args){
        System.out.println("Operators runner has started!!");


        boolean flag = true;

        int valOne =234;
        int valTwo =22;
        double answer = 0;

        // Arithmetic operators
        answer = valOne + valTwo;
        System.out.println("The Sum of valOne and valTwo is "+answer);

        answer = valOne - valTwo;
        System.out.println("Value of valOne and valTwo is "+answer);

        answer = (double)valOne / valTwo;
        System.out.println("The value of valOne and valTwo is "+answer);

        answer = valOne * valTwo;
        System.out.println("The value of valOne and valTwo is "+answer);

// modulus returns the remainder
        answer = (double)valOne % valTwo;
        System.out.println("The value of valOne and valTwo is "+answer);

// increment
         
         int x = 30;
         ++x;
         System.out.println("pre Increment: "+x);
        
         System.out.println("Post Increment: "+(++x));

        //  Decrement
        int y=30;
        --y;
        System.out.println("pre decrement: "+y);
        
         System.out.println("Post decrement: "+(y--));


        //  Comparison operators

        boolean trueFlag=true;
        // boolean isTrue =false;
        boolean isEqual = valOne == valOne;
        System.out.println("ValOne is equal to valOne --> "+isEqual);

        boolean isNotEqual = valOne != valOne;
        System.out.println("valOne is not equal to valOne --> "+isNotEqual);
         
        boolean isGreaterThan = valOne > valTwo;
        System.out.println(valOne+"is greater than "+valTwo+"-->"+isGreaterThan);
        
        boolean isLessThan = valOne < valOne;
        System.out.println(valOne+"is less than "+valTwo+"-->"+isLessThan);
        

        // Assignment Operators
         int testVal = 30;
         testVal += 2;
         System.out.println("(30) += 2 -->"+testVal);


         








    


    }
}