import java.util.Comparator;

class StudCmpPrist implements Comparator<Student>
{

public int compare(Student a, Student b)
{

    return a.getPatronymic().compareTo(b.getPatronymic());
}

}

class StudCmp implements Comparator<Student>
{

public int compare(Student a, Student b)
{

    return a.getName().compareTo(b.getName());
}

}

class StudCmpSur implements Comparator<Student>
{

public int compare(Student a, Student b)
{

    return a.getSurname().compareTo(b.getSurname());
}

}