/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koty.domain;

import com.mycompany.koty.domain.Kot;
import com.mycompany.koty.domain.Kot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author jrokita
 */
public class KotDAO {
    private Kot kot = new Kot();
    private Kot kote = new Kot();
    private List<Kot> listaKotow = new ArrayList<>();

    public List<Kot> dodajKota(Kot kot){
        listaKotow.add(kot);
        return listaKotow;
    }

    public void getListaKotow() {
        System.out.println("Ile kotow"+listaKotow.size());
        listaKotow.forEach(item -> System.out.println("Imie "+item.getImie()));
    }
        

            
            
    
    
}
