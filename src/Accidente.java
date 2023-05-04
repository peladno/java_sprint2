public class Accidente {
    /*
     * Accidente
     * - Identificador del accidente: obligatorio, número interno manejado por la
     * compañía.
     * - RUT Cliente: obligatorio
     * - Día: fecha del accidente, independiente si lo declara como una fecha o un
     * String,
     * debe ser desplegado con el formato DD/MM/AAAA
     * - Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a
     * 23, minutos entre 0 y 59)
     * - Lugar: obligatorio, mínimo 10 caracteres, máximo 50
     * - Origen: máximo 100 caracteres
     * - Consecuencias: máximo 100 caracteres
     */

    String id_accidente;
    String fecha_accidente;
    String hora;
    String lugar;
    String origen;
    String consecuencias;


    public Accidente(String id_accidente, String fecha_accidente, String hora, String lugar, String origen,
                     String consecuencias) {
        this.id_accidente = id_accidente;
        this.fecha_accidente = fecha_accidente;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public String getId_accidente() {
        return id_accidente;
    }

    public void setId_accidente(String id_accidente) {
        this.id_accidente = id_accidente;
    }

    public String getFecha_accidente() {
        return fecha_accidente;
    }

    public void setFecha_accidente(String fecha_accidente) {
        this.fecha_accidente = fecha_accidente;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }
}
