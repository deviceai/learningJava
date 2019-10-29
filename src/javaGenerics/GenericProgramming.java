package javaGenerics;

public class GenericProgramming {
    public static <string> void main(String[] args) {
        /**
         * The most commonly used type parameter names are:
         *     T – Type
         *     S, U, V etc. – 2nd, 3rd, 4th types
         *     E – Element (used extensively by the Java Collections Framework)
         *     K – Key
         *     V – Value
         *     N – Number
         */

        ImmutableArray<String> array = new ImmutableArray<>(new String[] { "item1", "item2", "item3"});
        ImmutableArray<Integer> intArray = new ImmutableArray<>(new Integer[] {1,2,3,4,5,6,7,8,9,10});
       //  ImmutableArray<int[]> intArray2 = new ImmutableArray<>(new int[] {1,5,6});  ???

        for (int i = 0; i < array.length(); i++) {
            System.out.print(array.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < intArray.length(); i++) {
            System.out.print(intArray.get(i) + " ");
        }


    }
}

class ImmutableArray<T> {

    private T[] items;

    public ImmutableArray(T[] items) {
        this.items = items;
    }

    public T get(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }
}
