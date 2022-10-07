class HourlyEmployee extends Employee {
    // Since abstract Employee class is inherited here, its methods are now accessible
    // In this case, Employee is now the Parent class and HourlyEmployee is now a Child class inheriting Employee class
    private int hoursWorked;
    private double rate;

    public HourlyEmployee(){}

    public HourlyEmployee(String name,String address,int age,String cName,int hoursWorked,double rate)	{
        super(name,address,age,cName);
        this.hoursWorked = hoursWorked;
        this.rate = rate;
    }

    public HourlyEmployee(String name,String address,int age,String cName)	{
        super(name,address,age,cName);
        hoursWorked = 0;
        rate = 0;
    }
    public int getHoursWorked(){
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public double getRate(){
        return this.rate;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public double earnings(){ // abstract method inherited from Employee abstract class is implemented and provided here
        if(hoursWorked > 40)
            return 40 * rate + ( hoursWorked - 40 ) * rate * 1.5;
        else
            return hoursWorked * rate;
    }

    @Override // 2nd Override: Overrides the toString() method of the Parent Class and call super.toString() to add its toString() back
    public String toString(){
        return "" + super.toString() + "\nHours workeed: " + hoursWorked + "\nRate: " + rate;
    }

    @Override // 2nd Override: Overrides the toString() method of Employee class to compare HourlyEmployee's object variables
    public boolean equals(Object obj){
        if(obj instanceof HourlyEmployee){
            if (this.hoursWorked == ((HourlyEmployee)obj).hoursWorked && this.rate == ((HourlyEmployee)obj).rate){
                return true;
            }
        }
        return false;
    }
}
