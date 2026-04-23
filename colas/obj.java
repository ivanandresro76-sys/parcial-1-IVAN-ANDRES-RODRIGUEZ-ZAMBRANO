public class obj {
    private String name;
    private String servivio;
    private String fecha;
    private boolean estado;
    private int id;
    public obj(String name, String servicio, String fecha, boolean estado, int id) {
        this.name = name;
        this.servivio = servicio;
        this.fecha = fecha;
        this.estado = estado;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getServivio() {
        return servivio;
    }
    public String getFecha() {
        return fecha;
    }
    public int getId() {
        return id;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setServicio(String servicio) {
        this.servivio = servicio;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void setId(int id) {
        this.id = id;
    }
}
