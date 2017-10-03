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
        /* Override for weapon */
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
