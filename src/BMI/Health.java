package BMI;

import java.text.DecimalFormat;

public class Health {
    public static float computeBmi(float weight, float height) {
        return (weight / (height * height));
    }

    public static String bmiString(float weight, float height) {
        float bmi = computeBmi(weight, height);
        String s;

        DecimalFormat df = new DecimalFormat("0.00");
        bmi = Float.parseFloat(df.format(bmi).replace(",", "."));

        if (bmi <= 18.5F) {
            s = "untergewichtig";
        }
        else if (bmi > 18.5F && bmi <= 25) {
            s = "normalgewichtig";
        }
        else if (bmi > 25 && bmi <= 30) {
            s = "übergewichtig";
        }
        else {
            s = "fettleibig";
        }

        return "Mit einem BMI von " + bmi + " sind Sie " + s;
    }
}