/*
 * XML Type:  DataSourceStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DataSourceStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML DataSourceStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class DataSourceStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.DataSourceStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public DataSourceStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASOURCE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "dataSource");
    private static final javax.xml.namespace.QName SHARED$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "shared");
    private static final javax.xml.namespace.QName RESTARTSHARED$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "restartShared");
    private static final javax.xml.namespace.QName PRELOAD$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "preload");
    private static final javax.xml.namespace.QName PROPERTY$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "property");
    private static final javax.xml.namespace.QName STARTROW$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "startRow");
    private static final javax.xml.namespace.QName ENDROW$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "endRow");
    private static final javax.xml.namespace.QName FAILONEMPTY$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "failOnEmpty");
    private static final javax.xml.namespace.QName GOTOLOOPONEMPTY$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "gotoLoopOnEmpty");
    private static final javax.xml.namespace.QName TRIMVALUES$18 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "trimValues");
    private static final javax.xml.namespace.QName ENTITIZEVALUES$20 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "entitizeValues");
    private static final javax.xml.namespace.QName RESTARTONRUN$22 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "restartOnRun");
    private static final javax.xml.namespace.QName EXPANDPROPERTIES$24 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "expandProperties");
    
    
    /**
     * Gets the "dataSource" element
     */
    public com.eviware.soapui.config.DataSourceConfig getDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataSourceConfig target = null;
            target = (com.eviware.soapui.config.DataSourceConfig)get_store().find_element_user(DATASOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataSource" element
     */
    public void setDataSource(com.eviware.soapui.config.DataSourceConfig dataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataSourceConfig target = null;
            target = (com.eviware.soapui.config.DataSourceConfig)get_store().find_element_user(DATASOURCE$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.DataSourceConfig)get_store().add_element_user(DATASOURCE$0);
            }
            target.set(dataSource);
        }
    }
    
    /**
     * Appends and returns a new empty "dataSource" element
     */
    public com.eviware.soapui.config.DataSourceConfig addNewDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.DataSourceConfig target = null;
            target = (com.eviware.soapui.config.DataSourceConfig)get_store().add_element_user(DATASOURCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "shared" element
     */
    public boolean getShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHARED$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "shared" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHARED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "shared" element
     */
    public void setShared(boolean shared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHARED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHARED$2);
            }
            target.setBooleanValue(shared);
        }
    }
    
    /**
     * Sets (as xml) the "shared" element
     */
    public void xsetShared(org.apache.xmlbeans.XmlBoolean shared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SHARED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SHARED$2);
            }
            target.set(shared);
        }
    }
    
    /**
     * Gets the "restartShared" element
     */
    public boolean getRestartShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTARTSHARED$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "restartShared" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRestartShared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESTARTSHARED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "restartShared" element
     */
    public void setRestartShared(boolean restartShared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTARTSHARED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESTARTSHARED$4);
            }
            target.setBooleanValue(restartShared);
        }
    }
    
    /**
     * Sets (as xml) the "restartShared" element
     */
    public void xsetRestartShared(org.apache.xmlbeans.XmlBoolean restartShared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESTARTSHARED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RESTARTSHARED$4);
            }
            target.set(restartShared);
        }
    }
    
    /**
     * Gets the "preload" element
     */
    public boolean getPreload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRELOAD$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preload" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRELOAD$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "preload" element
     */
    public void setPreload(boolean preload)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRELOAD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRELOAD$6);
            }
            target.setBooleanValue(preload);
        }
    }
    
    /**
     * Sets (as xml) the "preload" element
     */
    public void xsetPreload(org.apache.xmlbeans.XmlBoolean preload)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PRELOAD$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PRELOAD$6);
            }
            target.set(preload);
        }
    }
    
    /**
     * Gets a List of "property" elements
     */
    public java.util.List<java.lang.String> getPropertyList()
    {
        final class PropertyList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return DataSourceStepConfigImpl.this.getPropertyArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = DataSourceStepConfigImpl.this.getPropertyArray(i);
                DataSourceStepConfigImpl.this.setPropertyArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { DataSourceStepConfigImpl.this.insertProperty(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = DataSourceStepConfigImpl.this.getPropertyArray(i);
                DataSourceStepConfigImpl.this.removeProperty(i);
                return old;
            }
            
            public int size()
                { return DataSourceStepConfigImpl.this.sizeOfPropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PropertyList();
        }
    }
    
    /**
     * Gets array of all "property" elements
     * @deprecated
     */
    public java.lang.String[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(PROPERTY$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public java.lang.String getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "property" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetPropertyList()
    {
        final class PropertyList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return DataSourceStepConfigImpl.this.xgetPropertyArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = DataSourceStepConfigImpl.this.xgetPropertyArray(i);
                DataSourceStepConfigImpl.this.xsetPropertyArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { DataSourceStepConfigImpl.this.insertNewProperty(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = DataSourceStepConfigImpl.this.xgetPropertyArray(i);
                DataSourceStepConfigImpl.this.removeProperty(i);
                return old;
            }
            
            public int size()
                { return DataSourceStepConfigImpl.this.sizeOfPropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PropertyList();
        }
    }
    
    /**
     * Gets array of all "property" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(PROPERTY$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "property" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$8);
        }
    }
    
    /**
     * Sets array of all "property" element
     */
    public void setPropertyArray(java.lang.String[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$8);
        }
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, java.lang.String property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(property);
        }
    }
    
    /**
     * Sets (as xml) array of all "property" element
     */
    public void xsetPropertyArray(org.apache.xmlbeans.XmlString[]propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$8);
        }
    }
    
    /**
     * Sets (as xml) ith "property" element
     */
    public void xsetPropertyArray(int i, org.apache.xmlbeans.XmlString property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts the value as the ith "property" element
     */
    public void insertProperty(int i, java.lang.String property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTY$8, i);
            target.setStringValue(property);
        }
    }
    
    /**
     * Appends the value as the last "property" element
     */
    public void addProperty(java.lang.String property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY$8);
            target.setStringValue(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public org.apache.xmlbeans.XmlString insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.apache.xmlbeans.XmlString addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$8, i);
        }
    }
    
    /**
     * Gets the "startRow" element
     */
    public java.lang.String getStartRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTROW$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "startRow" element
     */
    public org.apache.xmlbeans.XmlString xgetStartRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTROW$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "startRow" element
     */
    public void setStartRow(java.lang.String startRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTROW$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTROW$10);
            }
            target.setStringValue(startRow);
        }
    }
    
    /**
     * Sets (as xml) the "startRow" element
     */
    public void xsetStartRow(org.apache.xmlbeans.XmlString startRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTROW$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTROW$10);
            }
            target.set(startRow);
        }
    }
    
    /**
     * Gets the "endRow" element
     */
    public java.lang.String getEndRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDROW$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "endRow" element
     */
    public org.apache.xmlbeans.XmlString xgetEndRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDROW$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "endRow" element
     */
    public void setEndRow(java.lang.String endRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDROW$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDROW$12);
            }
            target.setStringValue(endRow);
        }
    }
    
    /**
     * Sets (as xml) the "endRow" element
     */
    public void xsetEndRow(org.apache.xmlbeans.XmlString endRow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDROW$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDROW$12);
            }
            target.set(endRow);
        }
    }
    
    /**
     * Gets the "failOnEmpty" element
     */
    public boolean getFailOnEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAILONEMPTY$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "failOnEmpty" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetFailOnEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FAILONEMPTY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "failOnEmpty" element
     */
    public boolean isSetFailOnEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILONEMPTY$14) != 0;
        }
    }
    
    /**
     * Sets the "failOnEmpty" element
     */
    public void setFailOnEmpty(boolean failOnEmpty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAILONEMPTY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAILONEMPTY$14);
            }
            target.setBooleanValue(failOnEmpty);
        }
    }
    
    /**
     * Sets (as xml) the "failOnEmpty" element
     */
    public void xsetFailOnEmpty(org.apache.xmlbeans.XmlBoolean failOnEmpty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FAILONEMPTY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FAILONEMPTY$14);
            }
            target.set(failOnEmpty);
        }
    }
    
    /**
     * Unsets the "failOnEmpty" element
     */
    public void unsetFailOnEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILONEMPTY$14, 0);
        }
    }
    
    /**
     * Gets the "gotoLoopOnEmpty" element
     */
    public boolean getGotoLoopOnEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOTOLOOPONEMPTY$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "gotoLoopOnEmpty" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetGotoLoopOnEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(GOTOLOOPONEMPTY$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "gotoLoopOnEmpty" element
     */
    public void setGotoLoopOnEmpty(boolean gotoLoopOnEmpty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GOTOLOOPONEMPTY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GOTOLOOPONEMPTY$16);
            }
            target.setBooleanValue(gotoLoopOnEmpty);
        }
    }
    
    /**
     * Sets (as xml) the "gotoLoopOnEmpty" element
     */
    public void xsetGotoLoopOnEmpty(org.apache.xmlbeans.XmlBoolean gotoLoopOnEmpty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(GOTOLOOPONEMPTY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(GOTOLOOPONEMPTY$16);
            }
            target.set(gotoLoopOnEmpty);
        }
    }
    
    /**
     * Gets the "trimValues" element
     */
    public boolean getTrimValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIMVALUES$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "trimValues" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTrimValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRIMVALUES$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "trimValues" element
     */
    public void setTrimValues(boolean trimValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIMVALUES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRIMVALUES$18);
            }
            target.setBooleanValue(trimValues);
        }
    }
    
    /**
     * Sets (as xml) the "trimValues" element
     */
    public void xsetTrimValues(org.apache.xmlbeans.XmlBoolean trimValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRIMVALUES$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TRIMVALUES$18);
            }
            target.set(trimValues);
        }
    }
    
    /**
     * Gets the "entitizeValues" element
     */
    public boolean getEntitizeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITIZEVALUES$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "entitizeValues" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEntitizeValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENTITIZEVALUES$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "entitizeValues" element
     */
    public void setEntitizeValues(boolean entitizeValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITIZEVALUES$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITIZEVALUES$20);
            }
            target.setBooleanValue(entitizeValues);
        }
    }
    
    /**
     * Sets (as xml) the "entitizeValues" element
     */
    public void xsetEntitizeValues(org.apache.xmlbeans.XmlBoolean entitizeValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENTITIZEVALUES$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENTITIZEVALUES$20);
            }
            target.set(entitizeValues);
        }
    }
    
    /**
     * Gets the "restartOnRun" element
     */
    public boolean getRestartOnRun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTARTONRUN$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "restartOnRun" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRestartOnRun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESTARTONRUN$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "restartOnRun" element
     */
    public void setRestartOnRun(boolean restartOnRun)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTARTONRUN$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESTARTONRUN$22);
            }
            target.setBooleanValue(restartOnRun);
        }
    }
    
    /**
     * Sets (as xml) the "restartOnRun" element
     */
    public void xsetRestartOnRun(org.apache.xmlbeans.XmlBoolean restartOnRun)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RESTARTONRUN$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RESTARTONRUN$22);
            }
            target.set(restartOnRun);
        }
    }
    
    /**
     * Gets the "expandProperties" element
     */
    public boolean getExpandProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPANDPROPERTIES$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "expandProperties" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetExpandProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXPANDPROPERTIES$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "expandProperties" element
     */
    public void setExpandProperties(boolean expandProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPANDPROPERTIES$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPANDPROPERTIES$24);
            }
            target.setBooleanValue(expandProperties);
        }
    }
    
    /**
     * Sets (as xml) the "expandProperties" element
     */
    public void xsetExpandProperties(org.apache.xmlbeans.XmlBoolean expandProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXPANDPROPERTIES$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXPANDPROPERTIES$24);
            }
            target.set(expandProperties);
        }
    }
}
