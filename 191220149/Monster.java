public class Monster extends Creature {


    Monster(String hint, int hp, int ap) {
        name=hint;
        health = hp;
        attack = ap;
    }

    @Override
    public void attack(Creature c, int ap) {
        System.out.println(name + " attack " + c.name + " of " + ap + "points");
        c.receiveAttack(ap);
    }


    public void beAngry() {
        System.out.println(name + " is so angry. ");
    }

    public void search() {
        System.out.println(name + " search. ");
    }

}
