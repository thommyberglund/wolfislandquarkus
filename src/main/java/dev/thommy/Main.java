package dev.thommy;

import dev.thommy.util.ArmyEnum;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {



    public static void main(String ... args) {
        System.out.println("Running main method");
        Quarkus.run(MyApp.class, args);
    }

    public static class MyApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            System.out.println("Do startup logic here");
            System.out.println(ArmyEnum.DEATH_GUARD);
            Quarkus.waitForExit();
            return 0;
        }
    }
}