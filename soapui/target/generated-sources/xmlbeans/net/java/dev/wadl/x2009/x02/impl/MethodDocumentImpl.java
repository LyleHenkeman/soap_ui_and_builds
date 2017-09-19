/*
 * An XML document type.
 * Localname: method
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.MethodDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one method(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class MethodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.MethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public MethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METHOD$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "method");
    
    
    /**
     * Gets the "method" element
     */
    public net.java.dev.wadl.x2009.x02.MethodDocument.Method getMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.MethodDocument.Method target = null;
            target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().find_element_user(METHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "method" element
     */
    public void setMethod(net.java.dev.wadl.x2009.x02.MethodDocument.Method method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.MethodDocument.Method target = null;
            target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().find_element_user(METHOD$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().add_element_user(METHOD$0);
            }
            target.set(method);
        }
    }
    
    /**
     * Appends and returns a new empty "method" element
     */
    public net.java.dev.wadl.x2009.x02.MethodDocument.Method addNewMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.MethodDocument.Method target = null;
            target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().add_element_user(METHOD$0);
            return target;
        }
    }
    /**
     * An XML method(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class MethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.MethodDocument.Method
    {
        private static final long serialVersionUID = 1L;
        
        public MethodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOC$0 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
        private static final javax.xml.namespace.QName REQUEST$2 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "request");
        private static final javax.xml.namespace.QName RESPONSE$4 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "response");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName HREF$10 = 
            new javax.xml.namespace.QName("", "href");
        
        
        /**
         * Gets a List of "doc" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList()
        {
            final class DocList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>
            {
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc get(int i)
                    { return MethodImpl.this.getDocArray(i); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc set(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = MethodImpl.this.getDocArray(i);
                    MethodImpl.this.setDocArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                    { MethodImpl.this.insertNewDoc(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = MethodImpl.this.getDocArray(i);
                    MethodImpl.this.removeDoc(i);
                    return old;
                }
                
                public int size()
                    { return MethodImpl.this.sizeOfDocArray(); }
                
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
         * Gets the "request" element
         */
        public net.java.dev.wadl.x2009.x02.RequestDocument.Request getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.RequestDocument.Request target = null;
                target = (net.java.dev.wadl.x2009.x02.RequestDocument.Request)get_store().find_element_user(REQUEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "request" element
         */
        public boolean isSetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUEST$2) != 0;
            }
        }
        
        /**
         * Sets the "request" element
         */
        public void setRequest(net.java.dev.wadl.x2009.x02.RequestDocument.Request request)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.RequestDocument.Request target = null;
                target = (net.java.dev.wadl.x2009.x02.RequestDocument.Request)get_store().find_element_user(REQUEST$2, 0);
                if (target == null)
                {
                    target = (net.java.dev.wadl.x2009.x02.RequestDocument.Request)get_store().add_element_user(REQUEST$2);
                }
                target.set(request);
            }
        }
        
        /**
         * Appends and returns a new empty "request" element
         */
        public net.java.dev.wadl.x2009.x02.RequestDocument.Request addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.RequestDocument.Request target = null;
                target = (net.java.dev.wadl.x2009.x02.RequestDocument.Request)get_store().add_element_user(REQUEST$2);
                return target;
            }
        }
        
        /**
         * Unsets the "request" element
         */
        public void unsetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUEST$2, 0);
            }
        }
        
        /**
         * Gets a List of "response" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.ResponseDocument.Response> getResponseList()
        {
            final class ResponseList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.ResponseDocument.Response>
            {
                public net.java.dev.wadl.x2009.x02.ResponseDocument.Response get(int i)
                    { return MethodImpl.this.getResponseArray(i); }
                
                public net.java.dev.wadl.x2009.x02.ResponseDocument.Response set(int i, net.java.dev.wadl.x2009.x02.ResponseDocument.Response o)
                {
                    net.java.dev.wadl.x2009.x02.ResponseDocument.Response old = MethodImpl.this.getResponseArray(i);
                    MethodImpl.this.setResponseArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.ResponseDocument.Response o)
                    { MethodImpl.this.insertNewResponse(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.ResponseDocument.Response remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.ResponseDocument.Response old = MethodImpl.this.getResponseArray(i);
                    MethodImpl.this.removeResponse(i);
                    return old;
                }
                
                public int size()
                    { return MethodImpl.this.sizeOfResponseArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResponseList();
            }
        }
        
        /**
         * Gets array of all "response" elements
         * @deprecated
         */
        public net.java.dev.wadl.x2009.x02.ResponseDocument.Response[] getResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.ResponseDocument.Response> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.ResponseDocument.Response>();
                get_store().find_all_element_users(RESPONSE$4, targetList);
                net.java.dev.wadl.x2009.x02.ResponseDocument.Response[] result = new net.java.dev.wadl.x2009.x02.ResponseDocument.Response[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "response" element
         */
        public net.java.dev.wadl.x2009.x02.ResponseDocument.Response getResponseArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResponseDocument.Response target = null;
                target = (net.java.dev.wadl.x2009.x02.ResponseDocument.Response)get_store().find_element_user(RESPONSE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "response" element
         */
        public int sizeOfResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESPONSE$4);
            }
        }
        
        /**
         * Sets array of all "response" element
         */
        public void setResponseArray(net.java.dev.wadl.x2009.x02.ResponseDocument.Response[] responseArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(responseArray, RESPONSE$4);
            }
        }
        
        /**
         * Sets ith "response" element
         */
        public void setResponseArray(int i, net.java.dev.wadl.x2009.x02.ResponseDocument.Response response)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResponseDocument.Response target = null;
                target = (net.java.dev.wadl.x2009.x02.ResponseDocument.Response)get_store().find_element_user(RESPONSE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(response);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "response" element
         */
        public net.java.dev.wadl.x2009.x02.ResponseDocument.Response insertNewResponse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResponseDocument.Response target = null;
                target = (net.java.dev.wadl.x2009.x02.ResponseDocument.Response)get_store().insert_element_user(RESPONSE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "response" element
         */
        public net.java.dev.wadl.x2009.x02.ResponseDocument.Response addNewResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResponseDocument.Response target = null;
                target = (net.java.dev.wadl.x2009.x02.ResponseDocument.Response)get_store().add_element_user(RESPONSE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "response" element
         */
        public void removeResponse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESPONSE$4, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
                return get_store().find_attribute_user(ID$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
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
                get_store().remove_attribute(ID$6);
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
        public net.java.dev.wadl.x2009.x02.Method xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.Method target = null;
                target = (net.java.dev.wadl.x2009.x02.Method)get_store().find_attribute_user(NAME$8);
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
        public void xsetName(net.java.dev.wadl.x2009.x02.Method name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.Method target = null;
                target = (net.java.dev.wadl.x2009.x02.Method)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (net.java.dev.wadl.x2009.x02.Method)get_store().add_attribute_user(NAME$8);
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
    }
}
