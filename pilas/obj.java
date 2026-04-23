public class obj {
    private String url;
    private String titulo;
    private String fechaAceso;
    public obj() {
    }
    public obj(String url, String titulo, String fechaAceso) {
        this.url = url;
        this.titulo = titulo;
        this.fechaAceso = fechaAceso;
    }
    public String getUrl() {
        return url;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getFechaAceso() {
        return fechaAceso;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setfechaAceso(String fechaAceso) {
        this.fechaAceso = fechaAceso;
    }

}