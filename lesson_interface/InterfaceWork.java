package org.example.lesson_interface;

public class InterfaceWork {
    public static void main(String[] args) {

        Running[] creatures = {
                new Cat("Мурка", 400, 1),
                new Cat("Рыжик", 250, 1.2),
                new Robot("T-800", 1000),
                new Man("Ivan",500, 0.7)              ,
                new Robot("NT-200", 100),
                new Man("John", 1000,1.5)
        };

        Obstacle[] obstacles = {
                new Wall(0.7),
                new Track(100),
                new Wall(0.2),
                new Track(400),
                new Wall(2)
        };

        for (int i = 0; i<creatures.length; i++){
            if(creatures[i] instanceof Robot){
                creatures[i].run(250);
            }
            else creatures[i].run(400);

            if(creatures[i] instanceof Jumping){
                ((Jumping)creatures[i]).jump(1);

                if (creatures[i].getRunLimit()>=creatures[i].getLength() && ((Jumping)creatures[i]).getJumpLimit()>=((Jumping)creatures[i]).getHeight()) {
                    for (Obstacle obstacle : obstacles) {

                        if (obstacle instanceof Wall)
                            if(obstacle.getDistant()<= ((Jumping) creatures[i]).getHeight()){
                                ((Wall) obstacle).exercise((Jumping) creatures[i]);
                            }
                            else{
                                System.out.println("Дисквалификация: стенка не перепрыгнута");
                                break;
                            }
                        else if (obstacle instanceof Track)
                            if(obstacle.getDistant()<= ((Running) creatures[i]).getRunLimit()){
                                ((Track) obstacle).exercise(creatures[i]);
                            }
                            else{
                                System.out.println("Дисквалификация: стенка не перепрыгнута");
                                break;
                            }
                    }
                }

                else System.out.println("Участник не соответствует требованиям");
            }
            else System.out.println("Роботы не прыгают - дисквалификация");

            System.out.println();
        }
    }
}
