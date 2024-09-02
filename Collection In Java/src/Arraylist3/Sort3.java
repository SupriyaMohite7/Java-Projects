package Arraylist3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1 {
    int id;
    String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee1{id=" + id + ", name='" + name + '\'' + '}';
    }
}

public class Sort3 {
    public static void main(String[] args) {
        ArrayList<Employee1> employeeList = new ArrayList<>();
        employeeList.add(new Employee1(3, "Priya"));
        employeeList.add(new Employee1(1, "Bobby"));
        employeeList.add(new Employee1(2, "chhaya"));

        Collections.sort(employeeList, new Comparator<Employee1>() {
            @Override
            public int compare(Employee1 e1, Employee1 e2) {
                if (e1.id > e2.id) {
                    return -1;
                } else if (e1.id < e2.id) {
                    return 1;
                } else {
                    return 0; 
                }
            }
        });

        for (Employee1 employee : employeeList) {
            System.out.println(employee);
        }
    }
}

