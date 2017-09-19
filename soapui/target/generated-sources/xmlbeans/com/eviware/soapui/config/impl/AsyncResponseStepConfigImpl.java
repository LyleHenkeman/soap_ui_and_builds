/*
 * XML Type:  AsyncResponseStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.AsyncResponseStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML AsyncResponseStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class AsyncResponseStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.AsyncResponseStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public AsyncResponseStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "interface");
    private static final javax.xml.namespace.QName OPERATION$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "operation");
    private static final javax.xml.namespace.QName PATH$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "path");
    private static final javax.xml.namespace.QName REQUESTQUERY$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "requestQuery");
    private static final javax.xml.namespace.QName MATCHINGVALUE$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "matchingValue");
    private static final javax.xml.namespace.QName PORT$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "port");
    private static final javax.xml.namespace.QName TIMEOUT$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "timeout");
    private static final javax.xml.namespace.QName RESPONSE$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "response");
    private static final javax.xml.namespace.QName ASSERTION$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "assertion");
    
    
    /**
     * Gets the "interface" element
     */
    public java.lang.String getInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "interface" element
     */
    public org.apache.xmlbeans.XmlString xgetInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERFACE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "interface" element
     */
    public void setInterface(java.lang.String xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERFACE$0);
            }
            target.setStringValue(xinterface);
        }
    }
    
    /**
     * Sets (as xml) the "interface" element
     */
    public void xsetInterface(org.apache.xmlbeans.XmlString xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERFACE$0);
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Gets the "operation" element
     */
    public java.lang.String getOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operation" element
     */
    public org.apache.xmlbeans.XmlString xgetOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "operation" element
     */
    public void setOperation(java.lang.String operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATION$2);
            }
            target.setStringValue(operation);
        }
    }
    
    /**
     * Sets (as xml) the "operation" element
     */
    public void xsetOperation(org.apache.xmlbeans.XmlString operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATION$2);
            }
            target.set(operation);
        }
    }
    
    /**
     * Gets the "path" element
     */
    public java.lang.String getPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "path" element
     */
    public org.apache.xmlbeans.XmlString xgetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "path" element
     */
    public void setPath(java.lang.String path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATH$4);
            }
            target.setStringValue(path);
        }
    }
    
    /**
     * Sets (as xml) the "path" element
     */
    public void xsetPath(org.apache.xmlbeans.XmlString path)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATH$4);
            }
            target.set(path);
        }
    }
    
    /**
     * Gets the "requestQuery" element
     */
    public java.lang.String getRequestQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTQUERY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "requestQuery" element
     */
    public org.apache.xmlbeans.XmlString xgetRequestQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTQUERY$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "requestQuery" element
     */
    public void setRequestQuery(java.lang.String requestQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTQUERY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTQUERY$6);
            }
            target.setStringValue(requestQuery);
        }
    }
    
    /**
     * Sets (as xml) the "requestQuery" element
     */
    public void xsetRequestQuery(org.apache.xmlbeans.XmlString requestQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTQUERY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTQUERY$6);
            }
            target.set(requestQuery);
        }
    }
    
    /**
     * Gets the "matchingValue" element
     */
    public java.lang.String getMatchingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHINGVALUE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "matchingValue" element
     */
    public org.apache.xmlbeans.XmlString xgetMatchingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCHINGVALUE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "matchingValue" element
     */
    public void setMatchingValue(java.lang.String matchingValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCHINGVALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATCHINGVALUE$8);
            }
            target.setStringValue(matchingValue);
        }
    }
    
    /**
     * Sets (as xml) the "matchingValue" element
     */
    public void xsetMatchingValue(org.apache.xmlbeans.XmlString matchingValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCHINGVALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATCHINGVALUE$8);
            }
            target.set(matchingValue);
        }
    }
    
    /**
     * Gets the "port" element
     */
    public int getPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORT$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "port" element
     */
    public org.apache.xmlbeans.XmlInt xgetPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PORT$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "port" element
     */
    public void setPort(int port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PORT$10);
            }
            target.setIntValue(port);
        }
    }
    
    /**
     * Sets (as xml) the "port" element
     */
    public void xsetPort(org.apache.xmlbeans.XmlInt port)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PORT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PORT$10);
            }
            target.set(port);
        }
    }
    
    /**
     * Gets the "timeout" element
     */
    public long getTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEOUT$12, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeout" element
     */
    public org.apache.xmlbeans.XmlLong xgetTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TIMEOUT$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "timeout" element
     */
    public void setTimeout(long timeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEOUT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEOUT$12);
            }
            target.setLongValue(timeout);
        }
    }
    
    /**
     * Sets (as xml) the "timeout" element
     */
    public void xsetTimeout(org.apache.xmlbeans.XmlLong timeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TIMEOUT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(TIMEOUT$12);
            }
            target.set(timeout);
        }
    }
    
    /**
     * Gets the "response" element
     */
    public com.eviware.soapui.config.MockResponseConfig getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockResponseConfig target = null;
            target = (com.eviware.soapui.config.MockResponseConfig)get_store().find_element_user(RESPONSE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(com.eviware.soapui.config.MockResponseConfig response)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockResponseConfig target = null;
            target = (com.eviware.soapui.config.MockResponseConfig)get_store().find_element_user(RESPONSE$14, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.MockResponseConfig)get_store().add_element_user(RESPONSE$14);
            }
            target.set(response);
        }
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public com.eviware.soapui.config.MockResponseConfig addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MockResponseConfig target = null;
            target = (com.eviware.soapui.config.MockResponseConfig)get_store().add_element_user(RESPONSE$14);
            return target;
        }
    }
    
    /**
     * Gets a List of "assertion" elements
     */
    public java.util.List<com.eviware.soapui.config.TestAssertionConfig> getAssertionList()
    {
        final class AssertionList extends java.util.AbstractList<com.eviware.soapui.config.TestAssertionConfig>
        {
            public com.eviware.soapui.config.TestAssertionConfig get(int i)
                { return AsyncResponseStepConfigImpl.this.getAssertionArray(i); }
            
            public com.eviware.soapui.config.TestAssertionConfig set(int i, com.eviware.soapui.config.TestAssertionConfig o)
            {
                com.eviware.soapui.config.TestAssertionConfig old = AsyncResponseStepConfigImpl.this.getAssertionArray(i);
                AsyncResponseStepConfigImpl.this.setAssertionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.TestAssertionConfig o)
                { AsyncResponseStepConfigImpl.this.insertNewAssertion(i).set(o); }
            
            public com.eviware.soapui.config.TestAssertionConfig remove(int i)
            {
                com.eviware.soapui.config.TestAssertionConfig old = AsyncResponseStepConfigImpl.this.getAssertionArray(i);
                AsyncResponseStepConfigImpl.this.removeAssertion(i);
                return old;
            }
            
            public int size()
                { return AsyncResponseStepConfigImpl.this.sizeOfAssertionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AssertionList();
        }
    }
    
    /**
     * Gets array of all "assertion" elements
     * @deprecated
     */
    public com.eviware.soapui.config.TestAssertionConfig[] getAssertionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.TestAssertionConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.TestAssertionConfig>();
            get_store().find_all_element_users(ASSERTION$16, targetList);
            com.eviware.soapui.config.TestAssertionConfig[] result = new com.eviware.soapui.config.TestAssertionConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig getAssertionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "assertion" element
     */
    public int sizeOfAssertionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSERTION$16);
        }
    }
    
    /**
     * Sets array of all "assertion" element
     */
    public void setAssertionArray(com.eviware.soapui.config.TestAssertionConfig[] assertionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(assertionArray, ASSERTION$16);
        }
    }
    
    /**
     * Sets ith "assertion" element
     */
    public void setAssertionArray(int i, com.eviware.soapui.config.TestAssertionConfig assertion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(assertion);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig insertNewAssertion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().insert_element_user(ASSERTION$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assertion" element
     */
    public com.eviware.soapui.config.TestAssertionConfig addNewAssertion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestAssertionConfig target = null;
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().add_element_user(ASSERTION$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "assertion" element
     */
    public void removeAssertion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSERTION$16, i);
        }
    }
}
