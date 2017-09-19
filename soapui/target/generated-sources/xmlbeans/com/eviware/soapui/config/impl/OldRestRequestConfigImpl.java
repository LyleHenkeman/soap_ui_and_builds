/*
 * XML Type:  OldRestRequest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OldRestRequestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML OldRestRequest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class OldRestRequestConfigImpl extends com.eviware.soapui.config.impl.AbstractRequestConfigImpl implements com.eviware.soapui.config.OldRestRequestConfig
{
    private static final long serialVersionUID = 1L;
    
    public OldRestRequestConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "parameters");
    private static final javax.xml.namespace.QName REPRESENTATION$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "representation");
    private static final javax.xml.namespace.QName METHOD$4 = 
        new javax.xml.namespace.QName("", "method");
    private static final javax.xml.namespace.QName WADLID$6 = 
        new javax.xml.namespace.QName("", "wadlId");
    private static final javax.xml.namespace.QName FULLPATH$8 = 
        new javax.xml.namespace.QName("", "fullPath");
    private static final javax.xml.namespace.QName MEDIATYPE$10 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName POSTQUERYSTRING$12 = 
        new javax.xml.namespace.QName("", "postQueryString");
    private static final javax.xml.namespace.QName ACCEPT$14 = 
        new javax.xml.namespace.QName("", "accept");
    
    
    /**
     * Gets the "parameters" element
     */
    public com.eviware.soapui.config.RestParametersConfig getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParametersConfig target = null;
            target = (com.eviware.soapui.config.RestParametersConfig)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameters" element
     */
    public void setParameters(com.eviware.soapui.config.RestParametersConfig parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParametersConfig target = null;
            target = (com.eviware.soapui.config.RestParametersConfig)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.RestParametersConfig)get_store().add_element_user(PARAMETERS$0);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    public com.eviware.soapui.config.RestParametersConfig addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestParametersConfig target = null;
            target = (com.eviware.soapui.config.RestParametersConfig)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "representation" elements
     */
    public java.util.List<com.eviware.soapui.config.RestResourceRepresentationConfig> getRepresentationList()
    {
        final class RepresentationList extends java.util.AbstractList<com.eviware.soapui.config.RestResourceRepresentationConfig>
        {
            public com.eviware.soapui.config.RestResourceRepresentationConfig get(int i)
                { return OldRestRequestConfigImpl.this.getRepresentationArray(i); }
            
            public com.eviware.soapui.config.RestResourceRepresentationConfig set(int i, com.eviware.soapui.config.RestResourceRepresentationConfig o)
            {
                com.eviware.soapui.config.RestResourceRepresentationConfig old = OldRestRequestConfigImpl.this.getRepresentationArray(i);
                OldRestRequestConfigImpl.this.setRepresentationArray(i, o);
                return old;
            }
            
            public void add(int i, com.eviware.soapui.config.RestResourceRepresentationConfig o)
                { OldRestRequestConfigImpl.this.insertNewRepresentation(i).set(o); }
            
            public com.eviware.soapui.config.RestResourceRepresentationConfig remove(int i)
            {
                com.eviware.soapui.config.RestResourceRepresentationConfig old = OldRestRequestConfigImpl.this.getRepresentationArray(i);
                OldRestRequestConfigImpl.this.removeRepresentation(i);
                return old;
            }
            
            public int size()
                { return OldRestRequestConfigImpl.this.sizeOfRepresentationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RepresentationList();
        }
    }
    
    /**
     * Gets array of all "representation" elements
     * @deprecated
     */
    public com.eviware.soapui.config.RestResourceRepresentationConfig[] getRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.eviware.soapui.config.RestResourceRepresentationConfig> targetList = new java.util.ArrayList<com.eviware.soapui.config.RestResourceRepresentationConfig>();
            get_store().find_all_element_users(REPRESENTATION$2, targetList);
            com.eviware.soapui.config.RestResourceRepresentationConfig[] result = new com.eviware.soapui.config.RestResourceRepresentationConfig[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "representation" element
     */
    public com.eviware.soapui.config.RestResourceRepresentationConfig getRepresentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceRepresentationConfig target = null;
            target = (com.eviware.soapui.config.RestResourceRepresentationConfig)get_store().find_element_user(REPRESENTATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "representation" element
     */
    public int sizeOfRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPRESENTATION$2);
        }
    }
    
    /**
     * Sets array of all "representation" element
     */
    public void setRepresentationArray(com.eviware.soapui.config.RestResourceRepresentationConfig[] representationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(representationArray, REPRESENTATION$2);
        }
    }
    
    /**
     * Sets ith "representation" element
     */
    public void setRepresentationArray(int i, com.eviware.soapui.config.RestResourceRepresentationConfig representation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceRepresentationConfig target = null;
            target = (com.eviware.soapui.config.RestResourceRepresentationConfig)get_store().find_element_user(REPRESENTATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(representation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "representation" element
     */
    public com.eviware.soapui.config.RestResourceRepresentationConfig insertNewRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceRepresentationConfig target = null;
            target = (com.eviware.soapui.config.RestResourceRepresentationConfig)get_store().insert_element_user(REPRESENTATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "representation" element
     */
    public com.eviware.soapui.config.RestResourceRepresentationConfig addNewRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RestResourceRepresentationConfig target = null;
            target = (com.eviware.soapui.config.RestResourceRepresentationConfig)get_store().add_element_user(REPRESENTATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "representation" element
     */
    public void removeRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPRESENTATION$2, i);
        }
    }
    
    /**
     * Gets the "method" attribute
     */
    public java.lang.String getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "method" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$4);
            return target;
        }
    }
    
    /**
     * True if has "method" attribute
     */
    public boolean isSetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METHOD$4) != null;
        }
    }
    
    /**
     * Sets the "method" attribute
     */
    public void setMethod(java.lang.String method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHOD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHOD$4);
            }
            target.setStringValue(method);
        }
    }
    
    /**
     * Sets (as xml) the "method" attribute
     */
    public void xsetMethod(org.apache.xmlbeans.XmlString method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHOD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHOD$4);
            }
            target.set(method);
        }
    }
    
    /**
     * Unsets the "method" attribute
     */
    public void unsetMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METHOD$4);
        }
    }
    
    /**
     * Gets the "wadlId" attribute
     */
    public java.lang.String getWadlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WADLID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wadlId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWadlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WADLID$6);
            return target;
        }
    }
    
    /**
     * True if has "wadlId" attribute
     */
    public boolean isSetWadlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WADLID$6) != null;
        }
    }
    
    /**
     * Sets the "wadlId" attribute
     */
    public void setWadlId(java.lang.String wadlId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WADLID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WADLID$6);
            }
            target.setStringValue(wadlId);
        }
    }
    
    /**
     * Sets (as xml) the "wadlId" attribute
     */
    public void xsetWadlId(org.apache.xmlbeans.XmlString wadlId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WADLID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WADLID$6);
            }
            target.set(wadlId);
        }
    }
    
    /**
     * Unsets the "wadlId" attribute
     */
    public void unsetWadlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WADLID$6);
        }
    }
    
    /**
     * Gets the "fullPath" attribute
     */
    public java.lang.String getFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLPATH$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "fullPath" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FULLPATH$8);
            return target;
        }
    }
    
    /**
     * True if has "fullPath" attribute
     */
    public boolean isSetFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FULLPATH$8) != null;
        }
    }
    
    /**
     * Sets the "fullPath" attribute
     */
    public void setFullPath(java.lang.String fullPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLPATH$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLPATH$8);
            }
            target.setStringValue(fullPath);
        }
    }
    
    /**
     * Sets (as xml) the "fullPath" attribute
     */
    public void xsetFullPath(org.apache.xmlbeans.XmlString fullPath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FULLPATH$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FULLPATH$8);
            }
            target.set(fullPath);
        }
    }
    
    /**
     * Unsets the "fullPath" attribute
     */
    public void unsetFullPath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FULLPATH$8);
        }
    }
    
    /**
     * Gets the "mediaType" attribute
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediaType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$10);
            return target;
        }
    }
    
    /**
     * True if has "mediaType" attribute
     */
    public boolean isSetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEDIATYPE$10) != null;
        }
    }
    
    /**
     * Sets the "mediaType" attribute
     */
    public void setMediaType(java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIATYPE$10);
            }
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Sets (as xml) the "mediaType" attribute
     */
    public void xsetMediaType(org.apache.xmlbeans.XmlString mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEDIATYPE$10);
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Unsets the "mediaType" attribute
     */
    public void unsetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEDIATYPE$10);
        }
    }
    
    /**
     * Gets the "postQueryString" attribute
     */
    public boolean getPostQueryString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTQUERYSTRING$12);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "postQueryString" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPostQueryString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(POSTQUERYSTRING$12);
            return target;
        }
    }
    
    /**
     * True if has "postQueryString" attribute
     */
    public boolean isSetPostQueryString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSTQUERYSTRING$12) != null;
        }
    }
    
    /**
     * Sets the "postQueryString" attribute
     */
    public void setPostQueryString(boolean postQueryString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTQUERYSTRING$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTQUERYSTRING$12);
            }
            target.setBooleanValue(postQueryString);
        }
    }
    
    /**
     * Sets (as xml) the "postQueryString" attribute
     */
    public void xsetPostQueryString(org.apache.xmlbeans.XmlBoolean postQueryString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(POSTQUERYSTRING$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(POSTQUERYSTRING$12);
            }
            target.set(postQueryString);
        }
    }
    
    /**
     * Unsets the "postQueryString" attribute
     */
    public void unsetPostQueryString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSTQUERYSTRING$12);
        }
    }
    
    /**
     * Gets the "accept" attribute
     */
    public java.lang.String getAccept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCEPT$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accept" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAccept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACCEPT$14);
            return target;
        }
    }
    
    /**
     * True if has "accept" attribute
     */
    public boolean isSetAccept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCEPT$14) != null;
        }
    }
    
    /**
     * Sets the "accept" attribute
     */
    public void setAccept(java.lang.String accept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCEPT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCEPT$14);
            }
            target.setStringValue(accept);
        }
    }
    
    /**
     * Sets (as xml) the "accept" attribute
     */
    public void xsetAccept(org.apache.xmlbeans.XmlString accept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACCEPT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACCEPT$14);
            }
            target.set(accept);
        }
    }
    
    /**
     * Unsets the "accept" attribute
     */
    public void unsetAccept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCEPT$14);
        }
    }
}
