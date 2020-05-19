public class Result {
    private int number;
    private int appearance;

    public Result(int number, int appearance) {
        this.number = number;
        this.appearance = appearance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }

    @Override
    public String toString() {
        return "Result{" +
                "number=" + number +
                ", appearance=" + appearance +
                '}';
    }
}
