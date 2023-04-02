package DataStructure.Searching;

public class LinearSearch {


    public static void main(String[] args) {
        int [] array ={1,5,4,51,25,65,79,12,50,60,48,94,13,84};

        int target=94;

        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                System.out.println("the index is "+i);
            }
        }
    }
}
