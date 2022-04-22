package org.example.lesson_interface;

public class Robot implements Running{
    private String name;
    private boolean possible;
    private double runLimit;
    private double length;

    Robot(String name,double runLimit) {
        this.name=name;
        this.runLimit = runLimit;
    }

    public boolean isPossible() {
        return possible;
    }

    @Override
    public void run(double length) {
        if(length<= runLimit){
            possible = true;
            this.length = length;
            System.out.printf("Робот %s может пробежать на %s метров \n", name, length);
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
}
