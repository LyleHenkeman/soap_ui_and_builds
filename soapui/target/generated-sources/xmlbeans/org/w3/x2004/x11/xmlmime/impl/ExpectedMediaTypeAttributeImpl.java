/*
 * An XML attribute type.
 * Localname: expectedMediaType
 * Namespace: http://www.w3.org/2004/11/xmlmime
 * Java type: org.w3.x2004.x11.xmlmime.ExpectedMediaTypeAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2004.x11.xmlmime.impl;
/**
 * A document containing one expectedMediaType(@http://www.w3.org/2004/11/xmlmime) attribute.
 *
 * This is a complex type.
 */
public class ExpectedMediaTypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.w3.x2004.x11.xmlmime.ExpectedMediaTypeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ExpectedMediaTypeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPECTEDMEDIATYPE$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/2004/11/xmlmime", "expectedMediaType");
    
    
    /**
     * Gets the "expectedMediaType" attribute
     */
    public java.lang.String getExpectedMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTEDMEDIATYPE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expectedMediaType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetExpectedMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXPECTEDMEDIATYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "expectedMediaType" attribute
     */
    public boolean isSetExpectedMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXPECTEDMEDIATYPE$0) != null;
        }
    }
    
    /**
     * Sets the "expectedMediaType" attribute
     */
    public void setExpectedMediaType(java.lang.String expectedMediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPECTEDMEDIATYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPECTEDMEDIATYPE$0);
            }
            target.setStringValue(expectedMediaType);
        }
    }
    
    /**
     * Sets (as xml) the "expectedMediaType" attribute
     */
    public void xsetExpectedMediaType(org.apache.xmlbeans.XmlString expectedMediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXPECTEDMEDIATYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXPECTEDMEDIATYPE$0);
            }
            target.set(expectedMediaType);
        }
    }
    
    /**
     * Unsets the "expectedMediaType" attribute
     */
    public void unsetExpectedMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXPECTEDMEDIATYPE$0);
        }
    }
}
