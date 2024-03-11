public class Jarra {
 private final int capacidad;
 private int contenido;
 public Jarra(int capacidad) {
         if(capacidad<=0) {
             throw new RuntimeException("ERROR");

             }else {
             this.capacidad=capacidad;
             this.contenido=0;
             }
         }
 public int capacidad(){
         return capacidad;
         }
 public int contenido(){
         return contenido;
         }
 public void llena() {
         contenido = capacidad;
         }
 public void vacia() {
         contenido = 0;
         }
 public void llenaDesde(Jarra j) {
         int c= Math.min( j.contenido ,(this.capacidad - this.contenido));
         j.contenido -= c;
         this.contenido+=c;
         }
 public String toString() {
         return "J(" +capacidad + "." + contenido + ")";
         }
}