package tw.StudentManager;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by tghe on 4/13/17.
 */
@Entity
@Table(name="studentCourse")
public class StudentCourse {
    @Id
    private String stuId = "1";
    private String courseId = "1";
    private double grade = 88;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
