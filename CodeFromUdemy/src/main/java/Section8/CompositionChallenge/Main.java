package Section8.CompositionChallenge;

public class Main {

    public static void main(String[] args) {

        Furniture furniture = new Furniture(true, false, false);
        Doors doors = new Doors("Brown", 2, 1);
        Walls walls = new Walls("Orange", 4);
        Windows windows = new Windows(2, 1, 1);

        Room room = new Room(furniture, doors, walls, windows);

        room.getDoors().openDoors();
        room.getWindows().openWindow();
        room.removeFurniture();
        room.paintWhiteWalls();

    }
}
