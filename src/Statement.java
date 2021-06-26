import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Statement {
    private TreeMap<Date, ArrayList<Operation>> operations;

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
}
