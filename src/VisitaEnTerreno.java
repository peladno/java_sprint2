import java.time.LocalDate;

public class VisitaEnTerreno {

    private int identificador;
    private String rutCliente;
    private LocalDate dia;
    private String hora;
    private String lugar;
    private String comentarios;

    public VisitaEnTerreno() { }

    public VisitaEnTerreno(int identificador, String rutCliente, LocalDate dia, String hora, String lugar, String comentarios) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Visita en terreno #" + identificador + " - Rut cliente: " + rutCliente + " - Fecha: " + dia.getDayOfMonth() + "/" + dia.getMonthValue() + "/" + dia.getYear() + " - Hora: " + hora + " - Lugar: " + lugar + " - Comentarios: " + comentarios;
    }
}
