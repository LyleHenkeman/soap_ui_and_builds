/*
 * XML Type:  uddiKey
 * Namespace: http://www.ws-i.org/testing/2003/03/analyzerConfig/
 * Java type: org.wsI.testing.x2003.x03.analyzerConfig.UddiKey
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.analyzerConfig.impl;
/**
 * An XML uddiKey(@http://www.ws-i.org/testing/2003/03/analyzerConfig/).
 *
 * This is an atomic type that is a restriction of org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.
 */
public class UddiKeyImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.wsI.testing.x2003.x03.analyzerConfig.UddiKey
{
    private static final long serialVersionUID = 1L;
    
    public UddiKeyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected UddiKeyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "type" attribute
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type target = null;
            target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.wsI.testing.x2003.x03.analyzerConfig.UddiKey$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.wsI.testing.x2003.x03.analyzerConfig.UddiKey.Type
    {
        private static final long serialVersionUID = 1L;
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
