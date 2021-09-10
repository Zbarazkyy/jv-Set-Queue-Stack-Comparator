package comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {
    public Set<Employee> getEmployeesByOrder(List<Employee> employees) {
        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int ageCompare = Integer.compare(o1.getAge(), o2.getAge());
                if (ageCompare < 0) {
                    return -1;
                }
                if (ageCompare == 0) {
                    return o1.getName().compareTo(o2.getName());
                }

                return 1;
            }
        };
        Set<Employee> result = new TreeSet<>(employeeComparator);
        result.addAll(employees);


        return result;
    }
}
