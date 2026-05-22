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

// import it.eng.parer.entity.AroUsoCertifCaContrMarca;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroContrMarcaComp")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroContrMarcaComp implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idContrMarcaComp;
    private String tiContr;
    private String dsMsgEsitoContrMarca;
    private String tiEsitoContrMarca;
    // private AroMarcaComp aroMarcaComp;
    private CryptoFirCrl firCrl;

    @XmlElementWrapper(name = "aroUsoCertifCaContrMarcas")
    @XmlElement(name = "aroUsoCertifCaContrMarca")
    private List<CryptoAroUsoCertifCaContrMarca> aroUsoCertifCaContrMarcas;

    public CryptoAroContrMarcaComp() {
	// empty
    }

    // public long getIdContrMarcaComp() {
    // return this.idContrMarcaComp;
    // }
    //
    // public void setIdContrMarcaComp(long idContrMarcaComp) {
    // this.idContrMarcaComp = idContrMarcaComp;
    // }
    public String getDsMsgEsitoContrMarca() {
	return this.dsMsgEsitoContrMarca;
    }

    public void setDsMsgEsitoContrMarca(String dsMsgEsitoContrMarca) {
	this.dsMsgEsitoContrMarca = dsMsgEsitoContrMarca;
    }

    public String getTiContr() {
	return this.tiContr;
    }

    public void setTiContr(String tiContr) {
	this.tiContr = tiContr;
    }

    public String getTiEsitoContrMarca() {
	return this.tiEsitoContrMarca;
    }

    public void setTiEsitoContrMarca(String tiEsitoContrMarca) {
	this.tiEsitoContrMarca = tiEsitoContrMarca;
    }

    // public AroMarcaComp getAroMarcaComp() {
    // return this.aroMarcaComp;
    // }
    //
    // public void setAroMarcaComp(AroMarcaComp aroMarcaComp) {
    // this.aroMarcaComp = aroMarcaComp;
    // }
    //
    public CryptoFirCrl getFirCrl() {
	return this.firCrl;
    }

    public void setFirCrl(CryptoFirCrl firCrl) {
	this.firCrl = firCrl;
    }

    public List<CryptoAroUsoCertifCaContrMarca> getAroUsoCertifCaContrMarcas() {
	return this.aroUsoCertifCaContrMarcas;
    }

    public void setAroUsoCertifCaContrMarcas(
	    List<CryptoAroUsoCertifCaContrMarca> aroUsoCertifCaContrMarcas) {
	this.aroUsoCertifCaContrMarcas = aroUsoCertifCaContrMarcas;
    }

}
