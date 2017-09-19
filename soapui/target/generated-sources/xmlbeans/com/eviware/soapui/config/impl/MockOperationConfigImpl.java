/*
 * XML Type:  MockOperation
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MockOperationConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MockOperation(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MockOperationConfigImpl extends com.eviware.soapui.config.impl.BaseMockOperationConfigImpl implements com.eviware.soapui.config.MockOperationConfig
{
    private static final long serialVersionUID = 1L;
    
    public MockOperationConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "response");
    private static final javax.xml.namespace.QName DISPATCHCONFIG$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "dispatchConfig");
    private static final javax.xml.namespace.QName INTERFACE$4 = 
        new javax.xml.namespace.QName("", "interface");
    private static final javax.xml.namespace.QName OPERATION$6 = 
        new javax.xml.namespace.QName("", "operation");
    private static final javax.xml.namespace.QName FAULTMOCKOPERATION$8 = 
        new javax.xml.namespace.QName("", "faultMockOperation");
    
    
    /**
     * Gets a List of "response" elements
     */
    public java.util.List<com.eviware.soapui.config.MockResponseConfig> getResponseList()
    {
        final class ResponseList extends java.util.AbstractList<com.eviware.soapui.config.MockResponseConfig>
        {
            public com.eviware.soapui.config.MockResponseConfig get(int i)
                { return MockOperationConfigImpl.this.getResponseArray(i); }
            
            public com.eviware.soapui.config.MockResponseConfig set(int i, com.eviware.soapui.config.MockResponseConfig o)
            {
                com.eviware.soapui.config.MockResponseConfig old = MockOperationConfigImpl.this.getResponseArray(i);
                MockOperationConfigImpl.this.setResponseArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.MockResponseConfig o)
                { MockOperationConfigImpl.this.insertNewResponse(i).set(o); }
            
            public com.eviware.soapui.config.MockResponseConfig remove(int i)
            {
                com.eviware.soapui.config.MockResponseConfig old = MockOperationConfigImpl.this.getResponseArray(i);
                MockOperationConfigImpl.this.removeResponse(i);
                return old;
            }
            
            public int size()
                { return MockOperationConfigImpl.this.sizeOfResponseArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResponseList();
        }
    }
    
    /**
     * Gets array of all "response" elements
     * @deprecated
     */
    public com.eviware.soapui.config.MockResponseConfig[] getResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.MockResponseConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.MockResponseConfig>();
            get_store().find_all_element_users(RESPONSE$0, targetList);
            com.eviware.soapui.config.MockResponseConfig[] result = new com.eviware.soapui.config.MockResponseConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "response" element
     */
    public com.eviware.soapui.config.MockResponseConfig getResponseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockResponseConfig target = null;
            target = (com.eviware.soapui.config.MockResponseConfig)get_store().find_element_user(RESPONSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "response" element
     */
    public int sizeOfResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSE$0);
        }
    }
    
    /**
     * Sets array of all "response" element
     */
    public void setResponseArray(com.eviware.soapui.config.MockResponseConfig[] responseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(responseArray, RESPONSE$0);
        }
    }
    
    /**
     * Sets ith "response" element
     */
    public void setResponseArray(int i, com.eviware.soapui.config.MockResponseConfig response)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockResponseConfig target = null;
            target = (com.eviware.soapui.config.MockResponseConfig)get_store().find_element_user(RESPONSE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(response);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "response" element
     */
    public com.eviware.soapui.config.MockResponseConfig insertNewResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockResponseConfig target = null;
            target = (com.eviware.soapui.config.MockResponseConfig)get_store().insert_element_user(RESPONSE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "response" element
     */
    public com.eviware.soapui.config.MockResponseConfig addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockResponseConfig target = null;
            target = (com.eviware.soapui.config.MockResponseConfig)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "response" element
     */
    public void removeResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSE$0, i);
        }
    }
    
    /**
     * Gets the "dispatchConfig" element
     */
    public org.apache.xmlbeans.XmlObject getDispatchConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DISPATCHCONFIG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dispatchConfig" element
     */
    public boolean isSetDispatchConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPATCHCONFIG$2) != 0;
        }
    }
    
    /**
     * Sets the "dispatchConfig" element
     */
    public void setDispatchConfig(org.apache.xmlbeans.XmlObject dispatchConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DISPATCHCONFIG$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DISPATCHCONFIG$2);
            }
            target.set(dispatchConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "dispatchConfig" element
     */
    public org.apache.xmlbeans.XmlObject addNewDispatchConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DISPATCHCONFIG$2);
            return target;
        }
    }
    
    /**
     * Unsets the "dispatchConfig" element
     */
    public void unsetDispatchConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPATCHCONFIG$2, 0);
        }
    }
    
    /**
     * Gets the "interface" attribute
     */
    public java.lang.String getInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERFACE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "interface" attribute
     */
    public org.apache.xmlbeans.XmlString xgetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERFACE$4);
            return target;
        }
    }
    
    /**
     * True if has "interface" attribute
     */
    public boolean isSetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERFACE$4) != null;
        }
    }
    
    /**
     * Sets the "interface" attribute
     */
    public void setInterface(java.lang.String xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERFACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERFACE$4);
            }
            target.setStringValue(xinterface);
        }
    }
    
    /**
     * Sets (as xml) the "interface" attribute
     */
    public void xsetInterface(org.apache.xmlbeans.XmlString xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INTERFACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INTERFACE$4);
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Unsets the "interface" attribute
     */
    public void unsetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERFACE$4);
        }
    }
    
    /**
     * Gets the "operation" attribute
     */
    public java.lang.String getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATION$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPERATION$6);
            return target;
        }
    }
    
    /**
     * True if has "operation" attribute
     */
    public boolean isSetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATION$6) != null;
        }
    }
    
    /**
     * Sets the "operation" attribute
     */
    public void setOperation(java.lang.String operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATION$6);
            }
            target.setStringValue(operation);
        }
    }
    
    /**
     * Sets (as xml) the "operation" attribute
     */
    public void xsetOperation(org.apache.xmlbeans.XmlString operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OPERATION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OPERATION$6);
            }
            target.set(operation);
        }
    }
    
    /**
     * Unsets the "operation" attribute
     */
    public void unsetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATION$6);
        }
    }
    
    /**
     * Gets the "faultMockOperation" attribute
     */
    public java.lang.String getFaultMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAULTMOCKOPERATION$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "faultMockOperation" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFaultMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAULTMOCKOPERATION$8);
            return target;
        }
    }
    
    /**
     * True if has "faultMockOperation" attribute
     */
    public boolean isSetFaultMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAULTMOCKOPERATION$8) != null;
        }
    }
    
    /**
     * Sets the "faultMockOperation" attribute
     */
    public void setFaultMockOperation(java.lang.String faultMockOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAULTMOCKOPERATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAULTMOCKOPERATION$8);
            }
            target.setStringValue(faultMockOperation);
        }
    }
    
    /**
     * Sets (as xml) the "faultMockOperation" attribute
     */
    public void xsetFaultMockOperation(org.apache.xmlbeans.XmlString faultMockOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FAULTMOCKOPERATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FAULTMOCKOPERATION$8);
            }
            target.set(faultMockOperation);
        }
    }
    
    /**
     * Unsets the "faultMockOperation" attribute
     */
    public void unsetFaultMockOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAULTMOCKOPERATION$8);
        }
    }
}
