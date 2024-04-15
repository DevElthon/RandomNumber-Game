package Game;

import java.util.Random;

public class SecretNumber {
    int maxRange, minRange, secretNumber;
    Random rand = new Random();
    
    public SecretNumber(int Level){
        switch (Level){
            case 1:
                this.minRange  = 1;
                this.maxRange = 10;
            break;
            case 2:
                this.minRange  = 1;
                this.maxRange = 20;
            break;
            case 3:
                this.minRange  = 1;
                this.maxRange = 30;
            break;
        }
    }

    public int getSecretNumber() {
        return secretNumber = rand.nextInt(maxRange-minRange) + minRange;
    }
}
