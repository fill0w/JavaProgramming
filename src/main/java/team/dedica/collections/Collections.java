package team.dedica.collections;

import org.springframework.util.comparator.Comparators;

import java.util.*;

public class Collections {

    public List<String> setToList(Set<String> set){
        List<String> targetList = new ArrayList<>(set);
        targetList.sort(Comparator.naturalOrder());
        return targetList;
    }

    public Set<String> listToSet(List<String> list) {
        Set<String> targetSet = new HashSet<>(list);
        return targetSet;
    }

    public Map<Integer, String> hashMapToList(Map<Integer, String> map) {
        Map<Integer, String> targetMap = new HashMap<>(map);
        return targetMap;
    }
}
