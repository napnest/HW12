import java.sql.SQLOutput;

public class Person {
    private String name;
    private String jobTitle;
    private String placeOfWork;
    private int age;
    private double salary;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public String getPlaceOfWork(){
        return placeOfWork;
    }
    public void setPlaceOfWork(String placeOfWork){
        this.placeOfWork=placeOfWork;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
    public Person(){

    }
    public Person(String name,String jobTitle,String placeOfWork,int age,double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.placeOfWork=placeOfWork;
        this.age=age;
        this.salary=salary;
    }

}

