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

package it.eng.parer.crypto.model.verifica.input;

import it.eng.parer.crypto.model.verifica.input.validation.DataRiferimento;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Modello per effettuare la validazione di una firma.
 *
 * @author Snidero_L
 */
public class CryptoDataToValidate implements Serializable {

    private static final long serialVersionUID = 6857282680348085868L;

    @Valid
    @NotNull(message = "Il documento principale deve essere valorizzato")
    private CryptoDocumentoVersato contenuto;

    private String uuid = UUID.randomUUID().toString();

    private List<CryptoDocumentoVersato> sottoComponentiFirma = new ArrayList<>();

    private List<CryptoDocumentoVersato> sottoComponentiMarca = new ArrayList<>();

    private CryptoProfiloVerifica profiloVerifica = CryptoProfiloVerifica.profiloDefault();

    @Valid
    @NotNull(message = "La data di riferimento deve essere valorizzata")
    @DataRiferimento(message = "La tipologia della data di riferimento deve essere valorizzata correttamente")
    private TipologiaDataRiferimento tipologiaDataRiferimento = TipologiaDataRiferimento
	    .verificaDefault();

    public CryptoDocumentoVersato getContenuto() {
	return contenuto;
    }

    public void setContenuto(CryptoDocumentoVersato contenuto) {
	this.contenuto = contenuto;
    }

    public List<CryptoDocumentoVersato> getSottoComponentiFirma() {
	return sottoComponentiFirma;
    }

    public void setSottoComponentiFirma(List<CryptoDocumentoVersato> sottoComponentiFirma) {
	this.sottoComponentiFirma = sottoComponentiFirma;
    }

    public List<CryptoDocumentoVersato> getSottoComponentiMarca() {
	return sottoComponentiMarca;
    }

    public void setSottoComponentiMarca(List<CryptoDocumentoVersato> sottoComponentiMarca) {
	this.sottoComponentiMarca = sottoComponentiMarca;
    }

    public boolean addSottoComponenteFirma(CryptoDocumentoVersato sottoComponenteFirma) {
	return this.sottoComponentiFirma.add(sottoComponenteFirma);
    }

    public boolean addSottoComponenteMarca(CryptoDocumentoVersato sottoComponenteMarca) {
	return this.sottoComponentiMarca.add(sottoComponenteMarca);
    }

    public CryptoProfiloVerifica getProfiloVerifica() {
	return profiloVerifica;
    }

    public void setProfiloVerifica(CryptoProfiloVerifica profiloVerifica) {
	this.profiloVerifica = profiloVerifica;
    }

    public void setTipologiaDataRiferimento(TipologiaDataRiferimento tipologiaDataRiferimento) {
	this.tipologiaDataRiferimento = tipologiaDataRiferimento;
    }

    public TipologiaDataRiferimento getTipologiaDataRiferimento() {
	return tipologiaDataRiferimento;
    }

    public String getUuid() {
	return uuid;
    }

    public void setUuid(String uuid) {
	this.uuid = uuid;
    }

}
