/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna <p/> This program is free software: you can
 * redistribute it and/or modify it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the License, or (at your option)
 * any later version. <p/> This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Affero General Public License for more details. <p/> You should
 * have received a copy of the GNU Affero General Public License along with this program. If not,
 * see <https://www.gnu.org/licenses/>.
 */

package it.eng.parer.crypto.model.verifica;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CryptoFirCrl implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idCrl;
    private Date dtIniCrl;
    private Date dtScadCrl;
    private BigDecimal niSerialCrl;
    private CryptoFirCertifCa firCertifCa;
    private CryptoFirFilePerFirma firFilePerFirma;
    private String linkCRL;

    private String subjectKeyID;
    private String subjectDN;
    private String uniqueId;

    public CryptoFirCrl() {
	// empty
    }

    // public long getIdCrl() {
    // return this.idCrl;
    // }
    //
    // public void setIdCrl(long idCrl) {
    // this.idCrl = idCrl;
    // }
    public Date getDtIniCrl() {
	return this.dtIniCrl;
    }

    public void setDtIniCrl(Date dtIniCrl) {
	this.dtIniCrl = dtIniCrl;
    }

    public Date getDtScadCrl() {
	return this.dtScadCrl;
    }

    public void setDtScadCrl(Date dtScadCrl) {
	this.dtScadCrl = dtScadCrl;
    }

    public BigDecimal getNiSerialCrl() {
	return this.niSerialCrl;
    }

    public void setNiSerialCrl(BigDecimal niSerialCrl) {
	this.niSerialCrl = niSerialCrl;
    }

    public CryptoFirCertifCa getFirCertifCa() {
	return this.firCertifCa;
    }

    public void setFirCertifCa(CryptoFirCertifCa firCertifCa) {
	this.firCertifCa = firCertifCa;
    }

    public CryptoFirFilePerFirma getFirFilePerFirma() {
	return this.firFilePerFirma;
    }

    public void setFirFilePerFirma(CryptoFirFilePerFirma firFilePerFirma) {
	this.firFilePerFirma = firFilePerFirma;
    }

    public String getLinkCRL() {
	return linkCRL;
    }

    public void setLinkCRL(String linkCRL) {
	this.linkCRL = linkCRL;
    }

    public String getSubjectKeyID() {
	return subjectKeyID;
    }

    public void setSubjectKeyID(String subjectKeyID) {
	this.subjectKeyID = subjectKeyID;
    }

    public String getSubjectDN() {
	return subjectDN;
    }

    public void setSubjectDN(String subjectDN) {
	this.subjectDN = subjectDN;
    }

    public String getUniqueId() {
	return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
	this.uniqueId = uniqueId;
    }

}
