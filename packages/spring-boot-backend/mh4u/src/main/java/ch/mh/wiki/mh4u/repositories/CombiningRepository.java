package ch.mh.wiki.mh4u.repositories;


import ch.mh.wiki.mh4u.models.Combining;
import ch.mh.wiki.mh4u.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CombiningRepository extends JpaRepository<Combining, Integer>{
    @Query("SELECT c FROM Combining c WHERE c.createdItem.id = :id OR c.item1.id = :id OR c.item2.id = :id")
    Optional<List<Combining>> findByAnyItemId(@Param("id") int id);
}
