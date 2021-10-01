package HW5;

import java.awt.*;

public class GameMenu {

    abstract static class MenuItem {
        public abstract String getAction();
    }

    void act(MenuItem item) {
        System.out.println(item.getAction());

    }
    static class Start extends MenuItem {
        @Override
        public String getAction() {
            return "start";
        }
    }

    static class Options extends MenuItem {
        @Override
        public String getAction() {
            return "options";
        }
    }

    static class Exit extends MenuItem {
        @Override
        public String getAction() {
            return "exit";
        }
    }
}



