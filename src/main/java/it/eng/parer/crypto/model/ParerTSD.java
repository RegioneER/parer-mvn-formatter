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
import java.util.Arrays;
import java.util.List;

/**
 * Timestamp token (per generare i TSD)
 *
 * @author Snidero_L
 */
public class ParerTSD implements Serializable {

    private static final long serialVersionUID = 4787341160336442803L;

    private ParerTST[] timeStampTokens;

    private byte[] encoded;

    public byte[] getEncoded() {
	return encoded;
    }

    public void setEncoded(byte[] encoded) {
	this.encoded = encoded;
    }

    public ParerTST[] getTimeStampTokens() {
	return timeStampTokens;
    }

    public void setTimeStampTokens(ParerTST[] timeStampTokens) {
	this.timeStampTokens = timeStampTokens;
    }

    public void addTimeStampToken(ParerTST timeStampToken) {
	if (timeStampTokens == null) {
	    timeStampTokens = new ParerTST[] {
		    timeStampToken };
	    return;
	}

	List<ParerTST> asList = Arrays.asList(timeStampTokens);
	asList.add(timeStampToken);
	timeStampTokens = asList.toArray(new ParerTST[] {});
    }

}
