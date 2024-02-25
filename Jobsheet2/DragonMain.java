// File DragonMain.java
public class DragonMain {
    public static void main(String[] args) {
        Dragon dg = new Dragon(10, 10, 100,100);

        dg.moveDown();
        dg.moveLeft();
        dg.moveLeft();
        dg.moveRight();
        
        dg.moveUp();
        dg.moveUp();
    }
}
