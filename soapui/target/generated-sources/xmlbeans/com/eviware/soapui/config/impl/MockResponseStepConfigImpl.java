/*
 * XML Type:  MockResponseStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MockResponseStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MockResponseStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MockResponseStepConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MockResponseStepConfig
{
    private static final long serialVersionUID = 1L;
    
    public MockResponseStepConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "interface");
    private static final javax.xml.namespace.QName OPERATION$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "operation");
    private static final javax.xml.namespace.QName PATH$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "path");
    private static final javax.xml.namespace.QName PORT$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "port");
    private static final javax.xml.namespace.QName TIMEOUT$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "timeout");
    private static final javax.xml.namespace.QName RESPONSE$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "response");
    private static final javax.xml.namespace.QName ASSERTION$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "assertion");
    private static final javax.xml.namespace.QName QUERY$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "query");
    private static final javax.xml.namespace.QName MATCH$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "match");
    private static final javax.xml.namespace.QName HOST$18 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "host");
    private static final javax.xml.namespace.QName HANDLEFAULT$20 = 
        new javax.xml.namespace.QName("", "handleFault");
    private static final javax.xml.namespace.QName HANDLERESPONSE$22 = 
        new javax.xml.namespace.QName("", "handleResponse");
    private static final javax.xml.namespace.QName STARTSTEP$24 = 
        new javax.xml.namespace.QName("", "startStep");
    
    
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
     * Gets the "port" element
     */
    public int getPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORT$6, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PORT$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PORT$6);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PORT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PORT$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEOUT$8, 0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TIMEOUT$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEOUT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEOUT$8);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(TIMEOUT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(TIMEOUT$8);
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
            target = (com.eviware.soapui.config.MockResponseConfig)get_store().find_element_user(RESPONSE$10, 0);
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
            target = (com.eviware.soapui.config.MockResponseConfig)get_store().find_element_user(RESPONSE$10, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.MockResponseConfig)get_store().add_element_user(RESPONSE$10);
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
            target = (com.eviware.soapui.config.MockResponseConfig)get_store().add_element_user(RESPONSE$10);
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
                { return MockResponseStepConfigImpl.this.getAssertionArray(i); }
            
            public com.eviware.soapui.config.TestAssertionConfig set(int i, com.eviware.soapui.config.TestAssertionConfig o)
            {
                com.eviware.soapui.config.TestAssertionConfig old = MockResponseStepConfigImpl.this.getAssertionArray(i);
                MockResponseStepConfigImpl.this.setAssertionArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.TestAssertionConfig o)
                { MockResponseStepConfigImpl.this.insertNewAssertion(i).set(o); }
            
            public com.eviware.soapui.config.TestAssertionConfig remove(int i)
            {
                com.eviware.soapui.config.TestAssertionConfig old = MockResponseStepConfigImpl.this.getAssertionArray(i);
                MockResponseStepConfigImpl.this.removeAssertion(i);
                return old;
            }
            
            public int size()
                { return MockResponseStepConfigImpl.this.sizeOfAssertionArray(); }
            
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
            get_store().find_all_element_users(ASSERTION$12, targetList);
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
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$12, i);
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
            return get_store().count_elements(ASSERTION$12);
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
            arraySetterHelper(assertionArray, ASSERTION$12);
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
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().find_element_user(ASSERTION$12, i);
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
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().insert_element_user(ASSERTION$12, i);
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
            target = (com.eviware.soapui.config.TestAssertionConfig)get_store().add_element_user(ASSERTION$12);
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
            get_store().remove_element(ASSERTION$12, i);
        }
    }
    
    /**
     * Gets the "query" element
     */
    public java.lang.String getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "query" element
     */
    public org.apache.xmlbeans.XmlString xgetQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "query" element
     */
    public void setQuery(java.lang.String query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERY$14);
            }
            target.setStringValue(query);
        }
    }
    
    /**
     * Sets (as xml) the "query" element
     */
    public void xsetQuery(org.apache.xmlbeans.XmlString query)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERY$14);
            }
            target.set(query);
        }
    }
    
    /**
     * Gets the "match" element
     */
    public java.lang.String getMatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCH$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "match" element
     */
    public org.apache.xmlbeans.XmlString xgetMatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCH$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "match" element
     */
    public void setMatch(java.lang.String match)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATCH$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATCH$16);
            }
            target.setStringValue(match);
        }
    }
    
    /**
     * Sets (as xml) the "match" element
     */
    public void xsetMatch(org.apache.xmlbeans.XmlString match)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MATCH$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MATCH$16);
            }
            target.set(match);
        }
    }
    
    /**
     * Gets the "host" element
     */
    public java.lang.String getHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "host" element
     */
    public org.apache.xmlbeans.XmlString xgetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "host" element
     */
    public boolean isSetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOST$18) != 0;
        }
    }
    
    /**
     * Sets the "host" element
     */
    public void setHost(java.lang.String host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOST$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOST$18);
            }
            target.setStringValue(host);
        }
    }
    
    /**
     * Sets (as xml) the "host" element
     */
    public void xsetHost(org.apache.xmlbeans.XmlString host)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOST$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOST$18);
            }
            target.set(host);
        }
    }
    
    /**
     * Unsets the "host" element
     */
    public void unsetHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOST$18, 0);
        }
    }
    
    /**
     * Gets the "handleFault" attribute
     */
    public boolean getHandleFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANDLEFAULT$20);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "handleFault" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHandleFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HANDLEFAULT$20);
            return target;
        }
    }
    
    /**
     * True if has "handleFault" attribute
     */
    public boolean isSetHandleFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HANDLEFAULT$20) != null;
        }
    }
    
    /**
     * Sets the "handleFault" attribute
     */
    public void setHandleFault(boolean handleFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANDLEFAULT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HANDLEFAULT$20);
            }
            target.setBooleanValue(handleFault);
        }
    }
    
    /**
     * Sets (as xml) the "handleFault" attribute
     */
    public void xsetHandleFault(org.apache.xmlbeans.XmlBoolean handleFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HANDLEFAULT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HANDLEFAULT$20);
            }
            target.set(handleFault);
        }
    }
    
    /**
     * Unsets the "handleFault" attribute
     */
    public void unsetHandleFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HANDLEFAULT$20);
        }
    }
    
    /**
     * Gets the "handleResponse" attribute
     */
    public boolean getHandleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANDLERESPONSE$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "handleResponse" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHandleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HANDLERESPONSE$22);
            return target;
        }
    }
    
    /**
     * True if has "handleResponse" attribute
     */
    public boolean isSetHandleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HANDLERESPONSE$22) != null;
        }
    }
    
    /**
     * Sets the "handleResponse" attribute
     */
    public void setHandleResponse(boolean handleResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HANDLERESPONSE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HANDLERESPONSE$22);
            }
            target.setBooleanValue(handleResponse);
        }
    }
    
    /**
     * Sets (as xml) the "handleResponse" attribute
     */
    public void xsetHandleResponse(org.apache.xmlbeans.XmlBoolean handleResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HANDLERESPONSE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HANDLERESPONSE$22);
            }
            target.set(handleResponse);
        }
    }
    
    /**
     * Unsets the "handleResponse" attribute
     */
    public void unsetHandleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HANDLERESPONSE$22);
        }
    }
    
    /**
     * Gets the "startStep" attribute
     */
    public java.lang.String getStartStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTSTEP$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "startStep" attribute
     */
    public org.apache.xmlbeans.XmlString xgetStartStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTSTEP$24);
            return target;
        }
    }
    
    /**
     * True if has "startStep" attribute
     */
    public boolean isSetStartStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTSTEP$24) != null;
        }
    }
    
    /**
     * Sets the "startStep" attribute
     */
    public void setStartStep(java.lang.String startStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTSTEP$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTSTEP$24);
            }
            target.setStringValue(startStep);
        }
    }
    
    /**
     * Sets (as xml) the "startStep" attribute
     */
    public void xsetStartStep(org.apache.xmlbeans.XmlString startStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STARTSTEP$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STARTSTEP$24);
            }
            target.set(startStep);
        }
    }
    
    /**
     * Unsets the "startStep" attribute
     */
    public void unsetStartStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTSTEP$24);
        }
    }
}
