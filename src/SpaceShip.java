public class SpaceShip implements Drawable {

    private Weapon[] weapons;
    private String name;
    private String color;
    private int modelNumber;
    private double speed;
    private boolean isStinky;

    SpaceShip(String name, String color, int modelNumber, double speed, boolean isStinky) {
        this.name = name;
        this.color = color;
        this.modelNumber = modelNumber;
        this.speed = speed;
        this.isStinky = isStinky;
    }

    public Weapon[] getWeapons() { return weapons; }

    public void setWeapons(Weapon[] weapons) { this.weapons = weapons; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public int getModelNumber() { return modelNumber; }

    public void setModelNumber(int modelNumber) { this.modelNumber = modelNumber; }

    public double getSpeed() { return speed; }

    public void setSpeed(double speed) { this.speed = speed; }

    public boolean getIsStinky() { return isStinky; }

    public void setStinky(boolean isStinky) { this.isStinky = isStinky; }

    void mount(Weapon[] w) {
        this.weapons = w;
    }

    public void draw() {
        System.out.println("" +
                "   __\n" +
                "   \\ \\_____\n" +
                "###[==_____>\n" +
                "   /_/ ");
    }

    private void sortWeapons(Comparable[] weaponsArray) {
        for (int i = 1; i < weaponsArray.length; i++) {
            Comparable c = weaponsArray[i];
            int j = i - 1;
            while (j >= 0 && weaponsArray[j].compareTo(c) > 0) {
                weaponsArray[j + 1] = weaponsArray[j];
                j--;
            }
            weaponsArray[j + 1] = c;
        }
    }

    public void fireFastestWeapons(int n) {
        sortWeapons(weapons);
        weapons[n].fire();
    }

    @Override public String toString() {
        return String.format("Name: %s Color: %s Model: %s Speed: %s", name, color, modelNumber, speed);
    }

}
