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
public class ParerCertificate implements Serializable {

    private static final long serialVersionUID = 2650375399621478270L;
    // get encoded
    private byte[] content;
    private String keyId;
    // ExtensionValue("2.5.29.35")
    private byte[] extensionValueSpecifico;
    // subject key id ottenuto come SignerUtil.getSubjectKeyId(caCert)
    private String issuerDN;
    private String subjectDN;

    public void setIssuerDN(String issuerDN) {
	this.issuerDN = issuerDN;
    }

    public String getIssuerDN() {
	return issuerDN;
    }

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

    public byte[] getExtensionValueSpecifico() {
	return extensionValueSpecifico;
    }

    public void setExtensionValueSpecifico(byte[] extensionValueSpecifico) {
	this.extensionValueSpecifico = extensionValueSpecifico;
    }

    public byte[] getContent() {
	return content;
    }

    public void setContent(byte[] content) {
	this.content = content;
    }

    // PER SACER, DA POPOLARE
    private BigInteger serialNumber;
    private Date notBefore;
    private Date notAfter;
    private String principalSubjectSerialNumber;
    private String principalSubjectName;
    private String principalSubjectSurname;

    // questo è di ISIGNATURE
    // new String(Base64.encode(s.getSignatureBytes())))
    // private String signatureBase64;

    // X500Name subjectName =
    // X500Name.getInstance(signerCert.getSubjectX500Principal().getEncoded());
    // if (subjectName.getRDNs(BCStyle.SERIALNUMBER).length > 0 &&
    // subjectName.getRDNs(BCStyle.GIVENNAME).length > 0
    // && subjectName.getRDNs(BCStyle.SURNAME).length > 0) {
    // String serialnum =
    // subjectName.getRDNs(BCStyle.SERIALNUMBER)[0].getFirst().getValue().toString();
    // String gn = subjectName.getRDNs(BCStyle.GIVENNAME)[0].getFirst().getValue().toString();
    // String surname = subjectName.getRDNs(BCStyle.SURNAME)[0].getFirst().getValue().toString();

    public BigInteger getSerialNumber() {
	return serialNumber;
    }

    public void setSerialNumber(BigInteger serialNumber) {
	this.serialNumber = serialNumber;
    }

    public Date getNotBefore() {
	return notBefore;
    }

    public void setNotBefore(Date notBefore) {
	this.notBefore = notBefore;
    }

    public Date getNotAfter() {
	return notAfter;
    }

    public void setNotAfter(Date notAfter) {
	this.notAfter = notAfter;
    }

    public String getPrincipalSubjectName() {
	return principalSubjectName;
    }

    public void setPrincipalSubjectName(String principalSubjectName) {
	this.principalSubjectName = principalSubjectName;
    }

    public String getPrincipalSubjectSerialNumber() {
	return principalSubjectSerialNumber;
    }

    public void setPrincipalSubjectSerialNumber(String principalSubjectSerialNumber) {
	this.principalSubjectSerialNumber = principalSubjectSerialNumber;
    }

    public String getPrincipalSubjectSurname() {
	return principalSubjectSurname;
    }

    public void setPrincipalSubjectSurname(String principalSubjectSurname) {
	this.principalSubjectSurname = principalSubjectSurname;
    }

    // public String getSignatureBase64() {
    // return signatureBase64;
    // }
    //
    // public void setSignatureBase64(String signatureBase64) {
    // this.signatureBase64 = signatureBase64;
    // }
    /*
     * @Override public void checkValidity() throws CertificateExpiredException,
     * CertificateNotYetValidException { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     * @Override public void checkValidity(Date date) throws CertificateExpiredException,
     * CertificateNotYetValidException { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     * @Override public int getVersion() { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     * @Override public Principal getIssuerDN() { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     * @Override public Principal getSubjectDN() { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     * @Override public String getSigAlgName() { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     * @Override public String getSigAlgOID() { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     * @Override public byte[] getSigAlgParams() { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     * @Override public byte[] getEncoded() throws CertificateEncodingException { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     * @Override public void verify(PublicKey key) throws CertificateException,
     * NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
     * throw new UnsupportedOperationException("Not supported yet."); //To change body of generated
     * methods, choose Tools | Templates. }
     *
     * @Override public void verify(PublicKey key, String sigProvider) throws CertificateException,
     * NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
     * throw new UnsupportedOperationException("Not supported yet."); //To change body of generated
     * methods, choose Tools | Templates. }
     *
     * @Override public String toString() { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     * @Override public PublicKey getPublicKey() { throw new
     * UnsupportedOperationException("Not supported yet."); //To change body of generated methods,
     * choose Tools | Templates. }
     *
     *
     */

}
