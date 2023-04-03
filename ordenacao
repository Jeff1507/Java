import java.util.Scanner;

public class ordenacao
{
    static void ordenaVetor(int[] recebeNum, int tam)
    {
        int i, j, aux;
        for(i=0; i<tam; i++)
        {
            for(j=0; j<tam; j++)
            {
                if(recebeNum[i]<recebeNum[j])
                {
                    aux=recebeNum[j];
                    recebeNum[j]=recebeNum[i];
                    recebeNum[i]=aux;
                }
            }
        }
        for(i=0; i<tam; i++)
        {
            System.out.print(+recebeNum[i]+ " ");
        }
    }
	public static void main(String[] args) {
	    int num[], quantidade, i;
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("Informe uma quantidade de numeros: ");
	    quantidade=scan.nextInt();
	    num=new int[quantidade];
	    for(i=0; i<quantidade; i++)
	    {
	        System.out.println("Digite os numeros: ");
	        num[i]=scan.nextInt();
	    }
	    ordenaVetor(num, quantidade);
	}
}
