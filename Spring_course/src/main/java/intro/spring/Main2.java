package intro.spring;

import intro.spring.impl.car.Audi;
import intro.spring.impl.car.Kia;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Audi audi = ctx.getBean(Audi.class);
        audi.move();
        audi.getAudioSystem().playCD();
        audi.getNavigationSystem().createRoute();

        Kia kia = ctx.getBean(Kia.class);
        kia.move();
    }
}
