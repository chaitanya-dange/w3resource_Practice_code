package BasicPart_01;

public class _999 {

    public static void main(String[] args) {
int mysum=_999.sum(10,20,30);
       //int mysum=_999.sum(10);
 System.out.println(mysum);
    }

    static int sum(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("In sadha args");
        return  sum;
    }
//
public static int sum(int a,int b,int... c) {
    int sum = 0;
    for (int num : c) {
        sum += num;
    }
    System.out.println("In var args");
    return sum;
}





}
