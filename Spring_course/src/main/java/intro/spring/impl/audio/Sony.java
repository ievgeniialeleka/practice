package intro.spring.impl.audio;

import intro.spring.interfaces.AudioSystem;

public class Sony implements AudioSystem {
    @Override
    public void playCD() {
        System.out.println("Music from Sony CD");
    }

    @Override
    public void playRadio() {
        System.out.println("Music from Sony radio");
    }
}
