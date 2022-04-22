package org.example.lesson_interface;

public abstract class Obstacle {
    private double distant;

    Obstacle(double distant){
        this.distant = distant;
    }

    public double getDistant() {
        return distant;
    }
}
