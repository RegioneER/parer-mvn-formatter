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

import it.eng.parer.crypto.model.CryptoEnums.EsitoControllo;
import java.util.StringTokenizer;

/**
 * Bean contenenti informazioni sull'esito di una verifica, in termini di errori e avvisi che sono
 * stati generati
 *
 * @author Administrator
 *
 */
public class ValidationInfos implements Cloneable {

    // Object validatedObject;
    String[] warnings = null;
    String[] errors = null;
    private static final String WARNINGS_CODE = "warnings";
    private static final String ERRORS_CODE = "errors";
    private static final String ISVALID_CODE = "isValid";
    private EsitoControllo esito;

    /**
     * Abbreviazione per errors.isEmpty()
     *
     * @return true se non ha errori
     */
    public boolean isValid() {
	return (errors == null || errors.length == 0);
    }

    /**
     * Verifica la presenza di errori e avvisi
     *
     * @param strict verifica anche la presenza di avvisi
     *
     * @return true se non sono presenti erorri ed eventualmente avvisi
     */
    public boolean isValid(boolean strict) {
	return strict ? isValid() && (warnings == null || warnings.length == 0) : isValid();
    }

    /**
     * Aggiunge un nuovo avviso a quelli presenti
     *
     * @param message messaggio di warning
     */
    public void addWarning(String message) {
	int length = warnings == null ? 0 : warnings.length;
	String[] temp = new String[length + 1];
	if (warnings != null) {
	    System.arraycopy(warnings, 0, temp, 0, length);
	}
	temp[length] = message;
	warnings = temp;
    }

    /**
     * Aggiunge una lista di avvisi a quelli presenti
     *
     * @param newWarnings lista di warning
     */
    public void addWarnings(String[] newWarnings) {
	if (newWarnings == null || newWarnings.length == 0) {
	    return;
	}
	int length = warnings == null ? 0 : warnings.length;
	String[] temp = new String[length + newWarnings.length];
	if (warnings != null) {
	    System.arraycopy(warnings, 0, temp, 0, length);
	}
	for (int i = 0; i < newWarnings.length; i++) {
	    temp[length + i] = newWarnings[i];
	}
	warnings = temp;
    }

    /**
     * Aggiunge un errore a quelli presenti
     *
     * @param error aggiungi errore
     */
    public void addError(String error) {
	int length = errors == null ? 0 : errors.length;
	String[] temp = new String[length + 1];
	if (errors != null) {
	    System.arraycopy(errors, 0, temp, 0, length);
	}
	temp[length] = error;
	errors = temp;
    }

    /**
     * Aggiunge una lista di errori a quelli presenti
     *
     * @param newErrors lista di errori
     */
    public void addErrors(String[] newErrors) {
	if (newErrors == null || newErrors.length == 0) {
	    return;
	}
	int length = errors == null ? 0 : errors.length;
	String[] temp = new String[length + newErrors.length];
	if (errors != null) {
	    System.arraycopy(errors, 0, temp, 0, length);
	}
	for (int i = 0; i < newErrors.length; i++) {
	    temp[length + i] = newErrors[i];
	}
	errors = temp;
    }

    /**
     * Recupera gli avvisi presenti
     *
     * @return lista di warning
     */
    public String[] getWarnings() {
	return warnings;
    }

    /**
     * Recupera gli errori presenti
     *
     * @return lista di errori
     */
    public String[] getErrors() {
	return errors;
    }

    public String getErrorsString() {
	StringBuilder errorsBuf = new StringBuilder();
	if (errors != null) {
	    for (int i = 0; i < errors.length; i++) {
		errorsBuf.append(errors[i]);
		if (i != errors.length - 1) {
		    errorsBuf.append(", ");
		}
	    }
	}
	return errorsBuf.toString();
    }

    public String getWarningsString() {
	StringBuilder warningsBuf = new StringBuilder();
	if (warnings != null) {
	    for (int i = 0; i < warnings.length; i++) {
		warningsBuf.append(warnings[i]);
		if (i != warnings.length - 1) {
		    warningsBuf.append(" - ");
		}
	    }
	}
	return warningsBuf.toString();
    }

    public String toString() {
	// return "[Validated " + validatedObject +"] warnings: " + warnings +", errors: " + errors
	// +", isValid: " +
	// isValid();
	StringBuilder warningsBuf = new StringBuilder("[");
	if (warnings != null) {
	    for (int i = 0; i < warnings.length; i++) {
		if (i != warnings.length - 1) {
		    warningsBuf.append(warnings[i] + ", ");
		} else {
		    warningsBuf.append(warnings[i] + "]");
		}
	    }
	} else {
	    warningsBuf.append("]");
	}
	StringBuilder errorsBuf = new StringBuilder("[");
	if (errors != null) {
	    for (int i = 0; i < errors.length; i++) {
		if (i != errors.length - 1) {
		    errorsBuf.append(errors[i] + ", ");
		} else {
		    errorsBuf.append(errors[i] + "]");
		}
	    }
	} else {
	    errorsBuf.append("]");
	}
	return WARNINGS_CODE + ": " + warningsBuf + ", " + ERRORS_CODE + ": " + errorsBuf + ", "
		+ ISVALID_CODE + ": " + isValid();
    }

    public static ValidationInfos fromString(String string) {
	if (string == null) {
	    return null;
	}
	ValidationInfos result = new ValidationInfos();

	String warnings = null;
	int wStartIdx = string.indexOf(WARNINGS_CODE);
	if (wStartIdx != -1) {
	    warnings = string.substring(wStartIdx);
	    wStartIdx = warnings.indexOf('[');
	    warnings = warnings.substring(wStartIdx);
	    int nOpen = 0;
	    for (int i = 0; i < warnings.length(); i++) {
		if (warnings.charAt(i) == '[') {
		    nOpen++;
		} else if (warnings.charAt(i) == ']') {
		    nOpen--;
		}
		if (nOpen == 0) {
		    warnings = warnings.substring(1, i);
		    break;
		}
	    }
	}

	String errors = null;
	int eStartIdx = string.indexOf(ERRORS_CODE);
	if (eStartIdx != -1) {
	    errors = string.substring(eStartIdx);
	    eStartIdx = errors.indexOf('[');
	    errors = errors.substring(eStartIdx);
	    int nOpen = 0;
	    for (int i = 0; i < errors.length(); i++) {
		if (errors.charAt(i) == '[') {
		    nOpen++;
		} else if (errors.charAt(i) == ']') {
		    nOpen--;
		}
		if (nOpen == 0) {
		    errors = errors.substring(1, i);
		    break;
		}
	    }
	}

	StringTokenizer wTokenizer = new StringTokenizer(warnings, ",");
	while (wTokenizer.hasMoreElements()) {
	    String wToken = wTokenizer.nextToken();
	    result.addWarning(wToken);
	}

	StringTokenizer eTokenizer = new StringTokenizer(errors, ",");
	while (eTokenizer.hasMoreElements()) {
	    String eToken = eTokenizer.nextToken();
	    result.addError(eToken);
	}

	return result;
    }

    /**
     * @param warnings the warnings to set
     */
    public void setWarnings(String[] warnings) {
	this.warnings = warnings;
    }

    /**
     * @param errors the errors to set
     */
    public void setErrors(String[] errors) {
	this.errors = errors;
    }

    // public Object getValidatedObject() {
    // return validatedObject;
    // }
    //
    // public void setValidatedObject(Object validatedObject) {
    // this.validatedObject = validatedObject;
    // }
    public EsitoControllo getEsito() {
	return esito;
    }

    public void setEsito(EsitoControllo esito) {
	this.esito = esito;
    }

    @Override
    public ValidationInfos clone() {
	try {
	    return (ValidationInfos) super.clone();
	} catch (CloneNotSupportedException e) {
	    throw new AssertionError();
	}
    }
}
