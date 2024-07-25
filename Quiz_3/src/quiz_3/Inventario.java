/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
    public class Inventario {

    private int idProducto;
    private String nEmpleado;
    private String nProducto;
    private int idEmpleado;
    private int cProductos;
    private double pBase;
    private String tipoProducto;
    private double precioBruto;
    private double ganancia;

    public double getpBase() {
        return pBase;
    }

    public void setpBase(double pBase) {
        this.pBase = pBase;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public Inventario(double pBase, String tipoProducto, double precioBruto) {
        this.pBase = pBase;
        this.tipoProducto = tipoProducto;
        this.precioBruto = precioBruto;
    }

    public static void input(Inventario arrInfo[]) {
        String nombreS = JOptionPane.showInputDialog(null, "Ingrese el nombre del supermercado");
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo del supermercado"));
        String nombreE = JOptionPane.showInputDialog(null, "Ingrese su nombre empleado");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cedula"));

        for (int i = 0; i < arrInfo.length; i++) {
            String tipoProducto = JOptionPane.showInputDialog(null, "Escriba el tipo de producto a registrar");
            double pBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Escriba el precio base del producto"));

            double precioBruto = 0;
            switch (tipoProducto) {
                case "alimentos":
                    precioBruto = pBase * 1.2;
                    break;
                case "bebidas":
                    precioBruto = pBase * 1.3;
                    break;
                case "higiene":
                    precioBruto = pBase * 1.25 + 500;
                    break;
                case "limpieza":
                    precioBruto = pBase * 1.19 + pBase * 0.04 + 1000;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Producto incorrecto");
                    continue;
            }

            arrInfo[i] = new Inventario(pBase, tipoProducto, precioBruto);
        }
    }

    public static void mostrar(Inventario arrInfo[]) {
        String mensaje = "";
    double totalGanancia = 0;

    for (int i = 0; i < arrInfo.length; i++) {
        Inventario inventario = arrInfo[i];
        mensaje += " productos ingresados " + "" +inventario.getTipoProducto() +
                   " precio base " + "" +inventario.getpBase() +
                   " precio bruto  " + "" +inventario.getPrecioBruto();
        totalGanancia += inventario.getPrecioBruto() - inventario.getpBase();
    }

    mensaje += " ganancia total " + totalGanancia;

    JOptionPane.showMessageDialog(null, mensaje);
    }
}

