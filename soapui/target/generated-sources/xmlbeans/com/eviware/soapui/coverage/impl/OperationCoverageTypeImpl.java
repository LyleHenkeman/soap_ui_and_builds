/*
 * XML Type:  OperationCoverageType
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.OperationCoverageType
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage.impl;
/**
 * An XML OperationCoverageType(@http://eviware.com/soapui/coverage).
 *
 * This is a complex type.
 */
public class OperationCoverageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.coverage.OperationCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public OperationCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACENAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "interfaceName");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "name");
    private static final javax.xml.namespace.QName REF$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "ref");
    private static final javax.xml.namespace.QName CONTRACTCOVERAGE$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "contractCoverage");
    private static final javax.xml.namespace.QName MESSAGE$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/coverage", "message");
    
    
    /**
     * Gets the "interfaceName" element
     */
    public java.lang.String getInterfaceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "interfaceName" element
     */
    public org.apache.xmlbeans.XmlString xgetInterfaceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERFACENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "interfaceName" element
     */
    public void setInterfaceName(java.lang.String interfaceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERFACENAME$0);
            }
            target.setStringValue(interfaceName);
        }
    }
    
    /**
     * Sets (as xml) the "interfaceName" element
     */
    public void xsetInterfaceName(org.apache.xmlbeans.XmlString interfaceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERFACENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERFACENAME$0);
            }
            target.set(interfaceName);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REF$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REF$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REF$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REF$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REF$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REF$4);
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
            target = (com.eviware.soapui.coverage.CoverageType)get_store().find_element_user(CONTRACTCOVERAGE$6, 0);
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
            target = (com.eviware.soapui.coverage.CoverageType)get_store().find_element_user(CONTRACTCOVERAGE$6, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.coverage.CoverageType)get_store().add_element_user(CONTRACTCOVERAGE$6);
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
            target = (com.eviware.soapui.coverage.CoverageType)get_store().add_element_user(CONTRACTCOVERAGE$6);
            return target;
        }
    }
    
    /**
     * Gets a List of "message" elements
     */
    public java.util.List<com.eviware.soapui.coverage.MessageType> getMessageList()
    {
        final class MessageList extends java.util.AbstractList<com.eviware.soapui.coverage.MessageType>
        {
            public com.eviware.soapui.coverage.MessageType get(int i)
                { return OperationCoverageTypeImpl.this.getMessageArray(i); }
            
            public com.eviware.soapui.coverage.MessageType set(int i, com.eviware.soapui.coverage.MessageType o)
            {
                com.eviware.soapui.coverage.MessageType old = OperationCoverageTypeImpl.this.getMessageArray(i);
                OperationCoverageTypeImpl.this.setMessageArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.coverage.MessageType o)
                { OperationCoverageTypeImpl.this.insertNewMessage(i).set(o); }
            
            public com.eviware.soapui.coverage.MessageType remove(int i)
            {
                com.eviware.soapui.coverage.MessageType old = OperationCoverageTypeImpl.this.getMessageArray(i);
                OperationCoverageTypeImpl.this.removeMessage(i);
                return old;
            }
            
            public int size()
                { return OperationCoverageTypeImpl.this.sizeOfMessageArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MessageList();
        }
    }
    
    /**
     * Gets array of all "message" elements
     * @deprecated
     */
    public com.eviware.soapui.coverage.MessageType[] getMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.coverage.MessageType> targetList = new java.util.ArrayList<com.eviware.soapui.coverage.MessageType>();
            get_store().find_all_element_users(MESSAGE$8, targetList);
            com.eviware.soapui.coverage.MessageType[] result = new com.eviware.soapui.coverage.MessageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "message" element
     */
    public com.eviware.soapui.coverage.MessageType getMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.MessageType target = null;
            target = (com.eviware.soapui.coverage.MessageType)get_store().find_element_user(MESSAGE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "message" element
     */
    public int sizeOfMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$8);
        }
    }
    
    /**
     * Sets array of all "message" element
     */
    public void setMessageArray(com.eviware.soapui.coverage.MessageType[] messageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageArray, MESSAGE$8);
        }
    }
    
    /**
     * Sets ith "message" element
     */
    public void setMessageArray(int i, com.eviware.soapui.coverage.MessageType message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.MessageType target = null;
            target = (com.eviware.soapui.coverage.MessageType)get_store().find_element_user(MESSAGE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(message);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message" element
     */
    public com.eviware.soapui.coverage.MessageType insertNewMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.MessageType target = null;
            target = (com.eviware.soapui.coverage.MessageType)get_store().insert_element_user(MESSAGE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message" element
     */
    public com.eviware.soapui.coverage.MessageType addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.coverage.MessageType target = null;
            target = (com.eviware.soapui.coverage.MessageType)get_store().add_element_user(MESSAGE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "message" element
     */
    public void removeMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$8, i);
        }
    }
}
