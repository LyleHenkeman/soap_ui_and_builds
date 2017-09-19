/*
 * XML Type:  WorkspaceProject
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WorkspaceProjectConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML WorkspaceProject(@http://eviware.com/soapui/config).
 *
 * This is an atomic type that is a restriction of com.eviware.soapui.config.WorkspaceProjectConfig.
 */
public class WorkspaceProjectConfigImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.eviware.soapui.config.WorkspaceProjectConfig
{
    private static final long serialVersionUID = 1L;
    
    public WorkspaceProjectConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected WorkspaceProjectConfigImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("", "status");
    private static final javax.xml.namespace.QName GROUP$4 = 
        new javax.xml.namespace.QName("", "group");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "type" attribute
     */
    public com.eviware.soapui.config.WorkspaceProjectConfig.Type.Enum getType()
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
            return (com.eviware.soapui.config.WorkspaceProjectConfig.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public com.eviware.soapui.config.WorkspaceProjectConfig.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceProjectConfig.Type target = null;
            target = (com.eviware.soapui.config.WorkspaceProjectConfig.Type)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(com.eviware.soapui.config.WorkspaceProjectConfig.Type.Enum type)
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
    public void xsetType(com.eviware.soapui.config.WorkspaceProjectConfig.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceProjectConfig.Type target = null;
            target = (com.eviware.soapui.config.WorkspaceProjectConfig.Type)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WorkspaceProjectConfig.Type)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
        }
    }
    
    /**
     * Gets the "status" attribute
     */
    public com.eviware.soapui.config.WorkspaceProjectConfig.Status.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.WorkspaceProjectConfig.Status.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" attribute
     */
    public com.eviware.soapui.config.WorkspaceProjectConfig.Status xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceProjectConfig.Status target = null;
            target = (com.eviware.soapui.config.WorkspaceProjectConfig.Status)get_store().find_attribute_user(STATUS$2);
            return target;
        }
    }
    
    /**
     * True if has "status" attribute
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STATUS$2) != null;
        }
    }
    
    /**
     * Sets the "status" attribute
     */
    public void setStatus(com.eviware.soapui.config.WorkspaceProjectConfig.Status.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$2);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" attribute
     */
    public void xsetStatus(com.eviware.soapui.config.WorkspaceProjectConfig.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceProjectConfig.Status target = null;
            target = (com.eviware.soapui.config.WorkspaceProjectConfig.Status)get_store().find_attribute_user(STATUS$2);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WorkspaceProjectConfig.Status)get_store().add_attribute_user(STATUS$2);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "status" attribute
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STATUS$2);
        }
    }
    
    /**
     * Gets the "group" attribute
     */
    public java.lang.String getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "group" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$4);
            return target;
        }
    }
    
    /**
     * True if has "group" attribute
     */
    public boolean isSetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GROUP$4) != null;
        }
    }
    
    /**
     * Sets the "group" attribute
     */
    public void setGroup(java.lang.String group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUP$4);
            }
            target.setStringValue(group);
        }
    }
    
    /**
     * Sets (as xml) the "group" attribute
     */
    public void xsetGroup(org.apache.xmlbeans.XmlString group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUP$4);
            }
            target.set(group);
        }
    }
    
    /**
     * Unsets the "group" attribute
     */
    public void unsetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GROUP$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
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
            return get_store().find_attribute_user(NAME$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
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
            get_store().remove_attribute(NAME$6);
        }
    }
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.config.WorkspaceProjectConfig$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.eviware.soapui.config.WorkspaceProjectConfig.Type
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
    /**
     * An XML status(@).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.config.WorkspaceProjectConfig$Status.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.eviware.soapui.config.WorkspaceProjectConfig.Status
    {
        private static final long serialVersionUID = 1L;
        
        public StatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
