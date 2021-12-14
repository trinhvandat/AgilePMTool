package org.aibles.agilepmtool.project.repositories;

import org.aibles.agilepmtool.project.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    Optional<Project> findByProjectIdentifier(String projectID);

}
