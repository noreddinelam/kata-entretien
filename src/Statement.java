import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Statement {
    private TreeMap<LocalDate, ArrayList<Operation>> operations = new TreeMap<>();

    public void addOperationToStatement(Operation op) {
        ArrayList<Operation> list;
        if ((list = operations.get(op.getDate())) != null) {
            list.add(op);
        } else {
            list = new ArrayList<>();
            list.add(op);
            this.operations.put(op.getDate(), list);
        }
    }

    public void printStatement() {
        for (Entry<LocalDate, ArrayList<Operation>> entry : this.operations.entrySet()) {
            System.out.println("La date : " + entry.getKey());
            System.out.println("===========================================");
            for (Operation op : entry.getValue()) {
                System.out.println(op);
                System.out.println("--------------------------------------------");
            }
            System.out.println("===========================================");

        }

    }
}
