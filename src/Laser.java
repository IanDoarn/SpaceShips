/**
 * <name>Laser</name>
 * <extends>Weapon</extends>
 * <implements>Drawable</implements>
 * <author>Ian Doarn</author>
 * <date>10-4-2017</date>
 * <summary>Subclass of Weapon</summary>
 */
public class Laser extends Weapon implements Drawable {

    Laser() {
        super("Laser", "zap", 3.7, 2.3);
    }

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
        } else if (loadTime < ((Weapon)c).loadTime)
            return -1;
        else
            return 0;
    }

    @Override public String toString() {
        return String.format("Weapon: %s Sound: %s Fire Speed: %s Load time: %s",
                name, sound, fireSpeed, loadTime);
    }

}
