/*
 * XML Type:  ManualTestStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ManualTestStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML ManualTestStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class ManualTestStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.ManualTestStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public ManualTestStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPECTEDRESULT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "expectedResult");
    
    
    /**
     * Gets the "expectedResult" element
     */
    public java.lang.String getExpectedResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expectedResult" element
     */
    public org.apache.xmlbeans.XmlString xgetExpectedResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPECTEDRESULT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "expectedResult" element
     */
    public void setExpectedResult(java.lang.String expectedResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPECTEDRESULT$0);
            }
            target.setStringValue(expectedResult);
        }
    }
    
    /**
     * Sets (as xml) the "expectedResult" element
     */
    public void xsetExpectedResult(org.apache.xmlbeans.XmlString expectedResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPECTEDRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPECTEDRESULT$0);
            }
            target.set(expectedResult);
        }
    }
}
