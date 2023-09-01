/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Taxonomy;
import services.TaxonomyServices;

/**
 *
 * @author david
 */
public class MainController {
    
    ArrayList<Object[]> products;

    public MainController() throws SQLException {
    }

    public ArrayList<Object[]> getAnimals() {
        return products;
    }       
    
    public ArrayList<Object[]> searchTaxonomy(String code, String what) throws SQLException{
        products = new ArrayList<>();
        try {
            ResultSet rs = TaxonomyServices.getINSTANCE().searchTaxonomy(code, what);
            int columnCount = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object[] filas = new Object[columnCount+1];
                for (int i = 0; i < columnCount; i++) {
                    filas[i] = rs.getObject(i+1);
                }
                products.add(filas);
            }
            return products;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de busqueda", "SQL error", JOptionPane.ERROR_MESSAGE);
            throw new SQLException("Error de busqueda");
        }
    }
    
    public Taxonomy manageTaxonomy(String code, String what) throws SQLException{
        try {
            ResultSet rs = TaxonomyServices.getINSTANCE().searchTaxonomy(code, what);
            int columnCount = rs.getMetaData().getColumnCount();
            Taxonomy animal = new Taxonomy();
            while(rs.next()){
                Object[] filas = new Object[columnCount+1];
                for (int i = 0; i < columnCount; i++) {
                    filas[i] = rs.getObject(i+1);
                }
                animal = new Taxonomy(Integer.parseInt(filas[0].toString()), filas[1].toString(), filas[2].toString(), filas[3].toString(), filas[4].toString(), filas[5].toString(), filas[6].toString(), filas[7].toString(), filas[8].toString(), filas[9].toString(), filas[10].toString());
            }
            return animal;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de busqueda", "SQL error", JOptionPane.ERROR_MESSAGE);
            throw new SQLException("Error de busqueda");
        }
    }
    
}
