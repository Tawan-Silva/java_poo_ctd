package models;

public abstract class Paciente {

    private String nome;
    private String sobrenome;
    private Boolean primeiraConsulta;

    public Paciente(String nome, String sobrenome, Boolean primeiraConsulta) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.primeiraConsulta = primeiraConsulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Boolean getPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(Boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }

    public abstract boolean avaliarPaciente();

}
