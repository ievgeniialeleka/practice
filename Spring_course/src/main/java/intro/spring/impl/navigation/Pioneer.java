package intro.spring.impl.navigation;

import intro.spring.interfaces.NavigationSystem;

public class Pioneer implements NavigationSystem {
    @Override
    public boolean createRoute() {
        System.out.println("Route was created by Pioneer");
        return true;
    }
}
