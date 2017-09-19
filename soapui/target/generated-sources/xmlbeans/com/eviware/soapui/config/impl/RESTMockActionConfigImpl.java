/*
 * XML Type:  RESTMockAction
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RESTMockActionConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML RESTMockAction(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class RESTMockActionConfigImpl extends com.eviware.soapui.config.impl.BaseMockOperationConfigImpl implements com.eviware.soapui.config.RESTMockActionConfig
{
    private static final long serialVersionUID = 1L;
    
    public RESTMockActionConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "response");
    private static final javax.xml.namespace.QName RESOURCEPATH$2 = 
        new javax.xml.namespace.QName("", "resourcePath");
    private static final javax.xml.namespace.QName METHOD$4 = 
        new javax.xml.namespace.QName("", "method");
    
    
    /**
     * Gets a List of "response" elements
     */
    public java.util.List<com.eviware.soapui.config.RESTMockResponseConfig> getResponseList()
    {
        final class ResponseList extends java.util.AbstractList<com.eviware.soapui.config.RESTMockResponseConfig>
        {
            public com.eviware.soapui.config.RESTMockResponseConfig get(int i)
                { return RESTMockActionConfigImpl.this.getResponseArray(i); }
            
            public com.eviware.soapui.config.RESTMockResponseConfig set(int i, com.eviware.soapui.config.RESTMockResponseConfig o)
            {
                com.eviware.soapui.config.RESTMockResponseConfig old = RESTMockActionConfigImpl.this.getResponseArray(i);
                RESTMockActionConfigImpl.this.setResponseArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RESTMockResponseConfig o)
                { RESTMockActionConfigImpl.this.insertNewResponse(i).set(o); }
            
            public com.eviware.soapui.config.RESTMockResponseConfig remove(int i)
            {
                com.eviware.soapui.config.RESTMockResponseConfig old = RESTMockActionConfigImpl.this.getResponseArray(i);
                RESTMockActionConfigImpl.this.removeResponse(i);
                return old;
            }
            
            public int size()
                { return RESTMockActionConfigImpl.this.sizeOfResponseArray(); }
            
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
    public com.eviware.soapui.config.RESTMockResponseConfig[] getResponseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RESTMockResponseConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RESTMockResponseConfig>();
            get_store().find_all_element_users(RESPONSE$0, targetList);
            com.eviware.soapui.config.RESTMockResponseConfig[] result = new com.eviware.soapui.config.RESTMockResponseConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "response" element
     */
    public com.eviware.soapui.config.RESTMockResponseConfig getResponseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockResponseConfig target = null;
            target = (com.eviware.soapui.config.RESTMockResponseConfig)get_store().find_element_user(RESPONSE$0, i);
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
    public void setResponseArray(com.eviware.soapui.config.RESTMockResponseConfig[] responseArray)
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
    public void setResponseArray(int i, com.eviware.soapui.config.RESTMockResponseConfig response)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockResponseConfig target = null;
            target = (com.eviware.soapui.config.RESTMockResponseConfig)get_store().find_element_user(RESPONSE$0, i);
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
    public com.eviware.soapui.config.RESTMockResponseConfig insertNewResponse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockResponseConfig target = null;
            target = (com.eviware.soapui.config.RESTMockResponseConfig)get_store().insert_element_user(RESPONSE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "response" element
     */
    public com.eviware.soapui.config.RESTMockResponseConfig addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RESTMockResponseConfig target = null;
            target = (com.eviware.soapui.config.RESTMockResponseConfig)get_store().add_element_user(RESPONSE$0);
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
     * Gets the "resourcePath" attribute
     */
    public java.lang.String getResourcePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCEPATH$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "resourcePath" attribute
     */
    public org.apache.xmlbeans.XmlString xgetResourcePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCEPATH$2);
            return target;
        }
    }
    
    /**
     * True if has "resourcePath" attribute
     */
    public boolean isSetResourcePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESOURCEPATH$2) != null;
        }
    }
    
    /**
     * Sets the "resourcePath" attribute
     */
    public void setResourcePath(java.lang.String resourcePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCEPATH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOURCEPATH$2);
            }
            target.setStringValue(resourcePath);
        }
    }
    
    /**
     * Sets (as xml) the "resourcePath" attribute
     */
    public void xsetResourcePath(org.apache.xmlbeans.XmlString resourcePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCEPATH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESOURCEPATH$2);
            }
            target.set(resourcePath);
        }
    }
    
    /**
     * Unsets the "resourcePath" attribute
     */
    public void unsetResourcePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESOURCEPATH$2);
        }
    }
    
    /**
     * Gets the "method" attribute
     */
    public java.lang.String getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "method" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$4);
            return target;
        }
    }
    
    /**
     * True if has "method" attribute
     */
    public boolean isSetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METHOD$4) != null;
        }
    }
    
    /**
     * Sets the "method" attribute
     */
    public void setMethod(java.lang.String method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$4);
            }
            target.setStringValue(method);
        }
    }
    
    /**
     * Sets (as xml) the "method" attribute
     */
    public void xsetMethod(org.apache.xmlbeans.XmlString method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$4);
            }
            target.set(method);
        }
    }
    
    /**
     * Unsets the "method" attribute
     */
    public void unsetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METHOD$4);
        }
    }
}
