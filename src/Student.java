
public class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Student o) {
		// TODO make it so that the Student with the name comes first in the alphabet is 
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return name + " " + score;
	}
	
}
