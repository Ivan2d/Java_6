import java.util.*;

    public class CollectionsDemo {
    public static int countStringList(List<String> list, char a) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toCharArray()[0] == a) {
                count++;
            }
        }
        return count;
    }

    public static List<Human> listNamesakes(List<Human> listHumans, Human human) {
        ArrayList<Human> namesakes = new ArrayList<>();

        for (int i = 0; i < listHumans.size(); i++) {
            if (listHumans.get(i).getSurname().equals(human.getSurname())) {
                namesakes.add(listHumans.get(i));
            }
        }
        return namesakes;
    }

    public static List<Human> copyArrayList(List<Human> humans, Human human) {
        ArrayList<Human> humans1 = new ArrayList<>();

        for (Human hum : humans) {
            if (!hum.equals(human)) {
                humans1.add(hum);
            }
        }
        return humans1;
    }

    public static List<Set<Integer>> listHashSets(List<Set<Integer>> hashSets, Set<Integer> hashSet) {
        ArrayList<Set<Integer>> resik = new ArrayList<>();

        for (Set<Integer> set : hashSets) {
            HashSet<Integer> copyset = new HashSet<Integer>(set);
            set.removeAll(hashSet);

            if (copyset.equals(set)) {
                resik.add(set);
            }
        }
        return resik;
    }

    public static List<Student> maxAgeList(List<Student> humans) {
        int maxAge = 0;

        ArrayList<Student> result = new ArrayList<>();

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

    public static List<Student> sortlist (Set<Student> humans)
    {
        ArrayList<Student> iterstudents = new ArrayList<>();
        Queue<Student> students = new PriorityQueue<>(new StudentComparator());

        for(Student man: humans)
        {
            students.add(man);
        }

        for(Student man: students)
        {
            iterstudents.add(man);
        }

        return iterstudents;
    }

    }