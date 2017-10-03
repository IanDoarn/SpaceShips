import java.util.Arrays;

public class SpaceShipClient {
    public static void main(String[] args) {
        // Create spaceship object
        SpaceShip spaceship = new SpaceShip("Cool Spaceship", "brown", 4, 44.4, true);

        Weapon[] weapons = new Weapon[] { new Laser(), new SingularityCannon() };

        spaceship.mount(weapons);

        spaceship.draw();

        System.out.println(spaceship);

        spaceship.fireFastestWeapons(0);

        Weapon[] additionalWeapons = new Weapon[] { new Laser(), new SingularityCannon(), new HeatRay() };

        spaceship.mount(additionalWeapons);

        System.out.println("Weapons");

        System.out.println(Arrays.toString(spaceship.getWeapons()));

        spaceship.fireFastestWeapons(0);
    }
}
