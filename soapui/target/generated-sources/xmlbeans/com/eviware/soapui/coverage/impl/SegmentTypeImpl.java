/*
 * XML Type:  SegmentType
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.SegmentType
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage.impl;
/**
 * An XML SegmentType(@http://eviware.com/soapui/coverage).
 *
 * This is a complex type.
 */
public class SegmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.coverage.SegmentType
{
    private static final long serialVersionUID = 1L;
    
    public SegmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "text");
    private static final javax.xml.namespace.QName COVERAGE$2 = 
        new javax.xml.namespace.QName("", "coverage");
    
    
    /**
     * Gets the "text" element
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text" element
     */
    public org.apache.xmlbeans.XmlString xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$0);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "text" element
     */
    public void xsetText(org.apache.xmlbeans.XmlString text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$0);
            }
            target.set(text);
        }
    }
    
    /**
     * Gets the "coverage" attribute
     */
    public java.lang.String getCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVERAGE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "coverage" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COVERAGE$2);
            return target;
        }
    }
    
    /**
     * True if has "coverage" attribute
     */
    public boolean isSetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COVERAGE$2) != null;
        }
    }
    
    /**
     * Sets the "coverage" attribute
     */
    public void setCoverage(java.lang.String coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COVERAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COVERAGE$2);
            }
            target.setStringValue(coverage);
        }
    }
    
    /**
     * Sets (as xml) the "coverage" attribute
     */
    public void xsetCoverage(org.apache.xmlbeans.XmlString coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COVERAGE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COVERAGE$2);
            }
            target.set(coverage);
        }
    }
    
    /**
     * Unsets the "coverage" attribute
     */
    public void unsetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COVERAGE$2);
        }
    }
}
