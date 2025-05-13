package FullStack.fullStackdemo.repository;

import FullStack.fullStackdemo.entity.JobDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDescriptionRepo extends JpaRepository<JobDescription, Long> {
}
