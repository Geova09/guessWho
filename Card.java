package guessinggame;

public class Card {
    
    
    private String name;
    private String hairColor;
    private String shirtColor;
    private String eyesColor;
    private boolean glasses;
    private boolean smiling;
    private boolean hat;
    
    
    public Card(String name, String hairColor, String shirtColor, String eyesColor, boolean glasses, boolean smiling, boolean hat){
        this.name = name;
        this.hairColor = hairColor;
        this.shirtColor = shirtColor;
        this.eyesColor = eyesColor;
        this.glasses = glasses;
        this.smiling = smiling;
        this.hat = hat;
    }
    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getShirtColor() {
        return shirtColor;
    }

    public void setShirtColor(String shirtColor) {
        this.shirtColor = shirtColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public boolean isGlasses() {
        return glasses;
    }

    public void setGlasses(boolean glasses) {
        this.glasses = glasses;
    }

    public boolean isSmiling() {
        return smiling;
    }

    public void setSmiling(boolean smiling) {
        this.smiling = smiling;
    }

    public boolean isHat() {
        return hat;
    }

    public void setHat(boolean hat) {
        this.hat = hat;
    }
    
   
    @Override
    public String toString() {
        return "Name: "+this.name+", HairColor: "+this.hairColor+
                ", ShirtColor: "+this.shirtColor+", EyesColor: "+this.eyesColor+
                ", Glasses: "+this.glasses+",Smiling: "+this.smiling+", Hat: "+this.hat;
    }
}
