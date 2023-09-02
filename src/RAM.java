public class RAM {
    int volume;
    String name;
    RAM() {
        volume = 100;
        name = "DDR4";
    }
    RAM(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }
    void showInf() {
        System.out.println("Ram name:" + name);
        System.out.println("Ram volume" + volume);
    }
}