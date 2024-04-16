package Game;

import java.util.Scanner;

public class GameLogic {
    int number;
    int limiteTentativa;
    int tentativas;

    public GameLogic(int chute, SecretNumber number, Scanner input, int tentativas, int min, int max, int level){
        this.number = number.getSecretNumber();
        this.limiteTentativa = level * 3; 
        this.tentativas = tentativas;

        System.out.println("Resposta: " + this.number);
        while(chute != this.number){
            if(this.tentativas >= this.limiteTentativa){
                level = 4;
                break;
            }

            System.out.printf("Insira um numero de %d a %d: ", min, max);
            chute = input.nextInt();

            if(chute == this.number){
                break;
            }
            else if(chute < this.number){
                this.tentativas++;
                System.out.println("O valor do numero escolhido, eh menor que o numero secreto. Tente novamente! " + (this.tentativas) + "/" + this.limiteTentativa);
            }
            else if(chute > this.number){
                this.tentativas++;
                System.out.println("O valor do numero escolhido, eh maior que o numero secreto. Tente novamente! " + this.tentativas + "/" + this.limiteTentativa);
            }
        }
        if(level >= 4){
            System.out.printf("Você realizou %d tentativa. Procure melhorar sua pontuacao!\n\n", this.tentativas);
        }
        else{
            GameScore score = new GameScore(this.tentativas);
            score.ImprimeScore();
        }
    }
    public int getTentativas(){
        return this.tentativas;
    }

    public int getLimiteTentativa(){
        return this.limiteTentativa;
    }
}
