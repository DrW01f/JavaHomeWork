package homework5;


import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> book = new HashMap<>();

    public void Add(String numberTelephone, String name) {
        book.put(numberTelephone, name);
    }


    public String getToList() { 
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : book.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}