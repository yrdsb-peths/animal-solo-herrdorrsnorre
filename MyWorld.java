import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant  = new Elephant();
        addObject(elephant, 300, 200);
        
        Label scoreLabel = new Label(0, 20);
        addObject(scoreLabel, 20, 20);
        
        createApple();
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(50);
        addObject(apple, x, y);
    }
}
