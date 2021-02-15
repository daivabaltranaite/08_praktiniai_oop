package Objektinis;

import org.w3c.dom.ls.LSOutput;

public class Svilpukas {

    private String sound = "UUUUuuUUU";

    Svilpukas() {

    }

    public Svilpukas(String sound) {
        this.sound = sound;
    }

    public void sound() {
        System.out.println(this.sound);
    }
}
