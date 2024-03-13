package com.contentment;

public class StudentCourse {
	public static void getCourseFrequency(Student st[],Course ct[])
	{
	
		for(Course c:ct)
		{
			int count = 0;
			for(Student s:st)
			{
				if(s.getCourse().equals(c))
				{
					count++;
				}
			}
			System.out.println(c+"=>"+count);
		}
	}


	public static void main(String[] args) {
		Student s[] = new Student[5];

		s[0] = new Student(1, "k", new double[] { 40, 50 }, new Course(1, "java"));
		s[1] = new Student(2, "l", new double[] { 60, 50 }, new Course(2, ".net"));

		for (Student x : s) {
			System.out.println(x);
		}
		System.out.println("---------------------------------");
		s[2] = new Student();
		s[2].setId(3);
		s[2].setName("d");
		s[2].setMarks(new double[] { 100, 90 });
		s[2].setCourse(new Course(3, "python"));
		for (Student x : s) {
			System.out.println(x);
		}
		System.out.println("---------------------------------");
		Course c[] = new Course[2];
		c[0] = new Course(4, "php");
		c[1] = new Course(5, "testing");
		s[3] = new Student(4, "h", new double[] { 10, 20 }, c[0]);
		for (Student x : s) {
			System.out.println(x);
		}
		System.out.println("---------------------------------");
		s[4] = new Student();
		s[4].setId(5);
		s[4].setName("a");
		s[4].setMarks(new double[] { 100, 90 });
		s[4].setCourse(c[1]);
		for (Student x : s) {
			System.out.println(x);
		}
		System.out.println("---------------------------------");
		getCourseFrequency(s,c);
	}

}
