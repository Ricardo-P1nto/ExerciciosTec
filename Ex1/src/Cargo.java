public class Cargo {
    private String titulo;
    private String departameto;

    public Cargo(String titulo, String departameto) {
        this.titulo = titulo;
        this.departameto = departameto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDepartameto() {
        return departameto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDepartameto(String departameto) {
        this.departameto = departameto;
    }
}
