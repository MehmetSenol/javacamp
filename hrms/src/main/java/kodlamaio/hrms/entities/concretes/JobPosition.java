package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_positions")
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="position")
    private String position;

    public JobPosition(int id, String position) {
        this.id = id;
        this.position = position;
    }

    public JobPosition() {
    }
}
