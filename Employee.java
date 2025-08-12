public class Employee
{
    public static void main(String[] args)
{
        int emp_id = 401;
        String name = "Sai Ganesh";
        double gross_sal = 50000;

        double travel_allowance = 13;
        double pf = 15;
        double tax= 5;

        double travel_allowance_amount= (gross_sal * travel_allowance)/ 100;
        double pf_amount = (gross_sal * pf)/ 100;
        double tax_amount =(gross_sal * tax)/ 100;

        double total_reductions = pf_amount + tax_amount;
        double net_salary = gross_sal - total_reductions + travel_allowance;

        System.out.println("Employee ID: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Gross Salary: " + gross_sal);
        System.out.println("Travel Allowance (13%): " + travel_allowance_amount);
        System.out.println("PF (15%): " + pf_amount);
        System.out.println("Tax (5%): " + tax_amount);
        System.out.println("Total Reductions: " + total_reductions);
        System.out.println("Net Salary: " + net_salary);
    }
}
