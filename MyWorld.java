import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1, false);
        
        Elephant elephant  = new Elephant();
        addObject(elephant, 300, 200);
        
        scoreLabel = new Label(0, 20);
        addObject(scoreLabel, 20, 20);
        
        createApple();
    }
    
    public void gameOver() 
    {
        Label gameOverLabel = new Label("GameOver", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore() 
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(50);
        addObject(apple, x, y);
    }
}
