package ch.mh.wiki.mh4u.repositories;


import ch.mh.wiki.mh4u.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
