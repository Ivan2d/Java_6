import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.*;

public class CollectionsTest {
@Test
public void checkchar() {
    char b = 'a';
    CollectionsDemo collect = new CollectionsDemo();
    List<String> str1 = List.of("a", "abc", "sda", "");
    assertEquals(collect.countStringList(str1, b), 2);
}

@Test
public void checkListDemo() {
    CollectionsDemo collect = new CollectionsDemo();
    List<Human> humans = new ArrayList<>();
    List<Human> humana = new ArrayList<>();
    Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 19);
    Human human2 = new Human("Артоновенко", "Вероника", "Николаевна", 19);
    Human human3 = new Human("Ортогональка", "Петр", "Сергеевич", 20);
    humans.add(human1);
    humans.add(human2);
    humana = collect.listNamesakes(humans, human3);
    assertTrue(humana.isEmpty());
}

@Test
public void checkHuman() {
    CollectionsDemo collect = new CollectionsDemo();
    ArrayList<Human> humans = new ArrayList<>();
    Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 19);
    Human human2 = new Human("Артоновенко", "Вероника", "Николаевна", 19);
    Human human3 = new Human("Ортогональка", "Петр", "Сергеевич", 20);
    humans.add(human1);
    humans.add(human2);
    humans.add(human3);
    assertEquals(humans.size(), 3);
}

@Test
public void checkHumanHere() {
    CollectionsDemo collect = new CollectionsDemo();
    ArrayList<Human> humans = new ArrayList<>();
    Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 19);
    Human human2 = new Human("Артоновенко", "Вероника", "Николаевна", 19);
    Human human3 = new Human("Ортогональка", "Петр", "Сергеевич", 20);
    humans.add(human1);
    humans.add(human2);
    humans.add(human3);


    List<Human> res = collect.copyArrayList(humans, human1);
    assertEquals(res.size(), 2);
    assertEquals(res.get(0).getName(), "Вероника");

    humans.get(1).setName("Марьяна");
    assertEquals(res.get(0).getName(), "Вероника");
}

@Test
public void checkSet2() {
    List<HashSet<Integer>> l = new ArrayList<>();
    HashSet<Integer> a = new HashSet<>(List.of(1, 3, 5));
    HashSet<Integer> b = new HashSet<>(List.of(2, 4, 6));
    HashSet<Integer> c = new HashSet<>(List.of(7, 8, 9));
    ArrayList<Set<Integer>> k = new ArrayList<>();
    k.add(a);
    k.add(b);
    l.add(a);
    l.add(b);

    assertEquals(CollectionsDemo.listHashSets(l, c), k);
}

@Test
public void checkSet22() {

    List<HashSet<Integer>> l = new ArrayList<>();
    Set<Integer> c = Set.of(3, 7);

    HashSet<Integer> a = new HashSet<>();
    a.add(2);
    a.add(8);
    l.add(a);

    List<Set<Integer>> r = List.of(
            Set.of(2, 8)
    );


    assertEquals(CollectionsDemo.listHashSets(l, c), r);
}

@Test
public void checkmaxage() {
    CollectionsDemo collect = new CollectionsDemo();
    List<Human> humans = new ArrayList<>();
    Student human1 = new Student("Артоновенко", "Марк", "Михайлович", 18, "omgu");
    Student human2 = new Student("Артоновенко", "Вероника", "Николаевна", 19, "omgu");
    Student human3 = new Student("Ортогональка", "Петр", "Сергеевич", 20, "Omgu");
    humans.add(human1);
    humans.add(human2);
    humans.add(human3);
    humans = collect.maxAgeList(humans);
    assertEquals(humans.get(0).getAge(), 20);
}

@Test
public void hashsettest() {
    CollectionsDemo collect = new CollectionsDemo();
    Set<Human> hum = new HashSet<>();

    int a = 19, b = 20, c = 18;

    Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 19);
    Human human2 = new Human("Артоновенко", "Вероника", "Николаевна", 19);
    Human human3 = new Human("Ортогональка", "Петр", "Сергеевич", 20);

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
public void hashsetagetest() {
    CollectionsDemo collect = new CollectionsDemo();
    List<Integer> hum = new ArrayList<>();
    HashMap<Integer, Human> humanHashMap = new HashMap<>();

    Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 17);
    Human human2 = new Human("Артоновенко", "Вероника", "Николаевна", 19);
    Human human3 = new Human("Ортогональка", "Петр", "Сергеевич", 20);

    humanHashMap.put(22, human1);
    humanHashMap.put(20, human2);
    humanHashMap.put(21, human3);

    hum = collect.ageAtLeastEighteen(humanHashMap);
    assertEquals(hum.size(), 2);
}

@Test
public void hashagetaken() {
    CollectionsDemo collect = new CollectionsDemo();
    List<Integer> hum = new ArrayList<>();
    Map<Integer, Human> humanHashMap = new HashMap<>();
    Map<Integer, Integer> humanHashMap1 = new HashMap<>();

    Human human1 = new Human("Артоновенко", "Марк", "Михайлович", 17);
    Human human2 = new Human("Артоновенко", "Вероника", "Николаевна", 19);
    Human human3 = new Human("Ортогональка", "Петр", "Сергеевич", 20);

    humanHashMap.put(20, human1);
    humanHashMap.put(22, human2);
    humanHashMap.put(21, human3);

    humanHashMap1 = collect.idAndAge(humanHashMap);


    assertEquals(humanHashMap1.toString(), "{20=17, 21=20, 22=19}");
}

@Test
public void hashagetaken1() {
    CollectionsDemo collect = new CollectionsDemo();
    List<Integer> hum = new ArrayList<>();
    Map<Integer, List<Human>> humanHashMap1 = new HashMap<>();
    Set<Human> people = new HashSet<>();

    Human human1 = new Human("ы", "ы", "ыыы", 20);
    Human human2 = new Human("ы", "ы", "ы", 17);
    Human human4 = new Human("aaaы", "ы", "ы", 17);
    Human human3 = new Human("ы", "ы", "ыы", 20);

    people.add(human1);
    people.add(human2);
    people.add(human3);
    people.add(human4);

    humanHashMap1 = collect.compareAgeAndPerson(people);


    assertEquals(humanHashMap1.size(), 2);
    assertEquals(humanHashMap1.get(17).size(), 2);
}

@Test
public void sortstudents()
{
    CollectionsDemo collect = new CollectionsDemo();
    List<Student> hum = new ArrayList<>();
    Set<Student> people = new HashSet<>();
    Deque<Student> o = new ArrayDeque<>();

    Student human1 = new Student("Дмитриев", "a", "ы", 18, "omgu");
    Student human2 = new Student("Антонов", "c", "ы", 19, "omgu");
    Student human3 = new Student("Буденый", "b", "ы", 20, "Omgu");
    Student human4 = new Student("Залов", "d", "ы", 18, "omgu");
    Student human6 = new Student("Хрящиков", "f", "ы", 19, "omgu");
    Student human7 = new Student("Пуков", "t", "ы", 20, "Omgu");

    people.add(human1);
    people.add(human2);
    people.add(human3);
    people.add(human4);
    people.add(human6);
    people.add(human7);

    hum = collect.sortlist(people);

    Iterator<Student> it = hum.iterator();
    while(it.hasNext())
    {
        o.add(it.next());
    }

    assertEquals(hum, o);
}

}



