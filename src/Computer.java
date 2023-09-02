public class Computer {
    int cost;
    String model;
    RAM ram;
    HDD hdd;
    Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }
    Computer(int cost, String model, RAM ram, HDD hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    public void displayInfo() {
        System.out.println("Comp model " + model);
        System.out.println("Comp cost " + cost);
        ram.showInf();
        hdd.showInform();
    }
}