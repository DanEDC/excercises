package Section8.CompositionChallange;

public class Windows {
    private int numberOfWindowsInTheRoom;
    private int windowsHeight;
    private int windowsWidth;

    public Windows(int numberOfWindowsInTheRoom, int windowsHeight, int windowsWidth) {
        this.numberOfWindowsInTheRoom = numberOfWindowsInTheRoom;
        this.windowsHeight = windowsHeight;
        this.windowsWidth = windowsWidth;
    }

    public void openWindow() {
        System.out.println("Windows have been fully opened");
    }

    public int getNumberOfWindowsInTheRoom() {
        return numberOfWindowsInTheRoom;
    }

    public int getWindowsHeight() {
        return windowsHeight;
    }

    public int getWindowsWidth() {
        return windowsWidth;
    }
}
