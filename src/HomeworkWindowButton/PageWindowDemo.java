package HomeworkWindowButton;

public class PageWindowDemo {
    public static void main(String[] args) {
        PageWindow window1 = new PageWindow ();
        window1.size = 15;
        window1.color = "blue";
        WindowButton button1 = new WindowButton ();
        button1.isOn = true;
        WindowButton button2 = new WindowButton ();
        button2.isOn = false;


        System.out.println("Window size is " + window1.size + " cm2");
        System.out.println("Window color is " + window1.color);
        System.out.println("Pagebutton 1 is on = " + button1.isOn);
        System.out.println("Pagebutton 2 is on = " + button2.isOn);
    }
}
