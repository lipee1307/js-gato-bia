package model;

public class Gato {

    private String nome;
    private String raca;
    private int idade;

    pubic Loja (String n, String raca, int idade);
    this.nome = n;
    this.raca = raca;
    this.idade = idade; 
}
    
    public Produto (){
        this.nome = "Miudo";
        this.raca = "Siamês";
        this.idade = 1;
    }

    public void emitirSom(){
        System.out.printIn("Miau Miau")
    }

    public String getNome(){
        return nome;
    }

    public String getRaca(){
        return raca;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

        public void setRaca(String raca){
        this.raca = raca;
    }

        public void setIdade(String idade){
        this.idade = idade;
    }

    @Override
    public String toString(){
        return
        "Gato [nome = " + nome +
        "raca"
        "idade"
    }