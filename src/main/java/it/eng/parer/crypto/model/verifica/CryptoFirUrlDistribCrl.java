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

@XmlRootElement(name = "firUrlDistribCrl")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoFirUrlDistribCrl implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idUrlDistribCrl;
    private String dlUrlDistribCrl;
    private BigDecimal niOrdUrlDistribCrl;
    // private FirCertifCa firCertifCa;

    public CryptoFirUrlDistribCrl() {
	// empty
    }

    // public long getIdUrlDistribCrl() {
    // return this.idUrlDistribCrl;
    // }
    //
    // public void setIdUrlDistribCrl(long idUrlDistribCrl) {
    // this.idUrlDistribCrl = idUrlDistribCrl;
    // }
    public String getDlUrlDistribCrl() {
	return this.dlUrlDistribCrl;
    }

    public void setDlUrlDistribCrl(String dlUrlDistribCrl) {
	this.dlUrlDistribCrl = dlUrlDistribCrl;
    }

    public BigDecimal getNiOrdUrlDistribCrl() {
	return this.niOrdUrlDistribCrl;
    }

    public void setNiOrdUrlDistribCrl(BigDecimal niOrdUrlDistribCrl) {
	this.niOrdUrlDistribCrl = niOrdUrlDistribCrl;
    }

    // public FirCertifCa getFirCertifCa() {
    // return this.firCertifCa;
    // }
    //
    // public void setFirCertifCa(FirCertifCa firCertifCa) {
    // this.firCertifCa = firCertifCa;
    // }
}
