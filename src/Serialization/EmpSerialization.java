package Serialization;

import java.io.*;

public class EmpSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Employee emp= new Employee();
//        FileOutputStream fos= new FileOutputStream("serial.txt");
//        ObjectOutputStream oos= new ObjectOutputStream(fos);
//        oos.writeObject(emp);

        FileInputStream fis= new FileInputStream("serial.txt");
        ObjectInputStream ois= new ObjectInputStream(fis);
        Employee d2= (Employee) ois.readObject();
        System.out.println(d2.empId+d2.city+d2.name);

    }
}
