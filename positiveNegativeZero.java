
public class positiveNegativeZero {
    public static void main(String[] args){
        checkNumber(0);
        fromKiloToMilesPerHour(4);
        fromKiloToMilesPerHour(-24.5);
        shouldWakeUp(true, 7);

    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive number");
        } else if (number < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("number is zero");
        }
    }
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
     public static boolean shouldWakeUp(boolean dogBarks, int hourOfDay) {
        if(dogBarks == true && hourOfDay>22 || hourOfDay<8) {
            System.out.println("hurrily wake up");
            return true;
        }
            System.out.println("do not wake up");
            return false;
     }

     public static boolean isLeapYear(){

     }
}