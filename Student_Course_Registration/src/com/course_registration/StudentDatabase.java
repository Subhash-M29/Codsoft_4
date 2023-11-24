package com.course_registration;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

	private String studentName,studentID;
	
	private List<String> courseEnrolled;

	

	public StudentDatabase(String studentID, String studentName) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		this.courseEnrolled=new ArrayList<>();
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public List<String> getCourseEnrolled() {
		return courseEnrolled;
	}

	public void setCourseEnrolled(List<String> courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	@Override
	public String toString() {
		return "[StudentName=" + studentName + ", StudentID=" + studentID +",RegisteredCourses="+courseEnrolled+"]\n";
		
	}
}
