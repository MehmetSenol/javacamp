package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_positions")
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="position")
    private String position;




}
