/*
 * XML Type:  MaliciousAttachmentSecurityScan
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MaliciousAttachmentSecurityScanConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MaliciousAttachmentSecurityScan(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MaliciousAttachmentSecurityScanConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MaliciousAttachmentSecurityScanConfig
{
    private static final long serialVersionUID = 1L;
    
    public MaliciousAttachmentSecurityScanConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELEMENT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "element");
    private static final javax.xml.namespace.QName REQUESTTIMEOUT$2 = 
        new javax.xml.namespace.QName("", "requestTimeout");
    
    
    /**
     * Gets a List of "element" elements
     */
    public java.util.List<com.eviware.soapui.config.MaliciousAttachmentElementConfig> getElementList()
    {
        final class ElementList extends java.util.AbstractList<com.eviware.soapui.config.MaliciousAttachmentElementConfig>
        {
            public com.eviware.soapui.config.MaliciousAttachmentElementConfig get(int i)
                { return MaliciousAttachmentSecurityScanConfigImpl.this.getElementArray(i); }
            
            public com.eviware.soapui.config.MaliciousAttachmentElementConfig set(int i, com.eviware.soapui.config.MaliciousAttachmentElementConfig o)
            {
                com.eviware.soapui.config.MaliciousAttachmentElementConfig old = MaliciousAttachmentSecurityScanConfigImpl.this.getElementArray(i);
                MaliciousAttachmentSecurityScanConfigImpl.this.setElementArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.MaliciousAttachmentElementConfig o)
                { MaliciousAttachmentSecurityScanConfigImpl.this.insertNewElement(i).set(o); }
            
            public com.eviware.soapui.config.MaliciousAttachmentElementConfig remove(int i)
            {
                com.eviware.soapui.config.MaliciousAttachmentElementConfig old = MaliciousAttachmentSecurityScanConfigImpl.this.getElementArray(i);
                MaliciousAttachmentSecurityScanConfigImpl.this.removeElement(i);
                return old;
            }
            
            public int size()
                { return MaliciousAttachmentSecurityScanConfigImpl.this.sizeOfElementArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ElementList();
        }
    }
    
    /**
     * Gets array of all "element" elements
     * @deprecated
     */
    public com.eviware.soapui.config.MaliciousAttachmentElementConfig[] getElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.MaliciousAttachmentElementConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.MaliciousAttachmentElementConfig>();
            get_store().find_all_element_users(ELEMENT$0, targetList);
            com.eviware.soapui.config.MaliciousAttachmentElementConfig[] result = new com.eviware.soapui.config.MaliciousAttachmentElementConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "element" element
     */
    public com.eviware.soapui.config.MaliciousAttachmentElementConfig getElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentElementConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentElementConfig)get_store().find_element_user(ELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "element" element
     */
    public int sizeOfElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEMENT$0);
        }
    }
    
    /**
     * Sets array of all "element" element
     */
    public void setElementArray(com.eviware.soapui.config.MaliciousAttachmentElementConfig[] elementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(elementArray, ELEMENT$0);
        }
    }
    
    /**
     * Sets ith "element" element
     */
    public void setElementArray(int i, com.eviware.soapui.config.MaliciousAttachmentElementConfig element)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentElementConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentElementConfig)get_store().find_element_user(ELEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(element);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "element" element
     */
    public com.eviware.soapui.config.MaliciousAttachmentElementConfig insertNewElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentElementConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentElementConfig)get_store().insert_element_user(ELEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "element" element
     */
    public com.eviware.soapui.config.MaliciousAttachmentElementConfig addNewElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MaliciousAttachmentElementConfig target = null;
            target = (com.eviware.soapui.config.MaliciousAttachmentElementConfig)get_store().add_element_user(ELEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "element" element
     */
    public void removeElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEMENT$0, i);
        }
    }
    
    /**
     * Gets the "requestTimeout" attribute
     */
    public int getRequestTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTTIMEOUT$2);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestTimeout" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetRequestTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(REQUESTTIMEOUT$2);
            return target;
        }
    }
    
    /**
     * True if has "requestTimeout" attribute
     */
    public boolean isSetRequestTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REQUESTTIMEOUT$2) != null;
        }
    }
    
    /**
     * Sets the "requestTimeout" attribute
     */
    public void setRequestTimeout(int requestTimeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTTIMEOUT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTTIMEOUT$2);
            }
            target.setIntValue(requestTimeout);
        }
    }
    
    /**
     * Sets (as xml) the "requestTimeout" attribute
     */
    public void xsetRequestTimeout(org.apache.xmlbeans.XmlInt requestTimeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(REQUESTTIMEOUT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(REQUESTTIMEOUT$2);
            }
            target.set(requestTimeout);
        }
    }
    
    /**
     * Unsets the "requestTimeout" attribute
     */
    public void unsetRequestTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REQUESTTIMEOUT$2);
        }
    }
}
