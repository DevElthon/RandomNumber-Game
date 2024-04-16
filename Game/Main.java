package Game;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int level = 1;
        int tentativas = 0;
        int chute = 0;
        int gameIsUp = 1;
        Scanner input = new Scanner(System.in);

        //Init game
        System.out.println("Welcome to the GAME!\n");
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ \n\n");

        while(gameIsUp > 0 && level < 4){
            SecretNumber number = new SecretNumber(level);
            System.out.printf("Voce esta no nivel %d, conclua os 3 niveis para vencer o jogo!\n\n", level);
            GameLogic game = new GameLogic(chute, number, input, tentativas, 1, level * 10, level);
            
            if(game.getTentativas() < game.getLimiteTentativa()){
                level++;

                if(level >= 4){
                    System.out.println("Voce venceu todos os estagios!!! Parabens!!!");
                    break;
                }

                System.out.println("Insira 1 para continuar o jogo e 0 para encerrar: ");
                gameIsUp = input.nextInt();
            }
            else{
                level = 1;
            }
        }
    }
}
