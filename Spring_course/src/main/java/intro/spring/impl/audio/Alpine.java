package intro.spring.impl.audio;

import intro.spring.interfaces.AudioSystem;

public class Alpine implements AudioSystem {
    @Override
    public void playCD() {
        System.out.println("Music from Alpine CD");
    }

    @Override
    public void playRadio() {
        System.out.println("Music from Alpine radio");
    }
}
