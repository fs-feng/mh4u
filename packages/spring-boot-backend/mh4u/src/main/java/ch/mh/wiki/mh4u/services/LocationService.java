package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Location;
import ch.mh.wiki.mh4u.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    private final LocationRepository repository;

    @Autowired
    public LocationService(LocationRepository repository) {
        this.repository = repository;
    }

    public List<Location> getAllLocations() {
        return repository.findAll();
    }
}
