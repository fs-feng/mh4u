package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Decoration;
import ch.mh.wiki.mh4u.repositories.DecorationRepository;
import ch.mh.wiki.mh4u.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DecorationService {
    private final DecorationRepository decorationRepository;
    private final ItemRepository itemRepository;

    @Autowired
    public DecorationService(DecorationRepository decorationRepository, ItemRepository itemRepository) {
        this.decorationRepository = decorationRepository;
        this.itemRepository = itemRepository;
    }

    public List<Decoration> getAllDecorations() {
        return decorationRepository.findAll();
    }
}
