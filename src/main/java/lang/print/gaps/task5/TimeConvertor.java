package lang.print.gaps.task5;

public class TimeConvertor {
    public static void main(String[] args) {
        TimeConvertor tc = new TimeConvertor();
        tc.convert(1.5f);
    }
    public void convert(float minutes) {
        float seconds = minutes*60f;
        System.out.println(seconds);
    }

}
