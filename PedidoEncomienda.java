/*
 * Pedido de encomienda (documentos o paquetes). Requiere validar el peso
 * declarado y que el embalaje sea adecuado antes de asignar repartidor.
 */
public class PedidoEncomienda extends Pedido {

    private double pesoKg;
    private boolean embalajeValidado;

    public PedidoEncomienda(String idPedido, String direccionEntrega, double pesoKg, boolean embalajeValidado) {
        super(idPedido, direccionEntrega, "Encomienda");
        this.pesoKg = pesoKg;
        this.embalajeValidado = embalajeValidado;
    }

    /*
     * Sobreescritura: lógica propia de asignación para encomiendas.
     */
    @Override
    public void asignarRepartidor() {
        boolean pesoValido = pesoKg <= 20.0;
        imprimirEncabezado();
        System.out.println("Asignando repartidor...");
        System.out.println("→ Validando peso y embalaje... " + (pesoValido && embalajeValidado ? "OK" : "FALLA"));
    }

    /*
     * valida peso y embalaje antes de confirmar
     * al repartidor recibido por parámetro.
     */
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        boolean pesoValido = pesoKg <= 20.0;
        if (pesoValido && embalajeValidado) {
            System.out.println("→ Pedido asignado a " + nombreRepartidor);
        } else {
            System.out.println("→ No se puede asignar a " + nombreRepartidor + ": "
                    + (!pesoValido ? "peso excede el límite permitido (20 kg). " : "")
                    + (!embalajeValidado ? "embalaje no validado." : ""));
        }
    }
}
