/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import conecction.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Taxonomy;
import org.mariadb.jdbc.Connection;


/**
 *
 * @author david
 */
public class TaxonomyServices {
    
    private static TaxonomyServices INSTANCE = new TaxonomyServices();
    
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private ConexionDB conn = new ConexionDB();
    private Connection con = conn.getConexion();  

    public TaxonomyServices() {
    }

    public static TaxonomyServices getINSTANCE() {
        return INSTANCE;
    } 
    
    public void createTaxonomy(Taxonomy taxonomy) throws SQLException{
        try {
            String sql = "INSERT INTO `taxonomy`(`animal`, `domain`, `kingdom`, `phylum`, `classA`, `orderA`, `family`, `genus`, `species`, `subspecies`) VALUES ('"+taxonomy.getAnimal()+"','"+taxonomy.getDomain()+"','"+taxonomy.getKingdom()+"','"+taxonomy.getPhylum()+"','"+taxonomy.getClassA()+"','"+taxonomy.getOrderA()+"','"+taxonomy.getFamily()+"','"+taxonomy.getGenus()+"','"+taxonomy.getSpecies()+"','"+taxonomy.getSubspecies()+"')";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Se ha agregado la información taxonomica del animal", "Animal añadido", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al insertar", JOptionPane.ERROR_MESSAGE);
            throw new SQLException();
        }
    }
    
    public ResultSet searchTaxonomy(String code, String what) throws SQLException{
        String where = "";
        if(!"".equals(code)){
            where = "WHERE code = '" + code +"'";
        }try {
            String sql = "SELECT "+what+" FROM taxonomy " +where;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException ex) {
            throw new SQLException("Error de busqueda");
        }        
    }

    public void updateTaxonomy(Taxonomy taxonomy) throws SQLException{
        try {
            String sql = "UPDATE `taxonomy` SET `code`='"+taxonomy.getCode()+"',`animal`='"+taxonomy.getAnimal()+"',`domain`='"+taxonomy.getDomain()+"',`kingdom`='"+taxonomy.getKingdom()+"',`phylum`='"+taxonomy.getPhylum()+"',`classA`='"+taxonomy.getClassA()+"',`orderA`='"+taxonomy.getOrderA()+"',`family`='"+taxonomy.getFamily()+"',`genus`='"+taxonomy.getGenus()+"',`species`='"+taxonomy.getSpecies()+"',`subspecies`='"+taxonomy.getSubspecies()+"' WHERE code = '"+taxonomy.getCode()+"'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Se ha actualizado el producto", "Producto editado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            throw new SQLException();
        }
    }

    public void deleteTaxonomy(int code) throws SQLException{
       try {
            String sql = "DELETE FROM `taxonomy` WHERE code = '"+code+"'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Se ha eliminado el producto", "Producto eliminado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            throw new SQLException();
        } 
    }
    
}
