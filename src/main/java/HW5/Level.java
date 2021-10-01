package HW5;

public class Level {
    private int width;
    private int height;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoader {
    public void load(Level level) throws LevelTooBigException{
        if (level.getHeight() * level.getWidth() <= 10000) {
            System.out.println("Level loaded");
        } else {
            throw new LevelTooBigException ();
        }
    }
}

class LevelTooBigException extends Exception {
    public LevelTooBigException() {
        super("Level too big");
    }
}
