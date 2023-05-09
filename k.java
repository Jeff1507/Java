import java.util.ArrayList;
public class registro {

    private ArrayList <pessoa2> pessoas;

    public registro()
    {
        pessoas=new ArrayList<>();
    }
    public ArrayList<pessoa2> getPessoas()
    {
        return pessoas;
    }
    public boolean cadastraPessoa(String n, String email, double altura, int idade)
    {

        pessoa2 pessoa=new pessoa2(n, email, altura, idade);
        if(verificarEmail(pessoa.getEmail()))
        {
            return false;
        }
        pessoas.add(pessoa);
        return true;
    }
    private static <T> Boolean verificarEmail(T... array)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;i++)
            {
                if(array[i]!=null && array[i].equals(array[j]))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public ArrayList<pessoa2> lista()
    {
        if(pessoas.isEmpty())
        {
            return null;
        }
        return pessoas;
    }
    public pessoa2 buscarPessoaMaisVelha()
    {
        int maior=0;
        pessoa2 maisVelha=null;
        for(pessoa2 pessoa:pessoas)
        {
            if(pessoa.getIdade()>maior)
            {
                maior=pessoa.getIdade();
                maisVelha=pessoa;

            }
        }
        return maisVelha;
    }
    public pessoa2 buscarPessoaMaisBaixa(){
        double baixo=0.0;;
        pessoa2 maisBaixo=null;
        for(pessoa2 pessoa:pessoas)
        {
            if(baixo==0.0){
                baixo=pessoa.getAltura();
            }
            if(pessoa.getAltura()<baixo)
            {
                baixo=pessoa.getAltura();
                maisBaixo=pessoa;
            }
        }
        return maisBaixo;
    }

}
