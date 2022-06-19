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




    }
}
