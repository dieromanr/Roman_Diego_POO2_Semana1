/**
 * Clase de prueba del sistema SpeedFast.
 * Demuestra POLIMORFISMO mediante:
 *  - SOBRESCRITURA (override): cada subclase redefine asignarRepartidor().
 *  - SOBRECARGA (overload): asignarRepartidor(String) coexiste con
 *    asignarRepartidor() en la misma clase.
 */

public class Main {
    public static void main(String[] args) {

        // Se crean instancias de cada subclase (arreglo de tipo Pedido -> polimorfismo)
        Pedido pedidoComida = new PedidoComida("C-001", "Av. Providencia 1234, Santiago", true);
        Pedido pedidoEncomienda = new PedidoEncomienda("E-001", "Los Militares 5620, Las Condes", 5.5, true);
        Pedido pedidoExpress = new PedidoExpress("X-001", "San Diego 890, Santiago Centro", 1.8, true);

        // Para cada pedido: primero se llama la versión SOBRESCRITA (sin parámetros)
        // y luego la versión SOBRECARGADA (con el nombre del repartidor).
        pedidoComida.asignarRepartidor();
        pedidoComida.asignarRepartidor("Juan Pérez");
        System.out.println();

        pedidoEncomienda.asignarRepartidor();
        pedidoEncomienda.asignarRepartidor("Camila Soto");
        System.out.println();

        pedidoExpress.asignarRepartidor();
        pedidoExpress.asignarRepartidor("Luis Díaz");
        System.out.println();

        // ----- Casos adicionales con validación fallida, para mostrar que la lógica -----
        // ----- de cada subclase realmente cambia el resultado (polimorfismo real) -----
        System.out.println("[Caso con validación fallida]");
        Pedido encomiendaPesada = new PedidoEncomienda("E-002", "Vitacura 2200, Vitacura", 25.0, true);
        encomiendaPesada.asignarRepartidor();
        encomiendaPesada.asignarRepartidor("Carlos Muñoz");
        System.out.println();

        Pedido expressLejano = new PedidoExpress("X-002", "Irarrázaval 3400, Ñuñoa", 6.2, true);
        expressLejano.asignarRepartidor();
        expressLejano.asignarRepartidor("Ana Torres");
    }
}
