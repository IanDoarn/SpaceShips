/**
 * <name>
 *     Weapon
 * </name>
 * <implements>
 *     Drawable, Comparable
 * </implements>
 * <author>Ian Doarn</author>
 * <date>10-4-2017</date>
 * <summary>
 *     Weapon class for creating and adding weapons
 *     to SpaceShip objects
 * </summary>
 */
public abstract class Weapon implements Drawable, Comparable {

    protected double fireSpeed;
    protected String name = "";
    protected String sound;
    protected double loadTime;

    Weapon(String name, String sound, double fireSpeed, double loadTime) {
        this.name = name;
        this.sound = sound;
        this.fireSpeed = fireSpeed;
        this.loadTime = loadTime;
    }

    public void draw() {
        System.out.println(name);
    }
    public void fire() {
        System.out.println(sound);
    }

    public int compareTo(Comparable c) {
        /*
            Compare to another weapon based on loadTime
             - If current weapon loadTime > other, return 1
             - If current weapon loadTime < other, return -1
             - else, return 0
        */
        if (loadTime > ((Weapon)c).loadTime)
            return 1;
        else if (loadTime < ((Weapon)c).loadTime)
            return -1;
        else
            return 0;
    }

    @Override public String toString() {
        return String.format("Weapon: %s Sound: %s Fire Speed: %s Load time: %s",
            name, sound, fireSpeed, loadTime);
    }
}
