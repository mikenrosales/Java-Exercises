abstract class Employee extends Person { // Employee is an abstract class that inherits Person classes
    // Abstract classes is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
    // Employee is a Child class that inherits Person class which is the Parent class using the extends keyword for abstract classes
    private String companyName;

    public Employee(){}

    public Employee(String name,String address,int age,String companyName) {
        super(name,address,age); // call super() to use Parent class' constructor with its private data members
        this.companyName = companyName;
    }
    public void setCompanyName(String cname){
        companyName = cname;
    }

    public String getCompanyName(){
        return companyName;
    }

    public abstract double earnings(); // abstract method of abstract class Employee, does not implement anything
    // Abstract methods can only be used in an abstract class, and it does not have a body. The body is provided by the subclass
    public void display(){
        super.display(); // call super.methodName() to use Parent class' display() method to add
        System.out.println("Company Name: " + companyName);
    }
    @Override // 1st Override: Overrides the toString() method of the Parent Class
    public String toString(){
        return String.format("Name: %s\nAddress: %s\nAge: %d\nCompany Name: %s", getName(), getAddress(), getAge() , companyName);
    }
    @Override // 1st Override: Overrides the Parent class' equals() method to compare this Employee's object variables
    public boolean equals(Object obj){
        if(obj instanceof Employee){
            if (this.companyName == ((Employee)obj).companyName){
                return true;
            }
        }
        return false;
    }
}
