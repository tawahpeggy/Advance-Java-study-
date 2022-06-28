public class dataTypes {
    public static void main (String[] args) {
int myValue = 10000;
//int datatype
    int myMinIntValue = Integer.MIN_VALUE; //int occupies 32bits
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer Minimum Value = " + myMinIntValue);
    System.out.println("Integer Maximum Value = " + myMaxIntValue);

//Byte datatype
    byte myMinByteValue = Byte.MIN_VALUE;//byte occupies 8bits
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Maximum Value = " + myMaxByteValue);

//Short datatype
    short myMinShortValue = Short.MIN_VALUE; //short occupies 16bits
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinShortValue);
    System.out.println("Short Maximum Value = " + myMaxShortValue);

//long datatype
    long myLongNumber = 10002345678903L; //always add L behind a long value so the interpretter understands.
    long myMinLongValue = Long.MIN_VALUE; //long occupies 32bits
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Minimum Value = " + myMinLongValue);
    System.out.println("Long Maximum Value = " + myMaxLongValue);

//Casting
    byte myNewByteValue = (byte) (myMinByteValue / 2);
    short myNewShortValue = (short) (myMinShortValue / 2);
    System.out.println(myNewByteValue);
    System.out.println( myMinShortValue);

//primitive type challenge.
    byte myByte = 10;
    short myShort = 20;
    int myInt = 50;
    long myLong =  50000L + 10L * (long)(myByte + myInt + myShort);
    short shortTotal = (short) (1000 + 10 * (myByte + myInt + myShort));
    System.out.println(myLong);
    System.out.println(shortTotal);

//Floating point
// float datatypes
        float myMinFloatValue = Float.MIN_VALUE; //float takes 32bits
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

//        Double datatype
        Double myMinDoubleValue = Double.MIN_VALUE; //double takes 64bits
        Double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        float myFloatNumber = 5F/3;
        double myDoubleNumber = 5D/3;
        int myIntNumber = 5/3; //always use floating point numbers when it  comes to division explicitely double
            System.out.println("myIntNumber = " + myIntNumber);
            System.out.println("myDoubleNumber = " + myDoubleNumber);
            System.out.println("myFloatNumber = " + myFloatNumber);

// convertion from pounds to kilograms.
        double numToBeConverted = 200d;
        double result = numToBeConverted * 0.45359237;
        System.out.println("result = " + result);

// char and boolean
        char myChar = 'D'; // char only stores 2 characters 16byte length.
        char myUnicode = '\u0040';
        System.out.println(myUnicode); //www.unicodetable.com
        boolean mytrueboolValue = true;
        boolean myFalseBoolValue = false;
        System.out.println(mytrueboolValue );
        System.out.println(myFalseBoolValue );

//string : its not a primitive datatype in java but an easier class
        //strings are immutable
        String myString = "this is my string";
        myString = myString + " and i love it ";
        System.out.println(myString + myUnicode + "2019");
        int old = 50;
        String news = "10";
        System.out.println( news +old);

//        operators
        int addition = 1+69; // addition
        System.out.println(addition);
        int previousResult = addition -2;
        System.out.println(previousResult);
        System.out.println(addition);

        int multiplication = addition * 10; // multiplication
        System.out.println("2 * 10 = " + multiplication);

        int division = addition/5; // diviion
        System.out.println("10/5 = " + division);

        int modulus = addition % 3; //modulus is reminder of division
        System.out.println(modulus);
        int increament = modulus++;
        System.out.println(increament);
        int decreament = modulus--;
        System.out.println(decreament);
        result+=2;
        System.out.println(result);
        result*=10;
        System.out.println(result);
        result/=10;
        System.out.println(result);
        result-= 2;
        System.out.println(result);
        //if then statement
        boolean isAlien = false;
        if (isAlien == false);
        {
            System.out.println("It is not an alien");
            System.out.println("and i am not scared");
        }
        //logical OR operator
        int topScore = 100;
        if (topScore!=100){
            System.out.println("you got the high score1");
        }
        if (topScore>=100){
            System.out.println("you got the high score2");
        }
        if (topScore<=100){
            System.out.println("you got the high score3");
        }
        if (topScore>100){
            System.out.println("you got the high score4");
        }
        if (topScore<100){
            System.out.println("you got the high score5");
        }
        //logical And operator
        int secondTopScore = 95;
        if ((topScore  > secondTopScore) && (topScore <= 100)){
            System.out.println("Greter than second top and score less than or equall to 100");
        }
        //OR operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
        // assignment and equall operator
         int newValue = 50;
//        if (newValue = 50) {
//            System.out.println("This is bad code");
//        }
        if (newValue ==50) {
            System.out.println("This is good code");
        }
        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }
        if (!isCar) {
            System.out.println("isCar is not equal to true");
        }
        if (isCar) {
            System.out.println("isCar is true");
        }
        //ternary operator
        boolean wasCar = isCar?true:false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
        int clientAge = 20;
        boolean isEighteen = (clientAge)==20?true:false;
        //chalenge
        double varChallenge = 20.00d;
        double varChallenge2 = 80.00d;
        double challengeTotal = 100.00d * (varChallenge + varChallenge2);
        System.out.println(challengeTotal%40.00d);
        boolean challengeRealTotal = (challengeTotal) == 0.0?true:false;
        System.out.println(challengeRealTotal);
        if(challengeRealTotal != true) {
            System.out.println("Got Some Remainder");
        }















    }
}
