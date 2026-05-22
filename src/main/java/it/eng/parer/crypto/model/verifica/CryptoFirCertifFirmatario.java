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

public class CryptoFirCertifFirmatario implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idCertifFirmatario;
    private Date dtFinValCertifFirmatario;
    private Date dtIniValCertifFirmatario;
    private BigDecimal niSerialCertifFirmatario;
    private CryptoFirCertifCa firCertifCa;
    private CryptoFirFilePerFirma firFilePerFirma;

    public CryptoFirCertifFirmatario() {
	// empty
    }

    // public long getIdCertifFirmatario() {
    // return this.idCertifFirmatario;
    // }
    //
    // public void setIdCertifFirmatario(long idCertifFirmatario) {
    // this.idCertifFirmatario = idCertifFirmatario;
    // }

    public Date getDtFinValCertifFirmatario() {
	return this.dtFinValCertifFirmatario;
    }

    public void setDtFinValCertifFirmatario(Date dtFinValCertifFirmatario) {
	this.dtFinValCertifFirmatario = dtFinValCertifFirmatario;
    }

    public Date getDtIniValCertifFirmatario() {
	return this.dtIniValCertifFirmatario;
    }

    public void setDtIniValCertifFirmatario(Date dtIniValCertifFirmatario) {
	this.dtIniValCertifFirmatario = dtIniValCertifFirmatario;
    }

    public BigDecimal getNiSerialCertifFirmatario() {
	return this.niSerialCertifFirmatario;
    }

    public void setNiSerialCertifFirmatario(BigDecimal niSerialCertifFirmatario) {
	this.niSerialCertifFirmatario = niSerialCertifFirmatario;
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

}
