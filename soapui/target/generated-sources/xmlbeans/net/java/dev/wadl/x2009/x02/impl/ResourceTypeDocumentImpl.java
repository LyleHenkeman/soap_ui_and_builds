/*
 * An XML document type.
 * Localname: resource_type
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.ResourceTypeDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one resource_type(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class ResourceTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.ResourceTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCETYPE$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "resource_type");
    
    
    /**
     * Gets the "resource_type" element
     */
    public net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType getResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType target = null;
            target = (net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType)get_store().find_element_user(RESOURCETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resource_type" element
     */
    public void setResourceType(net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType resourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType target = null;
            target = (net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType)get_store().find_element_user(RESOURCETYPE$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType)get_store().add_element_user(RESOURCETYPE$0);
            }
            target.set(resourceType);
        }
    }
    
    /**
     * Appends and returns a new empty "resource_type" element
     */
    public net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType addNewResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType target = null;
            target = (net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType)get_store().add_element_user(RESOURCETYPE$0);
            return target;
        }
    }
    /**
     * An XML resource_type(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class ResourceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOC$0 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
        private static final javax.xml.namespace.QName PARAM$2 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "param");
        private static final javax.xml.namespace.QName METHOD$4 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "method");
        private static final javax.xml.namespace.QName RESOURCE$6 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "resource");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets a List of "doc" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList()
        {
            final class DocList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>
            {
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc get(int i)
                    { return ResourceTypeImpl.this.getDocArray(i); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc set(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = ResourceTypeImpl.this.getDocArray(i);
                    ResourceTypeImpl.this.setDocArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                    { ResourceTypeImpl.this.insertNewDoc(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = ResourceTypeImpl.this.getDocArray(i);
                    ResourceTypeImpl.this.removeDoc(i);
                    return old;
                }
                
                public int size()
                    { return ResourceTypeImpl.this.sizeOfDocArray(); }
                
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
                    { return ResourceTypeImpl.this.getParamArray(i); }
                
                public net.java.dev.wadl.x2009.x02.ParamDocument.Param set(int i, net.java.dev.wadl.x2009.x02.ParamDocument.Param o)
                {
                    net.java.dev.wadl.x2009.x02.ParamDocument.Param old = ResourceTypeImpl.this.getParamArray(i);
                    ResourceTypeImpl.this.setParamArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.ParamDocument.Param o)
                    { ResourceTypeImpl.this.insertNewParam(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.ParamDocument.Param remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.ParamDocument.Param old = ResourceTypeImpl.this.getParamArray(i);
                    ResourceTypeImpl.this.removeParam(i);
                    return old;
                }
                
                public int size()
                    { return ResourceTypeImpl.this.sizeOfParamArray(); }
                
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
         * Gets a List of "method" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.MethodDocument.Method> getMethodList()
        {
            final class MethodList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.MethodDocument.Method>
            {
                public net.java.dev.wadl.x2009.x02.MethodDocument.Method get(int i)
                    { return ResourceTypeImpl.this.getMethodArray(i); }
                
                public net.java.dev.wadl.x2009.x02.MethodDocument.Method set(int i, net.java.dev.wadl.x2009.x02.MethodDocument.Method o)
                {
                    net.java.dev.wadl.x2009.x02.MethodDocument.Method old = ResourceTypeImpl.this.getMethodArray(i);
                    ResourceTypeImpl.this.setMethodArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.MethodDocument.Method o)
                    { ResourceTypeImpl.this.insertNewMethod(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.MethodDocument.Method remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.MethodDocument.Method old = ResourceTypeImpl.this.getMethodArray(i);
                    ResourceTypeImpl.this.removeMethod(i);
                    return old;
                }
                
                public int size()
                    { return ResourceTypeImpl.this.sizeOfMethodArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MethodList();
            }
        }
        
        /**
         * Gets array of all "method" elements
         * @deprecated
         */
        public net.java.dev.wadl.x2009.x02.MethodDocument.Method[] getMethodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.MethodDocument.Method> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.MethodDocument.Method>();
                get_store().find_all_element_users(METHOD$4, targetList);
                net.java.dev.wadl.x2009.x02.MethodDocument.Method[] result = new net.java.dev.wadl.x2009.x02.MethodDocument.Method[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "method" element
         */
        public net.java.dev.wadl.x2009.x02.MethodDocument.Method getMethodArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.MethodDocument.Method target = null;
                target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().find_element_user(METHOD$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "method" element
         */
        public int sizeOfMethodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METHOD$4);
            }
        }
        
        /**
         * Sets array of all "method" element
         */
        public void setMethodArray(net.java.dev.wadl.x2009.x02.MethodDocument.Method[] methodArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(methodArray, METHOD$4);
            }
        }
        
        /**
         * Sets ith "method" element
         */
        public void setMethodArray(int i, net.java.dev.wadl.x2009.x02.MethodDocument.Method method)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.MethodDocument.Method target = null;
                target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().find_element_user(METHOD$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(method);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "method" element
         */
        public net.java.dev.wadl.x2009.x02.MethodDocument.Method insertNewMethod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.MethodDocument.Method target = null;
                target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().insert_element_user(METHOD$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "method" element
         */
        public net.java.dev.wadl.x2009.x02.MethodDocument.Method addNewMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.MethodDocument.Method target = null;
                target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().add_element_user(METHOD$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "method" element
         */
        public void removeMethod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METHOD$4, i);
            }
        }
        
        /**
         * Gets a List of "resource" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.ResourceDocument.Resource> getResourceList()
        {
            final class ResourceList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.ResourceDocument.Resource>
            {
                public net.java.dev.wadl.x2009.x02.ResourceDocument.Resource get(int i)
                    { return ResourceTypeImpl.this.getResourceArray(i); }
                
                public net.java.dev.wadl.x2009.x02.ResourceDocument.Resource set(int i, net.java.dev.wadl.x2009.x02.ResourceDocument.Resource o)
                {
                    net.java.dev.wadl.x2009.x02.ResourceDocument.Resource old = ResourceTypeImpl.this.getResourceArray(i);
                    ResourceTypeImpl.this.setResourceArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.ResourceDocument.Resource o)
                    { ResourceTypeImpl.this.insertNewResource(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.ResourceDocument.Resource remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.ResourceDocument.Resource old = ResourceTypeImpl.this.getResourceArray(i);
                    ResourceTypeImpl.this.removeResource(i);
                    return old;
                }
                
                public int size()
                    { return ResourceTypeImpl.this.sizeOfResourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceList();
            }
        }
        
        /**
         * Gets array of all "resource" elements
         * @deprecated
         */
        public net.java.dev.wadl.x2009.x02.ResourceDocument.Resource[] getResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.ResourceDocument.Resource> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.ResourceDocument.Resource>();
                get_store().find_all_element_users(RESOURCE$6, targetList);
                net.java.dev.wadl.x2009.x02.ResourceDocument.Resource[] result = new net.java.dev.wadl.x2009.x02.ResourceDocument.Resource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resource" element
         */
        public net.java.dev.wadl.x2009.x02.ResourceDocument.Resource getResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourceDocument.Resource target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourceDocument.Resource)get_store().find_element_user(RESOURCE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resource" element
         */
        public int sizeOfResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCE$6);
            }
        }
        
        /**
         * Sets array of all "resource" element
         */
        public void setResourceArray(net.java.dev.wadl.x2009.x02.ResourceDocument.Resource[] resourceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resourceArray, RESOURCE$6);
            }
        }
        
        /**
         * Sets ith "resource" element
         */
        public void setResourceArray(int i, net.java.dev.wadl.x2009.x02.ResourceDocument.Resource resource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourceDocument.Resource target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourceDocument.Resource)get_store().find_element_user(RESOURCE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(resource);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource" element
         */
        public net.java.dev.wadl.x2009.x02.ResourceDocument.Resource insertNewResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourceDocument.Resource target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourceDocument.Resource)get_store().insert_element_user(RESOURCE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource" element
         */
        public net.java.dev.wadl.x2009.x02.ResourceDocument.Resource addNewResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourceDocument.Resource target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourceDocument.Resource)get_store().add_element_user(RESOURCE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "resource" element
         */
        public void removeResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCE$6, i);
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
}
