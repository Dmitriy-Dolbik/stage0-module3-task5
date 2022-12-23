package lang.print.gaps.task5;

public class NumberDivider {
    public static void main(String[] args) {
        NumberDivider nd = new NumberDivider();
        nd.divide(7);
    }
    void divide(int toBeDivided) {
        double result = toBeDivided/5d;
        System.out.println(result);
    }
}
