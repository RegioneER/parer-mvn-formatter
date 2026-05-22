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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroUsoCertifCaContrComp")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroUsoCertifCaContrComp implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idUsoCertifCaContrComp;
    private BigDecimal pgCertifCa;
    // private AroContrFirmaComp aroContrFirmaComp;
    private CryptoFirCertifCa firCertifCa;
    private CryptoFirCrl firCrl;

    public CryptoAroUsoCertifCaContrComp() {
	// empty
    }

    // public long getIdUsoCertifCaContrComp() {
    // return this.idUsoCertifCaContrComp;
    // }
    //
    // public void setIdUsoCertifCaContrComp(long idUsoCertifCaContrComp) {
    // this.idUsoCertifCaContrComp = idUsoCertifCaContrComp;
    // }

    public BigDecimal getPgCertifCa() {
	return this.pgCertifCa;
    }

    public void setPgCertifCa(BigDecimal pgCertifCa) {
	this.pgCertifCa = pgCertifCa;
    }

    // public AroContrFirmaComp getAroContrFirmaComp() {
    // return this.aroContrFirmaComp;
    // }
    //
    // public void setAroContrFirmaComp(AroContrFirmaComp aroContrFirmaComp) {
    // this.aroContrFirmaComp = aroContrFirmaComp;
    // }

    public CryptoFirCertifCa getFirCertifCa() {
	return this.firCertifCa;
    }

    public void setFirCertifCa(CryptoFirCertifCa firCertifCa) {
	this.firCertifCa = firCertifCa;
    }

    public CryptoFirCrl getFirCrl() {
	return this.firCrl;
    }

    public void setFirCrl(CryptoFirCrl firCrl) {
	this.firCrl = firCrl;
    }

}
