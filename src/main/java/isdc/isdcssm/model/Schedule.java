package isdc.isdcssm.model;

import javax.persistence.*;
import java.util.List;

@Table(name = "`cms_schedule`")
public class Schedule {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`target`")
    private String target;

    @Column(name = "`semester_id`")
    private Integer semesterId;

    private List<Course> course;

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return target;
    }

    /**
     * @param target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * @return semester_id
     */
    public Integer getSemesterId() {
        return semesterId;
    }

    /**
     * @param semesterId
     */
    public void setSemesterId(Integer semesterId) {
        this.semesterId = semesterId;
    }
}