package intro.spring.impl.navigation;

import intro.spring.interfaces.NavigationSystem;

public class Navitel implements NavigationSystem {
    @Override
    public boolean createRoute() {
        System.out.println("Route was created by Navitel");
        return true;
    }
}
