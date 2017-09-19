/*
 * XML Type:  XmlTemplates
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.XmlTemplatesConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML XmlTemplates(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class XmlTemplatesConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.XmlTemplatesConfig
{
    private static final long serialVersionUID = 1L;
    
    public XmlTemplatesConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPLATES$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "templates");
    
    
    /**
     * Gets a List of "templates" elements
     */
    public java.util.List<com.eviware.soapui.config.XmlTemplatesTypeConfig> getTemplatesList()
    {
        final class TemplatesList extends java.util.AbstractList<com.eviware.soapui.config.XmlTemplatesTypeConfig>
        {
            public com.eviware.soapui.config.XmlTemplatesTypeConfig get(int i)
                { return XmlTemplatesConfigImpl.this.getTemplatesArray(i); }
            
            public com.eviware.soapui.config.XmlTemplatesTypeConfig set(int i, com.eviware.soapui.config.XmlTemplatesTypeConfig o)
            {
                com.eviware.soapui.config.XmlTemplatesTypeConfig old = XmlTemplatesConfigImpl.this.getTemplatesArray(i);
                XmlTemplatesConfigImpl.this.setTemplatesArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.XmlTemplatesTypeConfig o)
                { XmlTemplatesConfigImpl.this.insertNewTemplates(i).set(o); }
            
            public com.eviware.soapui.config.XmlTemplatesTypeConfig remove(int i)
            {
                com.eviware.soapui.config.XmlTemplatesTypeConfig old = XmlTemplatesConfigImpl.this.getTemplatesArray(i);
                XmlTemplatesConfigImpl.this.removeTemplates(i);
                return old;
            }
            
            public int size()
                { return XmlTemplatesConfigImpl.this.sizeOfTemplatesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TemplatesList();
        }
    }
    
    /**
     * Gets array of all "templates" elements
     * @deprecated
     */
    public com.eviware.soapui.config.XmlTemplatesTypeConfig[] getTemplatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.XmlTemplatesTypeConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.XmlTemplatesTypeConfig>();
            get_store().find_all_element_users(TEMPLATES$0, targetList);
            com.eviware.soapui.config.XmlTemplatesTypeConfig[] result = new com.eviware.soapui.config.XmlTemplatesTypeConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "templates" element
     */
    public com.eviware.soapui.config.XmlTemplatesTypeConfig getTemplatesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.XmlTemplatesTypeConfig target = null;
            target = (com.eviware.soapui.config.XmlTemplatesTypeConfig)get_store().find_element_user(TEMPLATES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "templates" element
     */
    public int sizeOfTemplatesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPLATES$0);
        }
    }
    
    /**
     * Sets array of all "templates" element
     */
    public void setTemplatesArray(com.eviware.soapui.config.XmlTemplatesTypeConfig[] templatesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(templatesArray, TEMPLATES$0);
        }
    }
    
    /**
     * Sets ith "templates" element
     */
    public void setTemplatesArray(int i, com.eviware.soapui.config.XmlTemplatesTypeConfig templates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.XmlTemplatesTypeConfig target = null;
            target = (com.eviware.soapui.config.XmlTemplatesTypeConfig)get_store().find_element_user(TEMPLATES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(templates);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "templates" element
     */
    public com.eviware.soapui.config.XmlTemplatesTypeConfig insertNewTemplates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.XmlTemplatesTypeConfig target = null;
            target = (com.eviware.soapui.config.XmlTemplatesTypeConfig)get_store().insert_element_user(TEMPLATES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "templates" element
     */
    public com.eviware.soapui.config.XmlTemplatesTypeConfig addNewTemplates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.XmlTemplatesTypeConfig target = null;
            target = (com.eviware.soapui.config.XmlTemplatesTypeConfig)get_store().add_element_user(TEMPLATES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "templates" element
     */
    public void removeTemplates(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPLATES$0, i);
        }
    }
}
