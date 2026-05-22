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
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Snidero_L
 */
public class ParerRevokedCertificate implements Serializable {

    private static final long serialVersionUID = -6359738353141877449L;

    private BigInteger serialNumber;
    private Date revocationDate;

    public BigInteger getSerialNumber() {
	return serialNumber;
    }

    public void setSerialNumber(BigInteger serialNumber) {
	this.serialNumber = serialNumber;
    }

    public Date getRevocationDate() {
	return revocationDate;
    }

    public void setRevocationDate(Date revocationDate) {
	this.revocationDate = revocationDate;
    }

}
