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

package it.eng.parer.crypto.model.verifica.input.validation;

import it.eng.parer.crypto.model.CryptoEnums;
import it.eng.parer.crypto.model.verifica.input.TipologiaDataRiferimento;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validatore per la data di riferimento. Le uniche configurazioni possibili sono quelle definite
 * qui:
 * <ul>
 * <li>Verifica alla <b>data di firma</b> vedi
 * {@link TipologiaDataRiferimento#verificaAllaDataDiFirma() }, in cui deve essere specificato
 * {@link TipologiaDataRiferimento#referenceDateType} con il valore
 * {@link CryptoEnums.TipoRifTemporale#DATA_FIRMA} e {@link TipologiaDataRiferimento#useSigningDate}
 * deve essere a <em>true</em>;</li>
 * <li>Verifica ad una <b>data specifica</b> vedi
 * {@link TipologiaDataRiferimento#verificaAllaDataSpecifica(long) }, in cui deve essere specificato
 * {@link TipologiaDataRiferimento#referenceDateType} con il valore
 * {@link CryptoEnums.TipoRifTemporale#RIF_TEMP_VERS},
 * {@link TipologiaDataRiferimento#useSigningDate} deve essere a <em>false</em> e
 * {@link TipologiaDataRiferimento#dataRiferimento } deve essere valorizzato;</li>
 * <li>Verifica alla <b>data di versamento</b> vedi
 * {@link TipologiaDataRiferimento#verificaDataVersamento(long) }, in cui deve essere specificato
 * {@link TipologiaDataRiferimento#referenceDateType} con il valore
 * {@link CryptoEnums.TipoRifTemporale#DATA_VERS}, {@link TipologiaDataRiferimento#useSigningDate}
 * deve essere a <em>false</em> e {@link TipologiaDataRiferimento#dataRiferimento } deve essere
 * valorizzato;</li>
 * <li>Verifica <b>predefinita</b> vedi {@link TipologiaDataRiferimento#verificaDefault() }, in cui
 * deve essere specificato {@link TipologiaDataRiferimento#referenceDateType} con il valore
 * {@link CryptoEnums.TipoRifTemporale#DATA_VERS} e {@link TipologiaDataRiferimento#useSigningDate}
 * deve essere a <em>false</em>.</li>
 * </ul>
 *
 * @author Snidero_L
 */
public class DataRiferimentoValidator
	implements ConstraintValidator<DataRiferimento, TipologiaDataRiferimento> {

    @Override
    public boolean isValid(TipologiaDataRiferimento t, ConstraintValidatorContext cvc) {

	if (t == null || t.getReferenceDateType() == null) {
	    return false;
	}

	// verifica alla data di firma
	if (CryptoEnums.TipoRifTemporale.DATA_FIRMA.equals(t.getReferenceDateType())
		&& t.isUseSigningDate()) {
	    return true;
	}
	// verifica alla data specifica
	if (CryptoEnums.TipoRifTemporale.RIF_TEMP_VERS.equals(t.getReferenceDateType())
		&& !t.isUseSigningDate() && t.getDataRiferimento() > 0) {
	    return true;
	}
	// verifica alla data di versamento
	if (CryptoEnums.TipoRifTemporale.DATA_VERS.equals(t.getReferenceDateType())
		&& !t.isUseSigningDate() && t.getDataRiferimento() > 0) {
	    return true;
	}
	// default
	if (CryptoEnums.TipoRifTemporale.DATA_VERS.equals(t.getReferenceDateType())
		&& !t.isUseSigningDate()) {
	    return true;
	}

	return false;
    }
}
