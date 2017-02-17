package homework_5_q11;
import java.util.Arrays;
import Student.Student;
import java.util.Scanner;
public class homework_5_q11 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("請輸入學生數量");
		
		Student[] s =new Student[input.nextInt()];
		input.nextLine();
		
		for(int i=0;i<s.length;i++){
				s[i]=new Student();
				System.out.println("請輸入學生第"+(i+1)+"位學生姓名");
				s[i].setName(input.nextLine());
				System.out.println("請輸入學生第"+(i+1)+"位學生ID");
				s[i].setID(input.nextLine());
		}
		
		Arrays.sort(s);
		
		for(int i=0;i<s.length;i++)
			System.out.println(	s[i].toString());
		
		
		input.close();
	}
}
