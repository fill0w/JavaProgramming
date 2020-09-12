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
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Apple");
        hashMap.put(2, "Orange");
        hashMap.put(3, "Pear");
        //act

        List<String> fruitList = collections.hashMapToList(hashMap);
        assertEquals("Apple", fruitList.get(0));
        assertEquals("Orange", fruitList.get(1));
        assertEquals("Pear", fruitList.get(2));
    }
}