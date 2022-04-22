package org.example.lesson_interface;

public class Man implements Running, Jumping{
    private String name;
    private boolean possible;
    private double runLimit;
    private double jumpLimit;
    private double length;
    private double height;


    Man(String name, double runLimit, double jumpLimit) {
        this.name=name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;

    }

    public boolean isPossible() {
        return possible;
    }

    @Override
    public void jump(double height) {
        if(height<= jumpLimit){
            possible = true;
            System.out.printf("Человек %s может прыгнуть на %s метров \n", name, height);
            this.height = height;
        }
        else System.out.printf("%s не может прыгать выше %s метров\n",name,height );
    }


    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void run(double length) {
        if(length<= runLimit){
            possible = true;
            this.length = length;
            System.out.printf("Человек %s может пробежать %s метров \n", name, length);
        }
        else{
            System.out.printf("%s не может пробежать больше %s метров\n",name,runLimit );
            this.length = length;
        }
    }

    @Override
    public double getLength(){
        return length;
    }

    @Override
    public double getRunLimit() {
        return runLimit;
    }

    @Override
    public double getJumpLimit() {
        return jumpLimit;
    }
}
