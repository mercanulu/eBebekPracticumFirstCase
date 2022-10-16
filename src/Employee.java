public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.getSalary()>1000){
            return getSalary()*0.03;
        }
        return 0;
    }
    public double bonus(){
        if(this.getWorkHours()>40){
            return (getWorkHours()-40)*30*4;
        }
        return 0;
    }
    public double raiseSalary(){
        final int currentYear=2021;
        int workYear=currentYear-getHireYear();
        if(workYear<10){
            return getSalary()*0.05;
        } else if (workYear>9 && workYear<20) {
            return getSalary()*0.05;
        }
        else if (workYear>19){
            return getSalary()*0.15;
        }
        this.salary = getSalary()+bonus()-tax();
        return salary;

    }
    @Override
    public String toString() {

        return "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Work Hours: " + workHours + "\n" +
                "Hire Year: " + hireYear + "\n" +
                "Tax: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Raise: " + raiseSalary() + "\n" +
                "Total Salary: "+ (this.getSalary()+bonus()+raiseSalary())+ "\n" +
                "tax and bonus with salary: "+(this.getSalary()+bonus()-tax()+raiseSalary());


    }

}
