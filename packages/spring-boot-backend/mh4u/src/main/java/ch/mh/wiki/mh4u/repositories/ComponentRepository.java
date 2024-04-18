package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.Component;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComponentRepository extends JpaRepository<Component, Integer> {
}
