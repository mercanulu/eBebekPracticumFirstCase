import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Employee employee1 = new Employee("Mercan Ulu", 8000,35,2005);
        Employee employee2 = new Employee("Yunus Ulu", 10000,50,2010);
        Employee employee3 = new Employee("Muhammed Ulu",500,45,2020);

        Employee[] employees ={employee1,employee2,employee3};
        for(Employee employee:employees){
            System.out.println(employee.toString());
            System.out.println("-----------------------------");
        }


    }
}
