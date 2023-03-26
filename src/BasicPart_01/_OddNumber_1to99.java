package BasicPart_01;

public class _OddNumber_1to99 {
    public static void main(String[] args) {
        int count=0;
        while(count<100){
            count=count+1;
            if(count%2==1){ //count%2!=0
                System.out.println(count);
            }
        }
    }
}
