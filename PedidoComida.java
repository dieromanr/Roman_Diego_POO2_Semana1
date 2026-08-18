/*
 * Pedido de comida (restaurantes). Requiere que el repartidor cuente con
 * mochila térmica para mantener el pedido en condiciones adecuadas.
 */

public class PedidoComida extends Pedido {

    private boolean requiereMochilaTermica;

    public PedidoComida(String idPedido, String direccionEntrega, boolean requiereMochilaTermica) {
        super(idPedido, direccionEntrega, "Comida");
        this.requiereMochilaTermica = requiereMochilaTermica;
    }

    /*
     * SOBRESCRITURA: lógica propia de asignación para pedidos de comida.
     */

    @Override
    public void asignarRepartidor() {
        imprimirEncabezado();
        System.out.println("Asignando repartidor...");
        System.out.println("→ Verificando mochila térmica... " + (requiereMochilaTermica ? "OK" : "FALTA"));
    }

    /*
     * Al recibir el nombre del repartidor, valida
     * si cuenta con mochila térmica antes de confirmar la asignación.
     */

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        if (requiereMochilaTermica) {
            System.out.println("→ Pedido asignado a " + nombreRepartidor);
        } else {
            System.out.println("→ No se puede asignar a " + nombreRepartidor + ": falta mochila térmica.");
        }
    }
}
