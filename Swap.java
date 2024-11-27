class IntHolder {
    int value;

    IntHolder(int value) {
        this.value = value;
    }
}

public class Swap {
    public static void tempSwap(IntHolder a, IntHolder b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        IntHolder a = new IntHolder(10);
        IntHolder b = new IntHolder(20);

        System.out.println("Before swapping: a = " + a.value + ", b = " + b.value);
        tempSwap(a, b);
        System.out.println("After swapping using wrapper: a = " + a.value + ", b = " + b.value);
    }
}
