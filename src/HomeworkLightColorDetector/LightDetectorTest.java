package HomeworkLightColorDetector;

public class LightDetectorTest {
    public static void main(String[] args) {
        LightColorDetector test1 = new LightColorDetector();
        System.out.println(test1.detect(45));

        LightColorDetector test2 = new LightColorDetector();
        System.out.println(test2.detect(385));

        LightColorDetector test3 = new LightColorDetector();
        System.out.println(test3.detect(460));

        LightColorDetector test4 = new LightColorDetector();
        System.out.println(test4.detect(500));

        LightColorDetector test5 = new LightColorDetector();
        System.out.println(test5.detect(572));

        LightColorDetector test6 = new LightColorDetector();
        System.out.println(test6.detect(615));

        LightColorDetector test7 = new LightColorDetector();
        System.out.println(test7.detect(700));
    }
}
