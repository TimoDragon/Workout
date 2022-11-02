package AmbientLight;

import java.awt.Color;

public class AmbiLight {
    private int hue;
    private int saturation;
    private int lightness;

    public AmbiLight(int hue, int saturation, int lightness) {
        this.hue = hue;
        this.saturation = saturation;
        this.lightness = lightness;
    }

    public AmbiLight() {
        this.hue = 0;
        this.saturation = 0;
        this.lightness = 0;
    }

    public void increaseSaturation() {
        if (saturation < 100) {
            saturation++;
        }
    }

    public void decreaseSaturation() {
        if (saturation > 0) {
            saturation--;
        }
    }

    public void increaseLightness() {
        if (saturation < 100) {
            saturation++;
        }
    }

    public void decreaseLightness() {
        if (saturation > 0) {
            saturation--;
        }
    }

    public RGBColor getNextColor() {
        return new RGBColor(hue, saturation, lightness);
    }

    public RGBColor getRandomColor() {
        int hue = (int) (Math.random() * 360);
        int saturation = (int) (Math.random() * 100);
        int lightness = (int) (Math.random() * 100);

        return new RGBColor(hue, saturation, lightness);
    }
}