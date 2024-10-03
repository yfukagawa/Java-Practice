package randomLambdas;

public class RandomLambdas {
    public static void main(String[] args) {
        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);

        System.out.println(a);
        System.out.println(b);
        System.out.println(intsSum());
        System.out.println("App Finished");
    }

    @FunctionalInterface
    interface AddInts {
        int totalValue(int a, int b);
    }

    public static AddInts intsSum() {
        AddInts addInts;

        addInts = (a, b) -> a + b;
        System.out.println(addInts);
        return addInts;
    }
}
