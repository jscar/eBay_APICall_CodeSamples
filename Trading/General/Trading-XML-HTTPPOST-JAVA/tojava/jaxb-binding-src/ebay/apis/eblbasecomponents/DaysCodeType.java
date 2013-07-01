//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DaysCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DaysCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="EveryDay"/>
 *     &lt;enumeration value="Weekdays"/>
 *     &lt;enumeration value="Weekends"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DaysCodeType")
@XmlEnum
public enum DaysCodeType {


    /**
     * 
     * 						Seller does not want to be contacted. Contact hours will not be supported for 
     * 						any days. If contact hours are specified, they will be ignored.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Seller can be contacted any day during the specified contact hours. 
     * 					
     * 
     */
    @XmlEnumValue("EveryDay")
    EVERY_DAY("EveryDay"),

    /**
     * 
     * 						Seller can be contacted Monday through Friday during the specified 
     * 						contact hours.
     * 					
     * 
     */
    @XmlEnumValue("Weekdays")
    WEEKDAYS("Weekdays"),

    /**
     * 
     * 						Seller can  be contacted Saturday or Sunday during the specified 
     * 						contact hours.
     * 					
     * 
     */
    @XmlEnumValue("Weekends")
    WEEKENDS("Weekends"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    DaysCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DaysCodeType fromValue(String v) {
        for (DaysCodeType c: DaysCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}