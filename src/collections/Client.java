package collections;

import java.util.*;

public class Client {

    public static void main(String[] args) {
        List<String> nos = new ArrayList<>();  // insertion order
        nos.add("hbvbf");
        nos.add("cdhvfhfv");
        nos.add("jnhbdg");
        nos.add("xnsbdv");
        System.out.println(nos);


        List<String> nos2 = new LinkedList<>();
        nos2.add("hbvbf");
        nos2.add("cdhvfhfv");
        nos2.add("jnhbdg");
        nos2.add("xnsbdv");
        System.out.println(nos2);


        Set<String> nos3 = new HashSet<>();  // random order
        nos3.add("hbvbf");
        nos3.add("cdhvfhfv");
        nos3.add("jnhbdg");
        nos3.add("xnsbdv");
        System.out.println(nos3);



        Set<String> nos4 = new TreeSet<>();  // lexographical order  ascending order
        nos4.add("hbvbf");
        nos4.add("cdhvfhfv");
        nos4.add("jnhbdg");
        nos4.add("xnsbdv");
        System.out.println(nos4);

        Set<String> nos5 = new LinkedHashSet<>();
        nos5.add("hbvbf");
        nos5.add("cdhvfhfv");
        nos5.add("jnhbdg");
        nos5.add("xnsbdv");
        System.out.println(nos5);


        Integer[] arr={4,2,57,3,5,6,7};

        Arrays.sort(arr , new Comparator<Integer>() {    // comparator gives val. in decreasing order is generic and
                                                           // func. interface so we use ony one method
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i:arr)
            System.out.print(i+ " ");

        System.out.println();


        List<Student>students = new ArrayList<>();

        students.add(new Student(1, "Ram", 80.30, 25));
        students.add(new Student(2, "Sham", 81.30, 24));
        students.add(new Student(3, "Calm", 90.30, 23));
        students.add(new Student(4, "Encore", 99.30, 22));


        Collections.sort(students);


           Collections.sort(students,new StudentScoreComparator());    // user defined
                                                                        /* sometimes when i want to define based on scoring
                                                                             then i cant disturb the natural ordering so for specific
                                                                           sorting we implement comparator*/

//          Collections.sort(students, new Comparator<Student>() {   // instead of creating a new class StudentScoreComparator we can do it here only.
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.score == o2.score){
//                    return o1.id.compareTo(o2.id);
//                }
//                return o2.score.compareTo(o1.score);
//            }
//        });

//        HashMap
        for(Student student:students){
            System.out.println(student.id + " " + student.name + " " + student.score + " " + student.age);
        }

//        To create the natural ordering of a class we need to implement comparable. like in Integer we know the ordering is in ascending
//        order but in the case of student object we dont know the ordering so we need to define the ordering.
//        for specific sorting we implement comparator(user defined sorting)


    }
}
