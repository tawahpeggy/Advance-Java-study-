import java.math.RoundingMode;
import java.text.DecimalFormat;
public class challenges {
    public static void main(String[] args){
        checkNumber(0);
        fromKiloToMilesPerHour(4);
        fromKiloToMilesPerHour(-24.5);
        shouldWakeUp(true, 7);
        isLeapYear(2100);
        areEqualByThreeDecimalPlaces(12.234,4.234);
        hasEqualSumCheck(1,1,2);
        area(5.0);
        area(5.0,4.0);

    }
    //check number
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive number");
        } else if (number < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("number is zero");
        }
    }

    //from kilometers to miles
     public static long fromKiloToMilesPerHour(double kiloMteresPerHour){
      //when cascading is used
         long resultHere = (long)(kiloMteresPerHour /  1.609344 );
         //when Math.round method is used
//         long resultHere = Math.round(kiloMteresPerHour /  1.609344 );
         if(resultHere < 0) {
             System.out.println(-1);
             return -1;
         }
             System.out.println(resultHere);
             return resultHere;

     }
     //dogBarking
     public static boolean shouldWakeUp(boolean dogBarks, int hourOfDay) {
        if(dogBarks == true && hourOfDay>22 || hourOfDay<8) {
            System.out.println("hurrily wake up");
            return true;
        }
            System.out.println("do not wake up");
            return false;
     }
//isleapYear
     public static boolean isLeapYear(int year){
        if (year>=1 && year <=9999) {
            if(year % 4 == 0){
                if (year % 100 ==0) {
                    if (year % 400 ==0){
                        System.out.println("this is a leap year with 366days");
                        return true;
                    }
                }
            }
         }
         System.out.println("not a leap year with 365 days");
         return false;
     }
// Decimal Comparator
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
            if (Math.abs(a - b) < 0.001){
                System.out.println("decimals are equal");
                return true;
            }

                System.out.println("decimals are not equal");
                return false;
        }
// equal check sum
    public static boolean hasEqualSumCheck(int a, int b,int c){
        if (a + b ==c){
            System.out.println("a + b = c");
            return true;
        }
        System.out.println("uneven");
        return false;

    }

// Area Calculator
    public static double area(double radius) {
        radius = radius * radius * Math.PI;
        System.out.println(radius);
            if (radius<0){
                System.out.println("radius is negative");
                return -1.0;
            }
        return radius;
    }
    public static double area(double x, double y) {
        if(x<0 || y<0){
            System.out.println("zero value not computable");
            return -1.0;
        }
        double rectangleArea = x  *  y;
        System.out.println(rectangleArea);
        return rectangleArea;
    }
}