package models;

public class PacienteParticular extends Paciente {

    private double valorDaConsulta;
    private String RG;

    public PacienteParticular(String nome, String sobrenome, Boolean primeiraConsulta) {
        super(nome, sobrenome, primeiraConsulta);
    }

    public double getValorDaConsulta() {
        return valorDaConsulta;
    }

    public void setValorDaConsulta(double valorDaConsulta) {
        this.valorDaConsulta = valorDaConsulta;
    }

    public String getRG() {
        return RG;
    }

    @Override
    public boolean avaliarPaciente() {
        if (super.getPrimeiraConsulta()) {
            return true;
        }
        return false;
    }
}
