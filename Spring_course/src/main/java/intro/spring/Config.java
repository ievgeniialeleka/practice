package intro.spring;

import intro.spring.impl.audio.Sony;
import intro.spring.impl.car.Audi;
import intro.spring.impl.car.Kia;
import intro.spring.impl.navigation.Navitel;
import intro.spring.interfaces.NavigationSystem;
import intro.spring.interfaces.AudioSystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public AudioSystem sonyAudio() {
        return new Sony();
    }

    @Bean
    public NavigationSystem navitelNav() {
        return new Navitel();
    }

    @Bean(initMethod = "init")
    public Audi car(AudioSystem audioSystem, NavigationSystem navigationSystem) {
        return new Audi(audioSystem, navigationSystem);
    }

    @Bean
    public Kia car2() {
        return new Kia();
    }

}
