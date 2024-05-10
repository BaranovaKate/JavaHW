public class HDD {
    int vol;
    String nam;
    String type;
    HDD() {
        vol = 400;
        nam = "Seagate";
        type = "External";
    }
    HDD(int vol, String nam, String type) {
        this.vol = vol;
        this.nam = nam;
        this.type = type;
    }
    void showInform() {
        System.out.println("HDD name:" + nam);
        System.out.println("HDD volume" + vol);
        System.out.println("HDD type" + type);
    }
}