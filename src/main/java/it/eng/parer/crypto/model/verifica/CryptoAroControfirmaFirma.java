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

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aroControFirmaFiglio")
@XmlAccessorType(XmlAccessType.FIELD)
public class CryptoAroControfirmaFirma implements Serializable {

    private static final long serialVersionUID = 1L;
    // private long idControfirmaFirma;
    private CryptoAroFirmaComp aroFirmaFiglio;
    // private CryptoAroFirmaComp aroFirmaPadre;

    public CryptoAroControfirmaFirma() {
	// empty
    }

    // public long getIdControfirmaFirma() {
    // return this.idControfirmaFirma;
    // }
    //
    // public void setIdControfirmaFirma(long idControfirmaFirma) {
    // this.idControfirmaFirma = idControfirmaFirma;
    // }
    public CryptoAroFirmaComp getAroFirmaFiglio() {
	return this.aroFirmaFiglio;
    }

    public void setAroFirmaFiglio(CryptoAroFirmaComp aroFirmaFiglio) {
	this.aroFirmaFiglio = aroFirmaFiglio;
    }

    // public CryptoAroFirmaComp getAroFirmaPadre() {
    // return this.aroFirmaPadre;
    // }
    //
    // public void setAroFirmaPadre(CryptoAroFirmaComp aroFirmaPadre) {
    // this.aroFirmaPadre = aroFirmaPadre;
    // }
}
