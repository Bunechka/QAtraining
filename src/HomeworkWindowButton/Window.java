package HomeworkWindowButton;

public class Window {

    private int size;
    private String color;
    private boolean button;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void changeColor(String color) {

        this.color = color;
        System.out.println(color);
    }

    public String getColor() {
        return color;
    }

    public void buttonOn() {
        this.button = true;
    }

    public void buttonOff() {
        this.button = false;
    }

    public void buttonStatus() {
        if (button) {
            System.out.println("Button is on");
        } else {
            System.out.println("Button is off");
        }
    }
    public Window (String color, int size, boolean buttonState) {
        this.color = color;
        this.size = size;
        button = buttonState;
    }
    public Window () {}
}
