package GFG_Problems_Practice.Recursion;

//Input : A = {1, 2, 3, 4, 5}
//        Output : [48]
//        [20, 28]
//        [8, 12, 16]
//        [3, 5, 7, 9]
//        [1, 2, 3, 4, 5]


public class _1_SumTriangleOfArray {

    public static void main(String[] args) {
        int array[]= {1, 2, 3, 4, 5};

       sumTriangle(array);
    }

    public static void sumTriangle(int [] array){
        //base condition
        if(array.length==1){
            return ;
        }
        int array1[]=new int [array.length-1];

        for(int i=0;i<array1.length;i++){
            array1[i]=array[i]+array[i+1];

           System.out.print(array1[i]+" ");
        }
        System.out.println();

       sumTriangle(array1);
    }
}
