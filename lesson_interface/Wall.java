package org.example.lesson_interface;

public class Wall extends Obstacle{
    Wall(double distant) {
        super(distant);
    }

    void exercise(Jumping jumper) {
        if(getDistant()<=jumper.getHeight()){
            System.out.println("Успешно перепрыгнул стенку");
        }
        else System.out.println("Не смог перепрыгнуть стенку");
    }
}
