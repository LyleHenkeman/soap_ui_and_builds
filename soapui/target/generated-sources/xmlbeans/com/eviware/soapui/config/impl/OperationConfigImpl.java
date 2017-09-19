/*
 * XML Type:  Operation
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OperationConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML Operation(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class OperationConfigImpl extends com.eviware.soapui.config.impl.ModelItemConfigImpl implements com.eviware.soapui.config.OperationConfig
{
    private static final long serialVersionUID = 1L;
    
    public OperationConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALL$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "call");
    private static final javax.xml.namespace.QName REQUESTPARTS$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "requestParts");
    private static final javax.xml.namespace.QName RESPONSEPARTS$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "responseParts");
    private static final javax.xml.namespace.QName ACTION$6 = 
        new javax.xml.namespace.QName("", "action");
    private static final javax.xml.namespace.QName BINDINGOPERATIONNAME$8 = 
        new javax.xml.namespace.QName("", "bindingOperationName");
    private static final javax.xml.namespace.QName STYLE$10 = 
        new javax.xml.namespace.QName("", "style");
    private static final javax.xml.namespace.QName TYPE$12 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName INPUTNAME$14 = 
        new javax.xml.namespace.QName("", "inputName");
    private static final javax.xml.namespace.QName OUTPUTNAME$16 = 
        new javax.xml.namespace.QName("", "outputName");
    private static final javax.xml.namespace.QName ISONEWAY$18 = 
        new javax.xml.namespace.QName("", "isOneWay");
    private static final javax.xml.namespace.QName SENDSATTACHMENTS$20 = 
        new javax.xml.namespace.QName("", "sendsAttachments");
    private static final javax.xml.namespace.QName RECEIVESATTACHMENTS$22 = 
        new javax.xml.namespace.QName("", "receivesAttachments");
    private static final javax.xml.namespace.QName ANONYMOUS$24 = 
        new javax.xml.namespace.QName("", "anonymous");
    
    
    /**
     * Gets a List of "call" elements
     */
    public java.util.List<com.eviware.soapui.config.WsdlRequestConfig> getCallList()
    {
        final class CallList extends java.util.AbstractList<com.eviware.soapui.config.WsdlRequestConfig>
        {
            public com.eviware.soapui.config.WsdlRequestConfig get(int i)
                { return OperationConfigImpl.this.getCallArray(i); }
            
            public com.eviware.soapui.config.WsdlRequestConfig set(int i, com.eviware.soapui.config.WsdlRequestConfig o)
            {
                com.eviware.soapui.config.WsdlRequestConfig old = OperationConfigImpl.this.getCallArray(i);
                OperationConfigImpl.this.setCallArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.WsdlRequestConfig o)
                { OperationConfigImpl.this.insertNewCall(i).set(o); }
            
            public com.eviware.soapui.config.WsdlRequestConfig remove(int i)
            {
                com.eviware.soapui.config.WsdlRequestConfig old = OperationConfigImpl.this.getCallArray(i);
                OperationConfigImpl.this.removeCall(i);
                return old;
            }
            
            public int size()
                { return OperationConfigImpl.this.sizeOfCallArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CallList();
        }
    }
    
    /**
     * Gets array of all "call" elements
     * @deprecated
     */
    public com.eviware.soapui.config.WsdlRequestConfig[] getCallArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.WsdlRequestConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.WsdlRequestConfig>();
            get_store().find_all_element_users(CALL$0, targetList);
            com.eviware.soapui.config.WsdlRequestConfig[] result = new com.eviware.soapui.config.WsdlRequestConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "call" element
     */
    public com.eviware.soapui.config.WsdlRequestConfig getCallArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsdlRequestConfig target = null;
            target = (com.eviware.soapui.config.WsdlRequestConfig)get_store().find_element_user(CALL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "call" element
     */
    public int sizeOfCallArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALL$0);
        }
    }
    
    /**
     * Sets array of all "call" element
     */
    public void setCallArray(com.eviware.soapui.config.WsdlRequestConfig[] callArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(callArray, CALL$0);
        }
    }
    
    /**
     * Sets ith "call" element
     */
    public void setCallArray(int i, com.eviware.soapui.config.WsdlRequestConfig call)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsdlRequestConfig target = null;
            target = (com.eviware.soapui.config.WsdlRequestConfig)get_store().find_element_user(CALL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(call);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "call" element
     */
    public com.eviware.soapui.config.WsdlRequestConfig insertNewCall(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsdlRequestConfig target = null;
            target = (com.eviware.soapui.config.WsdlRequestConfig)get_store().insert_element_user(CALL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "call" element
     */
    public com.eviware.soapui.config.WsdlRequestConfig addNewCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsdlRequestConfig target = null;
            target = (com.eviware.soapui.config.WsdlRequestConfig)get_store().add_element_user(CALL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "call" element
     */
    public void removeCall(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALL$0, i);
        }
    }
    
    /**
     * Gets the "requestParts" element
     */
    public com.eviware.soapui.config.PartsConfig getRequestParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PartsConfig target = null;
            target = (com.eviware.soapui.config.PartsConfig)get_store().find_element_user(REQUESTPARTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "requestParts" element
     */
    public boolean isSetRequestParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTPARTS$2) != 0;
        }
    }
    
    /**
     * Sets the "requestParts" element
     */
    public void setRequestParts(com.eviware.soapui.config.PartsConfig requestParts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PartsConfig target = null;
            target = (com.eviware.soapui.config.PartsConfig)get_store().find_element_user(REQUESTPARTS$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PartsConfig)get_store().add_element_user(REQUESTPARTS$2);
            }
            target.set(requestParts);
        }
    }
    
    /**
     * Appends and returns a new empty "requestParts" element
     */
    public com.eviware.soapui.config.PartsConfig addNewRequestParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PartsConfig target = null;
            target = (com.eviware.soapui.config.PartsConfig)get_store().add_element_user(REQUESTPARTS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "requestParts" element
     */
    public void unsetRequestParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTPARTS$2, 0);
        }
    }
    
    /**
     * Gets the "responseParts" element
     */
    public com.eviware.soapui.config.PartsConfig getResponseParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PartsConfig target = null;
            target = (com.eviware.soapui.config.PartsConfig)get_store().find_element_user(RESPONSEPARTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "responseParts" element
     */
    public boolean isSetResponseParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSEPARTS$4) != 0;
        }
    }
    
    /**
     * Sets the "responseParts" element
     */
    public void setResponseParts(com.eviware.soapui.config.PartsConfig responseParts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PartsConfig target = null;
            target = (com.eviware.soapui.config.PartsConfig)get_store().find_element_user(RESPONSEPARTS$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PartsConfig)get_store().add_element_user(RESPONSEPARTS$4);
            }
            target.set(responseParts);
        }
    }
    
    /**
     * Appends and returns a new empty "responseParts" element
     */
    public com.eviware.soapui.config.PartsConfig addNewResponseParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PartsConfig target = null;
            target = (com.eviware.soapui.config.PartsConfig)get_store().add_element_user(RESPONSEPARTS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "responseParts" element
     */
    public void unsetResponseParts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSEPARTS$4, 0);
        }
    }
    
    /**
     * Gets the "action" attribute
     */
    public java.lang.String getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "action" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$6);
            return target;
        }
    }
    
    /**
     * True if has "action" attribute
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTION$6) != null;
        }
    }
    
    /**
     * Sets the "action" attribute
     */
    public void setAction(java.lang.String action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$6);
            }
            target.setStringValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "action" attribute
     */
    public void xsetAction(org.apache.xmlbeans.XmlString action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTION$6);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "action" attribute
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTION$6);
        }
    }
    
    /**
     * Gets the "bindingOperationName" attribute
     */
    public java.lang.String getBindingOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDINGOPERATIONNAME$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bindingOperationName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBindingOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BINDINGOPERATIONNAME$8);
            return target;
        }
    }
    
    /**
     * True if has "bindingOperationName" attribute
     */
    public boolean isSetBindingOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BINDINGOPERATIONNAME$8) != null;
        }
    }
    
    /**
     * Sets the "bindingOperationName" attribute
     */
    public void setBindingOperationName(java.lang.String bindingOperationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BINDINGOPERATIONNAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BINDINGOPERATIONNAME$8);
            }
            target.setStringValue(bindingOperationName);
        }
    }
    
    /**
     * Sets (as xml) the "bindingOperationName" attribute
     */
    public void xsetBindingOperationName(org.apache.xmlbeans.XmlString bindingOperationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BINDINGOPERATIONNAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BINDINGOPERATIONNAME$8);
            }
            target.set(bindingOperationName);
        }
    }
    
    /**
     * Unsets the "bindingOperationName" attribute
     */
    public void unsetBindingOperationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BINDINGOPERATIONNAME$8);
        }
    }
    
    /**
     * Gets the "style" attribute
     */
    public com.eviware.soapui.config.OperationStylesConfig.Enum getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$10);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.OperationStylesConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "style" attribute
     */
    public com.eviware.soapui.config.OperationStylesConfig xgetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationStylesConfig target = null;
            target = (com.eviware.soapui.config.OperationStylesConfig)get_store().find_attribute_user(STYLE$10);
            return target;
        }
    }
    
    /**
     * True if has "style" attribute
     */
    public boolean isSetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLE$10) != null;
        }
    }
    
    /**
     * Sets the "style" attribute
     */
    public void setStyle(com.eviware.soapui.config.OperationStylesConfig.Enum style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$10);
            }
            target.setEnumValue(style);
        }
    }
    
    /**
     * Sets (as xml) the "style" attribute
     */
    public void xsetStyle(com.eviware.soapui.config.OperationStylesConfig style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationStylesConfig target = null;
            target = (com.eviware.soapui.config.OperationStylesConfig)get_store().find_attribute_user(STYLE$10);
            if (target == null)
            {
                target = (com.eviware.soapui.config.OperationStylesConfig)get_store().add_attribute_user(STYLE$10);
            }
            target.set(style);
        }
    }
    
    /**
     * Unsets the "style" attribute
     */
    public void unsetStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLE$10);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public com.eviware.soapui.config.OperationTypesConfig.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.OperationTypesConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public com.eviware.soapui.config.OperationTypesConfig xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationTypesConfig target = null;
            target = (com.eviware.soapui.config.OperationTypesConfig)get_store().find_attribute_user(TYPE$12);
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$12) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(com.eviware.soapui.config.OperationTypesConfig.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$12);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(com.eviware.soapui.config.OperationTypesConfig type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OperationTypesConfig target = null;
            target = (com.eviware.soapui.config.OperationTypesConfig)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (com.eviware.soapui.config.OperationTypesConfig)get_store().add_attribute_user(TYPE$12);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$12);
        }
    }
    
    /**
     * Gets the "inputName" attribute
     */
    public java.lang.String getInputName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INPUTNAME$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "inputName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetInputName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INPUTNAME$14);
            return target;
        }
    }
    
    /**
     * True if has "inputName" attribute
     */
    public boolean isSetInputName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INPUTNAME$14) != null;
        }
    }
    
    /**
     * Sets the "inputName" attribute
     */
    public void setInputName(java.lang.String inputName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INPUTNAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INPUTNAME$14);
            }
            target.setStringValue(inputName);
        }
    }
    
    /**
     * Sets (as xml) the "inputName" attribute
     */
    public void xsetInputName(org.apache.xmlbeans.XmlString inputName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INPUTNAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INPUTNAME$14);
            }
            target.set(inputName);
        }
    }
    
    /**
     * Unsets the "inputName" attribute
     */
    public void unsetInputName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INPUTNAME$14);
        }
    }
    
    /**
     * Gets the "outputName" attribute
     */
    public java.lang.String getOutputName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTPUTNAME$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "outputName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOutputName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OUTPUTNAME$16);
            return target;
        }
    }
    
    /**
     * True if has "outputName" attribute
     */
    public boolean isSetOutputName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTPUTNAME$16) != null;
        }
    }
    
    /**
     * Sets the "outputName" attribute
     */
    public void setOutputName(java.lang.String outputName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTPUTNAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTPUTNAME$16);
            }
            target.setStringValue(outputName);
        }
    }
    
    /**
     * Sets (as xml) the "outputName" attribute
     */
    public void xsetOutputName(org.apache.xmlbeans.XmlString outputName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OUTPUTNAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OUTPUTNAME$16);
            }
            target.set(outputName);
        }
    }
    
    /**
     * Unsets the "outputName" attribute
     */
    public void unsetOutputName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTPUTNAME$16);
        }
    }
    
    /**
     * Gets the "isOneWay" attribute
     */
    public boolean getIsOneWay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISONEWAY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISONEWAY$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isOneWay" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsOneWay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISONEWAY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISONEWAY$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "isOneWay" attribute
     */
    public boolean isSetIsOneWay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISONEWAY$18) != null;
        }
    }
    
    /**
     * Sets the "isOneWay" attribute
     */
    public void setIsOneWay(boolean isOneWay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISONEWAY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISONEWAY$18);
            }
            target.setBooleanValue(isOneWay);
        }
    }
    
    /**
     * Sets (as xml) the "isOneWay" attribute
     */
    public void xsetIsOneWay(org.apache.xmlbeans.XmlBoolean isOneWay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISONEWAY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISONEWAY$18);
            }
            target.set(isOneWay);
        }
    }
    
    /**
     * Unsets the "isOneWay" attribute
     */
    public void unsetIsOneWay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISONEWAY$18);
        }
    }
    
    /**
     * Gets the "sendsAttachments" attribute
     */
    public boolean getSendsAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENDSATTACHMENTS$20);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "sendsAttachments" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSendsAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SENDSATTACHMENTS$20);
            return target;
        }
    }
    
    /**
     * True if has "sendsAttachments" attribute
     */
    public boolean isSetSendsAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SENDSATTACHMENTS$20) != null;
        }
    }
    
    /**
     * Sets the "sendsAttachments" attribute
     */
    public void setSendsAttachments(boolean sendsAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENDSATTACHMENTS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENDSATTACHMENTS$20);
            }
            target.setBooleanValue(sendsAttachments);
        }
    }
    
    /**
     * Sets (as xml) the "sendsAttachments" attribute
     */
    public void xsetSendsAttachments(org.apache.xmlbeans.XmlBoolean sendsAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SENDSATTACHMENTS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SENDSATTACHMENTS$20);
            }
            target.set(sendsAttachments);
        }
    }
    
    /**
     * Unsets the "sendsAttachments" attribute
     */
    public void unsetSendsAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SENDSATTACHMENTS$20);
        }
    }
    
    /**
     * Gets the "receivesAttachments" attribute
     */
    public boolean getReceivesAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECEIVESATTACHMENTS$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "receivesAttachments" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetReceivesAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RECEIVESATTACHMENTS$22);
            return target;
        }
    }
    
    /**
     * True if has "receivesAttachments" attribute
     */
    public boolean isSetReceivesAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RECEIVESATTACHMENTS$22) != null;
        }
    }
    
    /**
     * Sets the "receivesAttachments" attribute
     */
    public void setReceivesAttachments(boolean receivesAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECEIVESATTACHMENTS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECEIVESATTACHMENTS$22);
            }
            target.setBooleanValue(receivesAttachments);
        }
    }
    
    /**
     * Sets (as xml) the "receivesAttachments" attribute
     */
    public void xsetReceivesAttachments(org.apache.xmlbeans.XmlBoolean receivesAttachments)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(RECEIVESATTACHMENTS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(RECEIVESATTACHMENTS$22);
            }
            target.set(receivesAttachments);
        }
    }
    
    /**
     * Unsets the "receivesAttachments" attribute
     */
    public void unsetReceivesAttachments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RECEIVESATTACHMENTS$22);
        }
    }
    
    /**
     * Gets the "anonymous" attribute
     */
    public com.eviware.soapui.config.AnonymousTypeConfig.Enum getAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANONYMOUS$24);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.AnonymousTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "anonymous" attribute
     */
    public com.eviware.soapui.config.AnonymousTypeConfig xgetAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AnonymousTypeConfig target = null;
            target = (com.eviware.soapui.config.AnonymousTypeConfig)get_store().find_attribute_user(ANONYMOUS$24);
            return target;
        }
    }
    
    /**
     * True if has "anonymous" attribute
     */
    public boolean isSetAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ANONYMOUS$24) != null;
        }
    }
    
    /**
     * Sets the "anonymous" attribute
     */
    public void setAnonymous(com.eviware.soapui.config.AnonymousTypeConfig.Enum anonymous)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ANONYMOUS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ANONYMOUS$24);
            }
            target.setEnumValue(anonymous);
        }
    }
    
    /**
     * Sets (as xml) the "anonymous" attribute
     */
    public void xsetAnonymous(com.eviware.soapui.config.AnonymousTypeConfig anonymous)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AnonymousTypeConfig target = null;
            target = (com.eviware.soapui.config.AnonymousTypeConfig)get_store().find_attribute_user(ANONYMOUS$24);
            if (target == null)
            {
                target = (com.eviware.soapui.config.AnonymousTypeConfig)get_store().add_attribute_user(ANONYMOUS$24);
            }
            target.set(anonymous);
        }
    }
    
    /**
     * Unsets the "anonymous" attribute
     */
    public void unsetAnonymous()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ANONYMOUS$24);
        }
    }
}
