package ch.mh.wiki.mh4u.services;

import ch.mh.wiki.mh4u.models.Component;
import ch.mh.wiki.mh4u.repositories.ComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComponentService {
    private final ComponentRepository repository;

    @Autowired
    public ComponentService(ComponentRepository repository) {
        this.repository = repository;
    }




    public List<List<Component>> getAllComponents() {
        List<Component> components = repository.findAll();

        List<List<Component>> componentList = new ArrayList<List<Component>>();
        int createdItemId = components.getFirst().getCreatedItem().getId();
        List<Component> componentsForItem = new ArrayList<Component>();

        componentsForItem.add(components.getFirst());

        for (Component component : components) {
            if (component.getCreatedItem().getId() == createdItemId) {
                componentsForItem.add(component);
                if (component == components.getLast()) {
                    componentList.add(componentsForItem);
                }

            } else  {
                componentList.add(componentsForItem);
                componentsForItem = new ArrayList<Component>();
                componentsForItem.add(component);
                createdItemId = component.getCreatedItem().getId();
            }


        }
        return componentList;
    }
}
