/*
 * XML Type:  InterfaceCoverageType
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.InterfaceCoverageType
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage.impl;
/**
 * An XML InterfaceCoverageType(@http://eviware.com/soapui/coverage).
 *
 * This is a complex type.
 */
public class InterfaceCoverageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.coverage.InterfaceCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public InterfaceCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "name");
    private static final javax.xml.namespace.QName REF$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "ref");
    private static final javax.xml.namespace.QName CONTRACTCOVERAGE$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "contractCoverage");
    private static final javax.xml.namespace.QName OPERATION$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "operation");
    
    
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
     * Gets the "ref" element
     */
    public java.lang.String getRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ref" element
     */
    public org.apache.xmlbeans.XmlString xgetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REF$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ref" element
     */
    public void setRef(java.lang.String ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REF$2);
            }
            target.setStringValue(ref);
        }
    }
    
    /**
     * Sets (as xml) the "ref" element
     */
    public void xsetRef(org.apache.xmlbeans.XmlString ref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REF$2);
            }
            target.set(ref);
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
            target = (com.eviware.soapui.coverage.CoverageType)get_store().find_element_user(CONTRACTCOVERAGE$4, 0);
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
            target = (com.eviware.soapui.coverage.CoverageType)get_store().find_element_user(CONTRACTCOVERAGE$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.coverage.CoverageType)get_store().add_element_user(CONTRACTCOVERAGE$4);
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
            target = (com.eviware.soapui.coverage.CoverageType)get_store().add_element_user(CONTRACTCOVERAGE$4);
            return target;
        }
    }
    
    /**
     * Gets a List of "operation" elements
     */
    public java.util.List<com.eviware.soapui.coverage.OperationCoverageType> getOperationList()
    {
        final class OperationList extends java.util.AbstractList<com.eviware.soapui.coverage.OperationCoverageType>
        {
            public com.eviware.soapui.coverage.OperationCoverageType get(int i)
                { return InterfaceCoverageTypeImpl.this.getOperationArray(i); }
            
            public com.eviware.soapui.coverage.OperationCoverageType set(int i, com.eviware.soapui.coverage.OperationCoverageType o)
            {
                com.eviware.soapui.coverage.OperationCoverageType old = InterfaceCoverageTypeImpl.this.getOperationArray(i);
                InterfaceCoverageTypeImpl.this.setOperationArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.coverage.OperationCoverageType o)
                { InterfaceCoverageTypeImpl.this.insertNewOperation(i).set(o); }
            
            public com.eviware.soapui.coverage.OperationCoverageType remove(int i)
            {
                com.eviware.soapui.coverage.OperationCoverageType old = InterfaceCoverageTypeImpl.this.getOperationArray(i);
                InterfaceCoverageTypeImpl.this.removeOperation(i);
                return old;
            }
            
            public int size()
                { return InterfaceCoverageTypeImpl.this.sizeOfOperationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OperationList();
        }
    }
    
    /**
     * Gets array of all "operation" elements
     * @deprecated
     */
    public com.eviware.soapui.coverage.OperationCoverageType[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.coverage.OperationCoverageType> targetList = new java.util.ArrayList<com.eviware.soapui.coverage.OperationCoverageType>();
            get_store().find_all_element_users(OPERATION$6, targetList);
            com.eviware.soapui.coverage.OperationCoverageType[] result = new com.eviware.soapui.coverage.OperationCoverageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "operation" element
     */
    public com.eviware.soapui.coverage.OperationCoverageType getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.OperationCoverageType target = null;
            target = (com.eviware.soapui.coverage.OperationCoverageType)get_store().find_element_user(OPERATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "operation" element
     */
    public int sizeOfOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$6);
        }
    }
    
    /**
     * Sets array of all "operation" element
     */
    public void setOperationArray(com.eviware.soapui.coverage.OperationCoverageType[] operationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operationArray, OPERATION$6);
        }
    }
    
    /**
     * Sets ith "operation" element
     */
    public void setOperationArray(int i, com.eviware.soapui.coverage.OperationCoverageType operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.OperationCoverageType target = null;
            target = (com.eviware.soapui.coverage.OperationCoverageType)get_store().find_element_user(OPERATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    public com.eviware.soapui.coverage.OperationCoverageType insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.OperationCoverageType target = null;
            target = (com.eviware.soapui.coverage.OperationCoverageType)get_store().insert_element_user(OPERATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    public com.eviware.soapui.coverage.OperationCoverageType addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.OperationCoverageType target = null;
            target = (com.eviware.soapui.coverage.OperationCoverageType)get_store().add_element_user(OPERATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "operation" element
     */
    public void removeOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$6, i);
        }
    }
}
