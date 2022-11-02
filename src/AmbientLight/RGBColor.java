package AmbientLight;

public class RGBColor {
    // funktioniert nicht richtig

    private int r;
    private int g;
    private int b;

    public RGBColor(int hue, int saturation, int lightness) {
        hslToRGB(hue, saturation, lightness);
    }

    public void hslToRGB(int hue, int saturation, int lightness) {
        float s = (float) (saturation/100.0);
        float l = (float) (lightness/100.0);

        float r = 0;
        float g = 0;
        float b = 0;

        if (s == 0) {
            r = (int) (255*l);
            g = (int) (255*l);
            b = (int) (255*l);
        }
        else {
            float temp1 = 0;
            float temp2 = 0;

            if (l < 0.5) {
                temp1 = (float) (l * (1.0+s));
            }
            else {
                temp1 = (float) (l+s-(l*s));
            }

            temp2 = 2*l - temp1;

            float h = (float) (hue/360.0);

            float tempR = h + 0.333F;
            float tempG = h;
            float tempB = h - 0.333F;

            tempR = convertBetween0and1(tempR);
            tempG = convertBetween0and1(tempG);
            tempB = convertBetween0and1(tempB);

            r = calculateColor(tempR, temp1, temp2);
            g = calculateColor(tempG, temp1, temp2);
            b = calculateColor(tempB, temp1, temp2);

            r = Math.round(r*255);
            g = Math.round(g*255);
            b = Math.round(b*255);

            this.r = (int) r;
            this.g = (int) g;
            this.b = (int) b;
        }
    }

    private float convertBetween0and1(float value) {
        if (value < 0) {
            value = value + 1;
        }
        else if (value > 1) {
            value = value - 1;
        }
        return value;
    }

    private float calculateColor(float tempColor, float temp1, float temp2) {
        float c = 0;

        if (6*tempColor < 1) {
            c = temp2 + (temp1 - temp2) * 6*tempColor;
        }
        else if (2*tempColor < 1) {
            c = temp1;
        }
        else if (3*tempColor < 2) {
            c = temp2 + (temp1 - temp2) * (0.666F - tempColor)*6;
        }
        else {
            c = temp2;
        }

        if (c > 1) {
            c = 1;
        }

        return c;
    }

    public String toString() {
        return "[r=" + r + ",g=" + g + ",b=" + b + "]";
    }
}