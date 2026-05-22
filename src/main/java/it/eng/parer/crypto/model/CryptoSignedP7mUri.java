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

package it.eng.parer.crypto.model;

import java.io.Serializable;
import java.net.URI;

import org.apache.commons.lang3.StringUtils;

import jakarta.validation.constraints.NotNull;

/**
 * Modello per i file p7m su un URI (tendenzialmente utilizzando le PRE-SIGNED URL dell'object
 * storage).
 */
public class CryptoSignedP7mUri implements Serializable {

    private static final long serialVersionUID = 6539537678266529865L;

    @NotNull(message = "URI del documento firmato p7m deve essere valorizzato correttamente")
    private URI uri;

    private String originalFileName;

    public CryptoSignedP7mUri() {
	super();
    }

    public CryptoSignedP7mUri(URI uri) {
	super();
	this.uri = uri;
	this.originalFileName = StringUtils.EMPTY;
    }

    public CryptoSignedP7mUri(URI uri, String originalFileName) {
	super();
	this.uri = uri;
	this.originalFileName = originalFileName;
    }

    public URI getUri() {
	return uri;
    }

    public void setUri(URI uri) {
	this.uri = uri;
    }

    public String getOriginalFileName() {
	return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
	this.originalFileName = originalFileName;
    }

}
