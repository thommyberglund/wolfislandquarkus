package dev.thommy.entity;

import dev.thommy.repository.ArmyRepository;
import dev.thommy.service.ArmyService;
import dev.thommy.util.ArmyEnum;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@QuarkusTest
class ArmyServiceTest {

    @Inject
    ArmyService armyService;

    @InjectMock
    ArmyRepository armyRepository;

    @BeforeEach
    void setup() {
        when(armyRepository.findById(1L))
                .thenReturn(new ArmyEntity("Test",1, ArmyEnum.ASTRA_MILITARUM));

        when(armyRepository.findById(0L))
                .thenThrow(new IllegalArgumentException("Hittade ingen entity"));
    }

    @Test
    void getArmyName() throws Exception {
        ArmyEntity army = armyService.findById(1L);
        assertEquals("Test", army.getArmyName());
    }

    @Test
    void
    getArmyNameKastarFel() {
        assertThrows(Exception.class, () -> {
           armyService.findById(0L);
        });
    }

    @Test
    void getArmyPoints() {
    }

    @Test
    void getArmyType() {
    }

}