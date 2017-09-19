/*
 * An XML document type.
 * Localname: representation
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.RepresentationDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one representation(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class RepresentationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.RepresentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public RepresentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "representation");
    
    
    /**
     * Gets the "representation" element
     */
    public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation getRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation target = null;
            target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().find_element_user(REPRESENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "representation" element
     */
    public void setRepresentation(net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation representation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation target = null;
            target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().find_element_user(REPRESENTATION$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().add_element_user(REPRESENTATION$0);
            }
            target.set(representation);
        }
    }
    
    /**
     * Appends and returns a new empty "representation" element
     */
    public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation addNewRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation target = null;
            target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().add_element_user(REPRESENTATION$0);
            return target;
        }
    }
    /**
     * An XML representation(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class RepresentationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation
    {
        private static final long serialVersionUID = 1L;
        
        public RepresentationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOC$0 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
        private static final javax.xml.namespace.QName PARAM$2 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "param");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName ELEMENT$6 = 
            new javax.xml.namespace.QName("", "element");
        private static final javax.xml.namespace.QName MEDIATYPE$8 = 
            new javax.xml.namespace.QName("", "mediaType");
        private static final javax.xml.namespace.QName HREF$10 = 
            new javax.xml.namespace.QName("", "href");
        private static final javax.xml.namespace.QName PROFILE$12 = 
            new javax.xml.namespace.QName("", "profile");
        
        
        /**
         * Gets a List of "doc" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList()
        {
            final class DocList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>
            {
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc get(int i)
                    { return RepresentationImpl.this.getDocArray(i); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc set(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = RepresentationImpl.this.getDocArray(i);
                    RepresentationImpl.this.setDocArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                    { RepresentationImpl.this.insertNewDoc(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = RepresentationImpl.this.getDocArray(i);
                    RepresentationImpl.this.removeDoc(i);
                    return old;
                }
                
                public int size()
                    { return RepresentationImpl.this.sizeOfDocArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DocList();
            }
        }
        
        /**
         * Gets array of all "doc" elements
         * @deprecated
         */
        public net.java.dev.wadl.x2009.x02.DocDocument.Doc[] getDocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>();
                get_store().find_all_element_users(DOC$0, targetList);
                net.java.dev.wadl.x2009.x02.DocDocument.Doc[] result = new net.java.dev.wadl.x2009.x02.DocDocument.Doc[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "doc" element
         */
        public net.java.dev.wadl.x2009.x02.DocDocument.Doc getDocArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.DocDocument.Doc target = null;
                target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().find_element_user(DOC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "doc" element
         */
        public int sizeOfDocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOC$0);
            }
        }
        
        /**
         * Sets array of all "doc" element
         */
        public void setDocArray(net.java.dev.wadl.x2009.x02.DocDocument.Doc[] docArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(docArray, DOC$0);
            }
        }
        
        /**
         * Sets ith "doc" element
         */
        public void setDocArray(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc doc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.DocDocument.Doc target = null;
                target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().find_element_user(DOC$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(doc);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "doc" element
         */
        public net.java.dev.wadl.x2009.x02.DocDocument.Doc insertNewDoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.DocDocument.Doc target = null;
                target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().insert_element_user(DOC$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "doc" element
         */
        public net.java.dev.wadl.x2009.x02.DocDocument.Doc addNewDoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.DocDocument.Doc target = null;
                target = (net.java.dev.wadl.x2009.x02.DocDocument.Doc)get_store().add_element_user(DOC$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "doc" element
         */
        public void removeDoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOC$0, i);
            }
        }
        
        /**
         * Gets a List of "param" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.ParamDocument.Param> getParamList()
        {
            final class ParamList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.ParamDocument.Param>
            {
                public net.java.dev.wadl.x2009.x02.ParamDocument.Param get(int i)
                    { return RepresentationImpl.this.getParamArray(i); }
                
                public net.java.dev.wadl.x2009.x02.ParamDocument.Param set(int i, net.java.dev.wadl.x2009.x02.ParamDocument.Param o)
                {
                    net.java.dev.wadl.x2009.x02.ParamDocument.Param old = RepresentationImpl.this.getParamArray(i);
                    RepresentationImpl.this.setParamArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.ParamDocument.Param o)
                    { RepresentationImpl.this.insertNewParam(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.ParamDocument.Param remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.ParamDocument.Param old = RepresentationImpl.this.getParamArray(i);
                    RepresentationImpl.this.removeParam(i);
                    return old;
                }
                
                public int size()
                    { return RepresentationImpl.this.sizeOfParamArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ParamList();
            }
        }
        
        /**
         * Gets array of all "param" elements
         * @deprecated
         */
        public net.java.dev.wadl.x2009.x02.ParamDocument.Param[] getParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.ParamDocument.Param> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.ParamDocument.Param>();
                get_store().find_all_element_users(PARAM$2, targetList);
                net.java.dev.wadl.x2009.x02.ParamDocument.Param[] result = new net.java.dev.wadl.x2009.x02.ParamDocument.Param[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "param" element
         */
        public net.java.dev.wadl.x2009.x02.ParamDocument.Param getParamArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ParamDocument.Param target = null;
                target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().find_element_user(PARAM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "param" element
         */
        public int sizeOfParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAM$2);
            }
        }
        
        /**
         * Sets array of all "param" element
         */
        public void setParamArray(net.java.dev.wadl.x2009.x02.ParamDocument.Param[] paramArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(paramArray, PARAM$2);
            }
        }
        
        /**
         * Sets ith "param" element
         */
        public void setParamArray(int i, net.java.dev.wadl.x2009.x02.ParamDocument.Param param)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ParamDocument.Param target = null;
                target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().find_element_user(PARAM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(param);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "param" element
         */
        public net.java.dev.wadl.x2009.x02.ParamDocument.Param insertNewParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ParamDocument.Param target = null;
                target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().insert_element_user(PARAM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "param" element
         */
        public net.java.dev.wadl.x2009.x02.ParamDocument.Param addNewParam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ParamDocument.Param target = null;
                target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().add_element_user(PARAM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "param" element
         */
        public void removeParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAM$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
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
                return get_store().find_attribute_user(ID$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
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
                get_store().remove_attribute(ID$4);
            }
        }
        
        /**
         * Gets the "element" attribute
         */
        public javax.xml.namespace.QName getElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEMENT$6);
                if (target == null)
                {
                    return null;
                }
                return target.getQNameValue();
            }
        }
        
        /**
         * Gets (as xml) the "element" attribute
         */
        public org.apache.xmlbeans.XmlQName xgetElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ELEMENT$6);
                return target;
            }
        }
        
        /**
         * True if has "element" attribute
         */
        public boolean isSetElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ELEMENT$6) != null;
            }
        }
        
        /**
         * Sets the "element" attribute
         */
        public void setElement(javax.xml.namespace.QName element)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEMENT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEMENT$6);
                }
                target.setQNameValue(element);
            }
        }
        
        /**
         * Sets (as xml) the "element" attribute
         */
        public void xsetElement(org.apache.xmlbeans.XmlQName element)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlQName target = null;
                target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ELEMENT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ELEMENT$6);
                }
                target.set(element);
            }
        }
        
        /**
         * Unsets the "element" attribute
         */
        public void unsetElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ELEMENT$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$8);
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
                return get_store().find_attribute_user(MEDIATYPE$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIATYPE$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIATYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEDIATYPE$8);
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
                get_store().remove_attribute(MEDIATYPE$8);
            }
        }
        
        /**
         * Gets the "href" attribute
         */
        public java.lang.String getHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "href" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$10);
                return target;
            }
        }
        
        /**
         * True if has "href" attribute
         */
        public boolean isSetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HREF$10) != null;
            }
        }
        
        /**
         * Sets the "href" attribute
         */
        public void setHref(java.lang.String href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$10);
                }
                target.setStringValue(href);
            }
        }
        
        /**
         * Sets (as xml) the "href" attribute
         */
        public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$10);
                }
                target.set(href);
            }
        }
        
        /**
         * Unsets the "href" attribute
         */
        public void unsetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HREF$10);
            }
        }
        
        /**
         * Gets the "profile" attribute
         */
        public java.util.List getProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROFILE$12);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "profile" attribute
         */
        public net.java.dev.wadl.x2009.x02.UriList xgetProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.UriList target = null;
                target = (net.java.dev.wadl.x2009.x02.UriList)get_store().find_attribute_user(PROFILE$12);
                return target;
            }
        }
        
        /**
         * True if has "profile" attribute
         */
        public boolean isSetProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROFILE$12) != null;
            }
        }
        
        /**
         * Sets the "profile" attribute
         */
        public void setProfile(java.util.List profile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROFILE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROFILE$12);
                }
                target.setListValue(profile);
            }
        }
        
        /**
         * Sets (as xml) the "profile" attribute
         */
        public void xsetProfile(net.java.dev.wadl.x2009.x02.UriList profile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.UriList target = null;
                target = (net.java.dev.wadl.x2009.x02.UriList)get_store().find_attribute_user(PROFILE$12);
                if (target == null)
                {
                    target = (net.java.dev.wadl.x2009.x02.UriList)get_store().add_attribute_user(PROFILE$12);
                }
                target.set(profile);
            }
        }
        
        /**
         * Unsets the "profile" attribute
         */
        public void unsetProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROFILE$12);
            }
        }
    }
}
