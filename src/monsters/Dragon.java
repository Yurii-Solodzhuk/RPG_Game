package monsters;

import heroes.Character;

public class Dragon extends Monster {
    public Dragon(String name, Integer health, Integer power) {
        super(name, health, power);
    }

    public Dragon() {
    }

    @Override
    public Integer useAttackSpell() {
        Integer power = null;
        if (super.getHealth() < 75 && super.getHealth() > 55 || super.getHealth() < 35 && super.getHealth() > 15) {
            power = super.getPower();
            double dmg = power * 3;
            power = (int) dmg;
            System.out.println("I used power");
        }
        return power;
    }

    @Override
    public void monsterShot(Character character) {
        character.setHp(character.getHp() - super.getPower() * 2);
    }
}