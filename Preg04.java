import javax.swing.*;
public class numero_capicua {
 
    public static void main(String[] args) {
        int num,inv,aux,digito;
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        inv=0;
        aux=num;
        while (aux>0){
            digito=aux%10;
            inv=inv*10+digito;
            aux=aux/10;
        }
        if (num==inv) {
            JOptionPane.showMessageDialog(null, "El numero es capicua");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero no es capicua");
        }
    }
}