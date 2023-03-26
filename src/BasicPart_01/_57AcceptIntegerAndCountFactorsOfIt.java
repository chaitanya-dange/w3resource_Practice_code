package BasicPart_01;

public class _57AcceptIntegerAndCountFactorsOfIt {
    public static void main(String[] args) {
        int number= 25;
        int count=0;
        for(int i=1;i<=25;i++){
            if(number%i==0){
                count=count+1;
            }
        }
        System.out.println(count);

    }
}
