import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class weekfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<String> employeeNames = new ArrayList<String>();
        employeeNames.add("Bobby");
        employeeNames.add("Ronnie");
        employeeNames.add("Ricky");
        employeeNames.add("Mike");
        employeeNames.add("Johnny");
        
   HashSet<Integer> ids = new HashSet<Integer>();
   HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);
        
        int i = 0;
        
        for (Integer id : ids) {
            employeeMap.put(id, employeeNames.get(i)); i ++;
            }

        for (Integer key : employeeMap.keySet()) {
            System.out.println("Employee " + key + " = " + employeeMap.get(key));
        }

        StringBuilder idsBuilder = new StringBuilder();
		for(Integer id: ids) {
			idsBuilder.append(id);
			idsBuilder.append("-");
		}
		System.out.println(idsBuilder); 
		
		StringBuilder namesBuilder = new StringBuilder();
		for(String name: employeeNames) {
			namesBuilder.append(name);
			namesBuilder.append(" ");
		}
		System.out.println(namesBuilder);
		
	}

}