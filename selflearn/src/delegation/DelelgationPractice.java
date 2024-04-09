package delegation;

// The delegate interface
interface Worker {
    void doWork();
}

public class DelelgationPractice {

    public static void main(String[] args) {

        Worker programmer = new Programmer();
        Manager manager = new Manager(programmer);

        manager.manage();
    }

    // The delegate class

}

class Programmer implements Worker {
    @Override
    public void doWork() {
        System.out.println("Writing code");
    }
}

//The delegator class

class Manager {
    private Worker worker;

    public Manager(Worker worker) {
        this.worker = worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void manage() {
        System.out.println("Manager starts managing");
        worker.doWork();
        System.out.println("Manager finishes managing");
    }
}