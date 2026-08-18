/*
 * Clase base que representa un pedido genérico dentro del sistema de SpeedFast.
 * Contiene los atributos comunes a cualquier tipo de pedido y define:
 *  - Un metodo que cada subclase redefinirá según su propia lógica de negocio.
 *  - Un Metodo que recibe el nombre del repartidor y que también será redefinido en cada subclase para
 *    incluir sus propias validaciones.
 */
public class Pedido {

    protected String idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    public Pedido(String idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    /*
     * Versión genérica (sin parámetros) del metodo.
     * Las subclases la sobreescriben para aplicar su lógica particular de asignación.
     */
    public void asignarRepartidor() {
        imprimirEncabezado();
        System.out.println("Asignando repartidor...");
    }

    protected void imprimirEncabezado() {
        System.out.println("[Pedido " + tipoPedido + "]");
        System.out.println("ID: " + idPedido + " | Dirección: " + direccionEntrega);
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("→ Pedido asignado a " + nombreRepartidor);
    }

    public String getIdPedido() {
        return idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }
}
