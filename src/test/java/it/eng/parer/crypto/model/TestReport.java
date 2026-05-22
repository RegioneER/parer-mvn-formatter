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

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.junit.jupiter.api.Test;

import it.eng.parer.crypto.model.verifica.CryptoAroCompDoc;
import it.eng.parer.crypto.model.verifica.CryptoAroContrFirmaComp;
import it.eng.parer.crypto.model.verifica.CryptoAroFirmaComp;
import it.eng.parer.crypto.model.verifica.CryptoFirCrl;
import it.eng.parer.crypto.model.verifica.CryptoFirFilePerFirma;

/**
 *
 * @author Snidero_L
 */
public class TestReport {

    /**
     * Crea un file XML a partire dalle annotation (se presenti) nel modello.
     *
     * @throws JAXBException
     */
    @SuppressWarnings({
	    "rawtypes", "unchecked" })
    @Test
    public void testMarshaller() throws JAXBException {

	CryptoFirFilePerFirma firFilePerFirma = new CryptoFirFilePerFirma();
	firFilePerFirma.setNmFileDownload("Nuova CRL");
	firFilePerFirma.setTiFilePerFirma("CRL");
	firFilePerFirma.setBlFilePerFirma(new byte[] {
		42, 53, 53, 42 });

	CryptoFirCrl crl = new CryptoFirCrl();
	crl.setFirFilePerFirma(firFilePerFirma);
	crl.setDtIniCrl(Date.from(Instant.parse("2019-12-05T10:15:30.00Z")));
	crl.setDtScadCrl(Date.from(Instant.parse("2019-12-06T15:15:30.00Z")));
	crl.setNiSerialCrl(BigDecimal.valueOf(42_000_000L));
	crl.setSubjectDN("CN=Regione Emilia-Romagna CA,DC=ente,DC=regione,DC=emr,DC=it");

	CryptoAroContrFirmaComp controlloCrl = new CryptoAroContrFirmaComp();
	controlloCrl.setFirCrl(crl);
	controlloCrl.setTiContr("CRL");
	controlloCrl.setDsMsgEsitoContrFirma("OK");

	CryptoAroFirmaComp firma = new CryptoAroFirmaComp();
	firma.setAroContrFirmaComps(Arrays.asList(new CryptoAroContrFirmaComp[] {
		controlloCrl }));
	firma.setCdFirmatario("IT:BRLLLL56P13L781I");
	firma.setDtFirma(Date.from(Instant.parse("2010-12-06T15:15:30.00Z")));
	firma.setNmCognomeFirmatario("DOTE");
	firma.setNmFirmatario("SACER");

	CryptoAroCompDoc response = new CryptoAroCompDoc();
	response.setAroFirmaComps(Arrays.asList(new CryptoAroFirmaComp[] {
		firma }));
	response.setDsNomeCompVers("COMPONENTE DI FIRMA");

	StringWriter tmpStringWriter = new StringWriter();

	JAXBContext jc = JAXBContext.newInstance(response.getClass());
	Marshaller tmpGenericMarshaller = jc.createMarshaller();
	JAXBIntrospector introspector = jc.createJAXBIntrospector();
	if (null == introspector.getElementName(response)) {
	    JAXBElement jaxbElement = new JAXBElement(new QName("ROOT"), response.getClass(),
		    response);
	    tmpGenericMarshaller.marshal(jaxbElement, tmpStringWriter);
	} else {
	    tmpGenericMarshaller.marshal(response, tmpStringWriter);
	}
	final String xmlReport = tmpStringWriter.toString();

	assertTrue(xmlReport.contains("<nmFileDownload>Nuova CRL</nmFileDownload>"));
	assertTrue(xmlReport.contains("<tiFilePerFirma>CRL</tiFilePerFirma>"));
	assertTrue(xmlReport.contains("<niSerialCrl>42000000</niSerialCrl>"));
	assertTrue(xmlReport.contains("blFilePerFirma"));

    }

}
