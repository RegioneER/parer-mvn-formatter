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

import it.eng.parer.crypto.model.verifica.input.CryptoProfiloVerifica;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the ARO_COMP_DOC database table.
 *
 */
@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroCompDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    private String idComponente;

    // private long idCompDoc;
    private String cdEncodingHashFileCalc;
    private String cdEncodingHashFileVers;
    private String dlUrnCompVers;
    private String dsAlgoHashFileCalc;
    private String dsAlgoHashFileVers;
    private String dsEsitoVerifFirmeDtVers;
    private String dsFormatoRapprCalc;
    private String dsFormatoRapprEstesoCalc;
    private String dsHashFileCalc;
    private String dsHashFileContr;
    private String dsHashFileVers;
    private String dsIdCompVers;
    private String dsMsgEsitoContrFormato;
    private String dsMsgEsitoVerifFirme;
    private String dsNomeCompVers;
    private String dsNomeFileArk;
    private String dsRifTempVers;
    private String dsUrnCompCalc;
    private String flCompFirmato;
    private String flNoCalcFmtVerifFirme;
    private String flNoCalcHashFile;
    private String flRifTempDataFirmaVers;
    // private BigDecimal idStrut;
    private BigDecimal niOrdCompDoc;
    private BigDecimal niSizeFileCalc;
    private String tiEsitoContrFormatoFile;
    private String tiEsitoContrHashVers;
    private String tiEsitoVerifFirme;
    private String tiEsitoVerifFirmeDtVers;
    private String tiSupportoComp;
    private Date tmRifTempVers;
    // private List<CryptoAroBustaCrittog> aroBustaCrittogs;
    // private AroCompDoc aroCompDoc;
    // private List<AroCompDoc> aroCompDocs;
    // private AroStrutDoc aroStrutDoc;
    // private AroUnitaDoc aroUnitaDoc;
    // private DecFormatoFileDoc decFormatoFileDoc;
    // private DecFormatoFileStandard decFormatoFileStandard;
    // private DecTipoCompDoc decTipoCompDoc;
    // private DecTipoRapprComp decTipoRapprComp;
    // private List<AroFileComp> aroFileComps;
    @XmlElementWrapper(name = "aroFirmaComps")
    @XmlElement(name = "aroFirmaComp")
    private List<CryptoAroFirmaComp> aroFirmaComps;
    @XmlElementWrapper(name = "aroMarcaComps")
    @XmlElement(name = "aroMarcaComp")
    private List<CryptoAroMarcaComp> aroMarcaComps;
    // private List<AroUsoXsdDatiSpec> aroUsoXsdDatiSpecs;
    // private List<VolAppartCompVolume> volAppartCompVolumes;
    // private List<RecSessioneRecup> recSessioneRecups;
    // private List<AroCompIndiceAipDaElab> aroCompIndiceAipDaElabs;
    // private List<AroCompVerIndiceAipUd> aroCompVerIndiceAipUds;
    // private List<FirReportEida> firReportEidas;
    // private List<AroVersIniComp> aroVersIniComps;
    // private List<AroUpdCompUnitaDoc> aroUpdCompUnitaDocs;
    // private List<AroCompUrnCalc> aroAroCompUrnCalcs;

    // private Map<String, String> mimeComponenti = new HashMap<>();
    // private String tikaMime;
    private String validatorVersion;
    private String libraryVersion;

    private String link;

    private Date inizioValidazione;
    private Date fineValidazione;

    private String tikaMimeComponentePrincipale;

    private CryptoProfiloVerifica profiloValidazione;

    public CryptoAroCompDoc() {
	// empty
    }

    public String getIdComponente() {
	return idComponente;
    }

    public void setIdComponente(String idComponente) {
	this.idComponente = idComponente;
    }

    // public long getIdCompDoc() {
    // return this.idCompDoc;
    // }
    //
    // public void setIdCompDoc(long idCompDoc) {
    // this.idCompDoc = idCompDoc;
    // }
    public String getCdEncodingHashFileCalc() {
	return this.cdEncodingHashFileCalc;
    }

    public void setCdEncodingHashFileCalc(String cdEncodingHashFileCalc) {
	this.cdEncodingHashFileCalc = cdEncodingHashFileCalc;
    }

    public String getCdEncodingHashFileVers() {
	return this.cdEncodingHashFileVers;
    }

    public void setCdEncodingHashFileVers(String cdEncodingHashFileVers) {
	this.cdEncodingHashFileVers = cdEncodingHashFileVers;
    }

    public String getDlUrnCompVers() {
	return this.dlUrnCompVers;
    }

    public void setDlUrnCompVers(String dlUrnCompVers) {
	this.dlUrnCompVers = dlUrnCompVers;
    }

    public String getDsAlgoHashFileCalc() {
	return this.dsAlgoHashFileCalc;
    }

    public void setDsAlgoHashFileCalc(String dsAlgoHashFileCalc) {
	this.dsAlgoHashFileCalc = dsAlgoHashFileCalc;
    }

    public String getDsAlgoHashFileVers() {
	return this.dsAlgoHashFileVers;
    }

    public void setDsAlgoHashFileVers(String dsAlgoHashFileVers) {
	this.dsAlgoHashFileVers = dsAlgoHashFileVers;
    }

    public String getDsEsitoVerifFirmeDtVers() {
	return this.dsEsitoVerifFirmeDtVers;
    }

    public void setDsEsitoVerifFirmeDtVers(String dsEsitoVerifFirmeDtVers) {
	this.dsEsitoVerifFirmeDtVers = dsEsitoVerifFirmeDtVers;
    }

    public String getDsFormatoRapprCalc() {
	return this.dsFormatoRapprCalc;
    }

    public void setDsFormatoRapprCalc(String dsFormatoRapprCalc) {
	this.dsFormatoRapprCalc = dsFormatoRapprCalc;
    }

    public String getDsFormatoRapprEstesoCalc() {
	return this.dsFormatoRapprEstesoCalc;
    }

    public void setDsFormatoRapprEstesoCalc(String dsFormatoRapprEstesoCalc) {
	this.dsFormatoRapprEstesoCalc = dsFormatoRapprEstesoCalc;
    }

    public String getDsHashFileCalc() {
	return this.dsHashFileCalc;
    }

    public void setDsHashFileCalc(String dsHashFileCalc) {
	this.dsHashFileCalc = dsHashFileCalc;
    }

    public String getDsHashFileContr() {
	return this.dsHashFileContr;
    }

    public void setDsHashFileContr(String dsHashFileContr) {
	this.dsHashFileContr = dsHashFileContr;
    }

    public String getDsHashFileVers() {
	return this.dsHashFileVers;
    }

    public void setDsHashFileVers(String dsHashFileVers) {
	this.dsHashFileVers = dsHashFileVers;
    }

    public String getDsIdCompVers() {
	return this.dsIdCompVers;
    }

    public void setDsIdCompVers(String dsIdCompVers) {
	this.dsIdCompVers = dsIdCompVers;
    }

    public String getDsMsgEsitoContrFormato() {
	return this.dsMsgEsitoContrFormato;
    }

    public void setDsMsgEsitoContrFormato(String dsMsgEsitoContrFormato) {
	this.dsMsgEsitoContrFormato = dsMsgEsitoContrFormato;
    }

    public String getDsMsgEsitoVerifFirme() {
	return this.dsMsgEsitoVerifFirme;
    }

    public void setDsMsgEsitoVerifFirme(String dsMsgEsitoVerifFirme) {
	this.dsMsgEsitoVerifFirme = dsMsgEsitoVerifFirme;
    }

    public String getDsNomeCompVers() {
	return this.dsNomeCompVers;
    }

    public void setDsNomeCompVers(String dsNomeCompVers) {
	this.dsNomeCompVers = dsNomeCompVers;
    }

    public String getDsNomeFileArk() {
	return dsNomeFileArk;
    }

    public void setDsNomeFileArk(String dsNomeFileArk) {
	this.dsNomeFileArk = dsNomeFileArk;
    }

    public String getDsRifTempVers() {
	return this.dsRifTempVers;
    }

    public void setDsRifTempVers(String dsRifTempVers) {
	this.dsRifTempVers = dsRifTempVers;
    }

    public String getDsUrnCompCalc() {
	return this.dsUrnCompCalc;
    }

    public void setDsUrnCompCalc(String dsUrnCompCalc) {
	this.dsUrnCompCalc = dsUrnCompCalc;
    }

    public String getFlCompFirmato() {
	return this.flCompFirmato;
    }

    public void setFlCompFirmato(String flCompFirmato) {
	this.flCompFirmato = flCompFirmato;
    }

    public String getFlNoCalcFmtVerifFirme() {
	return this.flNoCalcFmtVerifFirme;
    }

    public void setFlNoCalcFmtVerifFirme(String flNoCalcFmtVerifFirme) {
	this.flNoCalcFmtVerifFirme = flNoCalcFmtVerifFirme;
    }

    public String getFlNoCalcHashFile() {
	return this.flNoCalcHashFile;
    }

    public void setFlNoCalcHashFile(String flNoCalcHashFile) {
	this.flNoCalcHashFile = flNoCalcHashFile;
    }

    public String getFlRifTempDataFirmaVers() {
	return this.flRifTempDataFirmaVers;
    }

    public void setFlRifTempDataFirmaVers(String flRifTempDataFirmaVers) {
	this.flRifTempDataFirmaVers = flRifTempDataFirmaVers;
    }

    // public BigDecimal getIdStrut() {
    // return this.idStrut;
    // }
    //
    // public void setIdStrut(BigDecimal idStrut) {
    // this.idStrut = idStrut;
    // }
    public BigDecimal getNiOrdCompDoc() {
	return this.niOrdCompDoc;
    }

    public void setNiOrdCompDoc(BigDecimal niOrdCompDoc) {
	this.niOrdCompDoc = niOrdCompDoc;
    }

    public BigDecimal getNiSizeFileCalc() {
	return this.niSizeFileCalc;
    }

    public void setNiSizeFileCalc(BigDecimal niSizeFileCalc) {
	this.niSizeFileCalc = niSizeFileCalc;
    }

    public String getTiEsitoContrFormatoFile() {
	return this.tiEsitoContrFormatoFile;
    }

    public void setTiEsitoContrFormatoFile(String tiEsitoContrFormatoFile) {
	this.tiEsitoContrFormatoFile = tiEsitoContrFormatoFile;
    }

    public String getTiEsitoContrHashVers() {
	return this.tiEsitoContrHashVers;
    }

    public void setTiEsitoContrHashVers(String tiEsitoContrHashVers) {
	this.tiEsitoContrHashVers = tiEsitoContrHashVers;
    }

    public String getTiEsitoVerifFirme() {
	return this.tiEsitoVerifFirme;
    }

    public void setTiEsitoVerifFirme(String tiEsitoVerifFirme) {
	this.tiEsitoVerifFirme = tiEsitoVerifFirme;
    }

    public String getTiEsitoVerifFirmeDtVers() {
	return this.tiEsitoVerifFirmeDtVers;
    }

    public void setTiEsitoVerifFirmeDtVers(String tiEsitoVerifFirmeDtVers) {
	this.tiEsitoVerifFirmeDtVers = tiEsitoVerifFirmeDtVers;
    }

    public String getTiSupportoComp() {
	return this.tiSupportoComp;
    }

    public void setTiSupportoComp(String tiSupportoComp) {
	this.tiSupportoComp = tiSupportoComp;
    }

    public Date getTmRifTempVers() {
	return this.tmRifTempVers;
    }

    public void setTmRifTempVers(Date tmRifTempVers) {
	this.tmRifTempVers = tmRifTempVers;
    }

    // bi-directional many-to-one association to AroBustaCrittog
    // public List<CryptoAroBustaCrittog> getAroBustaCrittogs() {
    // return this.aroBustaCrittogs;
    // }
    //
    // public void setAroBustaCrittogs(List<CryptoAroBustaCrittog> aroBustaCrittogs) {
    // this.aroBustaCrittogs = aroBustaCrittogs;
    // }
    // bi-directional many-to-one association to AroCompDoc
    // public AroCompDoc getAroCompDoc() {
    // return this.aroCompDoc;
    // }
    //
    // public void setAroCompDoc(AroCompDoc aroCompDoc) {
    // this.aroCompDoc = aroCompDoc;
    // }
    // public List<AroCompDoc> getAroCompDocs() {
    // return this.aroCompDocs;
    // }
    //
    // public void setAroCompDocs(List<AroCompDoc> aroCompDocs) {
    // this.aroCompDocs = aroCompDocs;
    // }
    // public AroStrutDoc getAroStrutDoc() {
    // return this.aroStrutDoc;
    // }
    //
    // public void setAroStrutDoc(AroStrutDoc aroStrutDoc) {
    // this.aroStrutDoc = aroStrutDoc;
    // }
    //
    // public AroUnitaDoc getAroUnitaDoc() {
    // return this.aroUnitaDoc;
    // }
    //
    // public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
    // this.aroUnitaDoc = aroUnitaDoc;
    // }
    //
    // public DecFormatoFileDoc getDecFormatoFileDoc() {
    // return this.decFormatoFileDoc;
    // }
    //
    // public void setDecFormatoFileDoc(DecFormatoFileDoc decFormatoFileDoc) {
    // this.decFormatoFileDoc = decFormatoFileDoc;
    // }
    //
    // public DecFormatoFileStandard getDecFormatoFileStandard() {
    // return this.decFormatoFileStandard;
    // }
    //
    // public void setDecFormatoFileStandard(DecFormatoFileStandard decFormatoFileStandard) {
    // this.decFormatoFileStandard = decFormatoFileStandard;
    // }
    //
    // public DecTipoCompDoc getDecTipoCompDoc() {
    // return this.decTipoCompDoc;
    // }
    //
    // public void setDecTipoCompDoc(DecTipoCompDoc decTipoCompDoc) {
    // this.decTipoCompDoc = decTipoCompDoc;
    // }
    //
    // public DecTipoRapprComp getDecTipoRapprComp() {
    // return this.decTipoRapprComp;
    // }
    //
    // public void setDecTipoRapprComp(DecTipoRapprComp decTipoRapprComp) {
    // this.decTipoRapprComp = decTipoRapprComp;
    // }
    // bi-directional many-to-one association to AroContenutoComp
    // public List<CryptoAroContenutoComp> getAroContenutoComps() {
    // return this.aroContenutoComps;
    // }
    //
    // public void setAroContenutoComps(List<CryptoAroContenutoComp> aroContenutoComps) {
    // this.aroContenutoComps = aroContenutoComps;
    // }

    // bi-directional many-to-one association to AroFileComp
    // public List<AroFileComp> getAroFileComps() {
    // return this.aroFileComps;
    // }
    //
    // public void setAroFileComps(List<AroFileComp> aroFileComps) {
    // this.aroFileComps = aroFileComps;
    // }
    // bi-directional many-to-one association to AroFirmaComp
    public List<CryptoAroFirmaComp> getAroFirmaComps() {
	return this.aroFirmaComps;
    }

    public void setAroFirmaComps(List<CryptoAroFirmaComp> aroFirmaComps) {
	this.aroFirmaComps = aroFirmaComps;
    }

    // bi-directional many-to-one association to AroMarcaComp
    public List<CryptoAroMarcaComp> getAroMarcaComps() {
	return this.aroMarcaComps;
    }

    public void setAroMarcaComps(List<CryptoAroMarcaComp> aroMarcaComps) {
	this.aroMarcaComps = aroMarcaComps;
    }

    // bi-directional many-to-one association to AroUsoXsdDatiSpec
    // public List<AroUsoXsdDatiSpec> getAroUsoXsdDatiSpecs() {
    // return this.aroUsoXsdDatiSpecs;
    // }
    //
    // public void setAroUsoXsdDatiSpecs(List<AroUsoXsdDatiSpec> aroUsoXsdDatiSpecs) {
    // this.aroUsoXsdDatiSpecs = aroUsoXsdDatiSpecs;
    // }
    //
    // //bi-directional many-to-one association to VolAppartCompVolume
    // public List<VolAppartCompVolume> getVolAppartCompVolumes() {
    // return this.volAppartCompVolumes;
    // }
    //
    // public void setVolAppartCompVolumes(List<VolAppartCompVolume> volAppartCompVolumes) {
    // this.volAppartCompVolumes = volAppartCompVolumes;
    // }
    //
    // //bi-directional many-to-one association to RecSessioneRecup
    // public List<RecSessioneRecup> getRecSessioneRecups() {
    // return this.recSessioneRecups;
    // }
    //
    // public void setRecSessioneRecups(List<RecSessioneRecup> recSessioneRecups) {
    // this.recSessioneRecups = recSessioneRecups;
    // }
    //
    // //bi-directional many-to-one association to AroCompIndiceAipDaElab
    // public List<AroCompIndiceAipDaElab> getAroCompIndiceAipDaElabs() {
    // return this.aroCompIndiceAipDaElabs;
    // }
    //
    // public void setAroCompIndiceAipDaElabs(List<AroCompIndiceAipDaElab> aroCompIndiceAipDaElabs)
    // {
    // this.aroCompIndiceAipDaElabs = aroCompIndiceAipDaElabs;
    // }
    //
    // //bi-directional many-to-one association to AroCompVerIndiceAipUd
    // public List<AroCompVerIndiceAipUd> getAroCompVerIndiceAipUds() {
    // return this.aroCompVerIndiceAipUds;
    // }
    //
    // public void setAroCompVerIndiceAipUds(List<AroCompVerIndiceAipUd> aroCompVerIndiceAipUds) {
    // this.aroCompVerIndiceAipUds = aroCompVerIndiceAipUds;
    // }
    //
    // //bi-directional many-to-one association to FirReportEida
    // public List<FirReportEida> getFirReportEidas() {
    // return firReportEidas;
    // }
    //
    // public void setFirReportEidas(List<FirReportEida> firReportEidas) {
    // this.firReportEidas = firReportEidas;
    // }
    //
    // //bi-directional many-to-one association to AroVersIniComp
    // public List<AroVersIniComp> getAroVersIniComps() {
    // return this.aroVersIniComps;
    // }
    //
    // public void setAroVersIniComps(List<AroVersIniComp> aroVersIniComps) {
    // this.aroVersIniComps = aroVersIniComps;
    // }
    //
    // //bi-directional many-to-one association to AroVersIniComp
    // public List<AroUpdCompUnitaDoc> getAroUpdCompUnitaDocs() {
    // return this.aroUpdCompUnitaDocs;
    // }
    //
    // public void setAroUpdCompUnitaDocs(List<AroUpdCompUnitaDoc> aroUpdCompUnitaDocs) {
    // this.aroUpdCompUnitaDocs = aroUpdCompUnitaDocs;
    // }
    //
    // //bi-directional many-to-one association to AroCompUrnCalc
    // public List<AroCompUrnCalc> getAroAroCompUrnCalcs() {
    // return this.aroAroCompUrnCalcs;
    // }
    //
    // public void setAroAroCompUrnCalcs(List<AroCompUrnCalc> aroAroCompUrnCalcs) {
    // this.aroAroCompUrnCalcs = aroAroCompUrnCalcs;
    // }
    // public String getTikaMime() {
    // return tikaMime;
    // }
    //
    // public void setTikaMime(String tikaMime) {
    // this.tikaMime = tikaMime;
    // }
    /**
     * Metodo helper per ottenere tutte le firme associate ad un componente versato.
     *
     * @param nomeComponenteVersato identificativo del componente versato
     *
     * @return lista contentente le firme associate al componente. Non restituisce mai NULL.
     */
    public List<CryptoAroFirmaComp> getFirme(String nomeComponenteVersato) {
	if (aroFirmaComps == null) {
	    return Collections.emptyList();
	}

	List<CryptoAroFirmaComp> result = aroFirmaComps.stream()
		.filter(m -> m.getIdFirma().equals(nomeComponenteVersato))
		.collect(Collectors.toList());
	return result;
    }

    /**
     * Metodo helper per ottenere tutte le marche associate ad un componente versato.
     *
     * @param nomeComponenteVersato identificativo del componente versato
     *
     * @return lista contentente le marche associate al componente. Non restituisce mai NULL.
     */
    public List<CryptoAroMarcaComp> getMarche(final String nomeComponenteVersato) {
	if (aroMarcaComps == null) {
	    return Collections.emptyList();
	}
	List<CryptoAroMarcaComp> result = aroMarcaComps.stream()
		.filter(m -> m.getIdMarca().equals(nomeComponenteVersato))
		.collect(Collectors.toList());
	return result;
    }

    public String getValidatorVersion() {
	return validatorVersion;
    }

    public void setValidatorVersion(String validatorVersion) {
	this.validatorVersion = validatorVersion;
    }

    // public Map<String, String> getMimeComponenti() {
    // return mimeComponenti;
    // }
    //
    // public void setMimeComponenti(Map<String, String> mimeComponenti) {
    // this.mimeComponenti = mimeComponenti;
    // }
    public void setLink(String link) {
	this.link = link;
    }

    public String getLink() {
	return link;
    }

    public Date getInizioValidazione() {
	return inizioValidazione;
    }

    public void setInizioValidazione(Date inizioValidazione) {
	this.inizioValidazione = inizioValidazione;
    }

    public Date getFineValidazione() {
	return fineValidazione;
    }

    public void setFineValidazione(Date fineValidazione) {
	this.fineValidazione = fineValidazione;
    }

    public String getTikaMimeComponentePrincipale() {
	return tikaMimeComponentePrincipale;
    }

    public void setTikaMimeComponentePrincipale(String tikaMimeComponentePrincipale) {
	this.tikaMimeComponentePrincipale = tikaMimeComponentePrincipale;
    }

    public String getLibraryVersion() {
	return libraryVersion;
    }

    public void setLibraryVersion(String libraryVersion) {
	this.libraryVersion = libraryVersion;
    }

    public void setProfiloValidazione(CryptoProfiloVerifica profiloValidazione) {
	this.profiloValidazione = profiloValidazione;
    }

    public CryptoProfiloVerifica getProfiloValidazione() {
	return profiloValidazione;
    }

}
