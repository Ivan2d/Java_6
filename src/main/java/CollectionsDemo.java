import java.util.*;

import static java.util.Comparator.naturalOrder;

public class CollectionsDemo
{
    public static int countStringList(List<String> list, char a)
    {
        int count = 0;

        List<String> list1 = new ArrayList<>();

        for(String str: list)
        {
            if (!(str.equals("")))
            {
                list1.add(str);
            }
        }

        for(String str: list1)
        {
            if (str.charAt(0) == a)
            {
                count++;
            }
        }
        return count;
    }

    public static List<Human> listNamesakes(List<Human> listHumans, Human human)
    {
        ArrayList<Human> namesakes = new ArrayList<>();

        for (int i = 0; i < listHumans.size(); i++) {
            if (listHumans.get(i).getSurname().equals(human.getSurname())) {
                namesakes.add(listHumans.get(i));
            }
        }
        return namesakes;
    }

    public static List<Human> copyArrayList(List<Human> humans, Human human)
    {
        ArrayList<Human> humans1 = new ArrayList<>();

        for (Human hum : humans) {
            if (!hum.equals(human))
            {
                Human hum1 = new Human(hum);
                humans1.add(hum1);
            }
        }
        return humans1;
    }

public static List<HashSet<Integer>> listHashSets(List<HashSet<Integer>> hashSets, Set<Integer> hashSet)
{
    List<HashSet<Integer>> list = new ArrayList<>(hashSets);
    List<HashSet<Integer>> resik = new ArrayList<>();

    for (HashSet<Integer> set : list)
    {
        HashSet<Integer> copyset = new HashSet<Integer>(set);
        set.removeAll(hashSet);

        if (copyset.equals(set)) {
            resik.add(set);
        }
    }
    return resik;
}

    public static List<Human> maxAgeList(List<Human> humans) {
        int maxAge = 0;

        ArrayList<Human> result = new ArrayList<>();

        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getAge() > maxAge) {
                maxAge = humans.get(i).getAge();
            }

        }
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getAge() == maxAge) {
                result.add(humans.get(i));
            }
        }
        return result;
    }

    public static Set<Human> setIdContained(Map<Integer, Human> maps, Set<Integer> ids) {
        HashSet<Human> result = new HashSet<>();

        for (Map.Entry<Integer, Human> entry : maps.entrySet()) {
            Integer key = entry.getKey();
            Human human = entry.getValue();

            if (ids.contains(key)) {
                result.add(human);
            }
        }
        return result;
    }

    public static List<Integer> ageAtLeastEighteen(Map<Integer, Human> maps) {
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Human> entry : maps.entrySet()) {
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

    public static Map<Integer, List<Human>> compareAgeAndPerson(Set<Human> humans) {
        Map<Integer, List<Human>> result = new HashMap<>();

        for (Human hum : humans) {
            List<Human> ages = new ArrayList<>();

            for (Human person : humans) {
                if (hum.getAge() == person.getAge()) {
                    ages.add(person);
                }
            }

            result.put(hum.getAge(), ages);
        }

        return result;
    }

    public static List<Student> sortlist(Set<Student> humans)
    {
        List<Student> l = new ArrayList<>();
        Comparator<Student> pcomp = new StudCmpSur().thenComparing(new StudCmp()).thenComparing(new StudCmpPrist());
        TreeSet<Student> people = new TreeSet(pcomp);

        for(Student n: humans)
        {
            people.add(n);
        }

        for(Student m: people)
        {
            l.add(m);
        }

        return l;
    }
}