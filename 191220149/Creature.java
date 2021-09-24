public class Creature extends Being {

    int health;
    int attack;
    String name;

    String[] memory;
    int memoryOffset;

    public Creature() {
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println(name + " tell " + creature.name + "'" + something + "'");
        creature.listen(something);
    }

    public void shout(String something) {
        System.out.println(name + " shout " + "'" + something + "'");
    }

    public void throwTo(Creature creature1, Creature creature2) {
        System.out.println(name + " throw " + creature1.name + "to" + creature2.name);
    }

    public void controll(Creature creature) {
        System.out.println(name + " controll " + creature.name);
    }

    public void listen(String something) {
        System.out.println(name + " heard: " + something);
        memory[memoryOffset % memory.length] = something;
    }

    public void attack(Creature creature, int ap) {
        System.out.println(name + " attack " + creature.name + " of " + ap + "points");
        creature.receiveAttack(ap);
    }

    public void cry() {
        System.out.println(name + " cry. ");
    }

    public void struggle() {
        System.out.println(name + " struggle. ");
    }

    public void fallOff() {
        System.out.println(name + " fall off a cliff. ");
    }

    public void bleed() {
        System.out.println(name + " bleed. ");
    }

    public void receiveAttack(int ap) {
        if (!isDead()) {
                health -= ap;
                System.out.println(name + " got " + ap + "points attack");
        }
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println("I am dead");
            return true;
        }

        return false;
    }

    

}
