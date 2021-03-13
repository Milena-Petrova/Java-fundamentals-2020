/*
        Write a program which keeps information about companies and their employees.
        You will receive company name and employee's id, until you receive the command "End".
        Add each employee to the given company. Keep in mind that a company cannot have two employees with the same id.
        When you finish reading data, order the companies by the name in ascending order.

        Input / Constraints
        •	Until you receive "End", the input come in the format: "{companyName} -> {employeeId}"
        •	The input always will be valid
        SoftUni -> AA12345
SoftUni -> AA12345
SoftUni -> CC12344
Lenovo -> XX23456
SoftUni -> AA12345
Movement -> DD11111
End
Lenovo
-- XX23456
Movement
-- DD11111
SoftUni
-- AA12345
-- CC12344
*/
package bg.softuni.fundamentals.MAPs;

import java.util.*;

public class CompanyUsersEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        //company --> unique Id!!!
        Map<String, List<String>> companyUsers = new TreeMap<>();

        while (!command.equals("End")) {
            String[] token = command.split("->");
            String company = token[0];
            String id = token[1];

            companyUsers.putIfAbsent(company, new ArrayList<>());
            if (!companyUsers.get(company).contains(id)) {
                companyUsers.get(company).add(id);
            }
            command = scanner.nextLine();
        }
        companyUsers.entrySet()
                .forEach(e -> {
                    System.out.println(e.getKey().trim());
                    e.getValue()
                            .stream()
                            .forEach(v -> System.out.println("--" + v));

                });
    }
}
