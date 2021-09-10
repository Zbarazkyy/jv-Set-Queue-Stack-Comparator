package set_hashSet;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> hashSet1 = new HashSet<>(set1);
        Set<T> hashSet2 = new HashSet<>(set2);
        hashSet1.removeAll(set2);
        hashSet2.removeAll(set1);
        Set<T> result = new HashSet<>();
        result.addAll(hashSet1);
        result.addAll(hashSet2);

        return result;
    }
}
