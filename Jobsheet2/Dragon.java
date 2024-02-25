public class Dragon {
    int x, y, width, height;

    public Dragon(int xposition, int yposition, int wDragon, int hDragon) {
        x = xposition;
        y = yposition;
        width = wDragon;
        height = hDragon;
    }

    void moveLeft() {
        x = x - 1;
        if (x < 0) {
            detectCollision();
        }else{
            positionDragon();  
          }
    }

    void moveRight() {
        x = x + 1;
        if (x > width) {
            detectCollision();
        }else{
            positionDragon();  
          }
    }

    void moveUp() {
        y = y - 1;
        if (y < 0) {
            detectCollision();
        }else{
            positionDragon();  
          }
    }

    void moveDown() {
        y = y + 1;
        if (y > height) {
            detectCollision();
        }else{
          positionDragon();  
        }
        
    }

    void detectCollision() {
        System.out.println("Collision detected at position: " + x + ", " + y);
        System.out.println("Game Over");
    }

    void positionDragon() {
        System.out.println("Position Dragon at: " + x + ", " + y);
    }
}
