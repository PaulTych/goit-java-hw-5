package HW5;

import java.util.Arrays;

public class HomeWork5Test {
    public static void main(String[] args) {
        Hero hero = new Hero();

        //Task 1
        System.out.println(hero.getName());//Expect Paratrooper
        System.out.println(hero.getHp());//Expect 100

        //Task 2-3
        Hero hero2 = new Hero("Stranger", 50);
        System.out.println(hero2.getName());//Expect Stranger
        System.out.println(hero2.getHp());//Expect 50

        //Task 4
        System.out.println(new Hero("Stranger", 250).getHp());

        //Task 5
        System.out.println(new BFG(10000, 300, "ExtraGun"));    //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(5000, 200)); //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(2000)); //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG());//BFG, ammo: 1000, damage: 50

        //Task 6
        new Bullet();
        new Bullet();

        //Task 7
        //GameSaver created!
        for (int i = 0; i < 10; i++) {
            new GameSaver();
        }

        //Task 8
        System.out.println(Arrays.toString(PowTable.POWERS_2));//[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

        System.out.println("Task 9:");
        for (int i = 0; i < 3; i++) {
            new AI();
        }

        System.out.println("Task 10:");
        System.out.println(new Distance(10, 10, 20, 20).getDistance()); //Expect 14
        System.out.println(new Distance(10, 10, 27, 25).getDistance());//Expect 23
        System.out.println(new Distance(-1, -36, 7, 14).getDistance());//Expect 23

        System.out.println("Task 11:");
        int[] coords = {2, 2, 12, 12};
        System.out.println(new RectangleArea(coords).getArea()); //Expect 100

        System.out.println("Task 12:");
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2)); //intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2)); //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2)); //not intersects

        System.out.println("Task 13:");
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        System.out.println(track1.equals(track2)); //false
        System.out.println(track1.equals(track3)); //true
        System.out.println(track1.hashCode() == track2.hashCode()); //Can be true or false
        System.out.println(track1.hashCode() == track3.hashCode()); //true

        System.out.println("Task 14:");
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        System.out.println(r1.canPlaceInto(r2)); //false
        System.out.println(r1.canPlaceInto(r3)); //true
        System.out.println(r2.canPlaceInto(r3)); //true
        System.out.println(r3.canPlaceInto(r2)); //false

        System.out.println("Task 15:");
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);
        System.out.println(Arrays.toString(nearestTarget)); //Expect [15, 14]

        System.out.println("------------------------------------------------");
        System.out.println("Task 16:");
        //System.out.println(new Level("Test"),);//Quarke level, name is Test

        System.out.println("------------------------------------------------");
        System.out.println("Task 17:");
        Level1.Point p1 = new Level1.Point(3, 5);
        Level1.Point p2 = new Level1.Point(10, 100);
        Level1.Point p3 = new Level1.Point(50, 40);

        Level1.Point[] points = {p1, p2, p3};
        // System.out.println(new Level("Test", points)); //Quarke level, name is Test, point count is 3

        System.out.println("------------------------------------------------");
        System.out.println("Task 18:");
        Level1.LevelInfo info = new Level1.LevelInfo("Quarke Intro", "Easy");
        System.out.println(new Level1(info, points));//Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3

        System.out.println("------------------------------------------------");
        System.out.println("Task 19:");
        System.out.println(new Level1(info, points).calculateLevelHash());

        System.out.println("------------------------------------------------");
        System.out.println("Task 20:");
        GameMenu menu = new GameMenu();
        menu.act(new GameMenu.Options()); //options
        menu.act(new GameMenu.Start());//start
        menu.act(new GameMenu.Exit());//exit

        System.out.println("------------------------------------------------");
        System.out.println("Task 21:");
        //LevelLoader levelLoader1 = new LevelLoader1();
        //System.out.println(LevelLoader1.load("StartLevel"));//Loading level Startlevel ...

        System.out.println("------------------------------------------------");
        System.out.println("Task 22:");
        System.out.println(LevelLoader1.getInstance().load("StartLevel"));

        System.out.println("------------------------------------------------");
        System.out.println("Task 23:");
        System.out.println(LevelLoader1.getInstance().load("StartLevel"));

        System.out.println("------------------------------------------------");
        System.out.println("Task 24:");
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));         //Get texture MainHero

        System.out.println("------------------------------------------------");
        System.out.println("Task 25:");
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[]{2, 4, 6, 8})); //5
        System.out.println(new AvgDamageCalculator().calculateAvg(new int[0])); //0

        System.out.println("------------------------------------------------");
        System.out.println("Task 26:");
        int[] array = {1, 2, 3};
        new ArrayWorker().printElement(array, 0); //value is 1, index is 0
        new ArrayWorker().printElement(array, 10);  //wrong index, index is 10

        System.out.println("------------------------------------------------");
        System.out.println("Task 27:");
        AIPlayer player = new AIPlayer();
        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        System.out.println("------------------------------------------------");
        System.out.println("Task 28:");
        int[] score = {10, 20, 100};
        System.out.println(new TotalScore().sum(score));//130

        System.out.println("------------------------------------------------");
        System.out.println("Task 29:");
        //Level loaded
        try {
            new LevelLoader().load(new Level(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader().load(new Level(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}


