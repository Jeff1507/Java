import java.util.Scanner;
import java.util.Random;

public class megaSenna
{
	public static void main(String[] args) {
	    int quantDeJogo=0, i, j;
	    int[] numRand=new int [6];
	    int[][] numUser;
	    Scanner scan=new Scanner(System.in);
	    Random rand=new Random();
	    
	    for(i=0; i<6; i++)
	    {
	        numRand[i]=rand.nextInt(60)+1;
	    }
	    
	    while(quantDeJogo!=1 && quantDeJogo!=2 && quantDeJogo!=3)
	    {
	        System.out.println("Escolha quantos jogo deseja fazer (1, 2, 3): ");
		    quantDeJogo=scan.nextInt();
		    if(quantDeJogo==1 || quantDeJogo==2 || quantDeJogo==3)
		    {
		        break;
		    }
		    else
		    {
		        System.out.println("Digite uma quantidade de 1 a 3!");
		    }
	    }
	    for(i=0; i<quantDeJogo; i++)
	    {
	        System.out.println("Digite uma sequencia de 6 numeros (1 a 60)");
	        numUser=new int[quantDeJogo][6];
	        for(i=0; i<quantDeJogo; i++)
	        {
	            System.out.printf("Sequencia (%d): ", i+1);
	            for(j=0; j<6; j++)
	            {
	                
	                numUser[i][j]=scan.nextInt();    
	            }
	        }
	    }
	}
}
