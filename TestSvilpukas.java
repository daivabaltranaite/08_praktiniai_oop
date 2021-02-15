package Objektinis;

public class TestSvilpukas {
    public static void main(String[] args) {
        Svilpukas svilpukas = new Svilpukas();
        svilpukas.sound();
        Svilpukas duckSvilpukas = new Svilpukas("Kvaak");
        Svilpukas roosterSvilpukas = new Svilpukas("Peef");
        duckSvilpukas.sound();
        roosterSvilpukas.sound();
        duckSvilpukas.sound();
    }
}
