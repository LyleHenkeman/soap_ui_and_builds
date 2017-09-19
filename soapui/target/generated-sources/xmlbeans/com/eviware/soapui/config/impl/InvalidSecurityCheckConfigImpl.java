/*
 * XML Type:  InvalidSecurityCheck
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.InvalidSecurityCheckConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML InvalidSecurityCheck(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class InvalidSecurityCheckConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.InvalidSecurityCheckConfig
{
    private static final long serialVersionUID = 1L;
    
    public InvalidSecurityCheckConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPESLIST$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "typesList");
    
    
    /**
     * Gets a List of "typesList" elements
     */
    public java.util.List<com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig> getTypesListList()
    {
        final class TypesListList extends java.util.AbstractList<com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig>
        {
            public com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig get(int i)
                { return InvalidSecurityCheckConfigImpl.this.getTypesListArray(i); }
            
            public com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig set(int i, com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig o)
            {
                com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig old = InvalidSecurityCheckConfigImpl.this.getTypesListArray(i);
                InvalidSecurityCheckConfigImpl.this.setTypesListArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig o)
                { InvalidSecurityCheckConfigImpl.this.insertNewTypesList(i).set(o); }
            
            public com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig remove(int i)
            {
                com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig old = InvalidSecurityCheckConfigImpl.this.getTypesListArray(i);
                InvalidSecurityCheckConfigImpl.this.removeTypesList(i);
                return old;
            }
            
            public int size()
                { return InvalidSecurityCheckConfigImpl.this.sizeOfTypesListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TypesListList();
        }
    }
    
    /**
     * Gets array of all "typesList" elements
     * @deprecated
     */
    public com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig[] getTypesListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig>();
            get_store().find_all_element_users(TYPESLIST$0, targetList);
            com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig[] result = new com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "typesList" element
     */
    public com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig getTypesListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig target = null;
            target = (com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig)get_store().find_element_user(TYPESLIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "typesList" element
     */
    public int sizeOfTypesListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPESLIST$0);
        }
    }
    
    /**
     * Sets array of all "typesList" element
     */
    public void setTypesListArray(com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig[] typesListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(typesListArray, TYPESLIST$0);
        }
    }
    
    /**
     * Sets ith "typesList" element
     */
    public void setTypesListArray(int i, com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig typesList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig target = null;
            target = (com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig)get_store().find_element_user(TYPESLIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(typesList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "typesList" element
     */
    public com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig insertNewTypesList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig target = null;
            target = (com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig)get_store().insert_element_user(TYPESLIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "typesList" element
     */
    public com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig addNewTypesList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig target = null;
            target = (com.eviware.soapui.config.SchemaTypeForSecurityCheckConfig)get_store().add_element_user(TYPESLIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "typesList" element
     */
    public void removeTypesList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPESLIST$0, i);
        }
    }
}
