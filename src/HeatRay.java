/**
 * <name>HeatRay</name>
 * <extends>Weapon</extends>
 * <implements>Drawable</implements>
 * <author>Ian Doarn</author>
 * <date>10-4-2017</date>
 * <summary>Subclass of Weapon</summary>
 */
public class HeatRay extends Weapon implements Drawable {

    HeatRay() { super("Heat Ray","buzz", 1.4, 1.2); }

    public void draw() {
        System.out.println(name);
    }

    public void fire() {
        System.out.println(sound);
    }

    @Override
    public int compareTo(Comparable c) {
        /* Override for weapon compareTo method

           Compare to another weapon based on loadTime
             - If current weapon loadTime > other, return 1
             - If current weapon loadTime < other, return -1
             - else, return 0
        */
        if (loadTime > ((Weapon)c).loadTime) {
            return 1;
        } else if (loadTime < ((Weapon)c).loadTime) {
            return -1;
        } else
            return 0;
    }

    @Override public String toString() {
        return String.format("Weapon: %s Sound: %s Fire Speed: %s Load time: %s",
                name, sound, fireSpeed, loadTime);
    }
}
