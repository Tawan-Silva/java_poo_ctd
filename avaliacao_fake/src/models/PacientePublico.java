package models;

public class PacientePublico extends Paciente implements  Comparable<PacientePublico> {

    private int SUS;

    public PacientePublico(String nome, String sobrenome, Boolean primeiraConsulta, int SUS) {
        super(nome, sobrenome, primeiraConsulta);
        this.SUS = SUS;
    }

    public int getSUS() {
        return SUS;
    }

    public void setSUS(int SUS) {
        SUS = SUS;
    }

    @Override
    public boolean avaliarPaciente() {
        if (super.getPrimeiraConsulta()) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(PacientePublico paciente) {
        if(this.SUS == paciente.SUS) {
            return 0;
        }
        if(this.SUS > paciente.SUS) {
            return 1;
        }

        return -1;
    }
}
