package Comparable_Comparator;

public class Employee implements  Comparable<Employee> {
    private String name;
    private int age;
    private String job;
    private String city;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Employee() {
    }

    public Employee(String name, int age, String job, String city) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.city = city;
    }


    @Override
    public int compareTo(Employee o) {
        return this.job.compareTo(o.job);
    }

    @Override
    public String toString() {
        return "Comparable_Comparator.Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
