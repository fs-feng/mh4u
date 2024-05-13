package ch.mh.wiki.mh4u.repositories;

import ch.mh.wiki.mh4u.models.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeaponRepository extends JpaRepository<Weapon, Integer> {
    public List<Weapon> findWeaponByWtype(String wtype);
}
