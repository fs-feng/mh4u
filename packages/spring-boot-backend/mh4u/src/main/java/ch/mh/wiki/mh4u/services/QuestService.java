package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Quest;
import ch.mh.wiki.mh4u.repositories.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestService {
    private final QuestRepository repository;

    @Autowired
    public QuestService(QuestRepository repository) {
        this.repository = repository;
    }

    public List<Quest> getQuestsByHub(String hub) {
        return repository.findByHub(hub);
    }

    public List<Quest> getAll() {
        return repository.findAll();
    }

    public Optional<Quest> getQuestById(int id) {
        return repository.findById(id);
    }
}
