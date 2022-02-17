import java.util.*;

public class CollectionsDemo
{

    public static int countStringList(ArrayList<String> list, char a) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toCharArray()[0] == a) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList listDemoNamesakes(ArrayList<Human> listHumans, Human human) {
        ArrayList<Human> namesakes = new ArrayList<>();
        for (int i = 0; i < listHumans.size(); i++) {
            if (listHumans.get(i).getSurname() == human.getSurname()) {
                namesakes.add(listHumans.get(i));
            }
        }

        return namesakes;
    }

    public static ArrayList<Human> copyArrayList(ArrayList<Human> humans, Human human)
    {
        ArrayList<Human> humans1 = new ArrayList<>(humans);
        humans1.remove(human);
        return humans1;

    }

    public static ArrayList<HashSet<Integer>> listHashSets(ArrayList<HashSet<Integer>> hashSets, HashSet<Integer> hashSet)
    {
        ArrayList<HashSet<Integer>> hashSets1 = new ArrayList<>();
        for (int i = 0; i < hashSets.size(); i++) {
            if (hashSets.get(i) == hashSet) {
                continue;
            }
            hashSets1.add(hashSets.get(i));
        }
        return hashSets1;
    }

    public static ArrayList<Human> maxAgeList(ArrayList<Human> humans)
    {
        int maxAge = 0;
        ArrayList<Human> result = new ArrayList<>();

        for (int i = 0; i < humans.size(); i++)
        {
            if (humans.get(i).getAge() > maxAge)
            {
                maxAge = humans.get(i).getAge();
            }
        }

        for (Human h : humans)
        {
            if (h.getAge() == maxAge)
            {
                result.add(h);
            }
        }
        return result;
    }

    public static HashSet<Human> setIdContained(Map<Integer, Human> maps, HashSet<Integer> ids) {
        HashSet<Human> result = new HashSet<>();
        for (Map.Entry<Integer, Human> entry : maps.entrySet()) {
            Integer key = entry.getKey();
            Human human = entry.getValue();
            for (int i = 0; i < ids.size(); i++) {
                if (ids.contains(key)) {
                    result.add(human);
                }
            }
        }
        return result;
    }

    public static ArrayList<Integer> ageAtLeastEighteen(Map<Integer, Human> maps) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Human> entry : maps.entrySet())
        {
            Integer key = entry.getKey();
            Human human = entry.getValue();
            if (human.getAge() >= 18) {
                result.add(key);
            }
        }
        return result;
    }

    public static Map<Integer, Integer> idAndAge(Map<Integer, Human> maps) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, Human> entry : maps.entrySet()) {
            Integer key = entry.getKey();
            Human human = entry.getValue();
            result.put(key, human.getAge());
        }
        return result;
    }
    public static Map<Integer, Human> compareAgeAndPerson(int age, ArrayList<Human> humans)
    {
        Map<Integer, Human> result = new HashMap<>();
        for (Human human : humans) {
            if (human.getAge() == age) {
                result.put(age, human);
            }
        }
        return result;
    }

}