package BasicPart_01;

public class _86CalcutatingNumberTill01 {
    public static void main(String[] args) {
        int number=235;

        while(number!=1){
            if(number%2==0||number%3==0){
                System.out.println(number+"is divisible by 2 or 3");
                number=1;
            }else{
                number=number+1;
            }
        }
    }
}
