package Objektinis;

public class Room {

    private String code = "Aktu sale";
    private int seats = 30;

    Room() {

    }

    public Room(String code, int seats) {
        this.code = code;
        this.seats = seats;
    }

    public void apsvietimas() {
        System.out.println(this.code + " " + "Sviesa ijungta");
    }
}
