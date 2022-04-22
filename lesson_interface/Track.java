package org.example.lesson_interface;

public class Track extends Obstacle{
    Track(double distant) {
        super(distant);
    }

    void exercise(Running runner) {
        if(getDistant()<=runner.getLength()){
            System.out.println("Успешно пробежал беговую дорожку");
        }
        else System.out.println("Не смог пробежать дорожку");
    }
}
