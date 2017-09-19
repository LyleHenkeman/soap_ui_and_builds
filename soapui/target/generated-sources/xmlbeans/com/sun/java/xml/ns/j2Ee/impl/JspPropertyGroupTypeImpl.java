/*
 * XML Type:  jsp-property-groupType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.JspPropertyGroupType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML jsp-property-groupType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class JspPropertyGroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.JspPropertyGroupType
{
    private static final long serialVersionUID = 1L;
    
    public JspPropertyGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "icon");
    private static final javax.xml.namespace.QName URLPATTERN$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "url-pattern");
    private static final javax.xml.namespace.QName ELIGNORED$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "el-ignored");
    private static final javax.xml.namespace.QName PAGEENCODING$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "page-encoding");
    private static final javax.xml.namespace.QName SCRIPTINGINVALID$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "scripting-invalid");
    private static final javax.xml.namespace.QName ISXML$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "is-xml");
    private static final javax.xml.namespace.QName INCLUDEPRELUDE$16 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "include-prelude");
    private static final javax.xml.namespace.QName INCLUDECODA$18 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "include-coda");
    private static final javax.xml.namespace.QName ID$20 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return JspPropertyGroupTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = JspPropertyGroupTypeImpl.this.getDescriptionArray(i);
                JspPropertyGroupTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { JspPropertyGroupTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = JspPropertyGroupTypeImpl.this.getDescriptionArray(i);
                JspPropertyGroupTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return JspPropertyGroupTypeImpl.this.sizeOfDescriptionArray(); }
            
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
                { return JspPropertyGroupTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType set(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = JspPropertyGroupTypeImpl.this.getDisplayNameArray(i);
                JspPropertyGroupTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType o)
                { JspPropertyGroupTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DisplayNameType old = JspPropertyGroupTypeImpl.this.getDisplayNameArray(i);
                JspPropertyGroupTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return JspPropertyGroupTypeImpl.this.sizeOfDisplayNameArray(); }
            
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
                { return JspPropertyGroupTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.IconType set(int i, com.sun.java.xml.ns.j2Ee.IconType o)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = JspPropertyGroupTypeImpl.this.getIconArray(i);
                JspPropertyGroupTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.IconType o)
                { JspPropertyGroupTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.IconType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.IconType old = JspPropertyGroupTypeImpl.this.getIconArray(i);
                JspPropertyGroupTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return JspPropertyGroupTypeImpl.this.sizeOfIconArray(); }
            
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
     * Gets a List of "url-pattern" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.UrlPatternType> getUrlPatternList()
    {
        final class UrlPatternList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.UrlPatternType>
        {
            public com.sun.java.xml.ns.j2Ee.UrlPatternType get(int i)
                { return JspPropertyGroupTypeImpl.this.getUrlPatternArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.UrlPatternType set(int i, com.sun.java.xml.ns.j2Ee.UrlPatternType o)
            {
                com.sun.java.xml.ns.j2Ee.UrlPatternType old = JspPropertyGroupTypeImpl.this.getUrlPatternArray(i);
                JspPropertyGroupTypeImpl.this.setUrlPatternArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.UrlPatternType o)
                { JspPropertyGroupTypeImpl.this.insertNewUrlPattern(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.UrlPatternType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.UrlPatternType old = JspPropertyGroupTypeImpl.this.getUrlPatternArray(i);
                JspPropertyGroupTypeImpl.this.removeUrlPattern(i);
                return old;
            }
            
            public int size()
                { return JspPropertyGroupTypeImpl.this.sizeOfUrlPatternArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UrlPatternList();
        }
    }
    
    /**
     * Gets array of all "url-pattern" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.UrlPatternType[] getUrlPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.UrlPatternType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.UrlPatternType>();
            get_store().find_all_element_users(URLPATTERN$6, targetList);
            com.sun.java.xml.ns.j2Ee.UrlPatternType[] result = new com.sun.java.xml.ns.j2Ee.UrlPatternType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "url-pattern" element
     */
    public com.sun.java.xml.ns.j2Ee.UrlPatternType getUrlPatternArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().find_element_user(URLPATTERN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "url-pattern" element
     */
    public int sizeOfUrlPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URLPATTERN$6);
        }
    }
    
    /**
     * Sets array of all "url-pattern" element
     */
    public void setUrlPatternArray(com.sun.java.xml.ns.j2Ee.UrlPatternType[] urlPatternArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(urlPatternArray, URLPATTERN$6);
        }
    }
    
    /**
     * Sets ith "url-pattern" element
     */
    public void setUrlPatternArray(int i, com.sun.java.xml.ns.j2Ee.UrlPatternType urlPattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().find_element_user(URLPATTERN$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(urlPattern);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "url-pattern" element
     */
    public com.sun.java.xml.ns.j2Ee.UrlPatternType insertNewUrlPattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().insert_element_user(URLPATTERN$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "url-pattern" element
     */
    public com.sun.java.xml.ns.j2Ee.UrlPatternType addNewUrlPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().add_element_user(URLPATTERN$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "url-pattern" element
     */
    public void removeUrlPattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URLPATTERN$6, i);
        }
    }
    
    /**
     * Gets the "el-ignored" element
     */
    public com.sun.java.xml.ns.j2Ee.TrueFalseType getElIgnored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().find_element_user(ELIGNORED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "el-ignored" element
     */
    public boolean isSetElIgnored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELIGNORED$8) != 0;
        }
    }
    
    /**
     * Sets the "el-ignored" element
     */
    public void setElIgnored(com.sun.java.xml.ns.j2Ee.TrueFalseType elIgnored)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().find_element_user(ELIGNORED$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().add_element_user(ELIGNORED$8);
            }
            target.set(elIgnored);
        }
    }
    
    /**
     * Appends and returns a new empty "el-ignored" element
     */
    public com.sun.java.xml.ns.j2Ee.TrueFalseType addNewElIgnored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().add_element_user(ELIGNORED$8);
            return target;
        }
    }
    
    /**
     * Unsets the "el-ignored" element
     */
    public void unsetElIgnored()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELIGNORED$8, 0);
        }
    }
    
    /**
     * Gets the "page-encoding" element
     */
    public com.sun.java.xml.ns.j2Ee.String getPageEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(PAGEENCODING$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "page-encoding" element
     */
    public boolean isSetPageEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGEENCODING$10) != 0;
        }
    }
    
    /**
     * Sets the "page-encoding" element
     */
    public void setPageEncoding(com.sun.java.xml.ns.j2Ee.String pageEncoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(PAGEENCODING$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(PAGEENCODING$10);
            }
            target.set(pageEncoding);
        }
    }
    
    /**
     * Appends and returns a new empty "page-encoding" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewPageEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(PAGEENCODING$10);
            return target;
        }
    }
    
    /**
     * Unsets the "page-encoding" element
     */
    public void unsetPageEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGEENCODING$10, 0);
        }
    }
    
    /**
     * Gets the "scripting-invalid" element
     */
    public com.sun.java.xml.ns.j2Ee.TrueFalseType getScriptingInvalid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().find_element_user(SCRIPTINGINVALID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "scripting-invalid" element
     */
    public boolean isSetScriptingInvalid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCRIPTINGINVALID$12) != 0;
        }
    }
    
    /**
     * Sets the "scripting-invalid" element
     */
    public void setScriptingInvalid(com.sun.java.xml.ns.j2Ee.TrueFalseType scriptingInvalid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().find_element_user(SCRIPTINGINVALID$12, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().add_element_user(SCRIPTINGINVALID$12);
            }
            target.set(scriptingInvalid);
        }
    }
    
    /**
     * Appends and returns a new empty "scripting-invalid" element
     */
    public com.sun.java.xml.ns.j2Ee.TrueFalseType addNewScriptingInvalid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().add_element_user(SCRIPTINGINVALID$12);
            return target;
        }
    }
    
    /**
     * Unsets the "scripting-invalid" element
     */
    public void unsetScriptingInvalid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCRIPTINGINVALID$12, 0);
        }
    }
    
    /**
     * Gets the "is-xml" element
     */
    public com.sun.java.xml.ns.j2Ee.TrueFalseType getIsXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().find_element_user(ISXML$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "is-xml" element
     */
    public boolean isSetIsXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISXML$14) != 0;
        }
    }
    
    /**
     * Sets the "is-xml" element
     */
    public void setIsXml(com.sun.java.xml.ns.j2Ee.TrueFalseType isXml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().find_element_user(ISXML$14, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().add_element_user(ISXML$14);
            }
            target.set(isXml);
        }
    }
    
    /**
     * Appends and returns a new empty "is-xml" element
     */
    public com.sun.java.xml.ns.j2Ee.TrueFalseType addNewIsXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.j2Ee.TrueFalseType)get_store().add_element_user(ISXML$14);
            return target;
        }
    }
    
    /**
     * Unsets the "is-xml" element
     */
    public void unsetIsXml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISXML$14, 0);
        }
    }
    
    /**
     * Gets a List of "include-prelude" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.PathType> getIncludePreludeList()
    {
        final class IncludePreludeList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.PathType>
        {
            public com.sun.java.xml.ns.j2Ee.PathType get(int i)
                { return JspPropertyGroupTypeImpl.this.getIncludePreludeArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.PathType set(int i, com.sun.java.xml.ns.j2Ee.PathType o)
            {
                com.sun.java.xml.ns.j2Ee.PathType old = JspPropertyGroupTypeImpl.this.getIncludePreludeArray(i);
                JspPropertyGroupTypeImpl.this.setIncludePreludeArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.PathType o)
                { JspPropertyGroupTypeImpl.this.insertNewIncludePrelude(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.PathType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.PathType old = JspPropertyGroupTypeImpl.this.getIncludePreludeArray(i);
                JspPropertyGroupTypeImpl.this.removeIncludePrelude(i);
                return old;
            }
            
            public int size()
                { return JspPropertyGroupTypeImpl.this.sizeOfIncludePreludeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IncludePreludeList();
        }
    }
    
    /**
     * Gets array of all "include-prelude" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.PathType[] getIncludePreludeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.PathType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.PathType>();
            get_store().find_all_element_users(INCLUDEPRELUDE$16, targetList);
            com.sun.java.xml.ns.j2Ee.PathType[] result = new com.sun.java.xml.ns.j2Ee.PathType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "include-prelude" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType getIncludePreludeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(INCLUDEPRELUDE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "include-prelude" element
     */
    public int sizeOfIncludePreludeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDEPRELUDE$16);
        }
    }
    
    /**
     * Sets array of all "include-prelude" element
     */
    public void setIncludePreludeArray(com.sun.java.xml.ns.j2Ee.PathType[] includePreludeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(includePreludeArray, INCLUDEPRELUDE$16);
        }
    }
    
    /**
     * Sets ith "include-prelude" element
     */
    public void setIncludePreludeArray(int i, com.sun.java.xml.ns.j2Ee.PathType includePrelude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(INCLUDEPRELUDE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(includePrelude);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "include-prelude" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType insertNewIncludePrelude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().insert_element_user(INCLUDEPRELUDE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "include-prelude" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType addNewIncludePrelude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().add_element_user(INCLUDEPRELUDE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "include-prelude" element
     */
    public void removeIncludePrelude(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDEPRELUDE$16, i);
        }
    }
    
    /**
     * Gets a List of "include-coda" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.PathType> getIncludeCodaList()
    {
        final class IncludeCodaList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.PathType>
        {
            public com.sun.java.xml.ns.j2Ee.PathType get(int i)
                { return JspPropertyGroupTypeImpl.this.getIncludeCodaArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.PathType set(int i, com.sun.java.xml.ns.j2Ee.PathType o)
            {
                com.sun.java.xml.ns.j2Ee.PathType old = JspPropertyGroupTypeImpl.this.getIncludeCodaArray(i);
                JspPropertyGroupTypeImpl.this.setIncludeCodaArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.PathType o)
                { JspPropertyGroupTypeImpl.this.insertNewIncludeCoda(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.PathType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.PathType old = JspPropertyGroupTypeImpl.this.getIncludeCodaArray(i);
                JspPropertyGroupTypeImpl.this.removeIncludeCoda(i);
                return old;
            }
            
            public int size()
                { return JspPropertyGroupTypeImpl.this.sizeOfIncludeCodaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IncludeCodaList();
        }
    }
    
    /**
     * Gets array of all "include-coda" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.PathType[] getIncludeCodaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.PathType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.PathType>();
            get_store().find_all_element_users(INCLUDECODA$18, targetList);
            com.sun.java.xml.ns.j2Ee.PathType[] result = new com.sun.java.xml.ns.j2Ee.PathType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "include-coda" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType getIncludeCodaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(INCLUDECODA$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "include-coda" element
     */
    public int sizeOfIncludeCodaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDECODA$18);
        }
    }
    
    /**
     * Sets array of all "include-coda" element
     */
    public void setIncludeCodaArray(com.sun.java.xml.ns.j2Ee.PathType[] includeCodaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(includeCodaArray, INCLUDECODA$18);
        }
    }
    
    /**
     * Sets ith "include-coda" element
     */
    public void setIncludeCodaArray(int i, com.sun.java.xml.ns.j2Ee.PathType includeCoda)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().find_element_user(INCLUDECODA$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(includeCoda);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "include-coda" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType insertNewIncludeCoda(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().insert_element_user(INCLUDECODA$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "include-coda" element
     */
    public com.sun.java.xml.ns.j2Ee.PathType addNewIncludeCoda()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.PathType target = null;
            target = (com.sun.java.xml.ns.j2Ee.PathType)get_store().add_element_user(INCLUDECODA$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "include-coda" element
     */
    public void removeIncludeCoda(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDECODA$18, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
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
            return get_store().find_attribute_user(ID$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$20);
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
            get_store().remove_attribute(ID$20);
        }
    }
}
