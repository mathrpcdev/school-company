public class TesteAluno {

    private String nome;
    private Date birth;
    private String registerNumber;

    //*** Aqui estou criando o método "TestaAluno" ***
    // Eu crio um parâmetro passando o que será utilizado pelo método criado */
    public TesteAluno(String name, Date birth, String registerNumber) {
        // Métodos construtores indicando que estou utilizando as características dessa classe.
        this.name = name;
        this.birth = birth;
        this.registerNumber = registerNumber;
    }

    // Sobrecarga
    public TesteAluno() {

    }

    public String getNome() {
        return nome;
    }

    // Se eu quero "SETTAR" algo novo, esse novo começa com o vazio de um void.
    public void setNome(String nome) {
        this.nome = nome;

    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth() {
        this.birth;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber() {
        this.registerNumber;
    }
    
}

