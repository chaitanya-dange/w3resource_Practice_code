package BasicPart_01;

public class _55ConvertSecondToHourMinuteSecond {
    public static void main(String[] args) {
        long input=86399;

        int hour=(int)input/3600;

        int minute=((int)input -hour*3600)/60;

        int second =(int)input-hour*3600-minute*60;

        System.out.println(hour+":"+minute+":"+minute);



    }
}
