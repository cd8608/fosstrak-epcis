
package org.accada.epcis.soap.model;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ImplementationExceptionSeverity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImplementationExceptionSeverity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="SEVERE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ImplementationExceptionSeverity {

    ERROR,
    SEVERE;

    public String value() {
        return name();
    }

    public static ImplementationExceptionSeverity fromValue(String v) {
        return valueOf(v);
    }

}