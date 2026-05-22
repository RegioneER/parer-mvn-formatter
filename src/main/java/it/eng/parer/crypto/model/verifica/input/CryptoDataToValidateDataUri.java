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
import java.net.URI;
import java.util.List;

import jakarta.validation.constraints.NotNull;

/**
 * Modello per i file presenti su un URI (tendenzialmente utilizzando le PRE-SIGNED URL dell'object
 * storage).
 *
 * @author Snidero_L
 */
public class CryptoDataToValidateDataUri implements Serializable {

    private static final long serialVersionUID = 2129598057865119908L;

    @NotNull(message = "Il percorso del componente principale deve essere valorizzate correttamente")
    private URI contenuto;
    private List<URI> firme;
    private List<URI> marche;

    public URI getContenuto() {
	return contenuto;
    }

    public void setContenuto(URI contenuto) {
	this.contenuto = contenuto;
    }

    public List<URI> getFirme() {
	return firme;
    }

    public void setFirme(List<URI> firme) {
	this.firme = firme;
    }

    public List<URI> getMarche() {
	return marche;
    }

    public void setMarche(List<URI> marche) {
	this.marche = marche;
    }

}
