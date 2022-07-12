public class switchvsif {
    public static void main(String[] args) {
        //elseif vs switch
        int value = 3;
        if (value == 1) System.out.println("value is 1");
        else if (value == 2) System.out.println("value is 2");
        else if (value == 3) System.out.println("value is 3");
        else System.out.println("value does not exit");


        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 1");
                break;
            default:
                System.out.println("value does not exist");
                break;
        }

    }
}