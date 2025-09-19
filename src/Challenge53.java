public class Challenge53 {

    public static void main(String[] args){

        System.out.println(toCentimeters(5,10));

    }

    public static double toCentimeters(int inches){
        return inches * 2.54;
    }

    public static double toCentimeters(int feet, int inches){
        int inchesForTotal = (feet * 12)+ inches;
        return toCentimeters(inchesForTotal);
    }

}
