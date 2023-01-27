package pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "course_tbl")
public class Course extends BaseEntity {
	@Column(name = "title", length = 100, unique = true)
	private String courseTitle;
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date")
	private LocalDate endDate;
	private double fees;
	private int capacity;
	// one course can be taken by many student 1------>*admission
	@OneToMany(mappedBy = "courseChoosen", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Admission> admissions = new ArrayList<Admission>();

	public Course() {

	}

	public Course(String title, LocalDate startDate, LocalDate endDate, double fees, int capacity) {
		this.courseTitle = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.capacity = capacity;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public List<Admission> getAdmissions() {
		return admissions;
	}

	public void setAdmissions(List<Admission> admissions) {
		this.admissions = admissions;
	}

	public String getTitle() {
		return courseTitle;
	}

	public void setTitle(String title) {
		this.courseTitle = title;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Course Id" + getId() + "[title=" + courseTitle + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", fees=" + fees + ", capacity=" + capacity + "]";
	}
}
