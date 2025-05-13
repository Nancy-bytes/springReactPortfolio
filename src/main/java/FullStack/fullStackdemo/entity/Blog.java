package FullStack.fullStackdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog extends BaseEntity {
    @Id
    private Long id;
    private String title;
    private String type;
    private String summary;
    private String image;
    private LocalDateTime publishDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
