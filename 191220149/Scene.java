public class Scene {

    Human oldman;
    Human pangolin;
    Human dawa;
    Monster bats;
    Monster cricket;
    Monster scorpion;
    Monster cliff;

    public Scene() {
        oldman = new Human("爷爷");
        pangolin = new Human("穿山甲");
        dawa = new Human("大娃");
        bats = new Monster("蝙蝠兵",200, 10);
        cricket = new Monster("蟋蟀",200, 10);
        cliff = new Monster("悬崖",200, 10);
        scorpion = new Monster("蝎子",500, 50);
    }

    public void play() {

        scorpion.controll(pangolin);
        pangolin.struggle();

        scorpion.shout("嘿嘿！");
        pangolin.speakTo(scorpion, "你们这些坏蛋！");

        scorpion.throwTo(pangolin,bats);
        bats.controll(pangolin);
        pangolin.struggle();

        cricket.speakTo(scorpion, "报告大王！大事不好，老头和瞎眼葫芦逃跑啦！");
        scorpion.beAngry();

        bats.throwTo(pangolin,scorpion);
        scorpion.attack(pangolin,10);
        pangolin.shout("放开我！你们这些坏蛋，害人精！");
        pangolin.bleed();


        scorpion.throwTo(pangolin,cliff);
        pangolin.fallOff();
        oldman.cry();

        scorpion.speakTo(bats, "快把老头给我抓回嘞！");
        bats.search();
        dawa.shout("嘿！你们这些懒虫，还不快起床！");

        cliff.shout("还没出生便骂人懒虫！下一回：穿山甲之死？duel standby!");

    }

    public static void main(String[] args) {
        new Scene().play();
    }

}
