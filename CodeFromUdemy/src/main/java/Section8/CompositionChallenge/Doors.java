package Section8.CompositionChallenge;

public class Doors {

    private String doorColour;
    private int doorHeight;
    private int doorWidth;

    public Doors(String doorColour, int doorHeight, int doorWidth) {
        this.doorColour = doorColour;
        this.doorHeight = doorHeight;
        this.doorWidth = doorWidth;
    }

    public void openDoors() {
        System.out.println("The door has been opened");
    }

    public String getDoorColour() {
        return doorColour;
    }

    public int getDoorHeight() {
        return doorHeight;
    }

    public int getDoorWidth() {
        return doorWidth;
    }
}
