public class WaterBottle {
    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDrink(){
        this.volume -= 5;
        return this.volume;
    }

    public void empty(){
        this.volume = 0;
    }

    public void reFill() {
        this.volume = 100;
    }
}
