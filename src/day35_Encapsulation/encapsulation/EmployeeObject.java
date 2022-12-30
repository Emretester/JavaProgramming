package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tahir", 'Q', -1000, 120000);

        employee1.setAge(32);

        Employee employee2 = new Employee("Aygun", 'F', 25, 115000);

        employee2.setSalary(employee1.getSalary() + 15000);

        System.out.println(employee1);
        System.out.println(employee2);
    }

}
