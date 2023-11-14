import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class start {

	public static void main(String[] args)throws IOException {    // use this exception because when we change the input of string buffer in int then might get error
		// TODO Auto-generated method stub
		
		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		while(true) {
			System.out.println("press 1 to ADD");
			System.out.println("press 2 to DELETE");
			System.out.println("press 3 to DISPLAY");
			System.out.println("press 4 to UPDATE ");
			System.out.println("press 5 to EXIT");
			
			 int c = Integer.parseInt(br.readLine());             // change the value in int because from readline we get String value

			
			if(c ==1) {
				//add student
				System.out.println("Enter your name :- ");
				String name = br.readLine();	
				
				System.out.println("Enter your phone :- ");
				String phone = br.readLine();	
				
				System.out.println("Enter your city :- ");
				String city = br.readLine();
				
				Student st = new Student(name, phone, city);       // create object by taking all parameter
				boolean answer = StudentDao.insertStudentToDB(st);      // to insert through driver
				if(answer) {
					System.out.println("Successfully added");
				}
				else {
					System.out.println("Something went wrong");
				}
//					System.out.println(st);
			}
			
			
			else if(c == 2) {
				// delete student
				System.out.println("Enter student id to delete ");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);       // go to studentDao class and run deleteStudent method
				if(f) {
					System.out.println("Successfully Deleted");
				}
				else {
					System.out.println("Something went wrong");
				}
//					System.out.println(st);
				
			}
			
			else if(c==3) {
				// display students
				StudentDao.showAllStudent();
			}
			
			else if(c==4) {
				// update students
				StudentDao.updateStudent();
			}
			
			else if(c == 5) {
				// exit
				
				break;
			}
			
			else {
				
			}
		}

		System.out.println("Thank you for using my application");
		System.out.println("See you soon bye");
	}

}
