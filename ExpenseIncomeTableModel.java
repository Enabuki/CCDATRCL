import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class ExpenseIncomeTableModel extends AbstractTableModel {
    private final LinkedList<ExpenseIncomeEntry> entries;
    private final String[] columnNames = {"Date", "Description", "Amount", "Type"};

    public ExpenseIncomeTableModel() {
        entries = new LinkedList<>();
    }

    public void addEntry(ExpenseIncomeEntry entry) {
        String date = entry.getDate();
        if (!isValidDate(date)) {
            JOptionPane.showMessageDialog(null, "Invalid date format. Please enter a valid date.");
            return;
        }
    
        entries.add(entry);
        fireTableRowsInserted(entries.size() - 1, entries.size() - 1);
    }
    
    private boolean isValidDate(String dateString) {
        if (!dateString.matches("(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])/(202[3-9]|2030)")) {
            return false;
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(false);
        
        try {
            sdf.parse(dateString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }


    public void removeEntry(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < entries.size()) {
            ExpenseIncomeEntry entry = entries.get(rowIndex);
            entries.remove(rowIndex);
            fireTableRowsDeleted(rowIndex, rowIndex);

            if (entry.getType().equals("Expense")) {
                fireTableRowsUpdated(rowIndex, entries.size() - 1);
            }
        }
    }

    @Override
    public int getRowCount() {
        return entries.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ExpenseIncomeEntry entry = entries.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return entry.getDate();
            case 1:
                return entry.getDescription();
            case 2:
                return entry.getAmount();
            case 3:
                return entry.getType();
            default:
                return null;
        }
    }
}
