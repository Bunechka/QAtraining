package Lesson3;

public class Lampa {
    public boolean isOn;
    public void turnOn() {
        this.isOn = true;

        System.out.println("My lampa is ON");
        System.out.println(this.isOn);
    }
    public void turnOff() {
        this.isOn = false;
        System.out.println("My lampa is OFF");
        System.out.println(this.isOn);
    }


}
