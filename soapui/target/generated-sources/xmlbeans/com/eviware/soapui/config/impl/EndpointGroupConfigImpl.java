/*
 * XML Type:  EndpointGroup
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.EndpointGroupConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML EndpointGroup(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class EndpointGroupConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.EndpointGroupConfig
{
    private static final long serialVersionUID = 1L;
    
    public EndpointGroupConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "endpoint");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets a List of "endpoint" elements
     */
    public java.util.List<com.eviware.soapui.config.EndpointGroupEndpointConfig> getEndpointList()
    {
        final class EndpointList extends java.util.AbstractList<com.eviware.soapui.config.EndpointGroupEndpointConfig>
        {
            public com.eviware.soapui.config.EndpointGroupEndpointConfig get(int i)
                { return EndpointGroupConfigImpl.this.getEndpointArray(i); }
            
            public com.eviware.soapui.config.EndpointGroupEndpointConfig set(int i, com.eviware.soapui.config.EndpointGroupEndpointConfig o)
            {
                com.eviware.soapui.config.EndpointGroupEndpointConfig old = EndpointGroupConfigImpl.this.getEndpointArray(i);
                EndpointGroupConfigImpl.this.setEndpointArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.EndpointGroupEndpointConfig o)
                { EndpointGroupConfigImpl.this.insertNewEndpoint(i).set(o); }
            
            public com.eviware.soapui.config.EndpointGroupEndpointConfig remove(int i)
            {
                com.eviware.soapui.config.EndpointGroupEndpointConfig old = EndpointGroupConfigImpl.this.getEndpointArray(i);
                EndpointGroupConfigImpl.this.removeEndpoint(i);
                return old;
            }
            
            public int size()
                { return EndpointGroupConfigImpl.this.sizeOfEndpointArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EndpointList();
        }
    }
    
    /**
     * Gets array of all "endpoint" elements
     * @deprecated
     */
    public com.eviware.soapui.config.EndpointGroupEndpointConfig[] getEndpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.EndpointGroupEndpointConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.EndpointGroupEndpointConfig>();
            get_store().find_all_element_users(ENDPOINT$0, targetList);
            com.eviware.soapui.config.EndpointGroupEndpointConfig[] result = new com.eviware.soapui.config.EndpointGroupEndpointConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "endpoint" element
     */
    public com.eviware.soapui.config.EndpointGroupEndpointConfig getEndpointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointGroupEndpointConfig target = null;
            target = (com.eviware.soapui.config.EndpointGroupEndpointConfig)get_store().find_element_user(ENDPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "endpoint" element
     */
    public int sizeOfEndpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINT$0);
        }
    }
    
    /**
     * Sets array of all "endpoint" element
     */
    public void setEndpointArray(com.eviware.soapui.config.EndpointGroupEndpointConfig[] endpointArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endpointArray, ENDPOINT$0);
        }
    }
    
    /**
     * Sets ith "endpoint" element
     */
    public void setEndpointArray(int i, com.eviware.soapui.config.EndpointGroupEndpointConfig endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointGroupEndpointConfig target = null;
            target = (com.eviware.soapui.config.EndpointGroupEndpointConfig)get_store().find_element_user(ENDPOINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(endpoint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endpoint" element
     */
    public com.eviware.soapui.config.EndpointGroupEndpointConfig insertNewEndpoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointGroupEndpointConfig target = null;
            target = (com.eviware.soapui.config.EndpointGroupEndpointConfig)get_store().insert_element_user(ENDPOINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endpoint" element
     */
    public com.eviware.soapui.config.EndpointGroupEndpointConfig addNewEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointGroupEndpointConfig target = null;
            target = (com.eviware.soapui.config.EndpointGroupEndpointConfig)get_store().add_element_user(ENDPOINT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "endpoint" element
     */
    public void removeEndpoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINT$0, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$2) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$2);
        }
    }
}
