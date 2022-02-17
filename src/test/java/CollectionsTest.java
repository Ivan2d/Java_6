import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionsTest
{
    @Test
    public void checkchar()
    {
        char b = 'a';
        CollectionsDemo collect = new CollectionsDemo();
        ArrayList<String> str = new ArrayList<>();
        String string1 = "a";
        String string2 = "abc";
        String string3 = "sda";
        str.add(string1);
        str.add(string2);
        str.add(string3);
        assertEquals(collect.countStringList(str, b), 2);
    }

    @Test
    public void checkListDemo()
    {
        CollectionsDemo collect = new CollectionsDemo();
        ArrayList<Human> humans = new ArrayList<>();
        ArrayList<Human> humana = new ArrayList<>();
        Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 19);
        Human human2 = new Human("Артоновенко","Вероника","Николаевна", 19);
        Human human3 = new Human("Ортогональка","Петр","Сергеевич", 20);
        humans.add(human1);
        humans.add(human2);
        humana = collect.listDemoNamesakes(humans, human3);
        assertTrue(humana.isEmpty());
    }

    @Test
    public void checkHuman()
    {
        CollectionsDemo collect = new CollectionsDemo();
        ArrayList<Human> humans = new ArrayList<>();
        Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 19);
        Human human2 = new Human("Артоновенко","Вероника","Николаевна", 19);
        Human human3 = new Human("Ортогональка","Петр","Сергеевич", 20);
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans = collect.copyArrayList(humans, human3);
        assertEquals(humans.size(),2);
    }

    @Test
    public void checkSet()
    {
        CollectionsDemo collect = new CollectionsDemo();
        ArrayList<HashSet<Integer>> numbers = new ArrayList<>();
        HashSet<Integer> numbers1 =  new HashSet<>();
        int a = 1, b = 2, c = 2;
        numbers1.add(a);
        numbers.add(numbers1);
        numbers1.add(b);
        numbers.add(numbers1);
        numbers1.add(c);
        assertTrue(collect.listHashSets(numbers,numbers1).isEmpty());
    }

    @Test
    public void checkmaxage()
    {
        CollectionsDemo collect = new CollectionsDemo();
        ArrayList<Human> humans = new ArrayList<>();
        Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 19);
        Human human2 = new Human("Артоновенко","Вероника","Николаевна", 19);
        Human human3 = new Human("Ортогональка","Петр","Сергеевич", 20);
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans = collect.maxAgeList(humans);
        assertEquals(humans.get(0).getAge(), 20);
    }

    @Test
    public void hashsettest()
    {
        CollectionsDemo collect = new CollectionsDemo();
        HashSet<Human> hum =  new HashSet<>();
        int a = 19, b = 20, c = 18;
        Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 19);
        Human human2 = new Human("Артоновенко","Вероника","Николаевна", 19);
        Human human3 = new Human("Ортогональка","Петр","Сергеевич", 20);

        HashMap<Integer, Human> humanHashMap = new HashMap<>();
        humanHashMap.put(22, human1);
        humanHashMap.put(20, human2);
        humanHashMap.put(21, human3);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(a);
        hashSet.add(b);
        hashSet.add(c);

        hum = collect.setIdContained(humanHashMap, hashSet);

        assertEquals(hum.size(), 1);
    }

    @Test
    public void hashsetagetest()
    {
        CollectionsDemo collect = new CollectionsDemo();
        ArrayList<Integer> hum =  new ArrayList<>();
        HashMap<Integer, Human> humanHashMap = new HashMap<>();

        Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 17);
        Human human2 = new Human("Артоновенко","Вероника","Николаевна", 19);
        Human human3 = new Human("Ортогональка","Петр","Сергеевич", 20);

        humanHashMap.put(22, human1);
        humanHashMap.put(20, human2);
        humanHashMap.put(21, human3);

        hum = collect.ageAtLeastEighteen(humanHashMap);
        assertEquals(hum.size(), 2);
    }

    @Test
    public void hashagetaken()
    {
        CollectionsDemo collect = new CollectionsDemo();
        ArrayList<Integer> hum =  new ArrayList<>();
        HashMap<Integer, Human> humanHashMap = new HashMap<>();
        Map<Integer, Integer> humanHashMap1 = new HashMap<>();

        Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 17);
        Human human2 = new Human("Артоновенко","Вероника","Николаевна", 19);
        Human human3 = new Human("Ортогональка","Петр","Сергеевич", 20);

        humanHashMap.put(20, human1);
        humanHashMap.put(22, human2);
        humanHashMap.put(21, human3);

        humanHashMap1 =  collect.idAndAge(humanHashMap);


        assertEquals(humanHashMap1.toString(), "{20=17, 21=20, 22=19}");
    }



}
