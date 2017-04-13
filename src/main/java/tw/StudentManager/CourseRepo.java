package tw.StudentManager;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tghe on 4/13/17.
 */
@Repository
public interface CourseRepo extends CrudRepository<Course,String>{
    Course findByCourseName(String courseName);
}
