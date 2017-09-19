/*
 * XML Type:  MockService
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MockServiceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MockService(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MockServiceConfigImpl extends com.eviware.soapui.config.impl.BaseMockServiceConfigImpl implements com.eviware.soapui.config.MockServiceConfig
{
    private static final long serialVersionUID = 1L;
    
    public MockServiceConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MOCKOPERATION$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "mockOperation");
    private static final javax.xml.namespace.QName INCOMINGWSS$2 = 
        new javax.xml.namespace.QName("", "incomingWss");
    private static final javax.xml.namespace.QName OUTGOINGWSS$4 = 
        new javax.xml.namespace.QName("", "outgoingWss");
    
    
    /**
     * Gets a List of "mockOperation" elements
     */
    public java.util.List<com.eviware.soapui.config.MockOperationConfig> getMockOperationList()
    {
        final class MockOperationList extends java.util.AbstractList<com.eviware.soapui.config.MockOperationConfig>
        {
            public com.eviware.soapui.config.MockOperationConfig get(int i)
                { return MockServiceConfigImpl.this.getMockOperationArray(i); }
            
            public com.eviware.soapui.config.MockOperationConfig set(int i, com.eviware.soapui.config.MockOperationConfig o)
            {
                com.eviware.soapui.config.MockOperationConfig old = MockServiceConfigImpl.this.getMockOperationArray(i);
                MockServiceConfigImpl.this.setMockOperationArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.MockOperationConfig o)
                { MockServiceConfigImpl.this.insertNewMockOperation(i).set(o); }
            
            public com.eviware.soapui.config.MockOperationConfig remove(int i)
            {
                com.eviware.soapui.config.MockOperationConfig old = MockServiceConfigImpl.this.getMockOperationArray(i);
                MockServiceConfigImpl.this.removeMockOperation(i);
                return old;
            }
            
            public int size()
                { return MockServiceConfigImpl.this.sizeOfMockOperationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MockOperationList();
        }
    }
    
    /**
     * Gets array of all "mockOperation" elements
     * @deprecated
     */
    public com.eviware.soapui.config.MockOperationConfig[] getMockOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.MockOperationConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.MockOperationConfig>();
            get_store().find_all_element_users(MOCKOPERATION$0, targetList);
            com.eviware.soapui.config.MockOperationConfig[] result = new com.eviware.soapui.config.MockOperationConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mockOperation" element
     */
    public com.eviware.soapui.config.MockOperationConfig getMockOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationConfig target = null;
            target = (com.eviware.soapui.config.MockOperationConfig)get_store().find_element_user(MOCKOPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mockOperation" element
     */
    public int sizeOfMockOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOCKOPERATION$0);
        }
    }
    
    /**
     * Sets array of all "mockOperation" element
     */
    public void setMockOperationArray(com.eviware.soapui.config.MockOperationConfig[] mockOperationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mockOperationArray, MOCKOPERATION$0);
        }
    }
    
    /**
     * Sets ith "mockOperation" element
     */
    public void setMockOperationArray(int i, com.eviware.soapui.config.MockOperationConfig mockOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationConfig target = null;
            target = (com.eviware.soapui.config.MockOperationConfig)get_store().find_element_user(MOCKOPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mockOperation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mockOperation" element
     */
    public com.eviware.soapui.config.MockOperationConfig insertNewMockOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationConfig target = null;
            target = (com.eviware.soapui.config.MockOperationConfig)get_store().insert_element_user(MOCKOPERATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mockOperation" element
     */
    public com.eviware.soapui.config.MockOperationConfig addNewMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockOperationConfig target = null;
            target = (com.eviware.soapui.config.MockOperationConfig)get_store().add_element_user(MOCKOPERATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "mockOperation" element
     */
    public void removeMockOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOCKOPERATION$0, i);
        }
    }
    
    /**
     * Gets the "incomingWss" attribute
     */
    public java.lang.String getIncomingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCOMINGWSS$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "incomingWss" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIncomingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INCOMINGWSS$2);
            return target;
        }
    }
    
    /**
     * True if has "incomingWss" attribute
     */
    public boolean isSetIncomingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INCOMINGWSS$2) != null;
        }
    }
    
    /**
     * Sets the "incomingWss" attribute
     */
    public void setIncomingWss(java.lang.String incomingWss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCOMINGWSS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCOMINGWSS$2);
            }
            target.setStringValue(incomingWss);
        }
    }
    
    /**
     * Sets (as xml) the "incomingWss" attribute
     */
    public void xsetIncomingWss(org.apache.xmlbeans.XmlString incomingWss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INCOMINGWSS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INCOMINGWSS$2);
            }
            target.set(incomingWss);
        }
    }
    
    /**
     * Unsets the "incomingWss" attribute
     */
    public void unsetIncomingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INCOMINGWSS$2);
        }
    }
    
    /**
     * Gets the "outgoingWss" attribute
     */
    public java.lang.String getOutgoingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTGOINGWSS$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "outgoingWss" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOutgoingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OUTGOINGWSS$4);
            return target;
        }
    }
    
    /**
     * True if has "outgoingWss" attribute
     */
    public boolean isSetOutgoingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTGOINGWSS$4) != null;
        }
    }
    
    /**
     * Sets the "outgoingWss" attribute
     */
    public void setOutgoingWss(java.lang.String outgoingWss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTGOINGWSS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTGOINGWSS$4);
            }
            target.setStringValue(outgoingWss);
        }
    }
    
    /**
     * Sets (as xml) the "outgoingWss" attribute
     */
    public void xsetOutgoingWss(org.apache.xmlbeans.XmlString outgoingWss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OUTGOINGWSS$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OUTGOINGWSS$4);
            }
            target.set(outgoingWss);
        }
    }
    
    /**
     * Unsets the "outgoingWss" attribute
     */
    public void unsetOutgoingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTGOINGWSS$4);
        }
    }
}
