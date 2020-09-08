//PROGRAMA COSTO Y VUELTOS
package package1;

import javax.swing.JOptionPane;

public class Main {
  
    public static void main(String[] args) {//1
     int op;
     int costo,dinero,vueltos;
     
     try{//2
        do{//4
         String opc = JOptionPane.showInputDialog("Digite una opcion\n" //Variable string para capturar dato 
                                                  + "1) Digitar datos de compra\n"
                                                  + "2) Salir");
        if ( opc == null ){
             JOptionPane.showMessageDialog(null, "Pesiono cancelar"); //Si presiona cancelar mostrara el mensaje ya que la variable opc esta vacia
          } 
     
     op = Integer.parseInt(opc); //Convertir string a int
     
      switch(op){//5   
          case 1 :
              try{//6
              String scosto = JOptionPane.showInputDialog("Digite el costo del producto");//String costo
              if(scosto == null){JOptionPane.showMessageDialog(null, "Presiono cancelar");}
              String sdinero = JOptionPane.showInputDialog("Digite el dinero pagado");//String dinero
              if(sdinero == null){JOptionPane.showMessageDialog(null, "Presiono cancelar");}                  
              
              costo = Integer.parseInt(scosto);
              dinero = Integer.parseInt(sdinero);
              /////condicionales 
              if(dinero > costo){
              vueltos = dinero - costo;
              JOptionPane.showMessageDialog(null, "Costo: $"+costo+"  Dinero: $"+dinero+"\nVueltos: $"+vueltos);
              } else if(dinero == costo){
              JOptionPane.showMessageDialog(null, "Costo: $"+costo+"  Dinero: $"+dinero+"\nVueltos: $0 (No conserva vueltos)");                  
              }else{
              vueltos = costo - dinero;   
              JOptionPane.showMessageDialog(null, "Costo: $"+costo+"  Dinero: $"+dinero+"\nDinero faltante: $"+vueltos);              
              }
              ////Fin condicionales    
              }catch(Exception e){//6-7
                JOptionPane.showMessageDialog(null, "Debe rellenar todas las casillas con valores numericos ( intente de nuevo )");                                   
              }//7
              break;
          }//5
        }while(op != 2);//4
     }catch(Exception e){  //2-3
       JOptionPane.showMessageDialog(null, "Debe rellenar la casilla con alguna de las opciones  (1) o (2)");
      } //3         
    } //1 
    
}
