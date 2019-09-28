//Authors: Kenny Lieu, Baoviet(Jean) Duong
import java.io.*;
import java.util.*;

public class ScoreTrakker {
	private static ArrayList<Student> scores = new ArrayList<Student>();
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt" };
	public void loadDataFromFile(String filename) throws FileNotFoundException {
		/*
		 * read student data from filename and 
		 * store Student objects in ArrayList<Student> scores
		 */
		scores = new ArrayList<Student>(); //reset ArrayList of Students
		FileReader reader = new FileReader(filename);
		Scanner in = new Scanner(reader);
		int i=0;
		while(in.hasNextLine()) {
			String name = in.nextLine();
			String score = in.nextLine();
			Student s = new Student(name, 0);
			try{
				s = new Student(name, Integer.parseInt(score));
				scores.add(s);
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid integer score for: " + name);
			}
			i++;
		}
		return;
	}
	public void printInOrder() {
		Collections.sort(scores);
		for(Student s : scores) {
			System.out.println(s);
		}
	}
	public void processFiles() throws FileNotFoundException {
		for(String file: files) {
			try {
				loadDataFromFile(file);
				printInOrder();
				System.out.println();
			}
			catch(FileNotFoundException e) {
				System.out.println("Cannot find file: " + file);
				System.out.println();
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		ScoreTrakker st = new ScoreTrakker();
		st.processFiles();
	}
}
