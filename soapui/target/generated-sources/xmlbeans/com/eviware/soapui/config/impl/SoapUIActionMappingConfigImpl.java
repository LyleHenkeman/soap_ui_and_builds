/*
 * XML Type:  SoapUIActionMapping
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapUIActionMappingConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML SoapUIActionMapping(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class SoapUIActionMappingConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.SoapUIActionMappingConfig
{
    private static final long serialVersionUID = 1L;
    
    public SoapUIActionMappingConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPID$0 = 
        new javax.xml.namespace.QName("", "groupId");
    private static final javax.xml.namespace.QName ACTIONID$2 = 
        new javax.xml.namespace.QName("", "actionId");
    private static final javax.xml.namespace.QName KEYSTROKE$4 = 
        new javax.xml.namespace.QName("", "keyStroke");
    private static final javax.xml.namespace.QName ICONPATH$6 = 
        new javax.xml.namespace.QName("", "iconPath");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$10 = 
        new javax.xml.namespace.QName("", "description");
    private static final javax.xml.namespace.QName PARAM$12 = 
        new javax.xml.namespace.QName("", "param");
    private static final javax.xml.namespace.QName POSITION$14 = 
        new javax.xml.namespace.QName("", "position");
    private static final javax.xml.namespace.QName POSITIONREF$16 = 
        new javax.xml.namespace.QName("", "positionRef");
    
    
    /**
     * Gets the "groupId" attribute
     */
    public java.lang.String getGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "groupId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUPID$0);
            return target;
        }
    }
    
    /**
     * True if has "groupId" attribute
     */
    public boolean isSetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GROUPID$0) != null;
        }
    }
    
    /**
     * Sets the "groupId" attribute
     */
    public void setGroupId(java.lang.String groupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUPID$0);
            }
            target.setStringValue(groupId);
        }
    }
    
    /**
     * Sets (as xml) the "groupId" attribute
     */
    public void xsetGroupId(org.apache.xmlbeans.XmlString groupId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUPID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUPID$0);
            }
            target.set(groupId);
        }
    }
    
    /**
     * Unsets the "groupId" attribute
     */
    public void unsetGroupId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GROUPID$0);
        }
    }
    
    /**
     * Gets the "actionId" attribute
     */
    public java.lang.String getActionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONID$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "actionId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetActionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTIONID$2);
            return target;
        }
    }
    
    /**
     * True if has "actionId" attribute
     */
    public boolean isSetActionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIONID$2) != null;
        }
    }
    
    /**
     * Sets the "actionId" attribute
     */
    public void setActionId(java.lang.String actionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONID$2);
            }
            target.setStringValue(actionId);
        }
    }
    
    /**
     * Sets (as xml) the "actionId" attribute
     */
    public void xsetActionId(org.apache.xmlbeans.XmlString actionId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTIONID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTIONID$2);
            }
            target.set(actionId);
        }
    }
    
    /**
     * Unsets the "actionId" attribute
     */
    public void unsetActionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIONID$2);
        }
    }
    
    /**
     * Gets the "keyStroke" attribute
     */
    public java.lang.String getKeyStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYSTROKE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "keyStroke" attribute
     */
    public org.apache.xmlbeans.XmlString xgetKeyStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYSTROKE$4);
            return target;
        }
    }
    
    /**
     * True if has "keyStroke" attribute
     */
    public boolean isSetKeyStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEYSTROKE$4) != null;
        }
    }
    
    /**
     * Sets the "keyStroke" attribute
     */
    public void setKeyStroke(java.lang.String keyStroke)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYSTROKE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYSTROKE$4);
            }
            target.setStringValue(keyStroke);
        }
    }
    
    /**
     * Sets (as xml) the "keyStroke" attribute
     */
    public void xsetKeyStroke(org.apache.xmlbeans.XmlString keyStroke)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYSTROKE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEYSTROKE$4);
            }
            target.set(keyStroke);
        }
    }
    
    /**
     * Unsets the "keyStroke" attribute
     */
    public void unsetKeyStroke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEYSTROKE$4);
        }
    }
    
    /**
     * Gets the "iconPath" attribute
     */
    public java.lang.String getIconPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICONPATH$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "iconPath" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIconPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ICONPATH$6);
            return target;
        }
    }
    
    /**
     * True if has "iconPath" attribute
     */
    public boolean isSetIconPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ICONPATH$6) != null;
        }
    }
    
    /**
     * Sets the "iconPath" attribute
     */
    public void setIconPath(java.lang.String iconPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ICONPATH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ICONPATH$6);
            }
            target.setStringValue(iconPath);
        }
    }
    
    /**
     * Sets (as xml) the "iconPath" attribute
     */
    public void xsetIconPath(org.apache.xmlbeans.XmlString iconPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ICONPATH$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ICONPATH$6);
            }
            target.set(iconPath);
        }
    }
    
    /**
     * Unsets the "iconPath" attribute
     */
    public void unsetIconPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ICONPATH$6);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$8) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$8);
        }
    }
    
    /**
     * Gets the "description" attribute
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
            return target;
        }
    }
    
    /**
     * True if has "description" attribute
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTION$10) != null;
        }
    }
    
    /**
     * Sets the "description" attribute
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$10);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" attribute
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$10);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" attribute
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTION$10);
        }
    }
    
    /**
     * Gets the "param" attribute
     */
    public java.lang.String getParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAM$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "param" attribute
     */
    public org.apache.xmlbeans.XmlString xgetParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAM$12);
            return target;
        }
    }
    
    /**
     * True if has "param" attribute
     */
    public boolean isSetParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARAM$12) != null;
        }
    }
    
    /**
     * Sets the "param" attribute
     */
    public void setParam(java.lang.String param)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAM$12);
            }
            target.setStringValue(param);
        }
    }
    
    /**
     * Sets (as xml) the "param" attribute
     */
    public void xsetParam(org.apache.xmlbeans.XmlString param)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARAM$12);
            }
            target.set(param);
        }
    }
    
    /**
     * Unsets the "param" attribute
     */
    public void unsetParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARAM$12);
        }
    }
    
    /**
     * Gets the "position" attribute
     */
    public com.eviware.soapui.config.ActionMappingPositionTypeConfig.Enum getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$14);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.ActionMappingPositionTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "position" attribute
     */
    public com.eviware.soapui.config.ActionMappingPositionTypeConfig xgetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ActionMappingPositionTypeConfig target = null;
            target = (com.eviware.soapui.config.ActionMappingPositionTypeConfig)get_store().find_attribute_user(POSITION$14);
            return target;
        }
    }
    
    /**
     * True if has "position" attribute
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSITION$14) != null;
        }
    }
    
    /**
     * Sets the "position" attribute
     */
    public void setPosition(com.eviware.soapui.config.ActionMappingPositionTypeConfig.Enum position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$14);
            }
            target.setEnumValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "position" attribute
     */
    public void xsetPosition(com.eviware.soapui.config.ActionMappingPositionTypeConfig position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ActionMappingPositionTypeConfig target = null;
            target = (com.eviware.soapui.config.ActionMappingPositionTypeConfig)get_store().find_attribute_user(POSITION$14);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ActionMappingPositionTypeConfig)get_store().add_attribute_user(POSITION$14);
            }
            target.set(position);
        }
    }
    
    /**
     * Unsets the "position" attribute
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSITION$14);
        }
    }
    
    /**
     * Gets the "positionRef" attribute
     */
    public java.lang.String getPositionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITIONREF$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "positionRef" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPositionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSITIONREF$16);
            return target;
        }
    }
    
    /**
     * True if has "positionRef" attribute
     */
    public boolean isSetPositionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSITIONREF$16) != null;
        }
    }
    
    /**
     * Sets the "positionRef" attribute
     */
    public void setPositionRef(java.lang.String positionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITIONREF$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITIONREF$16);
            }
            target.setStringValue(positionRef);
        }
    }
    
    /**
     * Sets (as xml) the "positionRef" attribute
     */
    public void xsetPositionRef(org.apache.xmlbeans.XmlString positionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSITIONREF$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSITIONREF$16);
            }
            target.set(positionRef);
        }
    }
    
    /**
     * Unsets the "positionRef" attribute
     */
    public void unsetPositionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSITIONREF$16);
        }
    }
}
