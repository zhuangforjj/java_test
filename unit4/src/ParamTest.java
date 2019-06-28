/**
 * @author jj
 * @date 2019/6/28-10:27 AM
 */
public class ParamTest {
    public static void main(String[] args) {
        System.out.println("Testing tripleValue:");
        double pecent=10;
        System.out.println("pecent = " + pecent);
        tripValue(pecent);
        System.out.println("end pecent = " + pecent);

        System.out.println("\nTesting tripleSalary:");
        Employee harry=new Employee("harry",50000);
        System.out.println("harry = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("end harry = " + harry.getSalary());

        System.out.println("\nTesting swap");
        Employee a=new Employee("Alice",70000);
        Employee b=new Employee("Bob",60000);
        System.out.println("a = " + a.getName());
        System.out.println("b = " + b.getName());
        swap(a,b);
        System.out.println("end a = " + a.getName());
        System.out.println("end b = " + b.getName());
    }

    public static void tripValue(double x){
        x=3*x;
        System.out.println("after x = " + x);
    }

    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("after x = " + x.getSalary());
    }

    public static void swap(Employee x,Employee y){
        Employee  temp=x;
        x=y;
        y=temp;
        System.out.println("after x = " + x.getName());
        System.out.println("after y = " + y.getName());
    }
}
