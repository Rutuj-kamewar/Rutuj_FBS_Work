package Main;

import controller.HomeController;
import view.HomeView;

public class Main {
    public static void main(String[] args) {

        HomeController controller = new HomeController();
        HomeView view = new HomeView(controller);

        view.start();  
    }
}
