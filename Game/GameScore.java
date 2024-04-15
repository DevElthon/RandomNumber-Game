package Game;
public class GameScore {
    int tentativas = 0;

    public GameScore(int tentativas){
        this.tentativas = tentativas;
    }

    public void ImprimeScore(){
        switch(this.tentativas){
            case 1: 
                System.out.printf("Você realizou %d tentativa. Atingiu a pontuacao maxima!\n\n", tentativas);
            break;
            case 2: 
                System.out.printf("Você realizou %d tentativa. Esta quase em seu auge!\n\n", tentativas);
            break;
            case 3: 
                System.out.printf("Você realizou %d tentativa. Continue assim!\n\n", tentativas);
            break;
            default: 
            System.out.printf("Você realizou %d tentativa. Procure melhorar sua pontuacao!\n\n", tentativas);
        }
        
    }
}
