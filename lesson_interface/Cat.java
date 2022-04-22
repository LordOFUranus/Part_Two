package org.example.lesson_interface;

public class Cat implements Jumping, Running{
    private String name;
    private double runLimit;
    private double jumpLimit;
    private boolean possible;
    private double length;
    private double height;
    Cat(String name, double runLimit, double jumpLimit) {
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
            this.height = height;
            System.out.printf("Кот %s может прыгнуть %s метров \n", name, height);
        }
        else System.out.printf("%s не может прыгать выше %s метров\n",name,jumpLimit );
    }

    @Override
    public double getHeight(){
        return height;
    }


    @Override
    public void run(double length) {
        if(length<= runLimit){
            possible = true;
            System.out.printf("Кот %s может пробежать %s метров \n", name, length);
            this.length = length;
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
