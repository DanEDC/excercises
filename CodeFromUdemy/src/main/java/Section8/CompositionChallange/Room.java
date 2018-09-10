package Section8.CompositionChallange;

public class Room {

    private Furniture furniture;
    private Doors doors;
    private Walls walls;
    private Windows windows;

    public Room(Furniture furniture, Doors doors, Walls walls, Windows windows) {
        this.furniture = furniture;
        this.doors = doors;
        this.walls = walls;
        this.windows = windows;
    }

    public void paintWhiteWalls() {
        walls.paintWalls("White");
    }

    public void removeFurniture() {
        furniture.removeFurnitureFromRoom();
    }


    public Doors getDoors() {
        return doors;
    }


    public Windows getWindows() {
        return windows;
    }

}
