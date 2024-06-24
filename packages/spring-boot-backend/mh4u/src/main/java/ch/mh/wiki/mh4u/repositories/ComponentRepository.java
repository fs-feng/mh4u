package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.Component;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ComponentRepository extends JpaRepository<Component, Integer> {
    Optional<List<Component>> findByCreatedItemId(int id);
}
