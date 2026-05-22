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
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroMarcaComp")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroMarcaComp implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idMarca;
    // private String tikaMime;

    // private long idMarcaComp;
    private String dsAlgoMarca;
    private String dsMarcaBase64;
    private String dsMsgEsitoContrConforme;
    private String dsMsgEsitoVerifMarca;
    private Date dtScadMarca;
    private BigDecimal pgBusta;
    private BigDecimal pgMarca;
    private String tiEsitoContrConforme;
    private String tiEsitoVerifMarca;
    private String tiFormatoMarca;
    private String tiMarcaTemp;
    private Date tmMarcaTemp;

    @XmlElementWrapper(name = "aroContrMarcaComps")
    @XmlElement(name = "aroContrMarcaComp")
    private List<CryptoAroContrMarcaComp> aroContrMarcaComps;
    private List<CryptoAroFirmaComp> aroFirmaComps;
    // private AroBustaCrittog aroBustaCrittog;
    // private AroCompDoc aroCompDoc;
    private CryptoFirCertifCa firCertifCa;

    public CryptoAroMarcaComp() {
	// empty
    }

    public String getIdMarca() {
	return idMarca;
    }

    public void setIdMarca(String idMarca) {
	this.idMarca = idMarca;
    }

    // public String getTikaMime() {
    // return tikaMime;
    // }
    //
    // public void setTikaMime(String tikaMime) {
    // this.tikaMime = tikaMime;
    // }
    // public long getIdMarcaComp() {
    // return this.idMarcaComp;
    // }
    //
    // public void setIdMarcaComp(long idMarcaComp) {
    // this.idMarcaComp = idMarcaComp;
    // }
    public String getDsAlgoMarca() {
	return this.dsAlgoMarca;
    }

    public void setDsAlgoMarca(String dsAlgoMarca) {
	this.dsAlgoMarca = dsAlgoMarca;
    }

    public String getDsMarcaBase64() {
	return this.dsMarcaBase64;
    }

    public void setDsMarcaBase64(String dsMarcaBase64) {
	this.dsMarcaBase64 = dsMarcaBase64;
    }

    public String getDsMsgEsitoContrConforme() {
	return this.dsMsgEsitoContrConforme;
    }

    public void setDsMsgEsitoContrConforme(String dsMsgEsitoContrConforme) {
	this.dsMsgEsitoContrConforme = dsMsgEsitoContrConforme;
    }

    public String getDsMsgEsitoVerifMarca() {
	return this.dsMsgEsitoVerifMarca;
    }

    public void setDsMsgEsitoVerifMarca(String dsMsgEsitoVerifMarca) {
	this.dsMsgEsitoVerifMarca = dsMsgEsitoVerifMarca;
    }

    public Date getDtScadMarca() {
	return this.dtScadMarca;
    }

    public void setDtScadMarca(Date dtScadMarca) {
	this.dtScadMarca = dtScadMarca;
    }

    public BigDecimal getPgBusta() {
	return this.pgBusta;
    }

    public void setPgBusta(BigDecimal pgBusta) {
	this.pgBusta = pgBusta;
    }

    public BigDecimal getPgMarca() {
	return this.pgMarca;
    }

    public void setPgMarca(BigDecimal pgMarca) {
	this.pgMarca = pgMarca;
    }

    public String getTiEsitoContrConforme() {
	return this.tiEsitoContrConforme;
    }

    public void setTiEsitoContrConforme(String tiEsitoContrConforme) {
	this.tiEsitoContrConforme = tiEsitoContrConforme;
    }

    public String getTiEsitoVerifMarca() {
	return this.tiEsitoVerifMarca;
    }

    public void setTiEsitoVerifMarca(String tiEsitoVerifMarca) {
	this.tiEsitoVerifMarca = tiEsitoVerifMarca;
    }

    public String getTiFormatoMarca() {
	return this.tiFormatoMarca;
    }

    public void setTiFormatoMarca(String tiFormatoMarca) {
	this.tiFormatoMarca = tiFormatoMarca;
    }

    public String getTiMarcaTemp() {
	return this.tiMarcaTemp;
    }

    public void setTiMarcaTemp(String tiMarcaTemp) {
	this.tiMarcaTemp = tiMarcaTemp;
    }

    public Date getTmMarcaTemp() {
	return this.tmMarcaTemp;
    }

    public void setTmMarcaTemp(Date tmMarcaTemp) {
	this.tmMarcaTemp = tmMarcaTemp;
    }

    public List<CryptoAroContrMarcaComp> getAroContrMarcaComps() {
	return this.aroContrMarcaComps;
    }

    public void setAroContrMarcaComps(List<CryptoAroContrMarcaComp> aroContrMarcaComps) {
	this.aroContrMarcaComps = aroContrMarcaComps;
    }

    public List<CryptoAroFirmaComp> getAroFirmaComps() {
	return this.aroFirmaComps;
    }

    public void setAroFirmaComps(List<CryptoAroFirmaComp> aroFirmaComps) {
	this.aroFirmaComps = aroFirmaComps;
    }

    // public AroBustaCrittog getAroBustaCrittog() {
    // return this.aroBustaCrittog;
    // }
    //
    // public void setAroBustaCrittog(AroBustaCrittog aroBustaCrittog) {
    // this.aroBustaCrittog = aroBustaCrittog;
    // }
    // public AroCompDoc getAroCompDoc() {
    // return this.aroCompDoc;
    // }
    //
    // public void setAroCompDoc(AroCompDoc aroCompDoc) {
    // this.aroCompDoc = aroCompDoc;
    // }
    public CryptoFirCertifCa getFirCertifCa() {
	return this.firCertifCa;
    }

    public void setFirCertifCa(CryptoFirCertifCa firCertifCa) {
	this.firCertifCa = firCertifCa;
    }

}
