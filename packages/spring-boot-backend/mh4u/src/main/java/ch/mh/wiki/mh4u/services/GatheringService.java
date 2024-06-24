package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Gathering;
import ch.mh.wiki.mh4u.repositories.GatheringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GatheringService {
    private final GatheringRepository repository;

    @Autowired
    public GatheringService(GatheringRepository repository) {
        this.repository = repository;
    }

    public Optional<List<Gathering>> getGatheringsByLocationId(int id, String rank){
        return repository.findByLocationIdAndRank(id, rank);
    }

    public Optional<List<Gathering>> getGatheringsByItemId(int id){
        return repository.findByItemId(id);
    }

}
