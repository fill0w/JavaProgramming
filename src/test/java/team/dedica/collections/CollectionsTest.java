package team.dedica.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
}