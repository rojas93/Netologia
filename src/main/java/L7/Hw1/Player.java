package L7.Hw1;

import java.util.Arrays;
import java.util.List;

public class Player {

    private List<Weapon> weaponSlots;

    public Player() {

        weaponSlots = Arrays.asList(
                new Gun(),
                new AutomaticWeapon(),
                new RPG(),
                new Slingshot(),
                new WaterGun()
        );
    }

    public int getSlotsCount() {
        // size - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.size();
    }

    public void shotWithWeapon(int slot) {
        if (weaponSlots.size() < slot)
            throw new IllegalArgumentException();
        // если значение slot некорректно

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots.get(slot -1);
        // Огонь!
        weapon.shot();
    }
}
