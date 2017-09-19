/*
 * XML Type:  filter-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.FilterMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML filter-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class FilterMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.FilterMappingType
{
    private static final long serialVersionUID = 1L;
    
    public FilterMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERNAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "filter-name");
    private static final javax.xml.namespace.QName URLPATTERN$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "url-pattern");
    private static final javax.xml.namespace.QName SERVLETNAME$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "servlet-name");
    private static final javax.xml.namespace.QName DISPATCHER$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "dispatcher");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "filter-name" element
     */
    public com.sun.java.xml.ns.j2Ee.FilterNameType getFilterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterNameType)get_store().find_element_user(FILTERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "filter-name" element
     */
    public void setFilterName(com.sun.java.xml.ns.j2Ee.FilterNameType filterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterNameType)get_store().find_element_user(FILTERNAME$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.FilterNameType)get_store().add_element_user(FILTERNAME$0);
            }
            target.set(filterName);
        }
    }
    
    /**
     * Appends and returns a new empty "filter-name" element
     */
    public com.sun.java.xml.ns.j2Ee.FilterNameType addNewFilterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.FilterNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.FilterNameType)get_store().add_element_user(FILTERNAME$0);
            return target;
        }
    }
    
    /**
     * Gets the "url-pattern" element
     */
    public com.sun.java.xml.ns.j2Ee.UrlPatternType getUrlPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().find_element_user(URLPATTERN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "url-pattern" element
     */
    public boolean isSetUrlPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URLPATTERN$2) != 0;
        }
    }
    
    /**
     * Sets the "url-pattern" element
     */
    public void setUrlPattern(com.sun.java.xml.ns.j2Ee.UrlPatternType urlPattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().find_element_user(URLPATTERN$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().add_element_user(URLPATTERN$2);
            }
            target.set(urlPattern);
        }
    }
    
    /**
     * Appends and returns a new empty "url-pattern" element
     */
    public com.sun.java.xml.ns.j2Ee.UrlPatternType addNewUrlPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().add_element_user(URLPATTERN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "url-pattern" element
     */
    public void unsetUrlPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URLPATTERN$2, 0);
        }
    }
    
    /**
     * Gets the "servlet-name" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletNameType getServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletNameType)get_store().find_element_user(SERVLETNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "servlet-name" element
     */
    public boolean isSetServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVLETNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "servlet-name" element
     */
    public void setServletName(com.sun.java.xml.ns.j2Ee.ServletNameType servletName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletNameType)get_store().find_element_user(SERVLETNAME$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.ServletNameType)get_store().add_element_user(SERVLETNAME$4);
            }
            target.set(servletName);
        }
    }
    
    /**
     * Appends and returns a new empty "servlet-name" element
     */
    public com.sun.java.xml.ns.j2Ee.ServletNameType addNewServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.j2Ee.ServletNameType)get_store().add_element_user(SERVLETNAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "servlet-name" element
     */
    public void unsetServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVLETNAME$4, 0);
        }
    }
    
    /**
     * Gets a List of "dispatcher" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DispatcherType> getDispatcherList()
    {
        final class DispatcherList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DispatcherType>
        {
            public com.sun.java.xml.ns.j2Ee.DispatcherType get(int i)
                { return FilterMappingTypeImpl.this.getDispatcherArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DispatcherType set(int i, com.sun.java.xml.ns.j2Ee.DispatcherType o)
            {
                com.sun.java.xml.ns.j2Ee.DispatcherType old = FilterMappingTypeImpl.this.getDispatcherArray(i);
                FilterMappingTypeImpl.this.setDispatcherArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DispatcherType o)
                { FilterMappingTypeImpl.this.insertNewDispatcher(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DispatcherType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DispatcherType old = FilterMappingTypeImpl.this.getDispatcherArray(i);
                FilterMappingTypeImpl.this.removeDispatcher(i);
                return old;
            }
            
            public int size()
                { return FilterMappingTypeImpl.this.sizeOfDispatcherArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DispatcherList();
        }
    }
    
    /**
     * Gets array of all "dispatcher" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.DispatcherType[] getDispatcherArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.DispatcherType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.DispatcherType>();
            get_store().find_all_element_users(DISPATCHER$6, targetList);
            com.sun.java.xml.ns.j2Ee.DispatcherType[] result = new com.sun.java.xml.ns.j2Ee.DispatcherType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dispatcher" element
     */
    public com.sun.java.xml.ns.j2Ee.DispatcherType getDispatcherArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DispatcherType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DispatcherType)get_store().find_element_user(DISPATCHER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dispatcher" element
     */
    public int sizeOfDispatcherArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPATCHER$6);
        }
    }
    
    /**
     * Sets array of all "dispatcher" element
     */
    public void setDispatcherArray(com.sun.java.xml.ns.j2Ee.DispatcherType[] dispatcherArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dispatcherArray, DISPATCHER$6);
        }
    }
    
    /**
     * Sets ith "dispatcher" element
     */
    public void setDispatcherArray(int i, com.sun.java.xml.ns.j2Ee.DispatcherType dispatcher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DispatcherType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DispatcherType)get_store().find_element_user(DISPATCHER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dispatcher);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dispatcher" element
     */
    public com.sun.java.xml.ns.j2Ee.DispatcherType insertNewDispatcher(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DispatcherType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DispatcherType)get_store().insert_element_user(DISPATCHER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dispatcher" element
     */
    public com.sun.java.xml.ns.j2Ee.DispatcherType addNewDispatcher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.DispatcherType target = null;
            target = (com.sun.java.xml.ns.j2Ee.DispatcherType)get_store().add_element_user(DISPATCHER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "dispatcher" element
     */
    public void removeDispatcher(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPATCHER$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
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
            return get_store().find_attribute_user(ID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
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
            get_store().remove_attribute(ID$8);
        }
    }
}
