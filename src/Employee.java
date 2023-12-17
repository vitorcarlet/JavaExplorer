import java.io.IOException;

public class Employee {
    private String name;
    private float salary;
    public void setSalary(float value) {
        salary = value;
    }
    public String getName(){
        return this.name;
    }

    public void setNamePlus1(String name){
        try{
        this.name = name+1;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
