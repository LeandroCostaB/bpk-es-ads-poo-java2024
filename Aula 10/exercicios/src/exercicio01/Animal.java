package exercicio01;

public class Animal {
    private String nome;
    private Integer idade;
    public Boolean respirar;

    public Animal(Integer idade, String nome) {
        this.idade = idade;
        this.nome = nome;
        this.respirar = false;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getRespirar() {
        return respirar;
    }

    public void setRespirar(Boolean respirar) {
        this.respirar = respirar;
    }

    public void respirando (){
        if (!this.respirar){
            this.respirar = true;
            System.out.println("O animal etsta respirando");
        }else {
            System.out.println("O animal esta MORTO");
        }
    }

    public void morto (){
        if (!this.respirar){
            this.respirar = false;
            System.out.println("O animal esta morto");
        }else{
            System.out.println("O animal esta respirando");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", respirar=" + respirar +
                '}';
    }
}
