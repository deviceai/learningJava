package javaAnonymousClass.iterations;

public class StartIterations {

    public static void main(String[] args) {

        int number = 5;
        startIterations(number);
    }

    static void startIterations(int numberOfIterations){
        LoopCallback callback = new LoopCallback() {
            @Override
            public void onNewIteration(int iteration) {
                System.out.println("Iteration: " + iteration);
            }
        };

        performIterationsWithCallback(numberOfIterations, callback);
    }

    static void performIterationsWithCallback(int numberOfIterations, LoopCallback callback){
        for (int i = 0; i < numberOfIterations; i++){
            callback.onNewIteration(i);
        }
    }
}
