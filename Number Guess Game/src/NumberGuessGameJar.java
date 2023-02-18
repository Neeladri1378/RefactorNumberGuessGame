/*
 * This class expects to import a NumberGuessGame.jar file, 
 * and run the packaged source code as an executable.  
 */


public class NumberGuessGameJar {
  
  public static void main(String args[]) throws Exception {
      Game2 gameA = new Game2(1);
      Game2 gameB = new Game2(2);
      while (gameA.level <= 3 && gameB.level <= 3) {
        System.out.println("Level " + gameA.level);
        gameA.play();
        if (gameA.level > 3) {
            break;
        }
        System.out.println("Level " + gameB.level);
        gameB.play();
        break;
          }
      
      System.out.println("Congratulations! You completed all levels.");
  }
}
   





