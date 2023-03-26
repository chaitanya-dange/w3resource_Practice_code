package BasicPart_01;

public class _93NextNumberBe10_10OR20_20 {
    public static void main(String[] args) {
        int [] arrayInteger={1,2,33,55,66,104,10,14,66,44,20,20};

        for(int i=0;i<arrayInteger.length;i++){

            if(i+1 < arrayInteger.length){
                if(arrayInteger[i]==10 && arrayInteger[i+1]==10 || arrayInteger[i]==20 && arrayInteger[i+1]==20 ){
                    System.out.println("present combo");
                    return;
                }
            }else {
                System.out.println("not present the combo");
            }

        }

        System.out.println();
    }

}
