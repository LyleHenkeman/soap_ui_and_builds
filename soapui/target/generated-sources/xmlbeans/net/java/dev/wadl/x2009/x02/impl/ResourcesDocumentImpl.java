/*
 * An XML document type.
 * Localname: resources
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.ResourcesDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one resources(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class ResourcesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.ResourcesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourcesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCES$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "resources");
    
    
    /**
     * Gets the "resources" element
     */
    public net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources getResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources target = null;
            target = (net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources)get_store().find_element_user(RESOURCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resources" element
     */
    public void setResources(net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources resources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources target = null;
            target = (net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources)get_store().find_element_user(RESOURCES$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources)get_store().add_element_user(RESOURCES$0);
            }
            target.set(resources);
        }
    }
    
    /**
     * Appends and returns a new empty "resources" element
     */
    public net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources addNewResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources target = null;
            target = (net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources)get_store().add_element_user(RESOURCES$0);
            return target;
        }
    }
    /**
     * An XML resources(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class ResourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources
    {
        private static final long serialVersionUID = 1L;
        
        public ResourcesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOC$0 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
        private static final javax.xml.namespace.QName RESOURCE$2 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "resource");
        private static final javax.xml.namespace.QName BASE$4 = 
            new javax.xml.namespace.QName("", "base");
        
        
        /**
         * Gets a List of "doc" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList()
        {
            final class DocList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>
            {
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc get(int i)
                    { return ResourcesImpl.this.getDocArray(i); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc set(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = ResourcesImpl.this.getDocArray(i);
                    ResourcesImpl.this.setDocArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                    { ResourcesImpl.this.insertNewDoc(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = ResourcesImpl.this.getDocArray(i);
                    ResourcesImpl.this.removeDoc(i);
                    return old;
                }
                
                public int size()
                    { return ResourcesImpl.this.sizeOfDocArray(); }
                
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
         * Gets a List of "resource" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.ResourceDocument.Resource> getResourceList()
        {
            final class ResourceList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.ResourceDocument.Resource>
            {
                public net.java.dev.wadl.x2009.x02.ResourceDocument.Resource get(int i)
                    { return ResourcesImpl.this.getResourceArray(i); }
                
                public net.java.dev.wadl.x2009.x02.ResourceDocument.Resource set(int i, net.java.dev.wadl.x2009.x02.ResourceDocument.Resource o)
                {
                    net.java.dev.wadl.x2009.x02.ResourceDocument.Resource old = ResourcesImpl.this.getResourceArray(i);
                    ResourcesImpl.this.setResourceArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.ResourceDocument.Resource o)
                    { ResourcesImpl.this.insertNewResource(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.ResourceDocument.Resource remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.ResourceDocument.Resource old = ResourcesImpl.this.getResourceArray(i);
                    ResourcesImpl.this.removeResource(i);
                    return old;
                }
                
                public int size()
                    { return ResourcesImpl.this.sizeOfResourceArray(); }
                
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
                get_store().find_all_element_users(RESOURCE$2, targetList);
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
                target = (net.java.dev.wadl.x2009.x02.ResourceDocument.Resource)get_store().find_element_user(RESOURCE$2, i);
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
                return get_store().count_elements(RESOURCE$2);
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
                arraySetterHelper(resourceArray, RESOURCE$2);
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
                target = (net.java.dev.wadl.x2009.x02.ResourceDocument.Resource)get_store().find_element_user(RESOURCE$2, i);
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
                target = (net.java.dev.wadl.x2009.x02.ResourceDocument.Resource)get_store().insert_element_user(RESOURCE$2, i);
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
                target = (net.java.dev.wadl.x2009.x02.ResourceDocument.Resource)get_store().add_element_user(RESOURCE$2);
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
                get_store().remove_element(RESOURCE$2, i);
            }
        }
        
        /**
         * Gets the "base" attribute
         */
        public java.lang.String getBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "base" attribute
         */
        public org.apache.xmlbeans.XmlAnyURI xgetBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(BASE$4);
                return target;
            }
        }
        
        /**
         * True if has "base" attribute
         */
        public boolean isSetBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BASE$4) != null;
            }
        }
        
        /**
         * Sets the "base" attribute
         */
        public void setBase(java.lang.String base)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE$4);
                }
                target.setStringValue(base);
            }
        }
        
        /**
         * Sets (as xml) the "base" attribute
         */
        public void xsetBase(org.apache.xmlbeans.XmlAnyURI base)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(BASE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(BASE$4);
                }
                target.set(base);
            }
        }
        
        /**
         * Unsets the "base" attribute
         */
        public void unsetBase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BASE$4);
            }
        }
    }
}
