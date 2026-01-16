import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


// 19.Group employees by department using Collectors.groupingBy() --->>>>>

public class Group_employees_by_department_using_Collectors_groupingBy {

    static class Employee{
        private String name;
        private String department;

        public  Employee(String name,String department){
            this.name=name;
            this.department=department;
        }
        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
          new Employee("Nikhil", "Development"),
          new Employee("Rohit", "Finance"),
          new Employee("shruti", "HR"),
          new Employee("JACK", "Finance"),
          new Employee("dev", "IT")
        );

        Map<String , List<Employee>>  groupByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        groupByDepartment.forEach((department, empList) -> {
            System.out.println(department + " " + empList);
        });
    }
}
