// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.*;
public class task1 {

    public static void main(String[] args) {

        HashMap<Object, Object> phoneMap = new HashMap<>();
        phoneMap.put("57474858", "Kate");
        phoneMap.put("543545", "Leo");
        phoneMap.put("5469857", "Chris");
        phoneMap.put("39857", "Chris");
        phoneMap.put("87564567", "Masha");
        phoneMap.put("47856645", "Leo");
        phoneMap.put("8756", "Leo");
        phoneMap.put("9856746", "Mar");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name: ");
        Object name;
        name = scanner.next();

        for(HashMap.Entry<Object, Object> phoneMapEntry : phoneMap.entrySet()) {
            if (phoneMapEntry.getValue().equals(name)) {
                System.out.println(phoneMapEntry.getKey());
            }
        }
    }
}
