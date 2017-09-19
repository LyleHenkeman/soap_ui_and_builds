/*
 * XML Type:  WsdlInterface
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WsdlInterfaceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML WsdlInterface(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class WsdlInterfaceConfigImpl extends com.eviware.soapui.config.impl.InterfaceConfigImpl implements com.eviware.soapui.config.WsdlInterfaceConfig
{
    private static final long serialVersionUID = 1L;
    
    public WsdlInterfaceConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATION$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "operation");
    private static final javax.xml.namespace.QName DEFINITION$2 = 
        new javax.xml.namespace.QName("", "definition");
    private static final javax.xml.namespace.QName BINDINGNAME$4 = 
        new javax.xml.namespace.QName("", "bindingName");
    private static final javax.xml.namespace.QName SOAPVERSION$6 = 
        new javax.xml.namespace.QName("", "soapVersion");
    private static final javax.xml.namespace.QName WSAVERSION$8 = 
        new javax.xml.namespace.QName("", "wsaVersion");
    private static final javax.xml.namespace.QName ANONYMOUS$10 = 
        new javax.xml.namespace.QName("", "anonymous");
    
    
    /**
     * Gets a List of "operation" elements
     */
    public java.util.List<com.eviware.soapui.config.OperationConfig> getOperationList()
    {
        final class OperationList extends java.util.AbstractList<com.eviware.soapui.config.OperationConfig>
        {
            public com.eviware.soapui.config.OperationConfig get(int i)
                { return WsdlInterfaceConfigImpl.this.getOperationArray(i); }
            
            public com.eviware.soapui.config.OperationConfig set(int i, com.eviware.soapui.config.OperationConfig o)
            {
                com.eviware.soapui.config.OperationConfig old = WsdlInterfaceConfigImpl.this.getOperationArray(i);
                WsdlInterfaceConfigImpl.this.setOperationArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.OperationConfig o)
                { WsdlInterfaceConfigImpl.this.insertNewOperation(i).set(o); }
            
            public com.eviware.soapui.config.OperationConfig remove(int i)
            {
                com.eviware.soapui.config.OperationConfig old = WsdlInterfaceConfigImpl.this.getOperationArray(i);
                WsdlInterfaceConfigImpl.this.removeOperation(i);
                return old;
            }
            
            public int size()
                { return WsdlInterfaceConfigImpl.this.sizeOfOperationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OperationList();
        }
    }
    
    /**
     * Gets array of all "operation" elements
     * @deprecated
     */
    public com.eviware.soapui.config.OperationConfig[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.OperationConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.OperationConfig>();
            get_store().find_all_element_users(OPERATION$0, targetList);
            com.eviware.soapui.config.OperationConfig[] result = new com.eviware.soapui.config.OperationConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operation" element
     */
    public com.eviware.soapui.config.OperationConfig getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationConfig target = null;
            target = (com.eviware.soapui.config.OperationConfig)get_store().find_element_user(OPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "operation" element
     */
    public int sizeOfOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$0);
        }
    }
    
    /**
     * Sets array of all "operation" element
     */
    public void setOperationArray(com.eviware.soapui.config.OperationConfig[] operationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operationArray, OPERATION$0);
        }
    }
    
    /**
     * Sets ith "operation" element
     */
    public void setOperationArray(int i, com.eviware.soapui.config.OperationConfig operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationConfig target = null;
            target = (com.eviware.soapui.config.OperationConfig)get_store().find_element_user(OPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    public com.eviware.soapui.config.OperationConfig insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationConfig target = null;
            target = (com.eviware.soapui.config.OperationConfig)get_store().insert_element_user(OPERATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    public com.eviware.soapui.config.OperationConfig addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationConfig target = null;
            target = (com.eviware.soapui.config.OperationConfig)get_store().add_element_user(OPERATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "operation" element
     */
    public void removeOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$0, i);
        }
    }
    
    /**
     * Gets the "definition" attribute
     */
    public java.lang.String getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITION$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "definition" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFINITION$2);
            return target;
        }
    }
    
    /**
     * True if has "definition" attribute
     */
    public boolean isSetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFINITION$2) != null;
        }
    }
    
    /**
     * Sets the "definition" attribute
     */
    public void setDefinition(java.lang.String definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFINITION$2);
            }
            target.setStringValue(definition);
        }
    }
    
    /**
     * Sets (as xml) the "definition" attribute
     */
    public void xsetDefinition(org.apache.xmlbeans.XmlString definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFINITION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFINITION$2);
            }
            target.set(definition);
        }
    }
    
    /**
     * Unsets the "definition" attribute
     */
    public void unsetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFINITION$2);
        }
    }
    
    /**
     * Gets the "bindingName" attribute
     */
    public java.lang.String getBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDINGNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bindingName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BINDINGNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "bindingName" attribute
     */
    public boolean isSetBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BINDINGNAME$4) != null;
        }
    }
    
    /**
     * Sets the "bindingName" attribute
     */
    public void setBindingName(java.lang.String bindingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDINGNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BINDINGNAME$4);
            }
            target.setStringValue(bindingName);
        }
    }
    
    /**
     * Sets (as xml) the "bindingName" attribute
     */
    public void xsetBindingName(org.apache.xmlbeans.XmlString bindingName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BINDINGNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BINDINGNAME$4);
            }
            target.set(bindingName);
        }
    }
    
    /**
     * Unsets the "bindingName" attribute
     */
    public void unsetBindingName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BINDINGNAME$4);
        }
    }
    
    /**
     * Gets the "soapVersion" attribute
     */
    public com.eviware.soapui.config.SoapVersionTypesConfig.Enum getSoapVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPVERSION$6);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.SoapVersionTypesConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "soapVersion" attribute
     */
    public com.eviware.soapui.config.SoapVersionTypesConfig xgetSoapVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapVersionTypesConfig target = null;
            target = (com.eviware.soapui.config.SoapVersionTypesConfig)get_store().find_attribute_user(SOAPVERSION$6);
            return target;
        }
    }
    
    /**
     * True if has "soapVersion" attribute
     */
    public boolean isSetSoapVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOAPVERSION$6) != null;
        }
    }
    
    /**
     * Sets the "soapVersion" attribute
     */
    public void setSoapVersion(com.eviware.soapui.config.SoapVersionTypesConfig.Enum soapVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPVERSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOAPVERSION$6);
            }
            target.setEnumValue(soapVersion);
        }
    }
    
    /**
     * Sets (as xml) the "soapVersion" attribute
     */
    public void xsetSoapVersion(com.eviware.soapui.config.SoapVersionTypesConfig soapVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapVersionTypesConfig target = null;
            target = (com.eviware.soapui.config.SoapVersionTypesConfig)get_store().find_attribute_user(SOAPVERSION$6);
            if (target == null)
            {
                target = (com.eviware.soapui.config.SoapVersionTypesConfig)get_store().add_attribute_user(SOAPVERSION$6);
            }
            target.set(soapVersion);
        }
    }
    
    /**
     * Unsets the "soapVersion" attribute
     */
    public void unsetSoapVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOAPVERSION$6);
        }
    }
    
    /**
     * Gets the "wsaVersion" attribute
     */
    public com.eviware.soapui.config.WsaVersionTypeConfig.Enum getWsaVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSAVERSION$8);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.WsaVersionTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "wsaVersion" attribute
     */
    public com.eviware.soapui.config.WsaVersionTypeConfig xgetWsaVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsaVersionTypeConfig target = null;
            target = (com.eviware.soapui.config.WsaVersionTypeConfig)get_store().find_attribute_user(WSAVERSION$8);
            return target;
        }
    }
    
    /**
     * True if has "wsaVersion" attribute
     */
    public boolean isSetWsaVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WSAVERSION$8) != null;
        }
    }
    
    /**
     * Sets the "wsaVersion" attribute
     */
    public void setWsaVersion(com.eviware.soapui.config.WsaVersionTypeConfig.Enum wsaVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSAVERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WSAVERSION$8);
            }
            target.setEnumValue(wsaVersion);
        }
    }
    
    /**
     * Sets (as xml) the "wsaVersion" attribute
     */
    public void xsetWsaVersion(com.eviware.soapui.config.WsaVersionTypeConfig wsaVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsaVersionTypeConfig target = null;
            target = (com.eviware.soapui.config.WsaVersionTypeConfig)get_store().find_attribute_user(WSAVERSION$8);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WsaVersionTypeConfig)get_store().add_attribute_user(WSAVERSION$8);
            }
            target.set(wsaVersion);
        }
    }
    
    /**
     * Unsets the "wsaVersion" attribute
     */
    public void unsetWsaVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WSAVERSION$8);
        }
    }
    
    /**
     * Gets the "anonymous" attribute
     */
    public com.eviware.soapui.config.AnonymousTypeConfig.Enum getAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANONYMOUS$10);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.AnonymousTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "anonymous" attribute
     */
    public com.eviware.soapui.config.AnonymousTypeConfig xgetAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AnonymousTypeConfig target = null;
            target = (com.eviware.soapui.config.AnonymousTypeConfig)get_store().find_attribute_user(ANONYMOUS$10);
            return target;
        }
    }
    
    /**
     * True if has "anonymous" attribute
     */
    public boolean isSetAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANONYMOUS$10) != null;
        }
    }
    
    /**
     * Sets the "anonymous" attribute
     */
    public void setAnonymous(com.eviware.soapui.config.AnonymousTypeConfig.Enum anonymous)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANONYMOUS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANONYMOUS$10);
            }
            target.setEnumValue(anonymous);
        }
    }
    
    /**
     * Sets (as xml) the "anonymous" attribute
     */
    public void xsetAnonymous(com.eviware.soapui.config.AnonymousTypeConfig anonymous)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AnonymousTypeConfig target = null;
            target = (com.eviware.soapui.config.AnonymousTypeConfig)get_store().find_attribute_user(ANONYMOUS$10);
            if (target == null)
            {
                target = (com.eviware.soapui.config.AnonymousTypeConfig)get_store().add_attribute_user(ANONYMOUS$10);
            }
            target.set(anonymous);
        }
    }
    
    /**
     * Unsets the "anonymous" attribute
     */
    public void unsetAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANONYMOUS$10);
        }
    }
}
