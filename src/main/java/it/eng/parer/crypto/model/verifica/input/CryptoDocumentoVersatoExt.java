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

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * Classe di comodità per poter passare un documento indicando solamente il percorso su filesystem
 * locale. ATTENZIONE in questo caso server e client devono essere sullo stesso host.
 *
 * @author Snidero_L
 */
public class CryptoDocumentoVersatoExt extends CryptoDocumentoVersato {

    private static final long serialVersionUID = 6492819204616324881L;

    private URI contentAbsolutePath;

    public CryptoDocumentoVersatoExt() {

    }

    public CryptoDocumentoVersatoExt(URI contentAbsolutePath) {
	this.contentAbsolutePath = contentAbsolutePath;
    }

    public CryptoDocumentoVersatoExt setContentAbsolutePath(URI contentAbsolutePath) {
	this.contentAbsolutePath = contentAbsolutePath;
	return this;
    }

    public URI getContentAbsolutePath() {
	return contentAbsolutePath;
    }

    @Override
    public byte[] getContenuto() {
	return readContenuto(contentAbsolutePath);
    }

    private static byte[] readContenuto(URI filePath) {
	Objects.requireNonNull(filePath, "FilePath non può essere vuoto");

	byte[] result = null;
	try {
	    result = Files.readAllBytes(Paths.get(filePath));
	} catch (IOException ex) {
	    throw new IllegalArgumentException(
		    "Errore durante la lettura dell'URI [" + filePath.toASCIIString() + "]", ex);
	}
	return result;
    }

}
