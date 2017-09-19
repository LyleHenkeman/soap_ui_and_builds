/*
 * XML Type:  logFile
 * Namespace: http://www.ws-i.org/testing/2003/03/analyzerConfig/
 * Java type: org.wsI.testing.x2003.x03.analyzerConfig.LogFile
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.analyzerConfig.impl;
/**
 * An XML logFile(@http://www.ws-i.org/testing/2003/03/analyzerConfig/).
 *
 * This is an atomic type that is a restriction of org.wsI.testing.x2003.x03.analyzerConfig.LogFile.
 */
public class LogFileImpl extends org.apache.xmlbeans.impl.values.JavaUriHolderEx implements org.wsI.testing.x2003.x03.analyzerConfig.LogFile
{
    private static final long serialVersionUID = 1L;
    
    public LogFileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected LogFileImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONTYPE$0 = 
        new javax.xml.namespace.QName("", "correlationType");
    
    
    /**
     * Gets the "correlationType" attribute
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType.Enum getCorrelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CORRELATIONTYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "correlationType" attribute
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType xgetCorrelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType)get_store().find_attribute_user(CORRELATIONTYPE$0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType)get_default_attribute_value(CORRELATIONTYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "correlationType" attribute
     */
    public boolean isSetCorrelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CORRELATIONTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "correlationType" attribute
     */
    public void setCorrelationType(org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType.Enum correlationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CORRELATIONTYPE$0);
            }
            target.setEnumValue(correlationType);
        }
    }
    
    /**
     * Sets (as xml) the "correlationType" attribute
     */
    public void xsetCorrelationType(org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType correlationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType)get_store().find_attribute_user(CORRELATIONTYPE$0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType)get_store().add_attribute_user(CORRELATIONTYPE$0);
            }
            target.set(correlationType);
        }
    }
    
    /**
     * Unsets the "correlationType" attribute
     */
    public void unsetCorrelationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CORRELATIONTYPE$0);
        }
    }
    /**
     * An XML correlationType(@).
     *
     * This is an atomic type that is a restriction of org.wsI.testing.x2003.x03.analyzerConfig.LogFile$CorrelationType.
     */
    public static class CorrelationTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.wsI.testing.x2003.x03.analyzerConfig.LogFile.CorrelationType
    {
        private static final long serialVersionUID = 1L;
        
        public CorrelationTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CorrelationTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
