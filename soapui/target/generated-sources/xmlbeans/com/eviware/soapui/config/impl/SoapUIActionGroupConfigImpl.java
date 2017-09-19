/*
 * XML Type:  SoapUIActionGroup
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapUIActionGroupConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SoapUIActionGroup(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SoapUIActionGroupConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapUIActionGroupConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapUIActionGroupConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIONMAPPING$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "actionMapping");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName CLASS1$6 = 
        new javax.xml.namespace.QName("", "class");
    private static final javax.xml.namespace.QName DEFAULT$8 = 
        new javax.xml.namespace.QName("", "default");
    
    
    /**
     * Gets a List of "actionMapping" elements
     */
    public java.util.List<com.eviware.soapui.config.SoapUIActionMappingConfig> getActionMappingList()
    {
        final class ActionMappingList extends java.util.AbstractList<com.eviware.soapui.config.SoapUIActionMappingConfig>
        {
            public com.eviware.soapui.config.SoapUIActionMappingConfig get(int i)
                { return SoapUIActionGroupConfigImpl.this.getActionMappingArray(i); }
            
            public com.eviware.soapui.config.SoapUIActionMappingConfig set(int i, com.eviware.soapui.config.SoapUIActionMappingConfig o)
            {
                com.eviware.soapui.config.SoapUIActionMappingConfig old = SoapUIActionGroupConfigImpl.this.getActionMappingArray(i);
                SoapUIActionGroupConfigImpl.this.setActionMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.SoapUIActionMappingConfig o)
                { SoapUIActionGroupConfigImpl.this.insertNewActionMapping(i).set(o); }
            
            public com.eviware.soapui.config.SoapUIActionMappingConfig remove(int i)
            {
                com.eviware.soapui.config.SoapUIActionMappingConfig old = SoapUIActionGroupConfigImpl.this.getActionMappingArray(i);
                SoapUIActionGroupConfigImpl.this.removeActionMapping(i);
                return old;
            }
            
            public int size()
                { return SoapUIActionGroupConfigImpl.this.sizeOfActionMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ActionMappingList();
        }
    }
    
    /**
     * Gets array of all "actionMapping" elements
     * @deprecated
     */
    public com.eviware.soapui.config.SoapUIActionMappingConfig[] getActionMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.SoapUIActionMappingConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.SoapUIActionMappingConfig>();
            get_store().find_all_element_users(ACTIONMAPPING$0, targetList);
            com.eviware.soapui.config.SoapUIActionMappingConfig[] result = new com.eviware.soapui.config.SoapUIActionMappingConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "actionMapping" element
     */
    public com.eviware.soapui.config.SoapUIActionMappingConfig getActionMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionMappingConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionMappingConfig)get_store().find_element_user(ACTIONMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "actionMapping" element
     */
    public int sizeOfActionMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIONMAPPING$0);
        }
    }
    
    /**
     * Sets array of all "actionMapping" element
     */
    public void setActionMappingArray(com.eviware.soapui.config.SoapUIActionMappingConfig[] actionMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(actionMappingArray, ACTIONMAPPING$0);
        }
    }
    
    /**
     * Sets ith "actionMapping" element
     */
    public void setActionMappingArray(int i, com.eviware.soapui.config.SoapUIActionMappingConfig actionMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionMappingConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionMappingConfig)get_store().find_element_user(ACTIONMAPPING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(actionMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actionMapping" element
     */
    public com.eviware.soapui.config.SoapUIActionMappingConfig insertNewActionMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionMappingConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionMappingConfig)get_store().insert_element_user(ACTIONMAPPING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actionMapping" element
     */
    public com.eviware.soapui.config.SoapUIActionMappingConfig addNewActionMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SoapUIActionMappingConfig target = null;
            target = (com.eviware.soapui.config.SoapUIActionMappingConfig)get_store().add_element_user(ACTIONMAPPING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "actionMapping" element
     */
    public void removeActionMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIONMAPPING$0, i);
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
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
    
    /**
     * Gets the "class" attribute
     */
    public java.lang.String getClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "class" attribute
     */
    public org.apache.xmlbeans.XmlString xgetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$6);
            return target;
        }
    }
    
    /**
     * True if has "class" attribute
     */
    public boolean isSetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASS1$6) != null;
        }
    }
    
    /**
     * Sets the "class" attribute
     */
    public void setClass1(java.lang.String class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$6);
            }
            target.setStringValue(class1);
        }
    }
    
    /**
     * Sets (as xml) the "class" attribute
     */
    public void xsetClass1(org.apache.xmlbeans.XmlString class1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$6);
            }
            target.set(class1);
        }
    }
    
    /**
     * Unsets the "class" attribute
     */
    public void unsetClass1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASS1$6);
        }
    }
    
    /**
     * Gets the "default" attribute
     */
    public java.lang.String getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "default" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$8);
            return target;
        }
    }
    
    /**
     * True if has "default" attribute
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULT$8) != null;
        }
    }
    
    /**
     * Sets the "default" attribute
     */
    public void setDefault(java.lang.String xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$8);
            }
            target.setStringValue(xdefault);
        }
    }
    
    /**
     * Sets (as xml) the "default" attribute
     */
    public void xsetDefault(org.apache.xmlbeans.XmlString xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$8);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Unsets the "default" attribute
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULT$8);
        }
    }
}
