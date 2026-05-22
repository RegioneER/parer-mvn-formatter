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
import java.util.Date;

/**
 *
 * @author Snidero_L
 */
public class ParerTST implements Serializable {

    private static final long serialVersionUID = 3859455083214093431L;

    private byte[] encoded;
    private TimeStampInfo timeStampInfo;

    public byte[] getEncoded() {
	return encoded;
    }

    public void setEncoded(byte[] encoded) {
	this.encoded = encoded;
    }

    public TimeStampInfo getTimeStampInfo() {
	return timeStampInfo;
    }

    public void setTimeStampInfo(TimeStampInfo timeStampInfo) {
	this.timeStampInfo = timeStampInfo;
    }

    public TimeStampInfo create() {
	return new TimeStampInfo();
    }

    public class TimeStampInfo implements Serializable {

	private static final long serialVersionUID = -6590203073891307988L;

	private Date genTime;

	public Date getGenTime() {
	    return genTime;
	}

	public void setGenTime(Date genTime) {
	    this.genTime = genTime;
	}

    }

}
