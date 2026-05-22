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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "firFilePerFirma")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoFirFilePerFirma implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idFilePerFirma;
    private byte[] blFilePerFirma;
    private String nmFileDownload;
    private String tiFilePerFirma;
    // private FirCertifCa firCertifCa;
    // private FirCertifFirmatario firCertifFirmatario;
    // private FirCrl firCrl;

    public CryptoFirFilePerFirma() {
	// empty
    }

    // public long getIdFilePerFirma() {
    // return this.idFilePerFirma;
    // }
    //
    // public void setIdFilePerFirma(long idFilePerFirma) {
    // this.idFilePerFirma = idFilePerFirma;
    // }
    public byte[] getBlFilePerFirma() {
	return this.blFilePerFirma;
    }

    public void setBlFilePerFirma(byte[] blFilePerFirma) {
	this.blFilePerFirma = blFilePerFirma;
    }

    public String getNmFileDownload() {
	return this.nmFileDownload;
    }

    public void setNmFileDownload(String nmFileDownload) {
	this.nmFileDownload = nmFileDownload;
    }

    public String getTiFilePerFirma() {
	return this.tiFilePerFirma;
    }

    public void setTiFilePerFirma(String tiFilePerFirma) {
	this.tiFilePerFirma = tiFilePerFirma;
    }

    // public FirCertifCa getFirCertifCa() {
    // return this.firCertifCa;
    // }
    //
    // public void setFirCertifCa(FirCertifCa firCertifCa) {
    // this.firCertifCa = firCertifCa;
    // }
    // public FirCertifFirmatario getFirCertifFirmatario() {
    // return this.firCertifFirmatario;
    // }
    //
    // public void setFirCertifFirmatario(FirCertifFirmatario firCertifFirmatario) {
    // this.firCertifFirmatario = firCertifFirmatario;
    // }
    // public FirCrl getFirCrl() {
    // return this.firCrl;
    // }
    //
    // public void setFirCrl(FirCrl firCrl) {
    // this.firCrl = firCrl;
    // }
}
