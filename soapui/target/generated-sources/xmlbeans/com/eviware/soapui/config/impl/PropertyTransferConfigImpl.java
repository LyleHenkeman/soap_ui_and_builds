/*
 * XML Type:  PropertyTransfer
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.PropertyTransferConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML PropertyTransfer(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class PropertyTransferConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.PropertyTransferConfig
{
    private static final long serialVersionUID = 1L;
    
    public PropertyTransferConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName SOURCETYPE$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "sourceType");
    private static final javax.xml.namespace.QName SOURCESTEP$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "sourceStep");
    private static final javax.xml.namespace.QName SOURCEPATH$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "sourcePath");
    private static final javax.xml.namespace.QName TARGETTYPE$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "targetType");
    private static final javax.xml.namespace.QName TARGETSTEP$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "targetStep");
    private static final javax.xml.namespace.QName TARGETPATH$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "targetPath");
    private static final javax.xml.namespace.QName TYPE$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "type");
    private static final javax.xml.namespace.QName TARGETTRANSFERTYPE$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "targetTransferType");
    private static final javax.xml.namespace.QName UPGRADED$18 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "upgraded");
    private static final javax.xml.namespace.QName FAILONERROR$20 = 
        new javax.xml.namespace.QName("", "failOnError");
    private static final javax.xml.namespace.QName SETNULLONMISSINGSOURCE$22 = 
        new javax.xml.namespace.QName("", "setNullOnMissingSource");
    private static final javax.xml.namespace.QName TRANSFERTEXTCONTENT$24 = 
        new javax.xml.namespace.QName("", "transferTextContent");
    private static final javax.xml.namespace.QName IGNOREEMPTY$26 = 
        new javax.xml.namespace.QName("", "ignoreEmpty");
    private static final javax.xml.namespace.QName TRANSFERTOALL$28 = 
        new javax.xml.namespace.QName("", "transferToAll");
    private static final javax.xml.namespace.QName USEXQUERY$30 = 
        new javax.xml.namespace.QName("", "useXQuery");
    private static final javax.xml.namespace.QName DISABLED$32 = 
        new javax.xml.namespace.QName("", "disabled");
    private static final javax.xml.namespace.QName TRANSFERCHILDNODES$34 = 
        new javax.xml.namespace.QName("", "transferChildNodes");
    private static final javax.xml.namespace.QName ENTITIZE$36 = 
        new javax.xml.namespace.QName("", "entitize");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "sourceType" element
     */
    public java.lang.String getSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceType" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCETYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "sourceType" element
     */
    public boolean isSetSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCETYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "sourceType" element
     */
    public void setSourceType(java.lang.String sourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETYPE$2);
            }
            target.setStringValue(sourceType);
        }
    }
    
    /**
     * Sets (as xml) the "sourceType" element
     */
    public void xsetSourceType(org.apache.xmlbeans.XmlString sourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCETYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCETYPE$2);
            }
            target.set(sourceType);
        }
    }
    
    /**
     * Unsets the "sourceType" element
     */
    public void unsetSourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCETYPE$2, 0);
        }
    }
    
    /**
     * Gets the "sourceStep" element
     */
    public java.lang.String getSourceStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESTEP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceStep" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESTEP$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "sourceStep" element
     */
    public boolean isSetSourceStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCESTEP$4) != 0;
        }
    }
    
    /**
     * Sets the "sourceStep" element
     */
    public void setSourceStep(java.lang.String sourceStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCESTEP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCESTEP$4);
            }
            target.setStringValue(sourceStep);
        }
    }
    
    /**
     * Sets (as xml) the "sourceStep" element
     */
    public void xsetSourceStep(org.apache.xmlbeans.XmlString sourceStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCESTEP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCESTEP$4);
            }
            target.set(sourceStep);
        }
    }
    
    /**
     * Unsets the "sourceStep" element
     */
    public void unsetSourceStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCESTEP$4, 0);
        }
    }
    
    /**
     * Gets the "sourcePath" element
     */
    public java.lang.String getSourcePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEPATH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourcePath" element
     */
    public org.apache.xmlbeans.XmlString xgetSourcePath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEPATH$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourcePath" element
     */
    public void setSourcePath(java.lang.String sourcePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEPATH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEPATH$6);
            }
            target.setStringValue(sourcePath);
        }
    }
    
    /**
     * Sets (as xml) the "sourcePath" element
     */
    public void xsetSourcePath(org.apache.xmlbeans.XmlString sourcePath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEPATH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEPATH$6);
            }
            target.set(sourcePath);
        }
    }
    
    /**
     * Gets the "targetType" element
     */
    public java.lang.String getTargetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetType" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETTYPE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "targetType" element
     */
    public boolean isSetTargetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETTYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "targetType" element
     */
    public void setTargetType(java.lang.String targetType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETTYPE$8);
            }
            target.setStringValue(targetType);
        }
    }
    
    /**
     * Sets (as xml) the "targetType" element
     */
    public void xsetTargetType(org.apache.xmlbeans.XmlString targetType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETTYPE$8);
            }
            target.set(targetType);
        }
    }
    
    /**
     * Unsets the "targetType" element
     */
    public void unsetTargetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETTYPE$8, 0);
        }
    }
    
    /**
     * Gets the "targetStep" element
     */
    public java.lang.String getTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETSTEP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetStep" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETSTEP$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "targetStep" element
     */
    public boolean isSetTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETSTEP$10) != 0;
        }
    }
    
    /**
     * Sets the "targetStep" element
     */
    public void setTargetStep(java.lang.String targetStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETSTEP$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETSTEP$10);
            }
            target.setStringValue(targetStep);
        }
    }
    
    /**
     * Sets (as xml) the "targetStep" element
     */
    public void xsetTargetStep(org.apache.xmlbeans.XmlString targetStep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETSTEP$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETSTEP$10);
            }
            target.set(targetStep);
        }
    }
    
    /**
     * Unsets the "targetStep" element
     */
    public void unsetTargetStep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETSTEP$10, 0);
        }
    }
    
    /**
     * Gets the "targetPath" element
     */
    public java.lang.String getTargetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETPATH$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetPath" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETPATH$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetPath" element
     */
    public void setTargetPath(java.lang.String targetPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETPATH$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETPATH$12);
            }
            target.setStringValue(targetPath);
        }
    }
    
    /**
     * Sets (as xml) the "targetPath" element
     */
    public void xsetTargetPath(org.apache.xmlbeans.XmlString targetPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETPATH$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETPATH$12);
            }
            target.set(targetPath);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public com.eviware.soapui.config.PropertyTransferTypesConfig.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$14, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.PropertyTransferTypesConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public com.eviware.soapui.config.PropertyTransferTypesConfig xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyTransferTypesConfig target = null;
            target = (com.eviware.soapui.config.PropertyTransferTypesConfig)get_store().find_element_user(TYPE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$14) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(com.eviware.soapui.config.PropertyTransferTypesConfig.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$14);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(com.eviware.soapui.config.PropertyTransferTypesConfig type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyTransferTypesConfig target = null;
            target = (com.eviware.soapui.config.PropertyTransferTypesConfig)get_store().find_element_user(TYPE$14, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertyTransferTypesConfig)get_store().add_element_user(TYPE$14);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$14, 0);
        }
    }
    
    /**
     * Gets the "targetTransferType" element
     */
    public com.eviware.soapui.config.PropertyTransferTypesConfig.Enum getTargetTransferType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTRANSFERTYPE$16, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.PropertyTransferTypesConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetTransferType" element
     */
    public com.eviware.soapui.config.PropertyTransferTypesConfig xgetTargetTransferType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyTransferTypesConfig target = null;
            target = (com.eviware.soapui.config.PropertyTransferTypesConfig)get_store().find_element_user(TARGETTRANSFERTYPE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "targetTransferType" element
     */
    public boolean isSetTargetTransferType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETTRANSFERTYPE$16) != 0;
        }
    }
    
    /**
     * Sets the "targetTransferType" element
     */
    public void setTargetTransferType(com.eviware.soapui.config.PropertyTransferTypesConfig.Enum targetTransferType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTRANSFERTYPE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETTRANSFERTYPE$16);
            }
            target.setEnumValue(targetTransferType);
        }
    }
    
    /**
     * Sets (as xml) the "targetTransferType" element
     */
    public void xsetTargetTransferType(com.eviware.soapui.config.PropertyTransferTypesConfig targetTransferType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.PropertyTransferTypesConfig target = null;
            target = (com.eviware.soapui.config.PropertyTransferTypesConfig)get_store().find_element_user(TARGETTRANSFERTYPE$16, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.PropertyTransferTypesConfig)get_store().add_element_user(TARGETTRANSFERTYPE$16);
            }
            target.set(targetTransferType);
        }
    }
    
    /**
     * Unsets the "targetTransferType" element
     */
    public void unsetTargetTransferType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETTRANSFERTYPE$16, 0);
        }
    }
    
    /**
     * Gets the "upgraded" element
     */
    public boolean getUpgraded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPGRADED$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "upgraded" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetUpgraded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UPGRADED$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "upgraded" element
     */
    public void setUpgraded(boolean upgraded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPGRADED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPGRADED$18);
            }
            target.setBooleanValue(upgraded);
        }
    }
    
    /**
     * Sets (as xml) the "upgraded" element
     */
    public void xsetUpgraded(org.apache.xmlbeans.XmlBoolean upgraded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UPGRADED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(UPGRADED$18);
            }
            target.set(upgraded);
        }
    }
    
    /**
     * Gets the "failOnError" attribute
     */
    public boolean getFailOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILONERROR$20);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "failOnError" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFailOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILONERROR$20);
            return target;
        }
    }
    
    /**
     * True if has "failOnError" attribute
     */
    public boolean isSetFailOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FAILONERROR$20) != null;
        }
    }
    
    /**
     * Sets the "failOnError" attribute
     */
    public void setFailOnError(boolean failOnError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FAILONERROR$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FAILONERROR$20);
            }
            target.setBooleanValue(failOnError);
        }
    }
    
    /**
     * Sets (as xml) the "failOnError" attribute
     */
    public void xsetFailOnError(org.apache.xmlbeans.XmlBoolean failOnError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FAILONERROR$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FAILONERROR$20);
            }
            target.set(failOnError);
        }
    }
    
    /**
     * Unsets the "failOnError" attribute
     */
    public void unsetFailOnError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FAILONERROR$20);
        }
    }
    
    /**
     * Gets the "setNullOnMissingSource" attribute
     */
    public boolean getSetNullOnMissingSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETNULLONMISSINGSOURCE$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "setNullOnMissingSource" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetSetNullOnMissingSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SETNULLONMISSINGSOURCE$22);
            return target;
        }
    }
    
    /**
     * True if has "setNullOnMissingSource" attribute
     */
    public boolean isSetSetNullOnMissingSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SETNULLONMISSINGSOURCE$22) != null;
        }
    }
    
    /**
     * Sets the "setNullOnMissingSource" attribute
     */
    public void setSetNullOnMissingSource(boolean setNullOnMissingSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETNULLONMISSINGSOURCE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETNULLONMISSINGSOURCE$22);
            }
            target.setBooleanValue(setNullOnMissingSource);
        }
    }
    
    /**
     * Sets (as xml) the "setNullOnMissingSource" attribute
     */
    public void xsetSetNullOnMissingSource(org.apache.xmlbeans.XmlBoolean setNullOnMissingSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SETNULLONMISSINGSOURCE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SETNULLONMISSINGSOURCE$22);
            }
            target.set(setNullOnMissingSource);
        }
    }
    
    /**
     * Unsets the "setNullOnMissingSource" attribute
     */
    public void unsetSetNullOnMissingSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SETNULLONMISSINGSOURCE$22);
        }
    }
    
    /**
     * Gets the "transferTextContent" attribute
     */
    public boolean getTransferTextContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFERTEXTCONTENT$24);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "transferTextContent" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTransferTextContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSFERTEXTCONTENT$24);
            return target;
        }
    }
    
    /**
     * True if has "transferTextContent" attribute
     */
    public boolean isSetTransferTextContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANSFERTEXTCONTENT$24) != null;
        }
    }
    
    /**
     * Sets the "transferTextContent" attribute
     */
    public void setTransferTextContent(boolean transferTextContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFERTEXTCONTENT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSFERTEXTCONTENT$24);
            }
            target.setBooleanValue(transferTextContent);
        }
    }
    
    /**
     * Sets (as xml) the "transferTextContent" attribute
     */
    public void xsetTransferTextContent(org.apache.xmlbeans.XmlBoolean transferTextContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSFERTEXTCONTENT$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRANSFERTEXTCONTENT$24);
            }
            target.set(transferTextContent);
        }
    }
    
    /**
     * Unsets the "transferTextContent" attribute
     */
    public void unsetTransferTextContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANSFERTEXTCONTENT$24);
        }
    }
    
    /**
     * Gets the "ignoreEmpty" attribute
     */
    public boolean getIgnoreEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREEMPTY$26);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ignoreEmpty" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIgnoreEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREEMPTY$26);
            return target;
        }
    }
    
    /**
     * True if has "ignoreEmpty" attribute
     */
    public boolean isSetIgnoreEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IGNOREEMPTY$26) != null;
        }
    }
    
    /**
     * Sets the "ignoreEmpty" attribute
     */
    public void setIgnoreEmpty(boolean ignoreEmpty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREEMPTY$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNOREEMPTY$26);
            }
            target.setBooleanValue(ignoreEmpty);
        }
    }
    
    /**
     * Sets (as xml) the "ignoreEmpty" attribute
     */
    public void xsetIgnoreEmpty(org.apache.xmlbeans.XmlBoolean ignoreEmpty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IGNOREEMPTY$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IGNOREEMPTY$26);
            }
            target.set(ignoreEmpty);
        }
    }
    
    /**
     * Unsets the "ignoreEmpty" attribute
     */
    public void unsetIgnoreEmpty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IGNOREEMPTY$26);
        }
    }
    
    /**
     * Gets the "transferToAll" attribute
     */
    public boolean getTransferToAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFERTOALL$28);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "transferToAll" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTransferToAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSFERTOALL$28);
            return target;
        }
    }
    
    /**
     * True if has "transferToAll" attribute
     */
    public boolean isSetTransferToAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANSFERTOALL$28) != null;
        }
    }
    
    /**
     * Sets the "transferToAll" attribute
     */
    public void setTransferToAll(boolean transferToAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFERTOALL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSFERTOALL$28);
            }
            target.setBooleanValue(transferToAll);
        }
    }
    
    /**
     * Sets (as xml) the "transferToAll" attribute
     */
    public void xsetTransferToAll(org.apache.xmlbeans.XmlBoolean transferToAll)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSFERTOALL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRANSFERTOALL$28);
            }
            target.set(transferToAll);
        }
    }
    
    /**
     * Unsets the "transferToAll" attribute
     */
    public void unsetTransferToAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANSFERTOALL$28);
        }
    }
    
    /**
     * Gets the "useXQuery" attribute
     */
    public boolean getUseXQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEXQUERY$30);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useXQuery" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseXQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEXQUERY$30);
            return target;
        }
    }
    
    /**
     * True if has "useXQuery" attribute
     */
    public boolean isSetUseXQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USEXQUERY$30) != null;
        }
    }
    
    /**
     * Sets the "useXQuery" attribute
     */
    public void setUseXQuery(boolean useXQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEXQUERY$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEXQUERY$30);
            }
            target.setBooleanValue(useXQuery);
        }
    }
    
    /**
     * Sets (as xml) the "useXQuery" attribute
     */
    public void xsetUseXQuery(org.apache.xmlbeans.XmlBoolean useXQuery)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEXQUERY$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEXQUERY$30);
            }
            target.set(useXQuery);
        }
    }
    
    /**
     * Unsets the "useXQuery" attribute
     */
    public void unsetUseXQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USEXQUERY$30);
        }
    }
    
    /**
     * Gets the "disabled" attribute
     */
    public boolean getDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$32);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "disabled" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$32);
            return target;
        }
    }
    
    /**
     * True if has "disabled" attribute
     */
    public boolean isSetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISABLED$32) != null;
        }
    }
    
    /**
     * Sets the "disabled" attribute
     */
    public void setDisabled(boolean disabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLED$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLED$32);
            }
            target.setBooleanValue(disabled);
        }
    }
    
    /**
     * Sets (as xml) the "disabled" attribute
     */
    public void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(DISABLED$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(DISABLED$32);
            }
            target.set(disabled);
        }
    }
    
    /**
     * Unsets the "disabled" attribute
     */
    public void unsetDisabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISABLED$32);
        }
    }
    
    /**
     * Gets the "transferChildNodes" attribute
     */
    public boolean getTransferChildNodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFERCHILDNODES$34);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "transferChildNodes" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTransferChildNodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSFERCHILDNODES$34);
            return target;
        }
    }
    
    /**
     * True if has "transferChildNodes" attribute
     */
    public boolean isSetTransferChildNodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TRANSFERCHILDNODES$34) != null;
        }
    }
    
    /**
     * Sets the "transferChildNodes" attribute
     */
    public void setTransferChildNodes(boolean transferChildNodes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSFERCHILDNODES$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSFERCHILDNODES$34);
            }
            target.setBooleanValue(transferChildNodes);
        }
    }
    
    /**
     * Sets (as xml) the "transferChildNodes" attribute
     */
    public void xsetTransferChildNodes(org.apache.xmlbeans.XmlBoolean transferChildNodes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TRANSFERCHILDNODES$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TRANSFERCHILDNODES$34);
            }
            target.set(transferChildNodes);
        }
    }
    
    /**
     * Unsets the "transferChildNodes" attribute
     */
    public void unsetTransferChildNodes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TRANSFERCHILDNODES$34);
        }
    }
    
    /**
     * Gets the "entitize" attribute
     */
    public boolean getEntitize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITIZE$36);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "entitize" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEntitize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENTITIZE$36);
            return target;
        }
    }
    
    /**
     * True if has "entitize" attribute
     */
    public boolean isSetEntitize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENTITIZE$36) != null;
        }
    }
    
    /**
     * Sets the "entitize" attribute
     */
    public void setEntitize(boolean entitize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITIZE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITIZE$36);
            }
            target.setBooleanValue(entitize);
        }
    }
    
    /**
     * Sets (as xml) the "entitize" attribute
     */
    public void xsetEntitize(org.apache.xmlbeans.XmlBoolean entitize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENTITIZE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENTITIZE$36);
            }
            target.set(entitize);
        }
    }
    
    /**
     * Unsets the "entitize" attribute
     */
    public void unsetEntitize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENTITIZE$36);
        }
    }
}
