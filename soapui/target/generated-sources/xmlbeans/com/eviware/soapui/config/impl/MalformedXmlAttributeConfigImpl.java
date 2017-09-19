/*
 * XML Type:  MalformedXmlAttribute
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MalformedXmlAttributeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MalformedXmlAttribute(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MalformedXmlAttributeConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.MalformedXmlAttributeConfig
{
    private static final long serialVersionUID = 1L;
    
    public MalformedXmlAttributeConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEAVEATTRIBUTEOPEN$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "leaveAttributeOpen");
    private static final javax.xml.namespace.QName INSERTINVALIDCHARS$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "insertInvalidChars");
    private static final javax.xml.namespace.QName MUTATEATTRIBUTES$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "mutateAttributes");
    private static final javax.xml.namespace.QName NEWATTRIBUTENAME$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "newAttributeName");
    private static final javax.xml.namespace.QName NEWATTRIBUTEVALUE$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "newAttributeValue");
    private static final javax.xml.namespace.QName ADDNEWATTRIBUTE$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "addNewAttribute");
    
    
    /**
     * Gets the "leaveAttributeOpen" element
     */
    public boolean getLeaveAttributeOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEAVEATTRIBUTEOPEN$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "leaveAttributeOpen" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetLeaveAttributeOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LEAVEATTRIBUTEOPEN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "leaveAttributeOpen" element
     */
    public void setLeaveAttributeOpen(boolean leaveAttributeOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEAVEATTRIBUTEOPEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEAVEATTRIBUTEOPEN$0);
            }
            target.setBooleanValue(leaveAttributeOpen);
        }
    }
    
    /**
     * Sets (as xml) the "leaveAttributeOpen" element
     */
    public void xsetLeaveAttributeOpen(org.apache.xmlbeans.XmlBoolean leaveAttributeOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LEAVEATTRIBUTEOPEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LEAVEATTRIBUTEOPEN$0);
            }
            target.set(leaveAttributeOpen);
        }
    }
    
    /**
     * Gets the "insertInvalidChars" element
     */
    public boolean getInsertInvalidChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSERTINVALIDCHARS$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "insertInvalidChars" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetInsertInvalidChars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INSERTINVALIDCHARS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "insertInvalidChars" element
     */
    public void setInsertInvalidChars(boolean insertInvalidChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSERTINVALIDCHARS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSERTINVALIDCHARS$2);
            }
            target.setBooleanValue(insertInvalidChars);
        }
    }
    
    /**
     * Sets (as xml) the "insertInvalidChars" element
     */
    public void xsetInsertInvalidChars(org.apache.xmlbeans.XmlBoolean insertInvalidChars)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INSERTINVALIDCHARS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INSERTINVALIDCHARS$2);
            }
            target.set(insertInvalidChars);
        }
    }
    
    /**
     * Gets the "mutateAttributes" element
     */
    public boolean getMutateAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUTATEATTRIBUTES$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mutateAttributes" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMutateAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MUTATEATTRIBUTES$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mutateAttributes" element
     */
    public void setMutateAttributes(boolean mutateAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MUTATEATTRIBUTES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MUTATEATTRIBUTES$4);
            }
            target.setBooleanValue(mutateAttributes);
        }
    }
    
    /**
     * Sets (as xml) the "mutateAttributes" element
     */
    public void xsetMutateAttributes(org.apache.xmlbeans.XmlBoolean mutateAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MUTATEATTRIBUTES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MUTATEATTRIBUTES$4);
            }
            target.set(mutateAttributes);
        }
    }
    
    /**
     * Gets the "newAttributeName" element
     */
    public java.lang.String getNewAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWATTRIBUTENAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "newAttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetNewAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWATTRIBUTENAME$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "newAttributeName" element
     */
    public void setNewAttributeName(java.lang.String newAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWATTRIBUTENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWATTRIBUTENAME$6);
            }
            target.setStringValue(newAttributeName);
        }
    }
    
    /**
     * Sets (as xml) the "newAttributeName" element
     */
    public void xsetNewAttributeName(org.apache.xmlbeans.XmlString newAttributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWATTRIBUTENAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEWATTRIBUTENAME$6);
            }
            target.set(newAttributeName);
        }
    }
    
    /**
     * Gets the "newAttributeValue" element
     */
    public java.lang.String getNewAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWATTRIBUTEVALUE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "newAttributeValue" element
     */
    public org.apache.xmlbeans.XmlString xgetNewAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWATTRIBUTEVALUE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "newAttributeValue" element
     */
    public void setNewAttributeValue(java.lang.String newAttributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWATTRIBUTEVALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWATTRIBUTEVALUE$8);
            }
            target.setStringValue(newAttributeValue);
        }
    }
    
    /**
     * Sets (as xml) the "newAttributeValue" element
     */
    public void xsetNewAttributeValue(org.apache.xmlbeans.XmlString newAttributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWATTRIBUTEVALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEWATTRIBUTEVALUE$8);
            }
            target.set(newAttributeValue);
        }
    }
    
    /**
     * Gets the "addNewAttribute" element
     */
    public boolean getAddNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDNEWATTRIBUTE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "addNewAttribute" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAddNewAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ADDNEWATTRIBUTE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "addNewAttribute" element
     */
    public void setAddNewAttribute(boolean addNewAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDNEWATTRIBUTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDNEWATTRIBUTE$10);
            }
            target.setBooleanValue(addNewAttribute);
        }
    }
    
    /**
     * Sets (as xml) the "addNewAttribute" element
     */
    public void xsetAddNewAttribute(org.apache.xmlbeans.XmlBoolean addNewAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ADDNEWATTRIBUTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ADDNEWATTRIBUTE$10);
            }
            target.set(addNewAttribute);
        }
    }
}
