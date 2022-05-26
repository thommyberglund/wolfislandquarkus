package dev.thommy.repository;

import dev.thommy.entity.ArmyEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.runtime.Startup;

import javax.enterprise.context.ApplicationScoped;

@Startup
@ApplicationScoped
public class ArmyRepository implements PanacheRepository<ArmyEntity> {
}
