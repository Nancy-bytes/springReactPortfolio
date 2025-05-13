package FullStack.fullStackdemo.repository;

import FullStack.fullStackdemo.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRepo extends JpaRepository<Work, Long> {
}
