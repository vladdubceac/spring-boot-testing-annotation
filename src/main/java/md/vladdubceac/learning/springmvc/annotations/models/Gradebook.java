package md.vladdubceac.learning.springmvc.annotations.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Gradebook {

    List<GradebookCollegeStudent> students = new ArrayList<>();

    public Gradebook() {

    }
    public Gradebook(List<GradebookCollegeStudent> students) {
        this.students = students;
    }

    public List<GradebookCollegeStudent> getStudents() {
        return students;
    }

    public void setStudents(List<GradebookCollegeStudent> students) {
        this.students = students;
    }
}
