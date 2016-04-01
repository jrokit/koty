/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koty.domain;

import java.util.Date;





/**
 *
 * @author jrokita
 */
public class Kot {
    private String imie ="siersciuch";
    private Date data;
    private Float waga;
    private String imieOp;
    public String testOwo;

public String przedstawSie()    {
    return "jestem siersciuchem"+ imie+" Urodzilem sie "+data+
            " Jestem gruby: "+waga+" A moj stary to: "+imieOp;
    
         
}
public String powiedzMiau(String coTamSzemrasz)
{
    return "Mowie: "+ coTamSzemrasz;
}

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getImieOp() {
        return imieOp;
    }

    public void setImieOp(String imieOp) {
        this.imieOp = imieOp;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

}
