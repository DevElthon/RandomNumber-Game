package Game;

import java.util.Scanner;

public class GameLogic {
    int number;

    public GameLogic(int chute, SecretNumber number, Scanner input, int tentativas, int min, int max){
        this.number = number.getSecretNumber();
        System.out.println("Resposta: " + this.number);
        while(chute != this.number){
            System.out.printf("Insira um numero de %d a %d: ", min, max);
            chute = input.nextInt();

            if(chute == this.number){
                tentativas++;
                break;
            }
            else if(chute < this.number){
                System.out.println("O valor do numero escolhido, eh menor que o numero secreto. Tente novamente!");
                tentativas++;
            }
            else if(chute > this.number){
                System.out.println("O valor do numero escolhido, eh maior que o numero secreto. Tente novamente!");
                tentativas++;
            }
        }
        GameScore score = new GameScore(tentativas);
        score.ImprimeScore();
    }
}
