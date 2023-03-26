package Static_Final_Clonable_Experiment;

public class Manager extends Employee {

    private int managerId;
    private int specialPay;


    public Manager(int empId, String name, String city,int managerId,int specialPay) {
        super(empId, name, city);
        this.managerId=managerId;
        this.specialPay=specialPay;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getSpecialPay() {
        return specialPay;
    }

    public void setSpecialPay(int specialPay) {
        this.specialPay = specialPay;
    }
}
