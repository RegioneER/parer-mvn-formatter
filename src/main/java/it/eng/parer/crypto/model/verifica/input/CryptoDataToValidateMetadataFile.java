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

import java.io.Serializable;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

/**
 * Metadati riferiti ai file caricati.
 *
 * @author Snidero_L
 */
public class CryptoDataToValidateMetadataFile implements Serializable {

    private static final long serialVersionUID = 2073062626291367247L;

    @NotNull(message = "Indicare l'identificativo del file")
    private String id;
    private String tipoHash;
    private String hash;
    private long size;

    public CryptoDataToValidateMetadataFile() {
	this.id = "componente-" + UUID.randomUUID().toString();
    }

    public CryptoDataToValidateMetadataFile(String id) {
	this.id = id;
    }

    public String getId() {
	return id;
    }

    public CryptoDataToValidateMetadataFile setId(String id) {
	this.id = id;
	return this;
    }

    public String getTipoHash() {
	return tipoHash;
    }

    public CryptoDataToValidateMetadataFile setTipoHash(String tipoHash) {
	this.tipoHash = tipoHash;
	return this;
    }

    public String getHash() {
	return hash;
    }

    public CryptoDataToValidateMetadataFile setHash(String hash) {
	this.hash = hash;
	return this;
    }

    public long getSize() {
	return size;
    }

    public CryptoDataToValidateMetadataFile setSize(long size) {
	this.size = size;
	return this;
    }

}
