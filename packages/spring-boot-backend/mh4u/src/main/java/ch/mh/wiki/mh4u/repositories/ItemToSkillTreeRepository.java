package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.ItemToSkillTree;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemToSkillTreeRepository extends JpaRepository<ItemToSkillTree, Integer> {
    List<ItemToSkillTree> findByItemId(int itemId);
}
