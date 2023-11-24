package com.course_registration;

import java.util.Scanner;

public class Client {

	public static void main(String args[]) {
		
		System.out.println("      Student Course Registration       ");
		
		System.out.println("1.Student Information");
		System.out.println("2.Course Information");
		System.out.println("3.Course Listing");
		System.out.println("4.Course Removal");
		System.out.println("5.Display Student List");
		
		StudentRegistration student =new StudentRegistration();
       
		try (Scanner scanner = new Scanner(System.in)) {
			int n;
   
			do {
			    System.out.println("Enter a choice");
			    
			    int choice =scanner.nextInt();
			    
			    switch(choice) {
			    
			    case 1:System.out.println("Add Student Informtion");
			    
			           student.addStudentInformation();
			           break;
			    case 2:System.out.println("Add Course Informtion");
			    
			           student.addCourseInformation();
			           break;
			    
			    case 3:System.out.println("Cousre Listing");
			    
			      	   student.courseListing();
			           break;
			      
			    case 4:System.out.println("Cousre Removal");
			    
			      	   student.courseRemoval();
			      	   break;
			      	   
			    case 5:System.out.println("Student List");
			           
			           student.displayStudentList();
			           break;
			    }
			    
			    System.out.println("Press 1 to continue\n or Exit Press Any number");
			    n=scanner.nextInt();
			    
			}while(n==1);
		}
	}
}
