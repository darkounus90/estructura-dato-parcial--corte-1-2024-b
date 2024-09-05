
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.next();
        if(nombreCliente.isEmpty()){

    
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.next();
        if(nombreProducto.isEmpty()){

        System.out.println("Ingrese el valor unitario del producto");
        double valorUnitario = scanner.nextDouble();
        if(valorUnitario>0){ 
            System.out.println("Ingrese la cantidad del producto ");
            double cantidad = scanner.nextDouble();
            scanner.close();
            if(cantidad>0){
                double valorBruto = valorUnitario * cantidad;
                double descuento;
                if (cantidad < 10) {
                    descuento = 0;
                } else if (10 <= cantidad && cantidad < 20) {
                    descuento = valorBruto * 0.05;
                } else {
                    descuento = valorBruto * 0.07;
                }
                double valorNeto = valorBruto - descuento;
    
          
                System.out.println("Nombre del Cliente: " + nombreCliente);
                System.out.println("Nombre del Producto: " + nombreProducto);
                System.out.println("Valor Unitario: " + valorUnitario);
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Valor Bruto: " + valorBruto);
                System.out.println("Valor Descuento: " + descuento);
                System.out.println("Valor Neto: " + valorNeto);
            }
            else{
                System.out.println("La cantidad debe ser mayor a 0");
            }
        }else{ System.out.println("Ingrese un nombre para el cliente");}
    }else{
        System.out.println("Ingrese un valor unitario para el producto");}
    }else{

        System.out.println("Ingrese una cantidad de producto");
    }

            
            
            
            
            
         
            
    
        }
    
            
            
            
            
            
            }

            
            
            




            

       
        


       
    


        
        
