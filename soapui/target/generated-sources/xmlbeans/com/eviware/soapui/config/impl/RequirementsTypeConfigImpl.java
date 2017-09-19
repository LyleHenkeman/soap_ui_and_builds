/*
 * XML Type:  RequirementsType
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RequirementsTypeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RequirementsType(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RequirementsTypeConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.RequirementsTypeConfig
{
    private static final long serialVersionUID = 1L;
    
    public RequirementsTypeConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUIREMENT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "requirement");
    
    
    /**
     * Gets a List of "requirement" elements
     */
    public java.util.List<com.eviware.soapui.config.RequirementConfig> getRequirementList()
    {
        final class RequirementList extends java.util.AbstractList<com.eviware.soapui.config.RequirementConfig>
        {
            public com.eviware.soapui.config.RequirementConfig get(int i)
                { return RequirementsTypeConfigImpl.this.getRequirementArray(i); }
            
            public com.eviware.soapui.config.RequirementConfig set(int i, com.eviware.soapui.config.RequirementConfig o)
            {
                com.eviware.soapui.config.RequirementConfig old = RequirementsTypeConfigImpl.this.getRequirementArray(i);
                RequirementsTypeConfigImpl.this.setRequirementArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RequirementConfig o)
                { RequirementsTypeConfigImpl.this.insertNewRequirement(i).set(o); }
            
            public com.eviware.soapui.config.RequirementConfig remove(int i)
            {
                com.eviware.soapui.config.RequirementConfig old = RequirementsTypeConfigImpl.this.getRequirementArray(i);
                RequirementsTypeConfigImpl.this.removeRequirement(i);
                return old;
            }
            
            public int size()
                { return RequirementsTypeConfigImpl.this.sizeOfRequirementArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RequirementList();
        }
    }
    
    /**
     * Gets array of all "requirement" elements
     * @deprecated
     */
    public com.eviware.soapui.config.RequirementConfig[] getRequirementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RequirementConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RequirementConfig>();
            get_store().find_all_element_users(REQUIREMENT$0, targetList);
            com.eviware.soapui.config.RequirementConfig[] result = new com.eviware.soapui.config.RequirementConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "requirement" element
     */
    public com.eviware.soapui.config.RequirementConfig getRequirementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RequirementConfig target = null;
            target = (com.eviware.soapui.config.RequirementConfig)get_store().find_element_user(REQUIREMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "requirement" element
     */
    public int sizeOfRequirementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUIREMENT$0);
        }
    }
    
    /**
     * Sets array of all "requirement" element
     */
    public void setRequirementArray(com.eviware.soapui.config.RequirementConfig[] requirementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(requirementArray, REQUIREMENT$0);
        }
    }
    
    /**
     * Sets ith "requirement" element
     */
    public void setRequirementArray(int i, com.eviware.soapui.config.RequirementConfig requirement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RequirementConfig target = null;
            target = (com.eviware.soapui.config.RequirementConfig)get_store().find_element_user(REQUIREMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(requirement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "requirement" element
     */
    public com.eviware.soapui.config.RequirementConfig insertNewRequirement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RequirementConfig target = null;
            target = (com.eviware.soapui.config.RequirementConfig)get_store().insert_element_user(REQUIREMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "requirement" element
     */
    public com.eviware.soapui.config.RequirementConfig addNewRequirement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RequirementConfig target = null;
            target = (com.eviware.soapui.config.RequirementConfig)get_store().add_element_user(REQUIREMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "requirement" element
     */
    public void removeRequirement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUIREMENT$0, i);
        }
    }
}
