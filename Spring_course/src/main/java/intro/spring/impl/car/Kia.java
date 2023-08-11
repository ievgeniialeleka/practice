package intro.spring.impl.car;

import intro.spring.interfaces.Car;
import intro.spring.interfaces.AudioSystem;
import intro.spring.interfaces.NavigationSystem;

public class Kia implements Car {
    private AudioSystem audioSystem;
    private NavigationSystem navigationSystem;



    public Kia(AudioSystem audioSystem, NavigationSystem navigationSystem) {
        this.audioSystem = audioSystem;
        this.navigationSystem = navigationSystem;
    }

    public Kia() {

    }

    public void init(){
        System.out.println("Composing your new car...");
    }

    public void move() {
        System.out.println("*****************************");
        System.out.println("Kia in action");
        System.out.println("*****************************");
    }

    public AudioSystem getAudioSystem() {

        return audioSystem;
    }

    public void setAudioSystem(AudioSystem audioSystem) {
        this.audioSystem = audioSystem;
    }

    public NavigationSystem getNavigationSystem() {
        return navigationSystem;
    }

    public void setNavigationSystem(NavigationSystem navigationSystem) {
        this.navigationSystem = navigationSystem;
    }
}
