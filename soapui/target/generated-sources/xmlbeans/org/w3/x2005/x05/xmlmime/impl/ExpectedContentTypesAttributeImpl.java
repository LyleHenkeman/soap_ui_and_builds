/*
 * An XML attribute type.
 * Localname: expectedContentTypes
 * Namespace: http://www.w3.org/2005/05/xmlmime
 * Java type: org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2005.x05.xmlmime.impl;
/**
 * A document containing one expectedContentTypes(@http://www.w3.org/2005/05/xmlmime) attribute.
 *
 * This is a complex type.
 */
public class ExpectedContentTypesAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ExpectedContentTypesAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPECTEDCONTENTTYPES$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2005/05/xmlmime", "expectedContentTypes");
    
    
    /**
     * Gets the "expectedContentTypes" attribute
     */
    public java.lang.String getExpectedContentTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTEDCONTENTTYPES$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expectedContentTypes" attribute
     */
    public org.apache.xmlbeans.XmlString xgetExpectedContentTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXPECTEDCONTENTTYPES$0);
            return target;
        }
    }
    
    /**
     * True if has "expectedContentTypes" attribute
     */
    public boolean isSetExpectedContentTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXPECTEDCONTENTTYPES$0) != null;
        }
    }
    
    /**
     * Sets the "expectedContentTypes" attribute
     */
    public void setExpectedContentTypes(java.lang.String expectedContentTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTEDCONTENTTYPES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPECTEDCONTENTTYPES$0);
            }
            target.setStringValue(expectedContentTypes);
        }
    }
    
    /**
     * Sets (as xml) the "expectedContentTypes" attribute
     */
    public void xsetExpectedContentTypes(org.apache.xmlbeans.XmlString expectedContentTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXPECTEDCONTENTTYPES$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXPECTEDCONTENTTYPES$0);
            }
            target.set(expectedContentTypes);
        }
    }
    
    /**
     * Unsets the "expectedContentTypes" attribute
     */
    public void unsetExpectedContentTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXPECTEDCONTENTTYPES$0);
        }
    }
}
