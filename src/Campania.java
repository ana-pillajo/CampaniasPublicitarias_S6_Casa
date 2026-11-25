public class Campania {

    private String nombre;
    private String plataforma;
    private double presupuesto;
    private boolean activa;

    public Campania(String nombre, String plataforma, double presupuesto, boolean activa) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.presupuesto = presupuesto;
        this.activa = activa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public boolean isActiva() {
        return activa;
    }

    public String mostrarInformacion() {
        String estado;
        if (activa) {
            estado = "Activa";
        } else {
            estado = "Inactiva";
        }
        return nombre + " - " + plataforma + " - $" + String.format("%.2f", presupuesto) + " - " + estado;
    }
}