package javaGenerics.Bounds;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        Cell<Job> cell = new Cell<>();
        cell.setT(new Job());
        cell.doJob();

        Cell<childJob> cell2 = new Cell<>();
        cell2.setT(new childJob());
        cell2.doJob();

    }
}

class Job {
    public void doit(){
        System.out.println("doit");
    }
}

class childJob extends Job{}

//class Cell<T extends Job & Serializable>{  //extend and implement
class Cell<T extends Job>{
    T t;

    public T getT(){
        return this.t;
    }
    public void setT(T t){
        this.t = t;
    }

    public void doJob(){
        t.doit();
    }
}


