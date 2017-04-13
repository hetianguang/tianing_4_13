package tw.StudentManager;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by tghe on 4/13/17.
 */
public interface StudentCourseRepo extends CrudRepository<StudentCourse, String>{
    StudentCourse findByStuIdAndCourseId(String stuId, String courseId);
    StudentCourse findByStuId(String stuId);
}
