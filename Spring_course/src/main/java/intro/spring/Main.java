package intro.spring;

import intro.spring.impl.car.Audi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Audi audi = ctx.getBean(Audi.class);
        audi.move();

        //without property or constructor in xml
        //audi.setAudioSystem(ctx.getBean("sony", Sony.class));

        audi.getAudioSystem().playRadio();
        audi.getNavigationSystem().createRoute();
    }
}
