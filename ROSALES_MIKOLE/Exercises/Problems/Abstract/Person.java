public class Person { // Person is the Parent Class/Superclass
    private String name;
    private String address;
    private int age;

    public Person(){}
    public Person(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void display() {
        System.out.println("Name      : "+name);
        System.out.println("Address   : "+address);
        System.out.println("Age       : "+age);
    }
    public String toString(){ // Will be the default display if a class object of Person is printed
        return "Name: " + name + "\nAddress: " + address +"\nAge: " + age + "\n";
    }

    public boolean equals(Object obj){ // User-defined method, modified to check if Object values are equal to another Object of the same class
        if(obj instanceof Person){ // Check if obj is an object of the Person class based on parameterized constructor
            if (this.age == ((Person)obj).age && this.name == ((Person)obj).name && this.address == ((Person)obj).address ){
                return true;
            }
        }
        return false;
    }
}
