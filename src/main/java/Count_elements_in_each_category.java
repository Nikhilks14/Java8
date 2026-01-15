import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Count_elements_in_each_category {

    static class Employee{
        String name;
        String department;

        Employee(String name, String department){
            this.name = name;
            this.department = department;
        }

        public String getDepartment(){
            return department;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Nikhil" , "Developer"),
                new Employee("Rohit" , "QA"),
                new Employee("Mohit" , "HR"),
                new Employee("Rahul" , "HR"),
                new Employee("Sumit" , "Developer")
        );

        Map<String, Long> departmentCount = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println(departmentCount);
    }
}
