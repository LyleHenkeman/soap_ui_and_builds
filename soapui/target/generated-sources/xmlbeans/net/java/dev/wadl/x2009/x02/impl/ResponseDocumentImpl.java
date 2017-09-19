/*
 * An XML document type.
 * Localname: response
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one response(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "response");
    
    
    /**
     * Gets the "response" element
     */
    public net.java.dev.wadl.x2009.x02.ResponseDocument.Response getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ResponseDocument.Response target = null;
            target = (net.java.dev.wadl.x2009.x02.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(net.java.dev.wadl.x2009.x02.ResponseDocument.Response response)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ResponseDocument.Response target = null;
            target = (net.java.dev.wadl.x2009.x02.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            }
            target.set(response);
        }
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public net.java.dev.wadl.x2009.x02.ResponseDocument.Response addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ResponseDocument.Response target = null;
            target = (net.java.dev.wadl.x2009.x02.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
    /**
     * An XML response(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.ResponseDocument.Response
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOC$0 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
        private static final javax.xml.namespace.QName PARAM$2 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "param");
        private static final javax.xml.namespace.QName REPRESENTATION$4 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "representation");
        private static final javax.xml.namespace.QName STATUS$6 = 
            new javax.xml.namespace.QName("", "status");
        
        
        /**
         * Gets a List of "doc" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList()
        {
            final class DocList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>
            {
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc get(int i)
                    { return ResponseImpl.this.getDocArray(i); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc set(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = ResponseImpl.this.getDocArray(i);
                    ResponseImpl.this.setDocArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                    { ResponseImpl.this.insertNewDoc(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = ResponseImpl.this.getDocArray(i);
                    ResponseImpl.this.removeDoc(i);
                    return old;
                }
                
                public int size()
                    { return ResponseImpl.this.sizeOfDocArray(); }
                
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
                    { return ResponseImpl.this.getParamArray(i); }
                
                public net.java.dev.wadl.x2009.x02.ParamDocument.Param set(int i, net.java.dev.wadl.x2009.x02.ParamDocument.Param o)
                {
                    net.java.dev.wadl.x2009.x02.ParamDocument.Param old = ResponseImpl.this.getParamArray(i);
                    ResponseImpl.this.setParamArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.ParamDocument.Param o)
                    { ResponseImpl.this.insertNewParam(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.ParamDocument.Param remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.ParamDocument.Param old = ResponseImpl.this.getParamArray(i);
                    ResponseImpl.this.removeParam(i);
                    return old;
                }
                
                public int size()
                    { return ResponseImpl.this.sizeOfParamArray(); }
                
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
         * Gets a List of "representation" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation> getRepresentationList()
        {
            final class RepresentationList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation>
            {
                public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation get(int i)
                    { return ResponseImpl.this.getRepresentationArray(i); }
                
                public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation set(int i, net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation o)
                {
                    net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation old = ResponseImpl.this.getRepresentationArray(i);
                    ResponseImpl.this.setRepresentationArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation o)
                    { ResponseImpl.this.insertNewRepresentation(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation old = ResponseImpl.this.getRepresentationArray(i);
                    ResponseImpl.this.removeRepresentation(i);
                    return old;
                }
                
                public int size()
                    { return ResponseImpl.this.sizeOfRepresentationArray(); }
                
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
        public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation[] getRepresentationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation>();
                get_store().find_all_element_users(REPRESENTATION$4, targetList);
                net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation[] result = new net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "representation" element
         */
        public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation getRepresentationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation target = null;
                target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().find_element_user(REPRESENTATION$4, i);
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
                return get_store().count_elements(REPRESENTATION$4);
            }
        }
        
        /**
         * Sets array of all "representation" element
         */
        public void setRepresentationArray(net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation[] representationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(representationArray, REPRESENTATION$4);
            }
        }
        
        /**
         * Sets ith "representation" element
         */
        public void setRepresentationArray(int i, net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation representation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation target = null;
                target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().find_element_user(REPRESENTATION$4, i);
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
        public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation insertNewRepresentation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation target = null;
                target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().insert_element_user(REPRESENTATION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "representation" element
         */
        public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation addNewRepresentation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation target = null;
                target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().add_element_user(REPRESENTATION$4);
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
                get_store().remove_element(REPRESENTATION$4, i);
            }
        }
        
        /**
         * Gets the "status" attribute
         */
        public java.util.List getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
                if (target == null)
                {
                    return null;
                }
                return target.getListValue();
            }
        }
        
        /**
         * Gets (as xml) the "status" attribute
         */
        public net.java.dev.wadl.x2009.x02.StatusCodeList xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.StatusCodeList target = null;
                target = (net.java.dev.wadl.x2009.x02.StatusCodeList)get_store().find_attribute_user(STATUS$6);
                return target;
            }
        }
        
        /**
         * True if has "status" attribute
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STATUS$6) != null;
            }
        }
        
        /**
         * Sets the "status" attribute
         */
        public void setStatus(java.util.List status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$6);
                }
                target.setListValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "status" attribute
         */
        public void xsetStatus(net.java.dev.wadl.x2009.x02.StatusCodeList status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.StatusCodeList target = null;
                target = (net.java.dev.wadl.x2009.x02.StatusCodeList)get_store().find_attribute_user(STATUS$6);
                if (target == null)
                {
                    target = (net.java.dev.wadl.x2009.x02.StatusCodeList)get_store().add_attribute_user(STATUS$6);
                }
                target.set(status);
            }
        }
        
        /**
         * Unsets the "status" attribute
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STATUS$6);
            }
        }
    }
}
