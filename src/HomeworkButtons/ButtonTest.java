package HomeworkButtons;

import HomeworkButtons.Button;

public class ButtonTest {
    public static void main(String[] args) {
        Button button1 = new Button();
        button1.createButton("blue", 12, 24, true);
        button1.pushTheButton(false);
        button1.moveButton(12,24);
    }
}
