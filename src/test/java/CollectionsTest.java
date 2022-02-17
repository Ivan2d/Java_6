import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.util.ArrayList;
import java.util.HashSet;

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

    


}
