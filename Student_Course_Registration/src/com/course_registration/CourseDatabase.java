package com.course_registration;

public class CourseDatabase {

	private String courseCode,title,description;
	private byte capacity;
	
	public CourseDatabase(String courseCode, String title, String description, byte capacity) {
		super();
		this.courseCode = courseCode;
		this.title = title;
		this.description = description;
		this.capacity = capacity;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte getCapacity() {
		return capacity;
	}
	public void setCapacity(byte capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "CourseDatabase [courseCode=" + courseCode + ", title=" + title + ", description=" + description+", capacity=" + capacity + "]";
	}

		
}
