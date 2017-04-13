package tw;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tw.StudentManager.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by tghe on 4/13/17.
 */
@Component
@Path("classes")
public class StudentApi {
    private MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private StudentRepo studentRepo;
    private ClazzRepo clazzRepo;
    private CourseRepo courseRepo;
    private StudentCourseRepo studentCourseRepo;

    @Autowired
    public StudentApi(StudentRepo studentRepo,ClazzRepo clazzRepo,CourseRepo courseRepo, StudentCourseRepo studentCourseRepo) {
        this.studentRepo = studentRepo;
        this.courseRepo =  courseRepo;
        this.clazzRepo = clazzRepo;
        this.studentCourseRepo = studentCourseRepo;
    }

    @Path("{classId}/{studentId}/{courseId}")
//    @Path("1/1/1")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String getStudentInfo(
                                  @PathParam("classId") String classId,
                                  @PathParam("studentId") String studentId,
                                  @PathParam("courseId") String courseId,
                                  @HeaderParam("teacherClass") String teacherClass,
                                  @HeaderParam("teacherCourse") String teacherCourse) {
//        if(!classId.equals(teacherClass) || !courseId.equals(teacherCourse)) {
//            return "not allowed";
//        }
        Student student = studentRepo.findByStuId(studentId);
        StudentCourse studentCourse = new StudentCourse();
//        Course course = courseRepo.findByCourseName(teacherCourse);
//        System.out.println(student.getName());
//        System.out.println(course.getCourseName());
//        double grade = studentCourseRepo.findByStuIdAndCourseId(studentId,courseId).getGrade();
//        double grade = studentCourse.getGrade();
        studentCourse.setCourseId("1");
        studentCourse.setStuId("1");
        studentCourse.setGrade(99);
        studentCourseRepo.save(studentCourse);
        double grade = studentCourseRepo.findByStuId(studentId).getGrade();
        System.out.println(grade);
        return String.valueOf(grade);
    }
}
