package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.Gathering;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GatheringRepository extends JpaRepository<Gathering, Integer> {
    Optional<List<Gathering>> findByLocationIdAndRank(int id, String rank);
    Optional<List<Gathering>> findByItemId(int id);
}
