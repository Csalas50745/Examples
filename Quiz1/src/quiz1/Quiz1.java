/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author charliesalas
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String lecture;
        int numEmployess = 0;
        double BrtSalry = 0;
        double amountxPay = 0;
        double deductionsSEM = 0.0925;
        double deductionsIVM = 0.0508;

        System.out.println("Bienvenido a la empresa. ");
        lecture = JOptionPane.showInputDialog("Digite cuantos empleados tiene: ");
        numEmployess = Integer.parseInt(lecture);

        for (int i = 0; i < numEmployess; i++) {
            lecture = JOptionPane.showInputDialog("Digite el salario de cada empleado: ");
            BrtSalry = Integer.parseInt(lecture);

            double deductionsSEMT = BrtSalry * deductionsSEM;
            double deductionsIVMT = BrtSalry * deductionsIVM;

            amountxPay = deductionsSEMT + deductionsIVMT;

        }

        System.out.println("En consecuencia, la empresa deberá pagar a la CCSS un total de: " + amountxPay);

    }

}
