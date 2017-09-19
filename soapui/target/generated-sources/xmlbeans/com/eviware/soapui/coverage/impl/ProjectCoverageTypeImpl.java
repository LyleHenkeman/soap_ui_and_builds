/*
 * XML Type:  ProjectCoverageType
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.ProjectCoverageType
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage.impl;
/**
 * An XML ProjectCoverageType(@http://eviware.com/soapui/coverage).
 *
 * This is a complex type.
 */
public class ProjectCoverageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.coverage.ProjectCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public ProjectCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "name");
    private static final javax.xml.namespace.QName CONTRACTCOVERAGE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "contractCoverage");
    private static final javax.xml.namespace.QName INTERFACE$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "interface");
    
    
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
     * Gets the "contractCoverage" element
     */
    public com.eviware.soapui.coverage.CoverageType getContractCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.CoverageType target = null;
            target = (com.eviware.soapui.coverage.CoverageType)get_store().find_element_user(CONTRACTCOVERAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contractCoverage" element
     */
    public void setContractCoverage(com.eviware.soapui.coverage.CoverageType contractCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.CoverageType target = null;
            target = (com.eviware.soapui.coverage.CoverageType)get_store().find_element_user(CONTRACTCOVERAGE$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.coverage.CoverageType)get_store().add_element_user(CONTRACTCOVERAGE$2);
            }
            target.set(contractCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "contractCoverage" element
     */
    public com.eviware.soapui.coverage.CoverageType addNewContractCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.CoverageType target = null;
            target = (com.eviware.soapui.coverage.CoverageType)get_store().add_element_user(CONTRACTCOVERAGE$2);
            return target;
        }
    }
    
    /**
     * Gets a List of "interface" elements
     */
    public java.util.List<com.eviware.soapui.coverage.InterfaceCoverageType> getInterfaceList()
    {
        final class InterfaceList extends java.util.AbstractList<com.eviware.soapui.coverage.InterfaceCoverageType>
        {
            public com.eviware.soapui.coverage.InterfaceCoverageType get(int i)
                { return ProjectCoverageTypeImpl.this.getInterfaceArray(i); }
            
            public com.eviware.soapui.coverage.InterfaceCoverageType set(int i, com.eviware.soapui.coverage.InterfaceCoverageType o)
            {
                com.eviware.soapui.coverage.InterfaceCoverageType old = ProjectCoverageTypeImpl.this.getInterfaceArray(i);
                ProjectCoverageTypeImpl.this.setInterfaceArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.coverage.InterfaceCoverageType o)
                { ProjectCoverageTypeImpl.this.insertNewInterface(i).set(o); }
            
            public com.eviware.soapui.coverage.InterfaceCoverageType remove(int i)
            {
                com.eviware.soapui.coverage.InterfaceCoverageType old = ProjectCoverageTypeImpl.this.getInterfaceArray(i);
                ProjectCoverageTypeImpl.this.removeInterface(i);
                return old;
            }
            
            public int size()
                { return ProjectCoverageTypeImpl.this.sizeOfInterfaceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InterfaceList();
        }
    }
    
    /**
     * Gets array of all "interface" elements
     * @deprecated
     */
    public com.eviware.soapui.coverage.InterfaceCoverageType[] getInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.coverage.InterfaceCoverageType> targetList = new java.util.ArrayList<com.eviware.soapui.coverage.InterfaceCoverageType>();
            get_store().find_all_element_users(INTERFACE$4, targetList);
            com.eviware.soapui.coverage.InterfaceCoverageType[] result = new com.eviware.soapui.coverage.InterfaceCoverageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "interface" element
     */
    public com.eviware.soapui.coverage.InterfaceCoverageType getInterfaceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.InterfaceCoverageType target = null;
            target = (com.eviware.soapui.coverage.InterfaceCoverageType)get_store().find_element_user(INTERFACE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "interface" element
     */
    public int sizeOfInterfaceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERFACE$4);
        }
    }
    
    /**
     * Sets array of all "interface" element
     */
    public void setInterfaceArray(com.eviware.soapui.coverage.InterfaceCoverageType[] xinterfaceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xinterfaceArray, INTERFACE$4);
        }
    }
    
    /**
     * Sets ith "interface" element
     */
    public void setInterfaceArray(int i, com.eviware.soapui.coverage.InterfaceCoverageType xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.InterfaceCoverageType target = null;
            target = (com.eviware.soapui.coverage.InterfaceCoverageType)get_store().find_element_user(INTERFACE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interface" element
     */
    public com.eviware.soapui.coverage.InterfaceCoverageType insertNewInterface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.InterfaceCoverageType target = null;
            target = (com.eviware.soapui.coverage.InterfaceCoverageType)get_store().insert_element_user(INTERFACE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interface" element
     */
    public com.eviware.soapui.coverage.InterfaceCoverageType addNewInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.InterfaceCoverageType target = null;
            target = (com.eviware.soapui.coverage.InterfaceCoverageType)get_store().add_element_user(INTERFACE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "interface" element
     */
    public void removeInterface(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERFACE$4, i);
        }
    }
}
