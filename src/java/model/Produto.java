/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kanec
 */
public class Produto {

    protected int idMerc;
    protected String tipMerc;
    protected String nomeMerc;
    protected int qntdMerc;
    protected double precMerc;
    protected boolean tipoMerc;
    protected boolean deltMerc;

    public Produto() {
    }

    public int getIdMerc() {
        return idMerc;
    }

    public void setIdMerc(int idMerc) {
        this.idMerc = idMerc;
    }

    public String getTipMerc() {
        return tipMerc;
    }

    public void setTipMerc(String tipMerc) {
        this.tipMerc = tipMerc;
    }

    public String getNomeMerc() {
        return nomeMerc;
    }

    public void setNomeMerc(String nomeMerc) {
        this.nomeMerc = nomeMerc;
    }

    public int getQntdMerc() {
        return qntdMerc;
    }

    public void setQntdMerc(int qntdMerc) {
        this.qntdMerc = qntdMerc;
    }

    public double getPrecMerc() {
        return precMerc;
    }

    public void setPrecMerc(double precMerc) {
        this.precMerc = precMerc;
    }

    public boolean isTipoMerc() {
        return tipoMerc;
    }

    public void setTipoMerc(boolean tipoMerc) {
        this.tipoMerc = tipoMerc;
    }

    public boolean isDeltMerc() {
        return deltMerc;
    }

    public void setDeltMerc(boolean deltMerc) {
        this.deltMerc = deltMerc;
    }

}
