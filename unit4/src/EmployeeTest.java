import java.util.Random;

/**
 * @author jj
 * @date 2019/6/27-9:42 PM
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff=new Employee[3];

        staff[0]=new Employee("Tom",40000);
        staff[1]=new Employee("Dick",60000);
        staff[2]=new Employee("Harry",65000);

        for(Employee e:staff){
            e.setId();
            System.out.println("e = " + e.getId()+" "+e.getName());
        }

        int  n=Employee.getNextId();
        System.out.println("n = " + n);
    }
}

class Employee{
    private static int nextId=1;

    private String name;
    private double salary;
    private int id;

    static{
        Random generator=new Random();
        nextId=generator.nextInt(10000);
    }

    {
        id=nextId;
        nextId++;
    }

    public Employee(String n,double s){
        name=n;
        salary=s;
    }

    public Employee(double s){
        this("Emplpyee #"+nextId,s);
    }

    public Employee(){};

    public String  getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id=nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Employee  e=new Employee("jj",50000);
        System.out.println(e.getName()+" :"+e.getSalary());
    }

    public void raiseSalary(double byPecent){
        double raise=salary*byPecent/100;
        salary+=raise;
    }
}