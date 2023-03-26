package Comparable_Comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class User_Main {
    public static void main(String[] args) {

        List<User> user= new ArrayList<User>();
        user.add(new User("chaitanya","chandrapur",20,"male", LocalDate.of(1996,03,05)));
        user.add(new User("amar","delhi",50,"male", LocalDate.of(1976,8,12)));
        user.add(new User("akbar","mumbai",40,"male", LocalDate.of(1986,9,15)));
        user.add(new User("antony","chennai",29,"male", LocalDate.of(1946,11,26)));
        user.add(new User("pranay","pune",24,"male", LocalDate.of(1999,02,21)));

        Collections.sort(user);// this is possible due to natural sorting , user is extended by comparable...

        System.out.println(user);

        //filter according age higher than 25...

        List<User> users = user.stream().filter(i -> i.getAge() > 25).collect(Collectors.toList());

        // sorting according to date of birth..
        List<User> userList = user.stream().sorted(Comparator.comparing(User::getDateOfBirth)).collect(Collectors.toList());



    }
}
