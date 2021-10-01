package HW5;

public class Level1 {
    private Point[] points;
    private int pointsCount;
    private LevelInfo levelInfo;


    public Level1 (LevelInfo levelInfo,Point[] points){
       this.levelInfo=levelInfo;
       this.points=points;
       this.pointsCount = points.length;
    }

    @Override
    public String toString() {
        return "Quarke level, name is "+levelInfo.name+", difficulty is "+levelInfo.difficulty+", point count is "+pointsCount;
    }
    public int calculateLevelHash(){
        int result=0;
       for (int i =0;i<this.points.length;i++){
           result += points[i].x*points[i].y;
       }
       return result;
    }

    static class Point{
        private int x;
        private int y;

        public Point(int x, int y){
            this.x=x;
            this.y=y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    static class LevelInfo{
        private String name;
        private String difficulty;

        public void setName(String name) {
            this.name = name;
        }

        public void setDifficulty(String difficulty) {
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }

        public LevelInfo(String name, String difficulty){
            setName(name);
            setDifficulty(difficulty);
        }
    }
}
