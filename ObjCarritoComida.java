public class ObjCarritoComida {
    private String Producto;
    private double precio;
    private int Cantidad;
    private String Cliente;

    // ------------------------------------------------------------------
    public String getProducto() {
        return Producto;
    }

    public void setProducto(String producto) {
        Producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public ObjCarritoComida() {
    }

    public ObjCarritoComida(ObjCarritoComida o) {
    }
}