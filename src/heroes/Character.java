package heroes;

import monsters.Monster;

public class Character {
    private String name;
    private Integer health;
    private Integer power;
    public Character(String name, Integer health, Integer power) {
        this.name = name;
        this.health = health;
        this.power = power;
    }

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void fight(Monster monster, Character character){
        monster.monsterShot(character);
        character.characterShot(monster);
    }

    public void characterShot(Monster monster){
        monster.setHealth(monster.getHealth()-this.power);
    }

    public void heal(Monster monster) {

        this.health += 20;

    }
}
