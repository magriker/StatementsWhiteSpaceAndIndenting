public class Challenge54 {

    public static void main(String[] args){
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }

    public static String getDurationString(int seconds){
        int minutes = seconds /60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minuites,int seconds){
        int finalHour = minuites /60;
        int finalMinuits =minuites%60;
        int finalSeconds= seconds%60;
        return finalHour+"h "+finalMinuits+"m "+ finalSeconds+"s";
    }
}
