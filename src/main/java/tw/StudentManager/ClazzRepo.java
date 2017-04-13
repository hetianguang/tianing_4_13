package tw.StudentManager;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tghe on 4/13/17.
 */
@Repository
public interface ClazzRepo extends CrudRepository<Clazz,String>{
    Student findById(String id);
}
