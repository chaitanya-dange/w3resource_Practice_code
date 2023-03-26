package Static_Final_Clonable_Experiment;

public class MainMethod  implements  Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Manager mgr01= new Manager(11,"chagan","hinjewadi",12,1000);
        mgr01.calculateAge(12);
        int num= Manager.getEmpId();
        System.out.println(num);

        Manager mgr02= (Manager) mgr01.clone();
        System.out.println(mgr02.getManagerId()+" "+mgr02.getSpecialPay());


    }
}
