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
public class Blog {
    @Id
    private int id;
    private String title;
    private String content;
    private LocalDateTime publishDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
