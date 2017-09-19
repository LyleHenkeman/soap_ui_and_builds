/*
 * XML Type:  MessageContentElement
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MessageContentElementConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MessageContentElement(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MessageContentElementConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MessageContentElementConfig
{
    private static final long serialVersionUID = 1L;
    
    public MessageContentElementConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XPATH$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "xpath");
    private static final javax.xml.namespace.QName ELEMENT$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "element");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "type");
    private static final javax.xml.namespace.QName OPERATOR$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "operator");
    private static final javax.xml.namespace.QName ENABLED$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "enabled");
    private static final javax.xml.namespace.QName EXPECTEDVALUE$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "expectedValue");
    private static final javax.xml.namespace.QName HASVALUE$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "hasValue");
    private static final javax.xml.namespace.QName VALUE$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "value");
    private static final javax.xml.namespace.QName NUMBERTYPE$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "numberType");
    private static final javax.xml.namespace.QName MESSAGE$18 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "message");
    
    
    /**
     * Gets the "xpath" element
     */
    public java.lang.String getXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XPATH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xpath" element
     */
    public org.apache.xmlbeans.XmlString xgetXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XPATH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "xpath" element
     */
    public void setXpath(java.lang.String xpath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XPATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XPATH$0);
            }
            target.setStringValue(xpath);
        }
    }
    
    /**
     * Sets (as xml) the "xpath" element
     */
    public void xsetXpath(org.apache.xmlbeans.XmlString xpath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(XPATH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(XPATH$0);
            }
            target.set(xpath);
        }
    }
    
    /**
     * Gets the "element" element
     */
    public java.lang.String getElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "element" element
     */
    public org.apache.xmlbeans.XmlString xgetElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ELEMENT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "element" element
     */
    public void setElement(java.lang.String element)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELEMENT$2);
            }
            target.setStringValue(element);
        }
    }
    
    /**
     * Sets (as xml) the "element" element
     */
    public void xsetElement(org.apache.xmlbeans.XmlString element)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ELEMENT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ELEMENT$2);
            }
            target.set(element);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "operator" element
     */
    public java.lang.String getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATOR$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operator" element
     */
    public org.apache.xmlbeans.XmlString xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATOR$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "operator" element
     */
    public void setOperator(java.lang.String operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATOR$6);
            }
            target.setStringValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "operator" element
     */
    public void xsetOperator(org.apache.xmlbeans.XmlString operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATOR$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATOR$6);
            }
            target.set(operator);
        }
    }
    
    /**
     * Gets the "enabled" element
     */
    public boolean getEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLED$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENABLED$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "enabled" element
     */
    public void setEnabled(boolean enabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENABLED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENABLED$8);
            }
            target.setBooleanValue(enabled);
        }
    }
    
    /**
     * Sets (as xml) the "enabled" element
     */
    public void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENABLED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENABLED$8);
            }
            target.set(enabled);
        }
    }
    
    /**
     * Gets the "expectedValue" element
     */
    public java.lang.String getExpectedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDVALUE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expectedValue" element
     */
    public org.apache.xmlbeans.XmlString xgetExpectedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPECTEDVALUE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "expectedValue" element
     */
    public void setExpectedValue(java.lang.String expectedValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDVALUE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPECTEDVALUE$10);
            }
            target.setStringValue(expectedValue);
        }
    }
    
    /**
     * Sets (as xml) the "expectedValue" element
     */
    public void xsetExpectedValue(org.apache.xmlbeans.XmlString expectedValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXPECTEDVALUE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXPECTEDVALUE$10);
            }
            target.set(expectedValue);
        }
    }
    
    /**
     * Gets the "hasValue" element
     */
    public boolean getHasValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASVALUE$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasValue" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHasValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASVALUE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hasValue" element
     */
    public void setHasValue(boolean hasValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASVALUE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASVALUE$12);
            }
            target.setBooleanValue(hasValue);
        }
    }
    
    /**
     * Sets (as xml) the "hasValue" element
     */
    public void xsetHasValue(org.apache.xmlbeans.XmlBoolean hasValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HASVALUE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HASVALUE$12);
            }
            target.set(hasValue);
        }
    }
    
    /**
     * Gets the "value" element
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" element
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$14);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$14);
            }
            target.set(value);
        }
    }
    
    /**
     * Gets the "numberType" element
     */
    public boolean getNumberType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERTYPE$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "numberType" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNumberType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NUMBERTYPE$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numberType" element
     */
    public void setNumberType(boolean numberType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERTYPE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERTYPE$16);
            }
            target.setBooleanValue(numberType);
        }
    }
    
    /**
     * Sets (as xml) the "numberType" element
     */
    public void xsetNumberType(org.apache.xmlbeans.XmlBoolean numberType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NUMBERTYPE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NUMBERTYPE$16);
            }
            target.set(numberType);
        }
    }
    
    /**
     * Gets the "message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$18);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$18);
            }
            target.set(message);
        }
    }
}
