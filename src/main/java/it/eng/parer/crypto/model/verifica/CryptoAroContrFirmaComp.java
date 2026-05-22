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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroContrFirmaComp")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroContrFirmaComp implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idContrFirmaComp;
    private String tiContr;
    private String dsMsgEsitoContrFirma;
    private String tiEsitoContrFirma;
    private String mimeType;
    // private AroFirmaComp aroFirmaComp;
    private CryptoFirCrl firCrl;

    @XmlElementWrapper(name = "aroUsoCertifCaContrComps")
    @XmlElement(name = "aroUsoCertifCaContrComp")
    private List<CryptoAroUsoCertifCaContrComp> aroUsoCertifCaContrComps;

    public CryptoAroContrFirmaComp() {
	// empty
    }

    // public long getIdContrFirmaComp() {
    // return this.idContrFirmaComp;
    // }
    //
    // public void setIdContrFirmaComp(long idContrFirmaComp) {
    // this.idContrFirmaComp = idContrFirmaComp;
    // }
    public String getDsMsgEsitoContrFirma() {
	return this.dsMsgEsitoContrFirma;
    }

    public void setDsMsgEsitoContrFirma(String dsMsgEsitoContrFirma) {
	this.dsMsgEsitoContrFirma = dsMsgEsitoContrFirma;
    }

    public String getTiContr() {
	return this.tiContr;
    }

    public void setTiContr(String tiContr) {
	this.tiContr = tiContr;
    }

    public String getTiEsitoContrFirma() {
	return this.tiEsitoContrFirma;
    }

    public void setTiEsitoContrFirma(String tiEsitoContrFirma) {
	this.tiEsitoContrFirma = tiEsitoContrFirma;
    }

    // public AroFirmaComp getAroFirmaComp() {
    // return this.aroFirmaComp;
    // }
    //
    // public void setAroFirmaComp(AroFirmaComp aroFirmaComp) {
    // this.aroFirmaComp = aroFirmaComp;
    // }
    public String getMimeType() {
	return mimeType;
    }

    public void setMimeType(String mimeType) {
	this.mimeType = mimeType;
    }

    public CryptoFirCrl getFirCrl() {
	return this.firCrl;
    }

    public void setFirCrl(CryptoFirCrl firCrl) {
	this.firCrl = firCrl;
    }

    public List<CryptoAroUsoCertifCaContrComp> getAroUsoCertifCaContrComps() {
	return this.aroUsoCertifCaContrComps;
    }

    public void setAroUsoCertifCaContrComps(
	    List<CryptoAroUsoCertifCaContrComp> aroUsoCertifCaContrComps) {
	this.aroUsoCertifCaContrComps = aroUsoCertifCaContrComps;
    }

}
