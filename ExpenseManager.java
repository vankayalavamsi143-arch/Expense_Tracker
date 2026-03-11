import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense Added Successfully!");
    }

    public void viewExpenses() {

        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }

        System.out.println("ID | Title | Amount | Category | Date");

        for (Expense e : expenses) {
            e.display();
        }
    }

    public void filterByCategory(String category) {

        boolean found = false;

        for (Expense e : expenses) {
            if (e.getCategory().equalsIgnoreCase(category)) {
                e.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expenses in this category.");
        }
    }

    public double totalExpense() {

        double total = 0;

        for (Expense e : expenses) {
            total += e.getAmount();
        }

        return total;
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(ArrayList<Expense> expenses) {
        this.expenses = expenses;
    }
}