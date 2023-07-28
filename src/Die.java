public class Die {
    private int faceValue;

    public void roll() {
        this.faceValue = getRandomNumBetween1To6();
    }

    public int getFaceValue() {
        return faceValue;
    }

    private int getRandomNumBetween1To6() {
        return  1 + (int)(Math.random() * 6);
    }
}
