package com.faith.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor {
	
	//declare variables
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int professorId;
		
		@Column(name="manager_Id")
		private int managerId;
		
		@Column(name="first_Name")
		private String firstName;
		
		@Column(name="last_Name")
		private String lastName;
		
		@Column(name="dept_No")
		private int deptNo;
		
		private double salary;
		
		private Date joiningDate;
		
		private Date dateofBirth;
		
		private String gender;
		
		//default constructor
		
		public Professor() {
		}
		
		//parameterized constructor
		
		public Professor(int professorId, int managerId, String firstName, String lastName, int deptNo, double salary,
				Date joiningDate, Date dateofBirth, String gender) {
			super();
			this.professorId = professorId;
			this.managerId = managerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.deptNo = deptNo;
			this.salary = salary;
			this.joiningDate = joiningDate;
			this.dateofBirth = dateofBirth;
			this.gender = gender;
		}
		//setters and getters

		public int getProfessorId() {
			return professorId;
		}

		public void setProfessorId(int professorId) {
			this.professorId = professorId;
		}

		public int getManagerId() {
			return managerId;
		}

		public void setManagerId(int managerId) {
			this.managerId = managerId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getDeptNo() {
			return deptNo;
		}

		public void setDeptNo(int deptNo) {
			this.deptNo = deptNo;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Date getJoiningDate() {
			return joiningDate;
		}

		public void setJoiningDate(Date joiningDate) {
			//util date
//			convert java date to sql date
			//java.sql.Date sqlMDob1 = new java.sql.Date(joiningDate.getTime());
			//this.joiningDate = sqlMDob1;
			this.joiningDate = joiningDate;
		}

		public Date getDateofBirth() {
			return dateofBirth;
		}

		public void setDateofBirth(Date dateofBirth) {
			this.dateofBirth = dateofBirth;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		

		
		
		//override toString
		

		@Override
		public String toString() {
			return "Professor [professorId=" + professorId + ", managerId=" + managerId + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", deptNo=" + deptNo + ", salary=" + salary + ", joiningDate="
					+ joiningDate + ", dateofBirth=" + dateofBirth + ", gender=" + gender + "]";
		}
		
		
		

}
