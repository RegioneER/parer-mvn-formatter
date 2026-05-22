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

// import it.eng.parer.entity.AroControfirmaFirma;
// import it.eng.parer.entity.AroVerifFirmaDtVer;
// import it.eng.parer.entity.VolAppartFirmaVolume;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroFirmaComp")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroFirmaComp implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idFirma;
    // private long idFirmaComp;
    // private String tikaMime;

    private String cdFirmatario;
    private String dlDnFirmatario;
    private String dsAlgoFirma;
    private String dsFirmaBase64;
    private String dsMsgEsitoContrConforme;
    private String dsMsgEsitoVerifFirma;
    private Date dtFirma;
    // private BigDecimal idStrut;
    private String nmCognomeFirmatario;
    private String nmFirmatario;
    private BigDecimal pgBusta;
    private BigDecimal pgFirma;
    private String tiEsitoContrConforme;
    private String tiEsitoVerifFirma;
    private String tiFirma;
    private String tiFormatoFirma;
    private String tiRifTempUsato;
    private Date tmRifTempUsato;

    @XmlElementWrapper(name = "aroControFirmaFiglios")
    @XmlElement(name = "aroControFirmaFiglio")
    private List<CryptoAroControfirmaFirma> aroControfirmaFirmaFiglios;
    // private List<CryptoAroControfirmaFirma> aroControfirmaFirmaPadres;

    @XmlElementWrapper(name = "aroContrFirmaComps")
    @XmlElement(name = "aroContrFirmaComp")
    private List<CryptoAroContrFirmaComp> aroContrFirmaComps;
    // private AroBustaCrittog aroBustaCrittog;
    // private AroCompDoc aroCompDoc;
    private CryptoAroMarcaComp aroMarcaComp;
    private CryptoFirCertifFirmatario firCertifFirmatario;
    // private List<VolAppartFirmaVolume> volAppartFirmaVolumes;
    // private List<AroVerifFirmaDtVer> aroVerifFirmaDtVers;

    // public String getTikaMime() {
    // return tikaMime;
    // }
    //
    // public void setTikaMime(String tikaMime) {
    // this.tikaMime = tikaMime;
    // }
    public CryptoAroFirmaComp() {
	// empty
    }

    public String getIdFirma() {
	return idFirma;
    }

    public void setIdFirma(String idFirma) {
	this.idFirma = idFirma;
    }

    // public long getIdFirmaComp() {
    // return this.idFirmaComp;
    // }
    //
    // public void setIdFirmaComp(long idFirmaComp) {
    // this.idFirmaComp = idFirmaComp;
    // }
    public String getCdFirmatario() {
	return this.cdFirmatario;
    }

    public void setCdFirmatario(String cdFirmatario) {
	this.cdFirmatario = cdFirmatario;
    }

    public String getDlDnFirmatario() {
	return this.dlDnFirmatario;
    }

    public void setDlDnFirmatario(String dlDnFirmatario) {
	this.dlDnFirmatario = dlDnFirmatario;
    }

    public String getDsAlgoFirma() {
	return this.dsAlgoFirma;
    }

    public void setDsAlgoFirma(String dsAlgoFirma) {
	this.dsAlgoFirma = dsAlgoFirma;
    }

    public String getDsFirmaBase64() {
	return this.dsFirmaBase64;
    }

    public void setDsFirmaBase64(String dsFirmaBase64) {
	this.dsFirmaBase64 = dsFirmaBase64;
    }

    public String getDsMsgEsitoContrConforme() {
	return this.dsMsgEsitoContrConforme;
    }

    public void setDsMsgEsitoContrConforme(String dsMsgEsitoContrConforme) {
	this.dsMsgEsitoContrConforme = dsMsgEsitoContrConforme;
    }

    public String getDsMsgEsitoVerifFirma() {
	return this.dsMsgEsitoVerifFirma;
    }

    public void setDsMsgEsitoVerifFirma(String dsMsgEsitoVerifFirma) {
	this.dsMsgEsitoVerifFirma = dsMsgEsitoVerifFirma;
    }

    public Date getDtFirma() {
	return this.dtFirma;
    }

    public void setDtFirma(Date dtFirma) {
	this.dtFirma = dtFirma;
    }

    // public BigDecimal getIdStrut() {
    // return this.idStrut;
    // }
    //
    // public void setIdStrut(BigDecimal idStrut) {
    // this.idStrut = idStrut;
    // }
    public String getNmCognomeFirmatario() {
	return this.nmCognomeFirmatario;
    }

    public void setNmCognomeFirmatario(String nmCognomeFirmatario) {
	this.nmCognomeFirmatario = nmCognomeFirmatario;
    }

    public String getNmFirmatario() {
	return this.nmFirmatario;
    }

    public void setNmFirmatario(String nmFirmatario) {
	this.nmFirmatario = nmFirmatario;
    }

    public BigDecimal getPgBusta() {
	return this.pgBusta;
    }

    public void setPgBusta(BigDecimal pgBusta) {
	this.pgBusta = pgBusta;
    }

    public BigDecimal getPgFirma() {
	return this.pgFirma;
    }

    public void setPgFirma(BigDecimal pgFirma) {
	this.pgFirma = pgFirma;
    }

    public String getTiEsitoContrConforme() {
	return this.tiEsitoContrConforme;
    }

    public void setTiEsitoContrConforme(String tiEsitoContrConforme) {
	this.tiEsitoContrConforme = tiEsitoContrConforme;
    }

    public String getTiEsitoVerifFirma() {
	return this.tiEsitoVerifFirma;
    }

    public void setTiEsitoVerifFirma(String tiEsitoVerifFirma) {
	this.tiEsitoVerifFirma = tiEsitoVerifFirma;
    }

    public String getTiFirma() {
	return this.tiFirma;
    }

    public void setTiFirma(String tiFirma) {
	this.tiFirma = tiFirma;
    }

    public String getTiFormatoFirma() {
	return this.tiFormatoFirma;
    }

    public void setTiFormatoFirma(String tiFormatoFirma) {
	this.tiFormatoFirma = tiFormatoFirma;
    }

    public String getTiRifTempUsato() {
	return this.tiRifTempUsato;
    }

    public void setTiRifTempUsato(String tiRifTempUsato) {
	this.tiRifTempUsato = tiRifTempUsato;
    }

    public Date getTmRifTempUsato() {
	return this.tmRifTempUsato;
    }

    public void setTmRifTempUsato(Date tmRifTempUsato) {
	this.tmRifTempUsato = tmRifTempUsato;
    }

    public List<CryptoAroControfirmaFirma> getAroControfirmaFirmaFiglios() {
	return this.aroControfirmaFirmaFiglios;
    }

    public void setAroControfirmaFirmaFiglios(
	    List<CryptoAroControfirmaFirma> aroControfirmaFirmaFiglios) {
	this.aroControfirmaFirmaFiglios = aroControfirmaFirmaFiglios;
    }

    // public List<CryptoAroControfirmaFirma> getAroControfirmaFirmaPadres() {
    // return this.aroControfirmaFirmaPadres;
    // }
    //
    // public void setAroControfirmaFirmaPadres(List<CryptoAroControfirmaFirma>
    // aroControfirmaFirmaPadres) {
    // this.aroControfirmaFirmaPadres = aroControfirmaFirmaPadres;
    // }
    public List<CryptoAroContrFirmaComp> getAroContrFirmaComps() {
	return this.aroContrFirmaComps;
    }

    public void setAroContrFirmaComps(List<CryptoAroContrFirmaComp> aroContrFirmaComps) {
	this.aroContrFirmaComps = aroContrFirmaComps;
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
    public CryptoAroMarcaComp getAroMarcaComp() {
	return this.aroMarcaComp;
    }

    public void setAroMarcaComp(CryptoAroMarcaComp aroMarcaComp) {
	this.aroMarcaComp = aroMarcaComp;
    }

    public CryptoFirCertifFirmatario getFirCertifFirmatario() {
	return this.firCertifFirmatario;
    }

    public void setFirCertifFirmatario(CryptoFirCertifFirmatario firCertifFirmatario) {
	this.firCertifFirmatario = firCertifFirmatario;
    }

    // public List<VolAppartFirmaVolume> getVolAppartFirmaVolumes() {
    // return this.volAppartFirmaVolumes;
    // }
    //
    // public void setVolAppartFirmaVolumes(List<VolAppartFirmaVolume> volAppartFirmaVolumes) {
    // this.volAppartFirmaVolumes = volAppartFirmaVolumes;
    // }
    //
    // public List<AroVerifFirmaDtVer> getAroVerifFirmaDtVers() {
    // return this.aroVerifFirmaDtVers;
    // }
    //
    // public void setAroVerifFirmaDtVers(List<AroVerifFirmaDtVer> aroVerifFirmaDtVers) {
    // this.aroVerifFirmaDtVers = aroVerifFirmaDtVers;
    // }
}
