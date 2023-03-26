package DesignPattern;

public class Pattern09 {

    public static void main(String[] args) {
        int count=0;
        int outer=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                count=count +outer;
                System.out.print(count+" ");


            }
            count=0;
            outer=outer+1;
            System.out.println();
        }
    }

}
