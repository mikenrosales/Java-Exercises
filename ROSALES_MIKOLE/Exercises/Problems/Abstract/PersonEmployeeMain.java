import java.util.Scanner;

public class PersonEmployeeMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Company Name: ");
        String companyName = sc.nextLine();
        System.out.print("Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = sc.nextInt();

        System.out.println("\nDisplay: ");
        //Test1
        // HourlyEmployee h = new HourlyEmployee("Linc Josef Ato","Talisay City",28,"Alliance",41, 600.00);
        // h.display();
        // System.out.println("\nEarnings: "+h.earnings());

        //Test2
        // HourlyEmployee h1 = new HourlyEmployee("Yule Josef Ato","Cebu City",23,"Accenture",40, 550.98);
        // HourlyEmployee h2 = new HourlyEmployee("Yule Josef Ato","Cebu City",23,"Accenture",40, 550.98);
        // HourlyEmployee h2 = new HourlyEmployee("Linc Josef Ato","Talisay City",28,"Alliance",41, 600.00);
        // System.out.println(h1.equals(h2));

        //Test3
        HourlyEmployee h1 = new HourlyEmployee();
        h1.setName(name);
        h1.setAddress(address);
        h1.setAge(age);
        h1.setCompanyName(companyName);
        h1.setRate(rate);
        h1.setHoursWorked(hoursWorked);
        System.out.println(h1);
        System.out.format("Earnings: %.2f", h1.earnings());

        // Person p1 = new Person();
        // p1.setName("Miko");
        // p1.setAddress("Cebu");
        // p1.setAge(22);
        // System.out.println(p1);

    }
}
