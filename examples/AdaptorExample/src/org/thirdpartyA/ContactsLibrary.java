package org.thirdpartyA;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * You cannot modify this file, as it is provided by a third party library
 */

public class ContactsLibrary {

    /**
     * This function returns a list of contacts. Each contact is a pair of a "name" and
     * a "phone". It is returned as an ordered Hash, in which the key (String) is the name,
     * and the value (String) is a phone.
     *
     * @return
     */
    public Map<String, String> fetchContacts() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("John", "012545166");
        map.put("Bob", "0121919191981");
        map.put("Billy", "05151616516");
        return map;
    }
}
