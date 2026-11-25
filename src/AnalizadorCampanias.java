public class AnalizadorCampanias {

    // Asociación: el arreglo forma parte del estado del analizador
    private Campania[] campanias;

    public AnalizadorCampanias(Campania[] campanias) {
        this.campanias = campanias;
    }

    public int contarActivas() {
        int contador = 0;
        for (int i = 0; i < campanias.length; i++) {
            if (campanias[i] != null && campanias[i].isActiva()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularPresupuestoTotal() {
        double total = 0;
        for (int i = 0; i < campanias.length; i++) {
            if (campanias[i] != null) {
                total += campanias[i].getPresupuesto();
            }
        }
        return total;
    }

    public Campania buscarPorNombre(String nombre) {
        for (int i = 0; i < campanias.length; i++) {
            if (campanias[i] != null && campanias[i].getNombre().equals(nombre)) {
                return campanias[i];
            }
        }
        return null;
    }

    public String listarCampanias() {
        String resultado = "";
        for (int i = 0; i < campanias.length; i++) {
            if (campanias[i] != null) {
                resultado += campanias[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }

    // Desafío
    public Campania obtenerMayorPresupuesto() {
        Campania mayor = null;
        for (int i = 0; i < campanias.length; i++) {
            if (campanias[i] != null) {
                if (mayor == null || campanias[i].getPresupuesto() > mayor.getPresupuesto()) {
                    mayor = campanias[i];
                }
            }
        }
        return mayor;
    }
}