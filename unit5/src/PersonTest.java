import java.time.LocalDate;
import java.util.Objects;

/**
 * @author jj
 * @date 2019/7/4-10:20 AM
 * 继承
 * 1.将公共操作放在超类中
 * 2.不要使用protected
 * 3.实现"is-a"的关系
 * 4.继承的方法有意义时，才用继承
 * 5.覆盖方法时，不要改变预期的行为
 * 6.多使用多态代替多类型信息
 * 7.不要过多的使用放射
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people=new Person[2];

        people[0]=new Employee("Harry Hacker",50000,1989,10,1);
        people[1]=new Student("Maria Morris","computer science");

        for(Person p:people){
            System.out.println(p.getName()+", "+p.getDescription());
        }
    }
}

abstract class Person{
    public abstract String getDescription();
    private String name;

    public Person(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}

class Employee extends Person{
    private double salary;
    private LocalDate hireDay;

    public Employee(String name,double salary,int year,int month,int day){
        super(name);
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an  employee with a salary of $%.2f",salary);
    }

    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }

    @Override
    public boolean equals(Object otherObject) {

        //第一步，先判断是不是引用同一个对象，或者都为null
        if(this==otherObject)   return true;

        //第二步，判断是不是该对象为null
        if(otherObject==null)    return false;

        //第三步，判断是不是同一个类
        if(getClass()!=otherObject.getClass())  return false;

        //第四步，创建一个other
        Employee other=(Employee)otherObject;

        //第五步，对比
        return Objects.equals(getName(),other.getName())
                &&salary==other.salary
                &&Objects.equals(hireDay,other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),salary,hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName()+
                "[name="+getName()+
                ",salary="+salary+
                ",hireDay="+hireDay+
                "]";
    }
}

class Student extends Person{
    private String major;
    public  Student(String name,String major){
        super(name);
        this.major=major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in "+major;
    }
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name,double salary,int year,int month,int day){
        super(name,salary,year,month,day);
        bonus=0;
    }

    @Override
    public double getSalary(){
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if(!super.equals(otherObject))  return false;

        Manager other=(Manager)otherObject;
        return bonus==other.bonus;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+17*new Double(bonus).hashCode();
    }

    @Override
    public String toString() {
        return super.toString()+
                "[bonus="+bonus+
                "]";
    }
}