package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
