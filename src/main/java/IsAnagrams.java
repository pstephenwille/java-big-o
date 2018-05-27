package main.java;

import java.util.HashMap;
import java.util.Map;

public class IsAnagrams {

    boolean isAnagram(String _a, String _b) {
        if (_a == null || _b == null) {
            return false;
        }
        // Complete the function
        String a = _a.toLowerCase();
        String b = _b.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        // create keys
        for (int i = 0; i < b.length(); i++) {
            Character ltr1 = b.charAt(i);
            if (!map.containsKey(ltr1)) {
                map.put(ltr1, 1);
            } else {
                Integer count = map.get(ltr1);
                map.put(ltr1, ++count);
            }
        }
        // subtract used keys
        for (int j = 0; j < a.length(); j++) {
            Character ltr2 = a.charAt(j);

            if (!map.containsKey(ltr2)) {
                return false;
            }

            Integer count = map.get(ltr2);
            map.put(ltr2, --count);
        }

        // count keys
        for (int k = 0; k < a.length(); k++) {
            Character ltr3 = a.charAt(k);
            Integer freqInteger = map.get(ltr3);

            if (freqInteger != 0) {
                return false;
            }
        }

        return true;
    }
}
