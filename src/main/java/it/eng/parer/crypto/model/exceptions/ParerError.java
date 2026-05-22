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

package it.eng.parer.crypto.model.exceptions;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import it.eng.parer.crypto.model.verifica.input.CryptoDataToValidateMetadata;

/**
 * Errori gestiti dell'applicazione. Sono classificati nell'enum {@link ExceptionType} e specificati
 * nell'enum {@link ErrorCode}.
 *
 * @author Snidero_L
 */
public interface ParerError {

    /**
     * Ambito dell'eccezione, sostanzialmente uno per <i>service</i> implementato.
     */
    public enum ExceptionType {
	GENERIC, TSD, CERTIFICATE, CRL, TIME
    }

    /**
     * Codici di errore specifici che vanno a dettagliare l'{@link ExceptionType}.
     */
    public enum ErrorCode {
	RESOURCE_NOT_FOUND("not-found-exception", ExceptionType.GENERIC), //
	VALIDATION_ERROR("validation-exception", ExceptionType.GENERIC), //
	GENERIC_ERROR("unhandled-exception", ExceptionType.GENERIC), //
	CRL_NOT_FOUND("crl-not-found-exception", ExceptionType.TSD), //
	CRL_CRYPTO_STORAGE("crl-cryptostorage-exception", ExceptionType.CRL), //
	CRL_EXCEPTION("crl-exception", ExceptionType.CRL), //
	CRL_IO("crl-io-exception", ExceptionType.CRL), //
	TSP_EXCEPTION("tsp-exception", ExceptionType.TIME), //
	TSP_IO("tsp-io-exception", ExceptionType.TIME), //
	TSP_PROVIDER_ERROR("tsp-provider-exception", ExceptionType.TIME), //
	TSD_NOT_FOUND("tsd-not-found-exception", ExceptionType.TSD), //
	TSD_PROVIDER_ERROR("tsd-provider-exception", ExceptionType.TIME), //
	CERT_IO("cert-io-exception", ExceptionType.CERTIFICATE), //
	CERT_EXCEPTION("cert-exception", ExceptionType.CERTIFICATE), //
	CERT_PROVIDER_ERROR("cert-provider-exception", ExceptionType.CERTIFICATE), //
	SIGNATURE_VERIFICATION_IO("signature-io-exception", ExceptionType.GENERIC), //
	SIGNATURE_WRONG_PARAMETER("signature-wrong-parameters", ExceptionType.GENERIC),
	SIGNATURE_FORMAT("signature-format", ExceptionType.GENERIC);

	ErrorCode(String urlFriendly, ExceptionType type) {
	    this.urlFriendly = urlFriendly;
	    this.type = type;
	}

	private String urlFriendly;
	private ExceptionType type;

	/**
	 * Restituisce la versione "web friendly" per il codice di errore.
	 *
	 * @return la string "web friendly" del codice.
	 */
	public String urlFriendly() {
	    return urlFriendly;
	}

	public ExceptionType exceptionType() {
	    return type;
	}

	/**
	 * Restituisce l'{@link ErrorCode} corrispondente alla stringa in input.
	 *
	 * @param urlFriendly stringa in input del codice "web friendly".
	 *
	 * @return transcodifica di {@link ErrorCode} a partire dalla stringa in input
	 *
	 * @throws IllegalArgumentException nel caso in cui la stringa non sia riconosciuta
	 */
	public static ErrorCode fromUrlFriendly(String urlFriendly) {
	    for (ErrorCode errorCode : values()) {
		if (errorCode.urlFriendly().equals(urlFriendly)) {
		    return errorCode;
		}
	    }
	    throw new IllegalArgumentException(
		    "Impossibile trovare un codice di errore per la stringa " + urlFriendly);
	}

    }

    public String getMessage();

    public List<String> getDetails();

    public ErrorCode getCode();

    public String getMoreInfo();

    public CryptoDataToValidateMetadata getMetadata();

    default String stdMsgPrefix() {
	return (getMetadata() != null && getMetadata().getComponentePrincipale() != null
		? "[ ID Documento = " + StringUtils.defaultIfBlank(
			getMetadata().getComponentePrincipale().getId(), "<id non presente>")
			+ " ] "
		: "");
    }

}
