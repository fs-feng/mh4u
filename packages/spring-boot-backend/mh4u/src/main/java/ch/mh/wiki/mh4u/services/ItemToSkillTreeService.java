package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.ItemToSkillTree;
import ch.mh.wiki.mh4u.repositories.ItemToSkillTreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemToSkillTreeService {
    private final ItemToSkillTreeRepository repository;

    @Autowired
    public ItemToSkillTreeService(ItemToSkillTreeRepository repository) {
        this.repository = repository;
    }

    public List<ItemToSkillTree> getItemToSkillTree(int itemId) {
        return repository.findByItemId(itemId);
    }
}
