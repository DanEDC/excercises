package Section8.CompositionChallenge;

public class Walls {
    private String wallsColour;
    private int numberOfWallsInTheRoom;

    public Walls(String wallsColour, int numberOfWallsInTheRoom) {
        this.wallsColour = wallsColour;
        this.numberOfWallsInTheRoom = numberOfWallsInTheRoom;
    }

    public void paintWalls(String wallsColour) {
        this.wallsColour = wallsColour;
        System.out.println("The walls have been painted in " + wallsColour);
    }

}
