/*
 * XML Type:  webservicesType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.WebservicesType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML webservicesType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class WebservicesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.WebservicesType
{
    private static final long serialVersionUID = 1L;
    
    public WebservicesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "icon");
    private static final javax.xml.namespace.QName WEBSERVICEDESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "webservice-description");
    private static final javax.xml.namespace.QName VERSION$8 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return WebservicesTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = WebservicesTypeImpl.this.getDescriptionArray(i);
                WebservicesTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { WebservicesTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = WebservicesTypeImpl.this.getDescriptionArray(i);
                WebservicesTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return WebservicesTypeImpl.this.sizeOfDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptionList();
        }
    }
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.DescriptionType>();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            com.sun.java.xml.ns.j2Ee.DescriptionType[] result = new com.sun.java.xml.ns.j2Ee.DescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(com.sun.java.xml.ns.j2Ee.DescriptionType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, com.sun.java.xml.ns.j2Ee.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public com.sun.java.xml.ns.j2Ee.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, i);
        }
    }
    
    /**
     * Gets a List of "display-name" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DisplayNameType> getDisplayNameList()
    {
        final class DisplayNameList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DisplayNameType>
        {
            public com.sun.java.xml.ns.j2Ee.DisplayNameType get(int i)
                { return WebservicesTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType set(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = WebservicesTypeImpl.this.getDisplayNameArray(i);
                WebservicesTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
                { WebservicesTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = WebservicesTypeImpl.this.getDisplayNameArray(i);
                WebservicesTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return WebservicesTypeImpl.this.sizeOfDisplayNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayNameList();
        }
    }
    
    /**
     * Gets array of all "display-name" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.DisplayNameType[] getDisplayNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.DisplayNameType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.DisplayNameType>();
            get_store().find_all_element_users(DISPLAYNAME$2, targetList);
            com.sun.java.xml.ns.j2Ee.DisplayNameType[] result = new com.sun.java.xml.ns.j2Ee.DisplayNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "display-name" element
     */
    public com.sun.java.xml.ns.j2Ee.DisplayNameType getDisplayNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "display-name" element
     */
    public int sizeOfDisplayNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$2);
        }
    }
    
    /**
     * Sets array of all "display-name" element
     */
    public void setDisplayNameArray(com.sun.java.xml.ns.j2Ee.DisplayNameType[] displayNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(displayNameArray, DISPLAYNAME$2);
        }
    }
    
    /**
     * Sets ith "display-name" element
     */
    public void setDisplayNameArray(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(displayName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "display-name" element
     */
    public com.sun.java.xml.ns.j2Ee.DisplayNameType insertNewDisplayName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().insert_element_user(DISPLAYNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "display-name" element
     */
    public com.sun.java.xml.ns.j2Ee.DisplayNameType addNewDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DisplayNameType)get_store().add_element_user(DISPLAYNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "display-name" element
     */
    public void removeDisplayName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$2, i);
        }
    }
    
    /**
     * Gets a List of "icon" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.IconType> getIconList()
    {
        final class IconList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.IconType>
        {
            public com.sun.java.xml.ns.j2Ee.IconType get(int i)
                { return WebservicesTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.IconType set(int i, com.sun.java.xml.ns.j2Ee.IconType o)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = WebservicesTypeImpl.this.getIconArray(i);
                WebservicesTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.IconType o)
                { WebservicesTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.IconType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = WebservicesTypeImpl.this.getIconArray(i);
                WebservicesTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return WebservicesTypeImpl.this.sizeOfIconArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IconList();
        }
    }
    
    /**
     * Gets array of all "icon" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.IconType[] getIconArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.IconType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.IconType>();
            get_store().find_all_element_users(ICON$4, targetList);
            com.sun.java.xml.ns.j2Ee.IconType[] result = new com.sun.java.xml.ns.j2Ee.IconType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "icon" element
     */
    public com.sun.java.xml.ns.j2Ee.IconType getIconArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().find_element_user(ICON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "icon" element
     */
    public int sizeOfIconArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICON$4);
        }
    }
    
    /**
     * Sets array of all "icon" element
     */
    public void setIconArray(com.sun.java.xml.ns.j2Ee.IconType[] iconArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iconArray, ICON$4);
        }
    }
    
    /**
     * Sets ith "icon" element
     */
    public void setIconArray(int i, com.sun.java.xml.ns.j2Ee.IconType icon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().find_element_user(ICON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(icon);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "icon" element
     */
    public com.sun.java.xml.ns.j2Ee.IconType insertNewIcon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().insert_element_user(ICON$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "icon" element
     */
    public com.sun.java.xml.ns.j2Ee.IconType addNewIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.IconType target = null;
            target = (com.sun.java.xml.ns.j2Ee.IconType)get_store().add_element_user(ICON$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "icon" element
     */
    public void removeIcon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICON$4, i);
        }
    }
    
    /**
     * Gets a List of "webservice-description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType> getWebserviceDescriptionList()
    {
        final class WebserviceDescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType get(int i)
                { return WebservicesTypeImpl.this.getWebserviceDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType set(int i, com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType old = WebservicesTypeImpl.this.getWebserviceDescriptionArray(i);
                WebservicesTypeImpl.this.setWebserviceDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType o)
                { WebservicesTypeImpl.this.insertNewWebserviceDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType old = WebservicesTypeImpl.this.getWebserviceDescriptionArray(i);
                WebservicesTypeImpl.this.removeWebserviceDescription(i);
                return old;
            }
            
            public int size()
                { return WebservicesTypeImpl.this.sizeOfWebserviceDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WebserviceDescriptionList();
        }
    }
    
    /**
     * Gets array of all "webservice-description" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType[] getWebserviceDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType>();
            get_store().find_all_element_users(WEBSERVICEDESCRIPTION$6, targetList);
            com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType[] result = new com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "webservice-description" element
     */
    public com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType getWebserviceDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType)get_store().find_element_user(WEBSERVICEDESCRIPTION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "webservice-description" element
     */
    public int sizeOfWebserviceDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBSERVICEDESCRIPTION$6);
        }
    }
    
    /**
     * Sets array of all "webservice-description" element
     */
    public void setWebserviceDescriptionArray(com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType[] webserviceDescriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(webserviceDescriptionArray, WEBSERVICEDESCRIPTION$6);
        }
    }
    
    /**
     * Sets ith "webservice-description" element
     */
    public void setWebserviceDescriptionArray(int i, com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType webserviceDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType)get_store().find_element_user(WEBSERVICEDESCRIPTION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(webserviceDescription);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "webservice-description" element
     */
    public com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType insertNewWebserviceDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType)get_store().insert_element_user(WEBSERVICEDESCRIPTION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "webservice-description" element
     */
    public com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType addNewWebserviceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType)get_store().add_element_user(WEBSERVICEDESCRIPTION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "webservice-description" element
     */
    public void removeWebserviceDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBSERVICEDESCRIPTION$6, i);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.math.BigDecimal getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$8);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public com.sun.java.xml.ns.j2Ee.DeweyVersionType xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DeweyVersionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DeweyVersionType)get_store().find_attribute_user(VERSION$8);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.DeweyVersionType)get_default_attribute_value(VERSION$8);
            }
            return target;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.math.BigDecimal version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$8);
            }
            target.setBigDecimalValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(com.sun.java.xml.ns.j2Ee.DeweyVersionType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DeweyVersionType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DeweyVersionType)get_store().find_attribute_user(VERSION$8);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.DeweyVersionType)get_store().add_attribute_user(VERSION$8);
            }
            target.set(version);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$10) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$10);
        }
    }
}
