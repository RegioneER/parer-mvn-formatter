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

import it.eng.parer.crypto.model.CryptoEnums;
import java.io.Serializable;
import java.util.Date;

/**
 * Tipologia di data di riferimento. Le tipologie permesse sono sono le seguenti:
 * <ul>
 * <li>Verifica alla data di versamento {@link TipologiaDataRiferimento#verificaDefault()}</li>
 * <li>Verifica alla data di versamento simulando la data di versamento
 * {@link TipologiaDataRiferimento#verificaDataVersamento(long) }</li>
 * <li>Verifica alla data di firma {@link TipologiaDataRiferimento#verificaAllaDataDiFirma() }</li>
 * <li>Verifica ad una data specifica
 * {@link TipologiaDataRiferimento#verificaAllaDataSpecifica(long) }</li>
 * </ul>
 */
public final class TipologiaDataRiferimento implements Serializable {

    private static final long serialVersionUID = -2610222636594138139L;

    private CryptoEnums.TipoRifTemporale referenceDateType;

    private boolean useSigningDate;

    private long dataRiferimento;

    // Predefinito
    public TipologiaDataRiferimento() {
	this(CryptoEnums.TipoRifTemporale.DATA_VERS, false);
    }

    public TipologiaDataRiferimento(CryptoEnums.TipoRifTemporale referenceDateType,
	    boolean useSigningDate) {
	this.referenceDateType = referenceDateType;
	this.useSigningDate = useSigningDate;
	this.dataRiferimento = new Date().getTime();
    }

    public TipologiaDataRiferimento(CryptoEnums.TipoRifTemporale referenceDateType,
	    boolean useSigningDate, long dataRiferimento) {
	if (dataRiferimento < 1) {
	    throw new IllegalArgumentException("La data di riferimento deve essere maggiore di 0");
	}
	this.referenceDateType = referenceDateType;
	this.useSigningDate = useSigningDate;
	this.dataRiferimento = dataRiferimento;

    }

    public CryptoEnums.TipoRifTemporale getReferenceDateType() {
	return referenceDateType;
    }

    public void setReferenceDateType(CryptoEnums.TipoRifTemporale referenceDateType) {
	this.referenceDateType = referenceDateType;
    }

    public void setUseSigningDate(boolean useSigningDate) {
	this.useSigningDate = useSigningDate;
    }

    public boolean isUseSigningDate() {
	return useSigningDate;
    }

    public long getDataRiferimento() {
	return dataRiferimento;
    }

    public void setDataRiferimento(long dataRiferimento) {
	this.dataRiferimento = dataRiferimento;
    }

    /**
     * Verifica predefinita, la costante specificata è
     * {@link CryptoEnums.TipoRifTemporale#DATA_VERS}.
     *
     * @return Tipologia predefinita
     */
    public static final TipologiaDataRiferimento verificaDefault() {
	return new TipologiaDataRiferimento();
    }

    /**
     * Verifica alla data di versamento (simulata). La costante specificata è
     * {@link CryptoEnums.TipoRifTemporale#DATA_VERS} ed è necessario specificare una data maggiore
     * dello UNIX epoch.
     *
     * @param dataVersamento data di versamento
     *
     * @return Tipologia verifica per la data di versamento
     */
    public static final TipologiaDataRiferimento verificaDataVersamento(long dataVersamento) {
	return new TipologiaDataRiferimento(CryptoEnums.TipoRifTemporale.DATA_VERS, false,
		dataVersamento);
    }

    /**
     * Verifica alla data di firma. La costante specificata è
     * {@link CryptoEnums.TipoRifTemporale#DATA_FIRMA}.
     *
     * @return Tipologia di verifica alla data di firma
     */
    public static final TipologiaDataRiferimento verificaAllaDataDiFirma() {
	return new TipologiaDataRiferimento(CryptoEnums.TipoRifTemporale.DATA_FIRMA, true);
    }

    /**
     * Verifica alla data specifica. La costante specificata è
     * {@link CryptoEnums.TipoRifTemporale#RIF_TEMP_VERS} ed è necessario specificare una data
     * maggiore dello UNIX epoch.
     *
     * @param dataSpecifica data di verifica
     *
     * @return Tipologia di verifca per la data specifica
     */
    public static final TipologiaDataRiferimento verificaAllaDataSpecifica(long dataSpecifica) {
	return new TipologiaDataRiferimento(CryptoEnums.TipoRifTemporale.RIF_TEMP_VERS, false,
		dataSpecifica);
    }

    @Override
    public String toString() {
	return "TipologiaDataRiferimento{" + "referenceDateType=" + referenceDateType
		+ ", useSigningDate=" + useSigningDate + ", dataRiferimento=" + dataRiferimento
		+ '}';
    }

}
