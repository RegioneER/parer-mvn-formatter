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
import java.util.List;

/**
 * The persistent class for the FIR_ISSUER database table.
 *
 */
public class CryptoFirIssuer implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dlDnIssuerCertifCa;
    private String dlDnSubjectCertifCa;
    private List<CryptoFirCertifCa> firCertifCas;

    public CryptoFirIssuer() {
	// Non fare nulla viene costruito automaticamente.
    }

    public String getDlDnIssuerCertifCa() {
	return this.dlDnIssuerCertifCa;
    }

    public void setDlDnIssuerCertifCa(String dlDnIssuerCertifCa) {
	this.dlDnIssuerCertifCa = dlDnIssuerCertifCa;
    }

    public String getDlDnSubjectCertifCa() {
	return dlDnSubjectCertifCa;
    }

    public void setDlDnSubjectCertifCa(String dlDnSubjectCertifCa) {
	this.dlDnSubjectCertifCa = dlDnSubjectCertifCa;
    }

    public List<CryptoFirCertifCa> getFirCertifCas() {
	return this.firCertifCas;
    }

    public void setFirCertifCas(List<CryptoFirCertifCa> firCertifCas) {
	this.firCertifCas = firCertifCas;
    }

}
