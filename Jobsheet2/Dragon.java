public class Dragon {
    int x,y,widht,height;

    void moveLeft(){
        x=x-1;
        if (x<0) {
            detectCollision(x, y);
        }
    }
    void moveRight(){
        x=x+1;
        if (x>widht) {
            detectCollision(x, y);
        }
    }
    void moveUp(){
        y=y-1;
        if (y<0) {
            detectCollision(x, y);
        }
    }

    void moveDown(){
        y=y+1;
        if (y>height) {
            detectCollision(x, y);
        }
    }

    void detectCollision(int x, int y){
        System.out.println("Game Over");
    }

}
