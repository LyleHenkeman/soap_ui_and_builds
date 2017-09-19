/*
 * XML Type:  ReportTemplate
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ReportTemplateConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML ReportTemplate(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class ReportTemplateConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.ReportTemplateConfig
{
    private static final long serialVersionUID = 1L;
    
    public ReportTemplateConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName REPORTTYPE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportType");
    private static final javax.xml.namespace.QName REPORTLEVEL$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "reportLevel");
    private static final javax.xml.namespace.QName DATA$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "data");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "description");
    private static final javax.xml.namespace.QName SUBREPORTS$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "subreports");
    private static final javax.xml.namespace.QName SCOPE$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "scope");
    private static final javax.xml.namespace.QName DATASOURCE$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "dataSource");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "reportType" element
     */
    public com.eviware.soapui.config.ReportTypeConfig.Enum getReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.ReportTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportType" element
     */
    public com.eviware.soapui.config.ReportTypeConfig xgetReportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTypeConfig target = null;
            target = (com.eviware.soapui.config.ReportTypeConfig)get_store().find_element_user(REPORTTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reportType" element
     */
    public void setReportType(com.eviware.soapui.config.ReportTypeConfig.Enum reportType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTTYPE$2);
            }
            target.setEnumValue(reportType);
        }
    }
    
    /**
     * Sets (as xml) the "reportType" element
     */
    public void xsetReportType(com.eviware.soapui.config.ReportTypeConfig reportType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportTypeConfig target = null;
            target = (com.eviware.soapui.config.ReportTypeConfig)get_store().find_element_user(REPORTTYPE$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ReportTypeConfig)get_store().add_element_user(REPORTTYPE$2);
            }
            target.set(reportType);
        }
    }
    
    /**
     * Gets the "reportLevel" element
     */
    public com.eviware.soapui.config.ReportLevelTypesConfig.Enum getReportLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTLEVEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.ReportLevelTypesConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportLevel" element
     */
    public com.eviware.soapui.config.ReportLevelTypesConfig xgetReportLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportLevelTypesConfig target = null;
            target = (com.eviware.soapui.config.ReportLevelTypesConfig)get_store().find_element_user(REPORTLEVEL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reportLevel" element
     */
    public void setReportLevel(com.eviware.soapui.config.ReportLevelTypesConfig.Enum reportLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTLEVEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTLEVEL$4);
            }
            target.setEnumValue(reportLevel);
        }
    }
    
    /**
     * Sets (as xml) the "reportLevel" element
     */
    public void xsetReportLevel(com.eviware.soapui.config.ReportLevelTypesConfig reportLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ReportLevelTypesConfig target = null;
            target = (com.eviware.soapui.config.ReportLevelTypesConfig)get_store().find_element_user(REPORTLEVEL$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ReportLevelTypesConfig)get_store().add_element_user(REPORTLEVEL$4);
            }
            target.set(reportLevel);
        }
    }
    
    /**
     * Gets the "data" element
     */
    public java.lang.String getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "data" element
     */
    public org.apache.xmlbeans.XmlString xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "data" element
     */
    public void setData(java.lang.String data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$6);
            }
            target.setStringValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlString data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$6);
            }
            target.set(data);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$8);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets a List of "subreports" elements
     */
    public java.util.List<java.lang.String> getSubreportsList()
    {
        final class SubreportsList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ReportTemplateConfigImpl.this.getSubreportsArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ReportTemplateConfigImpl.this.getSubreportsArray(i);
                ReportTemplateConfigImpl.this.setSubreportsArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ReportTemplateConfigImpl.this.insertSubreports(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ReportTemplateConfigImpl.this.getSubreportsArray(i);
                ReportTemplateConfigImpl.this.removeSubreports(i);
                return old;
            }
            
            public int size()
                { return ReportTemplateConfigImpl.this.sizeOfSubreportsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SubreportsList();
        }
    }
    
    /**
     * Gets array of all "subreports" elements
     * @deprecated
     */
    public java.lang.String[] getSubreportsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(SUBREPORTS$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "subreports" element
     */
    public java.lang.String getSubreportsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBREPORTS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "subreports" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetSubreportsList()
    {
        final class SubreportsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ReportTemplateConfigImpl.this.xgetSubreportsArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ReportTemplateConfigImpl.this.xgetSubreportsArray(i);
                ReportTemplateConfigImpl.this.xsetSubreportsArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ReportTemplateConfigImpl.this.insertNewSubreports(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ReportTemplateConfigImpl.this.xgetSubreportsArray(i);
                ReportTemplateConfigImpl.this.removeSubreports(i);
                return old;
            }
            
            public int size()
                { return ReportTemplateConfigImpl.this.sizeOfSubreportsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SubreportsList();
        }
    }
    
    /**
     * Gets array of all "subreports" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetSubreportsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(SUBREPORTS$10, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "subreports" element
     */
    public org.apache.xmlbeans.XmlString xgetSubreportsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBREPORTS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "subreports" element
     */
    public int sizeOfSubreportsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBREPORTS$10);
        }
    }
    
    /**
     * Sets array of all "subreports" element
     */
    public void setSubreportsArray(java.lang.String[] subreportsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subreportsArray, SUBREPORTS$10);
        }
    }
    
    /**
     * Sets ith "subreports" element
     */
    public void setSubreportsArray(int i, java.lang.String subreports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBREPORTS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(subreports);
        }
    }
    
    /**
     * Sets (as xml) array of all "subreports" element
     */
    public void xsetSubreportsArray(org.apache.xmlbeans.XmlString[]subreportsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subreportsArray, SUBREPORTS$10);
        }
    }
    
    /**
     * Sets (as xml) ith "subreports" element
     */
    public void xsetSubreportsArray(int i, org.apache.xmlbeans.XmlString subreports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBREPORTS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subreports);
        }
    }
    
    /**
     * Inserts the value as the ith "subreports" element
     */
    public void insertSubreports(int i, java.lang.String subreports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SUBREPORTS$10, i);
            target.setStringValue(subreports);
        }
    }
    
    /**
     * Appends the value as the last "subreports" element
     */
    public void addSubreports(java.lang.String subreports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBREPORTS$10);
            target.setStringValue(subreports);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subreports" element
     */
    public org.apache.xmlbeans.XmlString insertNewSubreports(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SUBREPORTS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subreports" element
     */
    public org.apache.xmlbeans.XmlString addNewSubreports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBREPORTS$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "subreports" element
     */
    public void removeSubreports(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBREPORTS$10, i);
        }
    }
    
    /**
     * Gets the "scope" element
     */
    public com.eviware.soapui.config.ScopeTypeConfig.Enum getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.ScopeTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope" element
     */
    public com.eviware.soapui.config.ScopeTypeConfig xgetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScopeTypeConfig target = null;
            target = (com.eviware.soapui.config.ScopeTypeConfig)get_store().find_element_user(SCOPE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scope" element
     */
    public void setScope(com.eviware.soapui.config.ScopeTypeConfig.Enum scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$12);
            }
            target.setEnumValue(scope);
        }
    }
    
    /**
     * Sets (as xml) the "scope" element
     */
    public void xsetScope(com.eviware.soapui.config.ScopeTypeConfig scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScopeTypeConfig target = null;
            target = (com.eviware.soapui.config.ScopeTypeConfig)get_store().find_element_user(SCOPE$12, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScopeTypeConfig)get_store().add_element_user(SCOPE$12);
            }
            target.set(scope);
        }
    }
    
    /**
     * Gets the "dataSource" element
     */
    public java.lang.String getDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataSource" element
     */
    public org.apache.xmlbeans.XmlString xgetDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATASOURCE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dataSource" element
     */
    public void setDataSource(java.lang.String dataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASOURCE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASOURCE$14);
            }
            target.setStringValue(dataSource);
        }
    }
    
    /**
     * Sets (as xml) the "dataSource" element
     */
    public void xsetDataSource(org.apache.xmlbeans.XmlString dataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATASOURCE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATASOURCE$14);
            }
            target.set(dataSource);
        }
    }
}
