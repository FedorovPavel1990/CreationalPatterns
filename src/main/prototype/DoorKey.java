package main.prototype;

import java.util.Arrays;
import java.util.List;

public class DoorKey implements Cloneable {

    private final int[] keyProngs;

    public DoorKey(int ...keyProngs) {
        this.keyProngs = keyProngs;
    }

    public int[] getKeyProngs() {
        return keyProngs;
    }

    @Override
    public String toString() {
        return String.join(", ", List.of(Arrays.toString(keyProngs)));
    }

    @Override
    public DoorKey clone() {
        try {
            return (DoorKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
