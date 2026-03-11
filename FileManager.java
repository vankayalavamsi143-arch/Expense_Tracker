import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_NAME = "expenses.dat";

    public static void saveExpenses(ArrayList<Expense> expenses) {

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(expenses);
            out.close();
        } catch (Exception e) {
            System.out.println("Error saving data.");
        }
    }

    public static ArrayList<Expense> loadExpenses() {

        ArrayList<Expense> expenses = new ArrayList<>();

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME));
            expenses = (ArrayList<Expense>) in.readObject();
            in.close();
        } catch (Exception e) {
            System.out.println("No previous data found.");
        }

        return expenses;
    }
}