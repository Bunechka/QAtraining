package HomeworkButtons;

public class Button {

    private int identityNumber;
    private String color;
    private int pageSideLength;
    private int pageSideHeight;
    private boolean button;

    public void createButton (String color, int pageSideHeight, int pageSideLength, boolean button) {
    }
    public void setIdentityNumber(int identityNumber) {
        this.identityNumber = identityNumber;
        System.out.println(identityNumber);
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public void pushTheButton (boolean button) {
        if (button) {
            System.out.println("Button is pressed ON");
        }
        else {
            System.out.println("Button is OFF");
        }
    }

    public void moveButton (int pageSideLength, int pageSideHeight) {
        this.pageSideLength = pageSideLength + 5;
        this.pageSideHeight = pageSideHeight - 10;
        System.out.println("Button has been moved");
    }
}
