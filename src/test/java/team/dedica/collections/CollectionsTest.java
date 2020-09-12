package team.dedica.collections;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {

    @Test
    void setToList() {
        //arrange
        Collections collections = new Collections();
        Set<String> set = new HashSet<>();
        set.add("Egg");
        set.add("Milk");
        set.add("Toast");
        //act
        List<String> shoppingList = collections.setToList(set);
        //assert
        assertEquals("Egg", shoppingList.get(0));
        assertEquals("Milk", shoppingList.get(1));
        assertEquals("Toast", shoppingList.get(2));
    }

    @Test
    void listToSet() {
        //arrange
        Collections collections = new Collections();
        List<String> list = new ArrayList<>();
        list.add("Honey");
        list.add("Oats");
        list.add("Almond");
        list.add("Almond");
        list.add("Almond");
        //act
        Set<String> shoppingSet = collections.listToSet(list);
        //assert
        assertEquals(true, shoppingSet.contains("Almond"));
        assertEquals(true, shoppingSet.contains("Oats"));
        assertEquals(true, shoppingSet.contains("Honey"));
    }
    @Test
    void hashMapToList() {
        //arrange
        Collections collections = new Collections();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Orange");
        map.put(3, "Pear");
        //act
        List<String> fruits = new ArrayList<String>(map.values());
        List<Integer> ints = new ArrayList<Integer>(map.keySet());
        System.out.println(ints);
        System.out.println(fruits);

    }
}