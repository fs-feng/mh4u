package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Combining;
import ch.mh.wiki.mh4u.repositories.CombiningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombiningService {
    private final CombiningRepository repository;

    @Autowired
    public CombiningService(CombiningRepository repository) {
        this.repository = repository;
    }

    public List<Combining> getAllCombining() {
        return repository.findAll();
    }
}
