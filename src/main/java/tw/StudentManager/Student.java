package tw.StudentManager;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;
import java.util.List;
import java.util.Map;

/**
 * Created by tghe on 4/13/17.
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    private String stuId;
    private String name;
    private String classId;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

}
