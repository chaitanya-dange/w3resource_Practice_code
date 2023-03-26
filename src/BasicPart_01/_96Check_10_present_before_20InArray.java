package BasicPart_01;

public class _96Check_10_present_before_20InArray {
    public static void main(String[] args) {
        int[] array_nums = {10, 70, 80, 50, 22, 13, 50};

        boolean check=false;
        for(int i=0;i<array_nums.length;i++){
            if(array_nums[i]==10){
                for(int j=i+1;j<array_nums.length;j++){
                    if(array_nums[j]==20){
                        check=true;
                    }
                }
            }
        }

        System.out.println("The 10 come before 20 : "+ check);
    }
}
