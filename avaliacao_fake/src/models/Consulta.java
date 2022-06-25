package models;

public class Consulta {

    private String dataDaConsulta;
    private String especialidade;
    private String hora;
    private String minutos;

    public Consulta(String dataDaConsulta, String especialidade, String hora, String minutos) {
        super();
        this.dataDaConsulta = dataDaConsulta;
        this.especialidade = especialidade;
        this.hora = hora;
        this.minutos = minutos;
    }
}
