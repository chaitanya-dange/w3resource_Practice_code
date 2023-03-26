package Stack_Problems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class _02_SortingElementInStack {
    public static void main(String[] args) {

        Stack<Integer> str= new Stack<Integer>();
        str.push(123);
        str.push(234);
        str.push(345);
        str.push(456);
        str.push(567);

        List<Integer> list= new ArrayList<>();
        while(!str.isEmpty()){
            list.add(str.pop());
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            str.push(list.get(i));
        }

        System.out.println(list);






    }
}
