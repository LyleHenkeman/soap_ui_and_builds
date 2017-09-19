/*
 * XML Type:  mappingType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.MappingType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools.impl;
/**
 * An XML mappingType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public class MappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.jboss.jbosswsTools.MappingType
{
    private static final long serialVersionUID = 1L;
    
    public MappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILE$0 = 
        new javax.xml.namespace.QName("", "file");
    
    
    /**
     * Gets the "file" attribute
     */
    public java.lang.String getFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILE$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "file" attribute
     */
    public org.jboss.jbosswsTools.MappingType.File xgetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.MappingType.File target = null;
            target = (org.jboss.jbosswsTools.MappingType.File)get_store().find_attribute_user(FILE$0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.MappingType.File)get_default_attribute_value(FILE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "file" attribute
     */
    public boolean isSetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILE$0) != null;
        }
    }
    
    /**
     * Sets the "file" attribute
     */
    public void setFile(java.lang.String file)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILE$0);
            }
            target.setStringValue(file);
        }
    }
    
    /**
     * Sets (as xml) the "file" attribute
     */
    public void xsetFile(org.jboss.jbosswsTools.MappingType.File file)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.jboss.jbosswsTools.MappingType.File target = null;
            target = (org.jboss.jbosswsTools.MappingType.File)get_store().find_attribute_user(FILE$0);
            if (target == null)
            {
                target = (org.jboss.jbosswsTools.MappingType.File)get_store().add_attribute_user(FILE$0);
            }
            target.set(file);
        }
    }
    
    /**
     * Unsets the "file" attribute
     */
    public void unsetFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILE$0);
        }
    }
    /**
     * An XML file(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.MappingType$File.
     */
    public static class FileImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.jboss.jbosswsTools.MappingType.File
    {
        private static final long serialVersionUID = 1L;
        
        public FileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FileImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
