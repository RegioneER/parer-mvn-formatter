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
import java.util.Objects;

/**
 * Profilo di verifica: Configurando questo è oggetto è possibile applicare dei "bypass" alla
 * verifica delle firme. Attualemente i controlli che possono essere saltati sono:
 * <ul>
 * <li>controllo crittografico</li>
 * <li>controllo catena trusted</li>
 * <li>controllo certificato</li>
 * <li>controllo CRL</li>
 * </ul>
 * Oltre ai controlli viene introdotto un parametro booleano che permette di includere nella
 * response eventuali file binari (per default true):
 * <ul>
 * <li>includeCertificateAndRevocationValues</li>
 * </ul>
 *
 * @author Snidero_L
 */
public class CryptoProfiloVerifica implements Serializable {

    private static final long serialVersionUID = -1338399317911956692L;

    private boolean controlloCrittograficoAbilitato = true;
    private boolean controlloCatenaTrustAbilitato = true;
    private boolean controlloCertificatoAbilitato = true;
    private boolean controlloCrlAbilitato = true;
    private boolean includeCertificateAndRevocationValues = true;

    public static CryptoProfiloVerifica profiloDefault() {
	return new CryptoProfiloVerifica();
    }

    public boolean isControlloCrittograficoAbilitato() {
	return controlloCrittograficoAbilitato;
    }

    public CryptoProfiloVerifica setControlloCrittograficoAbilitato(
	    boolean controlloCrittograficoAbilitato) {
	this.controlloCrittograficoAbilitato = controlloCrittograficoAbilitato;
	return this;
    }

    public boolean isControlloCatenaTrustAbilitato() {
	return controlloCatenaTrustAbilitato;
    }

    public CryptoProfiloVerifica setControlloCatenaTrustAbilitato(
	    boolean controlloCatenaTrustAbilitato) {
	this.controlloCatenaTrustAbilitato = controlloCatenaTrustAbilitato;
	return this;
    }

    public boolean isControlloCertificatoAbilitato() {
	return controlloCertificatoAbilitato;
    }

    public CryptoProfiloVerifica setControlloCertificatoAbilitato(
	    boolean controlloCertificatoAbilitato) {
	this.controlloCertificatoAbilitato = controlloCertificatoAbilitato;
	return this;
    }

    public boolean isControlloCrlAbilitato() {
	return controlloCrlAbilitato;
    }

    public CryptoProfiloVerifica setControlloCrlAbilitato(boolean controlloCrlAbilitato) {
	this.controlloCrlAbilitato = controlloCrlAbilitato;
	return this;
    }

    public boolean isIncludeCertificateAndRevocationValues() {
	return includeCertificateAndRevocationValues;
    }

    public CryptoProfiloVerifica setIncludeCertificateAndRevocationValues(
	    boolean includeCertificateAndRevocationValues) {
	this.includeCertificateAndRevocationValues = includeCertificateAndRevocationValues;
	return this;
    }

    @Override
    public String toString() {
	return "CryptoProfiloVerifica [controlloCrittograficoAbilitato="
		+ controlloCrittograficoAbilitato + ", controlloCatenaTrustAbilitato="
		+ controlloCatenaTrustAbilitato + ", controlloCertificatoAbilitato="
		+ controlloCertificatoAbilitato + ", controlloCrlAbilitato=" + controlloCrlAbilitato
		+ ", includeCertificateAndRevocationValues=" + includeCertificateAndRevocationValues
		+ "]";
    }

    @Override
    public int hashCode() {
	return Objects.hash(controlloCatenaTrustAbilitato, controlloCertificatoAbilitato,
		controlloCrittograficoAbilitato, controlloCrlAbilitato,
		includeCertificateAndRevocationValues);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	CryptoProfiloVerifica other = (CryptoProfiloVerifica) obj;
	return controlloCatenaTrustAbilitato == other.controlloCatenaTrustAbilitato
		&& controlloCertificatoAbilitato == other.controlloCertificatoAbilitato
		&& controlloCrittograficoAbilitato == other.controlloCrittograficoAbilitato
		&& controlloCrlAbilitato == other.controlloCrlAbilitato
		&& includeCertificateAndRevocationValues == other.includeCertificateAndRevocationValues;
    }

}
