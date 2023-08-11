package intro.spring.impl.car;

import intro.spring.interfaces.Car;
import intro.spring.interfaces.NavigationSystem;
import intro.spring.interfaces.AudioSystem;

public class Lexus implements Car {
    private AudioSystem audioSystem;
    private NavigationSystem navigationSystem;

    public Lexus(AudioSystem audioSystem, NavigationSystem navigationSystem) {
        this.audioSystem = audioSystem;
        this.navigationSystem = navigationSystem;
    }

    public Lexus() {

    }

    public void init(){
        System.out.println("Composing your new car...");
    }

    public void move() {
        System.out.println("*****************************");
        System.out.println("Lexus in action");
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
