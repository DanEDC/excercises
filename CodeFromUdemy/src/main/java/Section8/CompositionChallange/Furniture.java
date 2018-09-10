package Section8.CompositionChallange;

public class Furniture {

    private boolean bed;
    private boolean closet;
    private boolean wardrobe;

    public Furniture(boolean bed, boolean closet, boolean wardrobe) {
        this.bed = bed;
        this.closet = closet;
        this.wardrobe = wardrobe;
    }

    public void removeFurnitureFromRoom() {
        setBed(false);
        setCloset(false);
        setWardrobe(false);
        System.out.println("All furniture have been removed from the room");

    }


    private void setBed(boolean bed) {
        this.bed = bed;
    }

    private void setCloset(boolean closet) {
        this.closet = closet;
    }

    private void setWardrobe(boolean wardrobe) {
        this.wardrobe = wardrobe;
    }
}
