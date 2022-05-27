package dev.thommy.service;

import dev.thommy.entity.ArmyEntity;
import dev.thommy.repository.ArmyRepository;
import dev.thommy.util.ArmyEnum;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ArmyService {

    @Inject
    ArmyRepository armyRepository;

    public List<ArmyEntity> findAllArmies() {
        return armyRepository.findAll().list();
    }

    public ArmyEntity findById(Long id) throws Exception {
        try {
            return armyRepository.findById(id);
        }
        catch(Exception e) {
            throw new Exception("Ngt gick fel");
        }
    }

    @Transactional
    public void create() {
        ArmyEntity a = new ArmyEntity("Testar",1, ArmyEnum.DEATH_GUARD);
        armyRepository.persist(a);
    }
}
