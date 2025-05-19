import java.util.*;

public class priorityQ{

    static class Student implements Comparable<Student>{
        String name; 
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("a",4)); //O(logn)
        pq.add(new Student("b",7));
        pq.add(new Student("c",2));
        pq.add(new Student("d",1));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "," + pq.peek().rank); //O(1)
            pq.remove();
        }
    }
}