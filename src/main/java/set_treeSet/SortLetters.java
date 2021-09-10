package set_treeSet;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class SortLetters {
    public String getUniqueCharacters(String text) {
        String[] litters = text.toLowerCase().split("");
        Set<String> set = new TreeSet<String>();
        for (String temp : litters) {
            boolean check = Pattern.matches("[a-zA-Z]", temp);
            if (check) {
                set.add(temp);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String temp : set) {
            stringBuilder.append(temp);
            count++;
            if (count == 5){
                break;
            }
        }

        return new String(stringBuilder);
    }
}