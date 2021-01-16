import java.util.Random;

public class Lottery {

    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int firstMin = 1;
        int firstMax = 50;
        int firstSet = 5;

        int secondMin = 1;
        int secondMax = 12;
        int secondSet = 2;

        int[] firstArray = new int[firstSet];
        int[] secondArray = new int[secondSet];
        boolean repeatedValue;
        int randNumber = 0;

        for(int arraySlot = 0; arraySlot < firstSet; arraySlot++){
            do{
                repeatedValue = false;
                randNumber = rand.nextInt(firstMax + 1 - firstMin) + firstMin;

                for(int j = 0; j <= arraySlot; j++){
                    if(firstArray[j] == randNumber){
                        repeatedValue = true;
                        break;
                    }
                }
            } while(repeatedValue);
            firstArray[arraySlot] = randNumber;
        }
        for(int m = 0; m < firstSet; m++){
            System.out.print(firstArray[m] + " ");
        }

        for(int arraySlot = 0; arraySlot < secondSet; arraySlot++){
            do{
                repeatedValue = false;
                randNumber = rand.nextInt(secondMax + 1 - secondMin) + secondMin;

                for(int j = 0; j <= arraySlot; j++){
                    if(secondArray[j] == randNumber){
                        repeatedValue = true;
                        break;
                    }
                }
            } while(repeatedValue);
            secondArray[arraySlot] = randNumber;
        }
        for(int m = 0; m < secondSet; m++){
            System.out.print(secondArray[m] + " ");
        }
    }

}
