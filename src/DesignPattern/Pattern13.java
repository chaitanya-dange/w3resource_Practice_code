package DesignPattern;

public class Pattern13 {
    public static void main(String[] args) {
        int count1=10;
        int count2=0;
        for( int i=1;i<=5;i++){
            for( int j=1;j<=5;j++)
                if(j%2==0){
                    System.out.print(i*count1+" ");
                    count1=count1+10;
                }else {
                    System.out.print(j+count2+" ");
                    count2=count2+10;
                }
            count1=0;
            count2=0;
            System.out.println();
        }
    }
}
