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

import jakarta.validation.constraints.NotNull;

/**
 * Modello per la versione 3 del servizio di verifica firma crypto
 *
 * @author Snidero_L
 */
public class CryptoDataToValidateBody {

    private CryptoDataToValidateMetadata metadata;
    @NotNull(message = "Necessario indicare l'elemento da verificare")
    private CryptoDataToValidateDataUri data;

    public CryptoDataToValidateMetadata getMetadata() {
	return metadata;
    }

    public void setMetadata(CryptoDataToValidateMetadata metadata) {
	this.metadata = metadata;
    }

    public CryptoDataToValidateDataUri getData() {
	return data;
    }

    public void setData(CryptoDataToValidateDataUri data) {
	this.data = data;
    }

}
