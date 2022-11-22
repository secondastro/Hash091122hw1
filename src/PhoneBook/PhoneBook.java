package PhoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final HashMap<String, String> phoneList = new HashMap<>();

    public void addPhone(String name, String phone) {
        phoneList.put(name, phone);
    }

    public Set<Map.Entry<String,String>> getEntries() {
        return phoneList.entrySet();
    }
}
