/*
 * XML Type:  Workspace
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WorkspaceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Workspace(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class WorkspaceConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.WorkspaceConfig
{
    private static final long serialVersionUID = 1L;
    
    public WorkspaceConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROJECT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "project");
    private static final javax.xml.namespace.QName COLLECTINFOFORSUPPORT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "collectInfoForSupport");
    private static final javax.xml.namespace.QName SOAPUIVERSION$4 = 
        new javax.xml.namespace.QName("", "soapui-version");
    private static final javax.xml.namespace.QName PROJECTROOT$6 = 
        new javax.xml.namespace.QName("", "projectRoot");
    
    
    /**
     * Gets a List of "project" elements
     */
    public java.util.List<com.eviware.soapui.config.WorkspaceProjectConfig> getProjectList()
    {
        final class ProjectList extends java.util.AbstractList<com.eviware.soapui.config.WorkspaceProjectConfig>
        {
            public com.eviware.soapui.config.WorkspaceProjectConfig get(int i)
                { return WorkspaceConfigImpl.this.getProjectArray(i); }
            
            public com.eviware.soapui.config.WorkspaceProjectConfig set(int i, com.eviware.soapui.config.WorkspaceProjectConfig o)
            {
                com.eviware.soapui.config.WorkspaceProjectConfig old = WorkspaceConfigImpl.this.getProjectArray(i);
                WorkspaceConfigImpl.this.setProjectArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.WorkspaceProjectConfig o)
                { WorkspaceConfigImpl.this.insertNewProject(i).set(o); }
            
            public com.eviware.soapui.config.WorkspaceProjectConfig remove(int i)
            {
                com.eviware.soapui.config.WorkspaceProjectConfig old = WorkspaceConfigImpl.this.getProjectArray(i);
                WorkspaceConfigImpl.this.removeProject(i);
                return old;
            }
            
            public int size()
                { return WorkspaceConfigImpl.this.sizeOfProjectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ProjectList();
        }
    }
    
    /**
     * Gets array of all "project" elements
     * @deprecated
     */
    public com.eviware.soapui.config.WorkspaceProjectConfig[] getProjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.WorkspaceProjectConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.WorkspaceProjectConfig>();
            get_store().find_all_element_users(PROJECT$0, targetList);
            com.eviware.soapui.config.WorkspaceProjectConfig[] result = new com.eviware.soapui.config.WorkspaceProjectConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "project" element
     */
    public com.eviware.soapui.config.WorkspaceProjectConfig getProjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceProjectConfig target = null;
            target = (com.eviware.soapui.config.WorkspaceProjectConfig)get_store().find_element_user(PROJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "project" element
     */
    public int sizeOfProjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROJECT$0);
        }
    }
    
    /**
     * Sets array of all "project" element
     */
    public void setProjectArray(com.eviware.soapui.config.WorkspaceProjectConfig[] projectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(projectArray, PROJECT$0);
        }
    }
    
    /**
     * Sets ith "project" element
     */
    public void setProjectArray(int i, com.eviware.soapui.config.WorkspaceProjectConfig project)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceProjectConfig target = null;
            target = (com.eviware.soapui.config.WorkspaceProjectConfig)get_store().find_element_user(PROJECT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(project);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "project" element
     */
    public com.eviware.soapui.config.WorkspaceProjectConfig insertNewProject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceProjectConfig target = null;
            target = (com.eviware.soapui.config.WorkspaceProjectConfig)get_store().insert_element_user(PROJECT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "project" element
     */
    public com.eviware.soapui.config.WorkspaceProjectConfig addNewProject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WorkspaceProjectConfig target = null;
            target = (com.eviware.soapui.config.WorkspaceProjectConfig)get_store().add_element_user(PROJECT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "project" element
     */
    public void removeProject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROJECT$0, i);
        }
    }
    
    /**
     * Gets the "collectInfoForSupport" element
     */
    public boolean getCollectInfoForSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTINFOFORSUPPORT$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "collectInfoForSupport" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCollectInfoForSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COLLECTINFOFORSUPPORT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "collectInfoForSupport" element
     */
    public boolean isSetCollectInfoForSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLECTINFOFORSUPPORT$2) != 0;
        }
    }
    
    /**
     * Sets the "collectInfoForSupport" element
     */
    public void setCollectInfoForSupport(boolean collectInfoForSupport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COLLECTINFOFORSUPPORT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COLLECTINFOFORSUPPORT$2);
            }
            target.setBooleanValue(collectInfoForSupport);
        }
    }
    
    /**
     * Sets (as xml) the "collectInfoForSupport" element
     */
    public void xsetCollectInfoForSupport(org.apache.xmlbeans.XmlBoolean collectInfoForSupport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COLLECTINFOFORSUPPORT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(COLLECTINFOFORSUPPORT$2);
            }
            target.set(collectInfoForSupport);
        }
    }
    
    /**
     * Unsets the "collectInfoForSupport" element
     */
    public void unsetCollectInfoForSupport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLECTINFOFORSUPPORT$2, 0);
        }
    }
    
    /**
     * Gets the "soapui-version" attribute
     */
    public java.lang.String getSoapuiVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPUIVERSION$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "soapui-version" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSoapuiVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOAPUIVERSION$4);
            return target;
        }
    }
    
    /**
     * True if has "soapui-version" attribute
     */
    public boolean isSetSoapuiVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOAPUIVERSION$4) != null;
        }
    }
    
    /**
     * Sets the "soapui-version" attribute
     */
    public void setSoapuiVersion(java.lang.String soapuiVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOAPUIVERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOAPUIVERSION$4);
            }
            target.setStringValue(soapuiVersion);
        }
    }
    
    /**
     * Sets (as xml) the "soapui-version" attribute
     */
    public void xsetSoapuiVersion(org.apache.xmlbeans.XmlString soapuiVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SOAPUIVERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SOAPUIVERSION$4);
            }
            target.set(soapuiVersion);
        }
    }
    
    /**
     * Unsets the "soapui-version" attribute
     */
    public void unsetSoapuiVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOAPUIVERSION$4);
        }
    }
    
    /**
     * Gets the "projectRoot" attribute
     */
    public java.lang.String getProjectRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROJECTROOT$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "projectRoot" attribute
     */
    public org.apache.xmlbeans.XmlString xgetProjectRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROJECTROOT$6);
            return target;
        }
    }
    
    /**
     * True if has "projectRoot" attribute
     */
    public boolean isSetProjectRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROJECTROOT$6) != null;
        }
    }
    
    /**
     * Sets the "projectRoot" attribute
     */
    public void setProjectRoot(java.lang.String projectRoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROJECTROOT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROJECTROOT$6);
            }
            target.setStringValue(projectRoot);
        }
    }
    
    /**
     * Sets (as xml) the "projectRoot" attribute
     */
    public void xsetProjectRoot(org.apache.xmlbeans.XmlString projectRoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROJECTROOT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROJECTROOT$6);
            }
            target.set(projectRoot);
        }
    }
    
    /**
     * Unsets the "projectRoot" attribute
     */
    public void unsetProjectRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROJECTROOT$6);
        }
    }
}
