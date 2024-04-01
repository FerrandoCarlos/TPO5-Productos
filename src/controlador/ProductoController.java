
package controlador;
import Vistas.ProductoView;
import javax.swing.JComboBox;
import modelo.Producto;
/**
 * @author Ferrando Carlos
 */
public class ProductoController {
    public static ProductoView vista = new ProductoView();
    public static void mostrar(){vista.setVisible(true);}
    public static void cerrar(){vista.setVisible(false);}

    public static void cargarCombo(JComboBox<Producto> jcbCategoria) {
//        jcbCategoria.addItem(new Producto("Electonica"));
//        jcbCategoria.addItem(new Producto("Indumentaria"));
//        jcbCategoria.addItem(new Producto("Alimentos"));
//        jcbCategoria.addItem(new Producto("Videojuegos"));
        
        System.out.println("evento");
        
    }  
    
}
