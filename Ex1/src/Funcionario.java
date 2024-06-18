public class Funcionario {
    private int id;
    private String nome;
    private int salario;

    public Funcionario(int idDoUtilizador, String nome, int salario) {
        this.id = idDoUtilizador;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean aumentarSalario(float aumento){
        if (aumento > 0){
            this.salario += aumento;
            return true;
        }
        return false;
    }
}
