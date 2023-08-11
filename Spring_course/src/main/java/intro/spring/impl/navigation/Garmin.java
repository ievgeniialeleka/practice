package intro.spring.impl.navigation;

import intro.spring.interfaces.NavigationSystem;

public class Garmin implements NavigationSystem {
    @Override
    public boolean createRoute() {
        System.out.println("Route was created by Gramin");
        return true;
    }
}
