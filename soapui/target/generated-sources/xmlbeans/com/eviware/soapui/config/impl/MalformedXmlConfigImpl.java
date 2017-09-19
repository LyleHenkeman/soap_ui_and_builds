/*
 * XML Type:  MalformedXml
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MalformedXmlConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MalformedXml(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MalformedXmlConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MalformedXmlConfig
{
    private static final long serialVersionUID = 1L;
    
    public MalformedXmlConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSERTNEWELEMENT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "insertNewElement");
    private static final javax.xml.namespace.QName NEWELEMENTVALUE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "newElementValue");
    private static final javax.xml.namespace.QName LEAVETAGOPEN$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "leaveTagOpen");
    private static final javax.xml.namespace.QName CHANGETAGNAME$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "changeTagName");
    private static final javax.xml.namespace.QName ATTRIBUTEMUTATION$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "attributeMutation");
    private static final javax.xml.namespace.QName INSERTINVALIDCHARACTER$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "insertInvalidCharacter");
    
    
    /**
     * Gets the "insertNewElement" element
     */
    public boolean getInsertNewElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSERTNEWELEMENT$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "insertNewElement" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetInsertNewElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INSERTNEWELEMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "insertNewElement" element
     */
    public void setInsertNewElement(boolean insertNewElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSERTNEWELEMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSERTNEWELEMENT$0);
            }
            target.setBooleanValue(insertNewElement);
        }
    }
    
    /**
     * Sets (as xml) the "insertNewElement" element
     */
    public void xsetInsertNewElement(org.apache.xmlbeans.XmlBoolean insertNewElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INSERTNEWELEMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INSERTNEWELEMENT$0);
            }
            target.set(insertNewElement);
        }
    }
    
    /**
     * Gets the "newElementValue" element
     */
    public java.lang.String getNewElementValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWELEMENTVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "newElementValue" element
     */
    public org.apache.xmlbeans.XmlString xgetNewElementValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWELEMENTVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "newElementValue" element
     */
    public void setNewElementValue(java.lang.String newElementValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWELEMENTVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWELEMENTVALUE$2);
            }
            target.setStringValue(newElementValue);
        }
    }
    
    /**
     * Sets (as xml) the "newElementValue" element
     */
    public void xsetNewElementValue(org.apache.xmlbeans.XmlString newElementValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWELEMENTVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEWELEMENTVALUE$2);
            }
            target.set(newElementValue);
        }
    }
    
    /**
     * Gets the "leaveTagOpen" element
     */
    public boolean getLeaveTagOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEAVETAGOPEN$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "leaveTagOpen" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetLeaveTagOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LEAVETAGOPEN$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leaveTagOpen" element
     */
    public void setLeaveTagOpen(boolean leaveTagOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEAVETAGOPEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEAVETAGOPEN$4);
            }
            target.setBooleanValue(leaveTagOpen);
        }
    }
    
    /**
     * Sets (as xml) the "leaveTagOpen" element
     */
    public void xsetLeaveTagOpen(org.apache.xmlbeans.XmlBoolean leaveTagOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LEAVETAGOPEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LEAVETAGOPEN$4);
            }
            target.set(leaveTagOpen);
        }
    }
    
    /**
     * Gets the "changeTagName" element
     */
    public boolean getChangeTagName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGETAGNAME$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "changeTagName" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetChangeTagName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHANGETAGNAME$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "changeTagName" element
     */
    public void setChangeTagName(boolean changeTagName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGETAGNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGETAGNAME$6);
            }
            target.setBooleanValue(changeTagName);
        }
    }
    
    /**
     * Sets (as xml) the "changeTagName" element
     */
    public void xsetChangeTagName(org.apache.xmlbeans.XmlBoolean changeTagName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CHANGETAGNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CHANGETAGNAME$6);
            }
            target.set(changeTagName);
        }
    }
    
    /**
     * Gets the "attributeMutation" element
     */
    public com.eviware.soapui.config.MalformedXmlAttributeConfig getAttributeMutation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MalformedXmlAttributeConfig target = null;
            target = (com.eviware.soapui.config.MalformedXmlAttributeConfig)get_store().find_element_user(ATTRIBUTEMUTATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "attributeMutation" element
     */
    public void setAttributeMutation(com.eviware.soapui.config.MalformedXmlAttributeConfig attributeMutation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MalformedXmlAttributeConfig target = null;
            target = (com.eviware.soapui.config.MalformedXmlAttributeConfig)get_store().find_element_user(ATTRIBUTEMUTATION$8, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.MalformedXmlAttributeConfig)get_store().add_element_user(ATTRIBUTEMUTATION$8);
            }
            target.set(attributeMutation);
        }
    }
    
    /**
     * Appends and returns a new empty "attributeMutation" element
     */
    public com.eviware.soapui.config.MalformedXmlAttributeConfig addNewAttributeMutation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.MalformedXmlAttributeConfig target = null;
            target = (com.eviware.soapui.config.MalformedXmlAttributeConfig)get_store().add_element_user(ATTRIBUTEMUTATION$8);
            return target;
        }
    }
    
    /**
     * Gets the "insertInvalidCharacter" element
     */
    public boolean getInsertInvalidCharacter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSERTINVALIDCHARACTER$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "insertInvalidCharacter" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetInsertInvalidCharacter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INSERTINVALIDCHARACTER$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "insertInvalidCharacter" element
     */
    public void setInsertInvalidCharacter(boolean insertInvalidCharacter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSERTINVALIDCHARACTER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSERTINVALIDCHARACTER$10);
            }
            target.setBooleanValue(insertInvalidCharacter);
        }
    }
    
    /**
     * Sets (as xml) the "insertInvalidCharacter" element
     */
    public void xsetInsertInvalidCharacter(org.apache.xmlbeans.XmlBoolean insertInvalidCharacter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INSERTINVALIDCHARACTER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INSERTINVALIDCHARACTER$10);
            }
            target.set(insertInvalidCharacter);
        }
    }
}
