import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ExpenseManager manager = new ExpenseManager();
        manager.setExpenses(FileManager.loadExpenses());

        while (true) {

            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Filter by Category");
            System.out.println("4. Show Total Expense");
            System.out.println("5. Save & Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Date (dd-mm-yyyy): ");
                    String date = sc.nextLine();

                    Expense expense = new Expense(id, title, amount, category, date);
                    manager.addExpense(expense);

                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:

                    System.out.print("Enter Category: ");
                    String cat = sc.nextLine();

                    manager.filterByCategory(cat);
                    break;

                case 4:
                    System.out.println("Total Expense: " + manager.totalExpense());
                    break;

                case 5:

                    FileManager.saveExpenses(manager.getExpenses());
                    System.out.println("Data saved successfully.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}