/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.SQLException;
import models.Taxonomy;
import services.TaxonomyServices;

/**
 *
 * @author david
 */
public class ManageeAnimalController {

    public ManageeAnimalController() {
    }
    
    public void updateAnimal(Taxonomy taxonomy) throws SQLException{
        TaxonomyServices.getINSTANCE().updateTaxonomy(taxonomy);
    }
    
    public void deleteAnimal(int code) throws SQLException{
        TaxonomyServices.getINSTANCE().deleteTaxonomy(code);
    }
    
}
