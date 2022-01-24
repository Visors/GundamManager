package com.sayo.pojo;

public class Student {
	private String student_id;
	private String name;
	private String sex;
	private Integer age;
	private String dept;
	private String major;
	private String sclass;
	private String teacher_id;
	private String title_id;
	
	public Student() {
		
	}
	
	public Student(String student_id, String name, String sex, Integer age, String dept, String major, String sclass,
			String teacher_id, String title_id) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.dept = dept;
		this.major = major;
		this.sclass = sclass;
		this.teacher_id = teacher_id;
		this.title_id = title_id;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getTitle_id() {
		return title_id;
	}

	public void setTitle_id(String title_id) {
		this.title_id = title_id;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", dept="
				+ dept + ", major=" + major + ", sclass=" + sclass + ", teacher_id=" + teacher_id + ", title_id="
				+ title_id + "]";
	}
	
	
	
}
