public class Main {

    public static void main(String[] args) {

        Campania[] campanias = new Campania[5];
        campanias[0] = new Campania("Black Friday", "Facebook", 1500.00, true);
        campanias[1] = new Campania("Navidad", "Instagram", 2200.00, true);
        campanias[2] = new Campania("Regreso a clases", "TikTok", 800.00, false);
        campanias[3] = new Campania("Día del Padre", "Google Ads", 1200.00, true);
        campanias[4] = new Campania("San Valentín", "YouTube", 950.00, false);

        AnalizadorCampanias analizador = new AnalizadorCampanias(campanias);


        System.out.println("=== LISTADO DE CAMPAÑAS ===");
        System.out.println(analizador.listarCampanias());


        System.out.println("Campañas activas: " + analizador.contarActivas());

        System.out.println("Presupuesto total: $" + String.format("%.2f", analizador.calcularPresupuestoTotal()));
        System.out.println();

        System.out.println("=== BÚSQUEDA ===");
        Campania encontrada = analizador.buscarPorNombre("Navidad");
        if (encontrada != null) {
            System.out.println("Encontrada: " + encontrada.mostrarInformacion());
        } else {
            System.out.println("Navidad no encontrada");
        }

        Campania noExiste = analizador.buscarPorNombre("Halloween");
        if (noExiste == null) {
            System.out.println("Halloween no encontrada (retornó null)");
        } else {
            System.out.println("Encontrada: " + noExiste.mostrarInformacion());
        }
        System.out.println();

        System.out.println("=== DESAFÍO ===");
        Campania mayor = analizador.obtenerMayorPresupuesto();
        if (mayor != null) {
            System.out.println("Campaña de mayor presupuesto: " + mayor.mostrarInformacion());
        }
    }
}