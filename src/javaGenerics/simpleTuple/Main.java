package javaGenerics.simpleTuple;

public class Main {
    public static void main(String[] args) {
        final Tuple<String> tp = new Tuple<>("l", "r");
        System.out.println(tp.getLeft() + " " + tp.getRight());

        final Tuple<Integer> intTp = new Tuple<>(1, 2);
        System.out.println(intTp.getLeft() + " " + intTp.getRight());

    }
}
