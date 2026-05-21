package Sistema_De_Agendamento_Medico.entities;

public class Consulta {
    public String especialidade;
    public String horario;
    public Consulta(String especialidade,String horario){
        this.especialidade=especialidade;
        this.horario=horario;
    }
}
