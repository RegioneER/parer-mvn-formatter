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
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Modello del Parer per la CRL. <em>Attenzione</em>, questo modello non deve essere considerato
 * come un'astrazione <i>completa</i> di una CRL. Attualmente vengono serializzati solamente i
 * valori utili a SACER.
 *
 * @author Snidero_L
 */
public class ParerCRL implements Serializable {

    private static final long serialVersionUID = -4336477557346382584L;

    private String principalName;
    private Date thisUpdate;
    private Date nextUpdate;
    private byte[] encoded;
    // oid = 2.5.29.35 - Authority Key Identifier
    private byte[] extensionValueOidSpecifico;
    private byte[] numBytes;
    private BigInteger crlNum;
    private String subjectDN;
    private String keyId;

    public String getSubjectDN() {
	return subjectDN;
    }

    public void setSubjectDN(String subjectDN) {
	this.subjectDN = subjectDN;
    }

    public String getKeyId() {
	return keyId;
    }

    public void setKeyId(String keyId) {
	this.keyId = keyId;
    }

    private Set<ParerRevokedCertificate> revokedCertificates = new HashSet<>();

    public String getPrincipalName() {
	return principalName;
    }

    public void setPrincipalName(String principalName) {
	this.principalName = principalName;
    }

    public Date getThisUpdate() {
	return thisUpdate;
    }

    public void setThisUpdate(Date thisUpdate) {
	this.thisUpdate = thisUpdate;
    }

    public byte[] getEncoded() {
	return encoded;
    }

    public void setEncoded(byte[] encoded) {
	this.encoded = encoded;
    }

    public Date getNextUpdate() {
	return nextUpdate;
    }

    public void setNextUpdate(Date nextUpdate) {
	this.nextUpdate = nextUpdate;
    }

    public Set<ParerRevokedCertificate> getRevokedCertificates() {
	return revokedCertificates;
    }

    public void setRevokedCertificates(Set<ParerRevokedCertificate> revokedCertificates) {
	this.revokedCertificates = revokedCertificates;
    }

    public ParerRevokedCertificate getRevokedCertificate(BigInteger serialNumber) {
	for (ParerRevokedCertificate revokedCertificate : revokedCertificates) {
	    if (revokedCertificate.getSerialNumber().equals(serialNumber)) {
		return revokedCertificate;
	    }
	}
	return null;
    }

    public void addRevokedCertificate(ParerRevokedCertificate revokedCertificate) {
	revokedCertificates.add(revokedCertificate);
    }

    public byte[] getExtensionValueOidSpecifico() {
	return extensionValueOidSpecifico;
    }

    public void setExtensionValueOidSpecifico(byte[] extensionValueOidSpecifico) {
	this.extensionValueOidSpecifico = extensionValueOidSpecifico;
    }

    public byte[] getNumBytes() {
	return numBytes;
    }

    public void setNumBytes(byte[] numBytes) {
	this.numBytes = numBytes;
    }

    public BigInteger getCrlNum() {
	return crlNum;
    }

    public void setCrlNum(BigInteger crlNum) {
	this.crlNum = crlNum;
    }

    /**
     * Helper function per calcolare l'id univoco della crl partendo da subjectDN e authKeyID.
     *
     * @param subjectDN DN dell'authority che ha emesso il certificato.
     * @param authKeyID ID dell'authority che ha emesso il certificato.
     *
     * @return uniqueID della CRL, ovvero l'MD5 tra subjectDN a authKeyID.
     */
    public static String calcolaUniqueId(String subjectDN, String authKeyID) {
	try {
	    MessageDigest md = MessageDigest.getInstance("MD5");
	    String toHash = subjectDN + authKeyID;
	    md.update(toHash.getBytes(Charset.forName("UTF-8")));
	    // Convert hash bytes to hex format
	    StringBuilder sb = new StringBuilder();
	    for (byte b : md.digest()) {
		sb.append(String.format("%02x", b));
	    }
	    return sb.toString();
	} catch (Exception e) {
	    throw new IllegalArgumentException("Errore durante il calcolo dell'id univoco", e);
	}
    }

}
