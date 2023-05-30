// package homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PhoneBook {
    private Map<String, String> book = new HashMap<>();

    public void add(String numberTelephone, String name) {
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

    public ArrayList<String> searchByName(String name) {
        ArrayList<String> telephones = new ArrayList<>();
        if (book.containsValue(name)) {
            for (Entry<String, String> stringEntry : book.entrySet()) {
                if (name.equals(stringEntry.getValue())) {
                    telephones.add(stringEntry.getKey());
                }
            }
            return telephones;
        }
        return telephones;
    }

    public String searchByNumber(String numberTelephone) {
        if (book.containsKey(numberTelephone)) {
           return book.get(numberTelephone);
        }
        return "";
    }

}