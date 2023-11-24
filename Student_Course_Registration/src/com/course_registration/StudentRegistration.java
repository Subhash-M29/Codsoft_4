package com.course_registration;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentRegistration implements Student{
	
	HashMap<String,StudentDatabase> student=new HashMap<String,StudentDatabase>();
	HashMap<String,CourseDatabase>  courses=new HashMap<>();
	
	Scanner scanner =new Scanner(System.in);
	Entry<String, StudentDatabase> foundStudent=null;
	@Override	
	public void addStudentInformation() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Student ID");
		String studentID=scanner.next();
		
		System.out.println("Enter a student Name");
		String name=scanner.next();
		
		student.put(studentID,new StudentDatabase(studentID, name));
		
		System.out.println(student);
	    System.out.println("Successfully Added");
		
	}

	@Override
	public void addCourseInformation() {
		System.out.print("Enter a course Code");
		String code=scanner.next();
		scanner.nextLine();
		System.out.println("Enter a Course Title");
		String title=scanner.nextLine();
		
		System.out.println("Enter a Description");
		String description=scanner.nextLine();
		
		System.out.println("Enter a Slots");
		byte slot=scanner.nextByte();
		
		courses.put(code,new CourseDatabase(code,title,description,slot));
		System.out.println(courses);
		System.out.println("Successfully Added");
	}

    @Override
	public void courseListing() 
    {
		
		for(Map.Entry<String,CourseDatabase> course : courses.entrySet()) 
		{
			try {
			
			System.out.printf("%-12s\t%-20s\t%-40s\t%d%n",course.getKey(),course.getValue().getTitle(),course.getValue().getDescription(),course.getValue().getCapacity());
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		studentRegistration();
		
		
	}
	
	

	@Override
	public void studentRegistration() 
	{
		System.out.println("Student Registration");
		System.out.println("Enter your ID for Course Registration");
		String id=scanner.next();
		
			if(student.containsKey(id)) 
				{
						
				System.out.println("Enter a course Code");
				String code=scanner.next();
				//String title=scanner.next();

				for(Map.Entry<String,CourseDatabase> courseEntry  : courses.entrySet()) 
					{
					CourseDatabase course=courses.get(code);
					StudentDatabase hs=student.get(id);
			
					  if(courses.containsKey(code)) 
						{
						if(course.getCapacity()>0) 
							{
							if(!hs.getCourseEnrolled().contains(code)) 
								{
	                  
								hs.getCourseEnrolled().add(code);
								//registeredCourse.add(course.getTitle());
					    
								System.out.println("You Successfully enrolled "+course.getTitle());
	                    
								byte capacity=course.getCapacity();
	                    
								course.setCapacity((byte) (capacity-1));
								break;
	                   
								}
								else 
									{
										System.out.println("You are already enrolled this course");
									}
							}
						else 
							{
							System.out.println("Course is full now.enroll the another course");
							
							}
						}
					else
					System.out.println("Course "+code+" not found");
					break;
					
					}
				}
	
			else 
				{
				System.out.println("Student " +id+ " not found");	
				}
	}

	
    
	@Override
	public void courseRemoval() 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a ID for Course Removal");
		String id=scanner.next();
		if(student.containsKey(id)) 
		{
		
			StudentDatabase hs =student.get(id);
			
			
			
			System.out.println("Student ID "+hs.getStudentID()+"\nName "+hs.getStudentName()
						+"\nCourse "+hs.getCourseEnrolled());
			
			
			if(!hs.getCourseEnrolled().isEmpty())
			{
			
				System.out.println();
				System.out.println("Enter a Course Code for Removal");
				String code=scanner.next();
			
				for(Map.Entry<String,CourseDatabase> c:courses.entrySet()) 
				{
				
					CourseDatabase value=courses.get(code);
					if(courses.containsKey(code)) 
					{
					
					hs.getCourseEnrolled().remove(code);
					
					byte capacity=(byte) (value.getCapacity()+1);
					value.setCapacity(capacity);
					System.out.println("You Sucessfull removed your enrolled Courses");
					
					break;
					}
					else
					System.out.println("Didn't registered " +code+" Course" );
				    break;
				
				}
			
			}
			else 
			{
				System.out.println("You didn't registred Any Course");
			}
		
		}
		else
			System.out.println("Student "+id+" Not found");
	}

	@Override
	public void displayStudentList() 
	{
		System.out.println("Enter a ID ");
		String id=scanner.next();
		StudentDatabase s=student.get(id);
		
		if(student.containsKey(id) )
		{
			System.out.println("Student ID         "+s.getStudentID());
			System.out.println("Student Name       "+s.getStudentName());
			System.out.println("Registered Courses "+s.getCourseEnrolled());
		
		
		}
		else
			System.out.println("Not found");
	
	
   }
}

