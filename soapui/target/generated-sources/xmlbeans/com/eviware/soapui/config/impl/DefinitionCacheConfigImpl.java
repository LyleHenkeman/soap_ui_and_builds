/*
 * XML Type:  DefinitionCache
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DefinitionCacheConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML DefinitionCache(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class DefinitionCacheConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.DefinitionCacheConfig
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionCacheConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PART$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "part");
    private static final javax.xml.namespace.QName ROOTPART$2 = 
        new javax.xml.namespace.QName("", "rootPart");
    private static final javax.xml.namespace.QName CACHETIME$4 = 
        new javax.xml.namespace.QName("", "cacheTime");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets a List of "part" elements
     */
    public java.util.List<com.eviware.soapui.config.DefintionPartConfig> getPartList()
    {
        final class PartList extends java.util.AbstractList<com.eviware.soapui.config.DefintionPartConfig>
        {
            public com.eviware.soapui.config.DefintionPartConfig get(int i)
                { return DefinitionCacheConfigImpl.this.getPartArray(i); }
            
            public com.eviware.soapui.config.DefintionPartConfig set(int i, com.eviware.soapui.config.DefintionPartConfig o)
            {
                com.eviware.soapui.config.DefintionPartConfig old = DefinitionCacheConfigImpl.this.getPartArray(i);
                DefinitionCacheConfigImpl.this.setPartArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.DefintionPartConfig o)
                { DefinitionCacheConfigImpl.this.insertNewPart(i).set(o); }
            
            public com.eviware.soapui.config.DefintionPartConfig remove(int i)
            {
                com.eviware.soapui.config.DefintionPartConfig old = DefinitionCacheConfigImpl.this.getPartArray(i);
                DefinitionCacheConfigImpl.this.removePart(i);
                return old;
            }
            
            public int size()
                { return DefinitionCacheConfigImpl.this.sizeOfPartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PartList();
        }
    }
    
    /**
     * Gets array of all "part" elements
     * @deprecated
     */
    public com.eviware.soapui.config.DefintionPartConfig[] getPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.DefintionPartConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.DefintionPartConfig>();
            get_store().find_all_element_users(PART$0, targetList);
            com.eviware.soapui.config.DefintionPartConfig[] result = new com.eviware.soapui.config.DefintionPartConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "part" element
     */
    public com.eviware.soapui.config.DefintionPartConfig getPartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DefintionPartConfig target = null;
            target = (com.eviware.soapui.config.DefintionPartConfig)get_store().find_element_user(PART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "part" element
     */
    public int sizeOfPartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PART$0);
        }
    }
    
    /**
     * Sets array of all "part" element
     */
    public void setPartArray(com.eviware.soapui.config.DefintionPartConfig[] partArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(partArray, PART$0);
        }
    }
    
    /**
     * Sets ith "part" element
     */
    public void setPartArray(int i, com.eviware.soapui.config.DefintionPartConfig part)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DefintionPartConfig target = null;
            target = (com.eviware.soapui.config.DefintionPartConfig)get_store().find_element_user(PART$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(part);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "part" element
     */
    public com.eviware.soapui.config.DefintionPartConfig insertNewPart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DefintionPartConfig target = null;
            target = (com.eviware.soapui.config.DefintionPartConfig)get_store().insert_element_user(PART$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "part" element
     */
    public com.eviware.soapui.config.DefintionPartConfig addNewPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DefintionPartConfig target = null;
            target = (com.eviware.soapui.config.DefintionPartConfig)get_store().add_element_user(PART$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "part" element
     */
    public void removePart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PART$0, i);
        }
    }
    
    /**
     * Gets the "rootPart" attribute
     */
    public java.lang.String getRootPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTPART$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rootPart" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRootPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTPART$2);
            return target;
        }
    }
    
    /**
     * True if has "rootPart" attribute
     */
    public boolean isSetRootPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROOTPART$2) != null;
        }
    }
    
    /**
     * Sets the "rootPart" attribute
     */
    public void setRootPart(java.lang.String rootPart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOTPART$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOTPART$2);
            }
            target.setStringValue(rootPart);
        }
    }
    
    /**
     * Sets (as xml) the "rootPart" attribute
     */
    public void xsetRootPart(org.apache.xmlbeans.XmlString rootPart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROOTPART$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROOTPART$2);
            }
            target.set(rootPart);
        }
    }
    
    /**
     * Unsets the "rootPart" attribute
     */
    public void unsetRootPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROOTPART$2);
        }
    }
    
    /**
     * Gets the "cacheTime" attribute
     */
    public java.util.Calendar getCacheTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHETIME$4);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "cacheTime" attribute
     */
    public org.apache.xmlbeans.XmlDateTime xgetCacheTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CACHETIME$4);
            return target;
        }
    }
    
    /**
     * True if has "cacheTime" attribute
     */
    public boolean isSetCacheTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CACHETIME$4) != null;
        }
    }
    
    /**
     * Sets the "cacheTime" attribute
     */
    public void setCacheTime(java.util.Calendar cacheTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHETIME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHETIME$4);
            }
            target.setCalendarValue(cacheTime);
        }
    }
    
    /**
     * Sets (as xml) the "cacheTime" attribute
     */
    public void xsetCacheTime(org.apache.xmlbeans.XmlDateTime cacheTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(CACHETIME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(CACHETIME$4);
            }
            target.set(cacheTime);
        }
    }
    
    /**
     * Unsets the "cacheTime" attribute
     */
    public void unsetCacheTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CACHETIME$4);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public com.eviware.soapui.config.DefinitionCacheTypeConfig.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.DefinitionCacheTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public com.eviware.soapui.config.DefinitionCacheTypeConfig xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DefinitionCacheTypeConfig target = null;
            target = (com.eviware.soapui.config.DefinitionCacheTypeConfig)get_store().find_attribute_user(TYPE$6);
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
            return get_store().find_attribute_user(TYPE$6) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(com.eviware.soapui.config.DefinitionCacheTypeConfig.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(com.eviware.soapui.config.DefinitionCacheTypeConfig type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DefinitionCacheTypeConfig target = null;
            target = (com.eviware.soapui.config.DefinitionCacheTypeConfig)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (com.eviware.soapui.config.DefinitionCacheTypeConfig)get_store().add_attribute_user(TYPE$6);
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
            get_store().remove_attribute(TYPE$6);
        }
    }
}
