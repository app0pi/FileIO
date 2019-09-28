import java.io.*;
import java.util.*;

public class ScoreTrakker {
	private static ArrayList<Student> scores = new ArrayList<Student>();
	public void loadDataFromFile(String filename) throws FileNotFoundException {
		/*
		 * read student data from filename and 
		 * store Student objects in ArrayList<Student> scores
		 */
		FileReader reader = new FileReader(filename);
		Scanner in = new Scanner(reader);
		int i=0;
		while(in.hasNextLine()) {
			String name = in.nextLine();
			int scoreVal = in.nextInt();
			if(in.hasNextLine()) {
				String foo = in.nextLine();
			}
			Student s = new Student(name, scoreVal);
			scores.add(s);
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
	public void processFiles(String filename) throws FileNotFoundException {
		loadDataFromFile(filename);
		printInOrder();
	}
	public static void main(String[] args) throws FileNotFoundException {
		ScoreTrakker st = new ScoreTrakker();
		st.processFiles("scores.txt");
	}
}
