/*
 * Compra Express (supermercado o farmacia). Debe asignarse al repartidor
 * más cercano que tenga disponibilidad inmediata.
 */
public class PedidoExpress extends Pedido {

    private double distanciaKm;
    private boolean disponibilidadInmediata;

    public PedidoExpress(String idPedido, String direccionEntrega, double distanciaKm, boolean disponibilidadInmediata) {
        super(idPedido, direccionEntrega, "Express");
        this.distanciaKm = distanciaKm;
        this.disponibilidadInmediata = disponibilidadInmediata;
    }

    /**
     * SOBRESCRITURA: lógica propia de asignación para compras express.
     */
    @Override
    public void asignarRepartidor() {
        boolean cumple = disponibilidadInmediata && distanciaKm <= 3.0;
        imprimirEncabezado();
        System.out.println("Asignando repartidor...");
        if (cumple) {
            System.out.println("→ Repartidor más cercano con disponibilidad inmediata encontrado.");
        } else {
            System.out.println("→ Buscando repartidor más cercano con disponibilidad inmediata... sin candidatos ideales.");
        }
    }

    /*
     * Valida cercanía y disponibilidad inmediata
     * del repartidor recibido por parámetro.
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        if (disponibilidadInmediata && distanciaKm <= 3.0) {
            System.out.println("→ Pedido asignado a " + nombreRepartidor);
        } else {
            System.out.println("→ No se puede asignar a " + nombreRepartidor + " (distancia: " + distanciaKm
                    + " km, disponibilidad inmediata: " + disponibilidadInmediata + ").");
        }
    }
}
