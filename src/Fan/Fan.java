package Fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW ;
    private boolean on = false ;
    private double radius = 5 ;
    private String color = "blue";
    public Fan(){

    }

    public void setSpeed(int speed) {
        switch (speed){
            case 1 :
                this.speed = SLOW;
                break;
            case 2 :
                this.speed = MEDIUM;
                break;
            case 3 :
                this.speed = FAST;
                break;
        }
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString(){
        if (on){
            return "This fan :{ speed : " + speed + " ; color : " + color + " ;radius : " + radius + " .Fan is on }" ;
        }else {
            return "This fan :{ color : " + color + " ;radius : " + radius + " .Fan is off }" ;
        }
    }
}
