//Authors: Kenny Lieu, Baoviet(Jean) Duong
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
		//compares Students' names alphabetically
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return name + " " + score;
	}
	
}
