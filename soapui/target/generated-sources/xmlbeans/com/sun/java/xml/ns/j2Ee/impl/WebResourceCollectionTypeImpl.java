/*
 * XML Type:  web-resource-collectionType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.WebResourceCollectionType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee.impl;
/**
 * An XML web-resource-collectionType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public class WebResourceCollectionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.j2Ee.WebResourceCollectionType
{
    private static final long serialVersionUID = 1L;
    
    public WebResourceCollectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBRESOURCENAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "web-resource-name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "description");
    private static final javax.xml.namespace.QName URLPATTERN$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "url-pattern");
    private static final javax.xml.namespace.QName HTTPMETHOD$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/j2ee", "http-method");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "web-resource-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String getWebResourceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(WEBRESOURCENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "web-resource-name" element
     */
    public void setWebResourceName(com.sun.java.xml.ns.j2Ee.String webResourceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().find_element_user(WEBRESOURCENAME$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(WEBRESOURCENAME$0);
            }
            target.set(webResourceName);
        }
    }
    
    /**
     * Appends and returns a new empty "web-resource-name" element
     */
    public com.sun.java.xml.ns.j2Ee.String addNewWebResourceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.String target = null;
            target = (com.sun.java.xml.ns.j2Ee.String)get_store().add_element_user(WEBRESOURCENAME$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.DescriptionType>
        {
            public com.sun.java.xml.ns.j2Ee.DescriptionType get(int i)
                { return WebResourceCollectionTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType set(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = WebResourceCollectionTypeImpl.this.getDescriptionArray(i);
                WebResourceCollectionTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.DescriptionType o)
                { WebResourceCollectionTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.DescriptionType old = WebResourceCollectionTypeImpl.this.getDescriptionArray(i);
                WebResourceCollectionTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return WebResourceCollectionTypeImpl.this.sizeOfDescriptionArray(); }
            
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
            get_store().find_all_element_users(DESCRIPTION$2, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$2, i);
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
            return get_store().count_elements(DESCRIPTION$2);
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
            arraySetterHelper(descriptionArray, DESCRIPTION$2);
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
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().find_element_user(DESCRIPTION$2, i);
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
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().insert_element_user(DESCRIPTION$2, i);
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
            target = (com.sun.java.xml.ns.j2Ee.DescriptionType)get_store().add_element_user(DESCRIPTION$2);
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
            get_store().remove_element(DESCRIPTION$2, i);
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
                { return WebResourceCollectionTypeImpl.this.getUrlPatternArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.UrlPatternType set(int i, com.sun.java.xml.ns.j2Ee.UrlPatternType o)
            {
                com.sun.java.xml.ns.j2Ee.UrlPatternType old = WebResourceCollectionTypeImpl.this.getUrlPatternArray(i);
                WebResourceCollectionTypeImpl.this.setUrlPatternArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.UrlPatternType o)
                { WebResourceCollectionTypeImpl.this.insertNewUrlPattern(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.UrlPatternType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.UrlPatternType old = WebResourceCollectionTypeImpl.this.getUrlPatternArray(i);
                WebResourceCollectionTypeImpl.this.removeUrlPattern(i);
                return old;
            }
            
            public int size()
                { return WebResourceCollectionTypeImpl.this.sizeOfUrlPatternArray(); }
            
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
            get_store().find_all_element_users(URLPATTERN$4, targetList);
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
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().find_element_user(URLPATTERN$4, i);
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
            return get_store().count_elements(URLPATTERN$4);
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
            arraySetterHelper(urlPatternArray, URLPATTERN$4);
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
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().find_element_user(URLPATTERN$4, i);
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
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().insert_element_user(URLPATTERN$4, i);
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
            target = (com.sun.java.xml.ns.j2Ee.UrlPatternType)get_store().add_element_user(URLPATTERN$4);
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
            get_store().remove_element(URLPATTERN$4, i);
        }
    }
    
    /**
     * Gets a List of "http-method" elements
     */
    public java.util.List<com.sun.java.xml.ns.j2Ee.HttpMethodType> getHttpMethodList()
    {
        final class HttpMethodList extends java.util.AbstractList<com.sun.java.xml.ns.j2Ee.HttpMethodType>
        {
            public com.sun.java.xml.ns.j2Ee.HttpMethodType get(int i)
                { return WebResourceCollectionTypeImpl.this.getHttpMethodArray(i); }
            
            public com.sun.java.xml.ns.j2Ee.HttpMethodType set(int i, com.sun.java.xml.ns.j2Ee.HttpMethodType o)
            {
                com.sun.java.xml.ns.j2Ee.HttpMethodType old = WebResourceCollectionTypeImpl.this.getHttpMethodArray(i);
                WebResourceCollectionTypeImpl.this.setHttpMethodArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.j2Ee.HttpMethodType o)
                { WebResourceCollectionTypeImpl.this.insertNewHttpMethod(i).set(o); }
            
            public com.sun.java.xml.ns.j2Ee.HttpMethodType remove(int i)
            {
                com.sun.java.xml.ns.j2Ee.HttpMethodType old = WebResourceCollectionTypeImpl.this.getHttpMethodArray(i);
                WebResourceCollectionTypeImpl.this.removeHttpMethod(i);
                return old;
            }
            
            public int size()
                { return WebResourceCollectionTypeImpl.this.sizeOfHttpMethodArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HttpMethodList();
        }
    }
    
    /**
     * Gets array of all "http-method" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.j2Ee.HttpMethodType[] getHttpMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.j2Ee.HttpMethodType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.j2Ee.HttpMethodType>();
            get_store().find_all_element_users(HTTPMETHOD$6, targetList);
            com.sun.java.xml.ns.j2Ee.HttpMethodType[] result = new com.sun.java.xml.ns.j2Ee.HttpMethodType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "http-method" element
     */
    public com.sun.java.xml.ns.j2Ee.HttpMethodType getHttpMethodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.HttpMethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.HttpMethodType)get_store().find_element_user(HTTPMETHOD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "http-method" element
     */
    public int sizeOfHttpMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HTTPMETHOD$6);
        }
    }
    
    /**
     * Sets array of all "http-method" element
     */
    public void setHttpMethodArray(com.sun.java.xml.ns.j2Ee.HttpMethodType[] httpMethodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(httpMethodArray, HTTPMETHOD$6);
        }
    }
    
    /**
     * Sets ith "http-method" element
     */
    public void setHttpMethodArray(int i, com.sun.java.xml.ns.j2Ee.HttpMethodType httpMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.HttpMethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.HttpMethodType)get_store().find_element_user(HTTPMETHOD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(httpMethod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "http-method" element
     */
    public com.sun.java.xml.ns.j2Ee.HttpMethodType insertNewHttpMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.HttpMethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.HttpMethodType)get_store().insert_element_user(HTTPMETHOD$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "http-method" element
     */
    public com.sun.java.xml.ns.j2Ee.HttpMethodType addNewHttpMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.j2Ee.HttpMethodType target = null;
            target = (com.sun.java.xml.ns.j2Ee.HttpMethodType)get_store().add_element_user(HTTPMETHOD$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "http-method" element
     */
    public void removeHttpMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HTTPMETHOD$6, i);
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
