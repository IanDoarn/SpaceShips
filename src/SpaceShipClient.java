import java.util.Arrays;
/**
 *  SpaceShipClient
 *
 * <author>Ian Doarn</author>
 * <date>10-4-2017</date>
 *
 *  <summary>
 *      Test client program for using the SpaceShip
 *      class and the various subclasses of
 *      Weapon.
 *  </summary>
 */
public class SpaceShipClient {
    public static void main(String[] args) {
        // Create spaceship object
        SpaceShip spaceship = new SpaceShip("Cool Spaceship", "brown", 4, 44.4, true);

        // Create array of weapons
        Weapon[] weapons = new Weapon[] { new Laser(), new SingularityCannon() };

        // Add weapons to space ship
        spaceship.mount(weapons);

        // Draw the really cool space ship
        spaceship.draw();

        System.out.println(spaceship);

        // Fire fastest weapon in our arsenal
        spaceship.fireFastestWeapons(0);

        // Create a new array of weapons and add our new Heat Ray
        Weapon[] additionalWeapons = new Weapon[] { new Laser(), new SingularityCannon(), new HeatRay() };

        spaceship.mount(additionalWeapons);

        System.out.println("Weapons");
        System.out.println(Arrays.toString(spaceship.getWeapons()));

        // Fire the new fastest weapon
        spaceship.fireFastestWeapons(0);
    }
}
