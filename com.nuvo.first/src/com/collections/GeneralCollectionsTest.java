package com.collections;

//import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class GeneralCollectionsTest {

	public static void main(String args[]) {


		
		Set<Integer> mySet = new HashSet<Integer>();
		
		Set<Student> mySet1 = new HashSet<Student>();
		
		Student st1 = new Student(7,"Harel","Gotliv");
		Student st2 = new Student(9,"Ori","Oved");
		Student st3 = new Student(8,"Beni","Far1");
		Student st4 = new Student(5,"Beni","Far");
		Student st5 = new Student(1,"Yoni","Gotliv");
		Student st6 = new Student(2,"Yossi","Ger");
		Student st7 = new Student(3,"Harel","Dav");
		Student st8 = new Student(4,"Ori","Lev");
		mySet1.add(st1);
		mySet1.add(st2);
		mySet1.add(st3);
		mySet1.add(st4);
		
		Set<Student> mySet2 = new TreeSet<Student>();

		mySet2.add(st1);
		mySet2.add(st2);
		mySet2.add(st3);
		mySet2.add(st4);
		

		
		
		
		List<Integer> listArray = Arrays.asList(1,2,3,4,5);

		Queue<Student> studentPriorityQueue = new PriorityQueue<Student>(/*7,studentComparator*/);
		studentPriorityQueue.add(st1);
		studentPriorityQueue.add(st2);
		studentPriorityQueue.add(st3);
		studentPriorityQueue.add(st4);
		studentPriorityQueue.add(st5);
		studentPriorityQueue.add(st6);
		studentPriorityQueue.add(st7);
		studentPriorityQueue.add(st8);
		
        System.out.println("Order of students in PriorityQueue");
        System.out.println(studentPriorityQueue);
		
		pollDataFromQueue(studentPriorityQueue);
		
		int i = 0;
//		mySet.
		ArrayList<Integer> list = new ArrayList<Integer>();
				
	}
	
	public static Comparator<Student> studentComparator = new Comparator<Student>(){

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.firstName.compareTo(o2.getFirstName());
//			return o1.age-o2.age;
		}
		
	};
	
    //utility method to poll data from queue
    private static void pollDataFromQueue(Queue<Student> studentPriorityQueue) {
        while(true){
            Student student = studentPriorityQueue.poll();
            if(student == null) break;
            System.out.println("Processing Student with first name="+student.getFirstName() + " and age= " + student.getAge());
        }
    }
}
