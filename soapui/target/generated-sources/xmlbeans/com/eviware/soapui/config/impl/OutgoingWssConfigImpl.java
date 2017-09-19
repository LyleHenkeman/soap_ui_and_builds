/*
 * XML Type:  OutgoingWss
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OutgoingWssConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML OutgoingWss(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class OutgoingWssConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.OutgoingWssConfig
{
    private static final long serialVersionUID = 1L;
    
    public OutgoingWssConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName USERNAME$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "username");
    private static final javax.xml.namespace.QName PASSWORD$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "password");
    private static final javax.xml.namespace.QName ENTRY$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "entry");
    private static final javax.xml.namespace.QName ENABLESIGNATURECONFIRMATION$8 = 
        new javax.xml.namespace.QName("", "enableSignatureConfirmation");
    private static final javax.xml.namespace.QName PRECISIONINMILLISECONDS$10 = 
        new javax.xml.namespace.QName("", "precisionInMilliSeconds");
    private static final javax.xml.namespace.QName TIMESTAMPSCRIPT$12 = 
        new javax.xml.namespace.QName("", "timeStampScript");
    private static final javax.xml.namespace.QName WSIBSPCOMPLIANT$14 = 
        new javax.xml.namespace.QName("", "wsiBspCompliant");
    private static final javax.xml.namespace.QName ACTOR$16 = 
        new javax.xml.namespace.QName("", "actor");
    private static final javax.xml.namespace.QName MUSTUNDERSTAND$18 = 
        new javax.xml.namespace.QName("", "mustUnderstand");
    
    
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
     * Gets the "username" element
     */
    public java.lang.String getUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "username" element
     */
    public org.apache.xmlbeans.XmlString xgetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "username" element
     */
    public boolean isSetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "username" element
     */
    public void setUsername(java.lang.String username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$2);
            }
            target.setStringValue(username);
        }
    }
    
    /**
     * Sets (as xml) the "username" element
     */
    public void xsetUsername(org.apache.xmlbeans.XmlString username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERNAME$2);
            }
            target.set(username);
        }
    }
    
    /**
     * Unsets the "username" element
     */
    public void unsetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERNAME$2, 0);
        }
    }
    
    /**
     * Gets the "password" element
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" element
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "password" element
     */
    public boolean isSetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PASSWORD$4) != 0;
        }
    }
    
    /**
     * Sets the "password" element
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$4);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" element
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PASSWORD$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PASSWORD$4);
            }
            target.set(password);
        }
    }
    
    /**
     * Unsets the "password" element
     */
    public void unsetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PASSWORD$4, 0);
        }
    }
    
    /**
     * Gets a List of "entry" elements
     */
    public java.util.List<com.eviware.soapui.config.WSSEntryConfig> getEntryList()
    {
        final class EntryList extends java.util.AbstractList<com.eviware.soapui.config.WSSEntryConfig>
        {
            public com.eviware.soapui.config.WSSEntryConfig get(int i)
                { return OutgoingWssConfigImpl.this.getEntryArray(i); }
            
            public com.eviware.soapui.config.WSSEntryConfig set(int i, com.eviware.soapui.config.WSSEntryConfig o)
            {
                com.eviware.soapui.config.WSSEntryConfig old = OutgoingWssConfigImpl.this.getEntryArray(i);
                OutgoingWssConfigImpl.this.setEntryArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.WSSEntryConfig o)
                { OutgoingWssConfigImpl.this.insertNewEntry(i).set(o); }
            
            public com.eviware.soapui.config.WSSEntryConfig remove(int i)
            {
                com.eviware.soapui.config.WSSEntryConfig old = OutgoingWssConfigImpl.this.getEntryArray(i);
                OutgoingWssConfigImpl.this.removeEntry(i);
                return old;
            }
            
            public int size()
                { return OutgoingWssConfigImpl.this.sizeOfEntryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EntryList();
        }
    }
    
    /**
     * Gets array of all "entry" elements
     * @deprecated
     */
    public com.eviware.soapui.config.WSSEntryConfig[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.WSSEntryConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.WSSEntryConfig>();
            get_store().find_all_element_users(ENTRY$6, targetList);
            com.eviware.soapui.config.WSSEntryConfig[] result = new com.eviware.soapui.config.WSSEntryConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public com.eviware.soapui.config.WSSEntryConfig getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WSSEntryConfig target = null;
            target = (com.eviware.soapui.config.WSSEntryConfig)get_store().find_element_user(ENTRY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entry" element
     */
    public int sizeOfEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRY$6);
        }
    }
    
    /**
     * Sets array of all "entry" element
     */
    public void setEntryArray(com.eviware.soapui.config.WSSEntryConfig[] entryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entryArray, ENTRY$6);
        }
    }
    
    /**
     * Sets ith "entry" element
     */
    public void setEntryArray(int i, com.eviware.soapui.config.WSSEntryConfig entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WSSEntryConfig target = null;
            target = (com.eviware.soapui.config.WSSEntryConfig)get_store().find_element_user(ENTRY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    public com.eviware.soapui.config.WSSEntryConfig insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WSSEntryConfig target = null;
            target = (com.eviware.soapui.config.WSSEntryConfig)get_store().insert_element_user(ENTRY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public com.eviware.soapui.config.WSSEntryConfig addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WSSEntryConfig target = null;
            target = (com.eviware.soapui.config.WSSEntryConfig)get_store().add_element_user(ENTRY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "entry" element
     */
    public void removeEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRY$6, i);
        }
    }
    
    /**
     * Gets the "enableSignatureConfirmation" attribute
     */
    public boolean getEnableSignatureConfirmation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLESIGNATURECONFIRMATION$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enableSignatureConfirmation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnableSignatureConfirmation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLESIGNATURECONFIRMATION$8);
            return target;
        }
    }
    
    /**
     * True if has "enableSignatureConfirmation" attribute
     */
    public boolean isSetEnableSignatureConfirmation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENABLESIGNATURECONFIRMATION$8) != null;
        }
    }
    
    /**
     * Sets the "enableSignatureConfirmation" attribute
     */
    public void setEnableSignatureConfirmation(boolean enableSignatureConfirmation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLESIGNATURECONFIRMATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLESIGNATURECONFIRMATION$8);
            }
            target.setBooleanValue(enableSignatureConfirmation);
        }
    }
    
    /**
     * Sets (as xml) the "enableSignatureConfirmation" attribute
     */
    public void xsetEnableSignatureConfirmation(org.apache.xmlbeans.XmlBoolean enableSignatureConfirmation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLESIGNATURECONFIRMATION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLESIGNATURECONFIRMATION$8);
            }
            target.set(enableSignatureConfirmation);
        }
    }
    
    /**
     * Unsets the "enableSignatureConfirmation" attribute
     */
    public void unsetEnableSignatureConfirmation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENABLESIGNATURECONFIRMATION$8);
        }
    }
    
    /**
     * Gets the "precisionInMilliSeconds" attribute
     */
    public boolean getPrecisionInMilliSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRECISIONINMILLISECONDS$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "precisionInMilliSeconds" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrecisionInMilliSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRECISIONINMILLISECONDS$10);
            return target;
        }
    }
    
    /**
     * True if has "precisionInMilliSeconds" attribute
     */
    public boolean isSetPrecisionInMilliSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRECISIONINMILLISECONDS$10) != null;
        }
    }
    
    /**
     * Sets the "precisionInMilliSeconds" attribute
     */
    public void setPrecisionInMilliSeconds(boolean precisionInMilliSeconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRECISIONINMILLISECONDS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRECISIONINMILLISECONDS$10);
            }
            target.setBooleanValue(precisionInMilliSeconds);
        }
    }
    
    /**
     * Sets (as xml) the "precisionInMilliSeconds" attribute
     */
    public void xsetPrecisionInMilliSeconds(org.apache.xmlbeans.XmlBoolean precisionInMilliSeconds)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRECISIONINMILLISECONDS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRECISIONINMILLISECONDS$10);
            }
            target.set(precisionInMilliSeconds);
        }
    }
    
    /**
     * Unsets the "precisionInMilliSeconds" attribute
     */
    public void unsetPrecisionInMilliSeconds()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRECISIONINMILLISECONDS$10);
        }
    }
    
    /**
     * Gets the "timeStampScript" attribute
     */
    public boolean getTimeStampScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMPSCRIPT$12);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeStampScript" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTimeStampScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TIMESTAMPSCRIPT$12);
            return target;
        }
    }
    
    /**
     * True if has "timeStampScript" attribute
     */
    public boolean isSetTimeStampScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TIMESTAMPSCRIPT$12) != null;
        }
    }
    
    /**
     * Sets the "timeStampScript" attribute
     */
    public void setTimeStampScript(boolean timeStampScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMESTAMPSCRIPT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMESTAMPSCRIPT$12);
            }
            target.setBooleanValue(timeStampScript);
        }
    }
    
    /**
     * Sets (as xml) the "timeStampScript" attribute
     */
    public void xsetTimeStampScript(org.apache.xmlbeans.XmlBoolean timeStampScript)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TIMESTAMPSCRIPT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TIMESTAMPSCRIPT$12);
            }
            target.set(timeStampScript);
        }
    }
    
    /**
     * Unsets the "timeStampScript" attribute
     */
    public void unsetTimeStampScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TIMESTAMPSCRIPT$12);
        }
    }
    
    /**
     * Gets the "wsiBspCompliant" attribute
     */
    public boolean getWsiBspCompliant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSIBSPCOMPLIANT$14);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "wsiBspCompliant" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetWsiBspCompliant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WSIBSPCOMPLIANT$14);
            return target;
        }
    }
    
    /**
     * True if has "wsiBspCompliant" attribute
     */
    public boolean isSetWsiBspCompliant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WSIBSPCOMPLIANT$14) != null;
        }
    }
    
    /**
     * Sets the "wsiBspCompliant" attribute
     */
    public void setWsiBspCompliant(boolean wsiBspCompliant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSIBSPCOMPLIANT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WSIBSPCOMPLIANT$14);
            }
            target.setBooleanValue(wsiBspCompliant);
        }
    }
    
    /**
     * Sets (as xml) the "wsiBspCompliant" attribute
     */
    public void xsetWsiBspCompliant(org.apache.xmlbeans.XmlBoolean wsiBspCompliant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WSIBSPCOMPLIANT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(WSIBSPCOMPLIANT$14);
            }
            target.set(wsiBspCompliant);
        }
    }
    
    /**
     * Unsets the "wsiBspCompliant" attribute
     */
    public void unsetWsiBspCompliant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WSIBSPCOMPLIANT$14);
        }
    }
    
    /**
     * Gets the "actor" attribute
     */
    public java.lang.String getActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTOR$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "actor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTOR$16);
            return target;
        }
    }
    
    /**
     * True if has "actor" attribute
     */
    public boolean isSetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTOR$16) != null;
        }
    }
    
    /**
     * Sets the "actor" attribute
     */
    public void setActor(java.lang.String actor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTOR$16);
            }
            target.setStringValue(actor);
        }
    }
    
    /**
     * Sets (as xml) the "actor" attribute
     */
    public void xsetActor(org.apache.xmlbeans.XmlString actor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTOR$16);
            }
            target.set(actor);
        }
    }
    
    /**
     * Unsets the "actor" attribute
     */
    public void unsetActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTOR$16);
        }
    }
    
    /**
     * Gets the "mustUnderstand" attribute
     */
    public boolean getMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUSTUNDERSTAND$18);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mustUnderstand" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MUSTUNDERSTAND$18);
            return target;
        }
    }
    
    /**
     * True if has "mustUnderstand" attribute
     */
    public boolean isSetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MUSTUNDERSTAND$18) != null;
        }
    }
    
    /**
     * Sets the "mustUnderstand" attribute
     */
    public void setMustUnderstand(boolean mustUnderstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUSTUNDERSTAND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MUSTUNDERSTAND$18);
            }
            target.setBooleanValue(mustUnderstand);
        }
    }
    
    /**
     * Sets (as xml) the "mustUnderstand" attribute
     */
    public void xsetMustUnderstand(org.apache.xmlbeans.XmlBoolean mustUnderstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MUSTUNDERSTAND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MUSTUNDERSTAND$18);
            }
            target.set(mustUnderstand);
        }
    }
    
    /**
     * Unsets the "mustUnderstand" attribute
     */
    public void unsetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MUSTUNDERSTAND$18);
        }
    }
}
