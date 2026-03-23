import java.util.Scanner;

public class EmployeeRejistation {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        int id=sc.nextInt();
        sc.nextLine();


        System.out.println("Enter Employee Name : ");
        String name=sc.nextLine();

        System.out.println("Enter Employee Email : ");
        String email=sc.next();

        EmailValidator emailValidator= new EmailValidator();
        if(emailValidator.isValiedEmail(email)){
            if(emailValidator.isCompanyEmail(email)){
                System.out.println("Employee Rejistatioon Successfully !");
                System.out.println();
                Employee employee= new Employee(id,name,email);
                employee.displayDetails();


            }
            else{
                System.out.println("Email must be a company email ending with \"@company.com\" .Please try again. ");


            }

        }
        else{
            System.out.println("Invalied email format .Please try again .");
        }





    }
}