package FullStack.fullStackdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobDescription {
    @Id
    private String id;
    private String description;
    private String jobName;
    private String department;
    private String responsibility;
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
