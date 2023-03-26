package Static_Final_Clonable_Experiment;

public  class Employee implements  Cloneable {
    private static int empId;
    private String Name;
    private String city;

     Employee(int empId, String name, String city) {
        this.empId = empId;
        Name = name;
        this.city = city;
    }

    public static int calculateAge(int number){
        int num=number*2;
        return  num;
    }

    public static int getEmpId() {
        return empId;
    }

    public static void setEmpId(int empId) {
        Employee.empId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }


}
