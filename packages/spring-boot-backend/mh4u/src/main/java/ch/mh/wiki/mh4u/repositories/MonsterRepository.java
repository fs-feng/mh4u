package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepository extends JpaRepository<Monster, Integer> {
}
