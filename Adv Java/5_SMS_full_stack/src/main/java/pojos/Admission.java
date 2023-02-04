package pojos;

import java.time.LocalDate;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "admission")
public class Admission extends BaseEntity {
	@Column(name = "apply_date")
	@CreationTimestamp
	private LocalDate applyDate;
	@Column(name = "result_date")
	private LocalDate resultDate;
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	// many course*----->one course
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course courseChoosen;
	@Column(name = "admission_status", length = 20)
	@Enumerated(EnumType.STRING)
	private Status admissionStatus;

	public Admission() {
	}

	public Admission(LocalDate applyDate, LocalDate resultDate, Student student, Course courseChoosen) {
		this.applyDate = applyDate;
		this.resultDate = resultDate;
		this.student = student;
		this.courseChoosen = courseChoosen;
	}

	public LocalDate getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(LocalDate applyDate) {
		this.applyDate = applyDate;
	}

	public LocalDate getResultDate() {
		return resultDate;
	}

	public void setResultDate(LocalDate resultDate) {
		this.resultDate = resultDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourseChoosen() {
		return courseChoosen;
	}

	public void setCourseChoosen(Course courseChoosen) {
		this.courseChoosen = courseChoosen;
	}

	@Override
	public String toString() {
		return "Admission ID " + getId() + "[applyDate=" + applyDate + ", resultDate=" + resultDate
				+ ", admissionStatus=" + admissionStatus + "]";
	}
}
