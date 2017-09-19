/*
 * An XML document type.
 * Localname: application
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.ApplicationDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one application(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class ApplicationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.ApplicationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ApplicationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName APPLICATION$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "application");
    
    
    /**
     * Gets the "application" element
     */
    public net.java.dev.wadl.x2009.x02.ApplicationDocument.Application getApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ApplicationDocument.Application target = null;
            target = (net.java.dev.wadl.x2009.x02.ApplicationDocument.Application)get_store().find_element_user(APPLICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "application" element
     */
    public void setApplication(net.java.dev.wadl.x2009.x02.ApplicationDocument.Application application)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ApplicationDocument.Application target = null;
            target = (net.java.dev.wadl.x2009.x02.ApplicationDocument.Application)get_store().find_element_user(APPLICATION$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.ApplicationDocument.Application)get_store().add_element_user(APPLICATION$0);
            }
            target.set(application);
        }
    }
    
    /**
     * Appends and returns a new empty "application" element
     */
    public net.java.dev.wadl.x2009.x02.ApplicationDocument.Application addNewApplication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.ApplicationDocument.Application target = null;
            target = (net.java.dev.wadl.x2009.x02.ApplicationDocument.Application)get_store().add_element_user(APPLICATION$0);
            return target;
        }
    }
    /**
     * An XML application(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class ApplicationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.ApplicationDocument.Application
    {
        private static final long serialVersionUID = 1L;
        
        public ApplicationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOC$0 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
        private static final javax.xml.namespace.QName GRAMMARS$2 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "grammars");
        private static final javax.xml.namespace.QName RESOURCES$4 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "resources");
        private static final javax.xml.namespace.QName RESOURCETYPE$6 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "resource_type");
        private static final javax.xml.namespace.QName METHOD$8 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "method");
        private static final javax.xml.namespace.QName REPRESENTATION$10 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "representation");
        private static final javax.xml.namespace.QName PARAM$12 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "param");
        
        
        /**
         * Gets a List of "doc" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList()
        {
            final class DocList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>
            {
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc get(int i)
                    { return ApplicationImpl.this.getDocArray(i); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc set(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = ApplicationImpl.this.getDocArray(i);
                    ApplicationImpl.this.setDocArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                    { ApplicationImpl.this.insertNewDoc(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = ApplicationImpl.this.getDocArray(i);
                    ApplicationImpl.this.removeDoc(i);
                    return old;
                }
                
                public int size()
                    { return ApplicationImpl.this.sizeOfDocArray(); }
                
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
         * Gets the "grammars" element
         */
        public net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars getGrammars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars target = null;
                target = (net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars)get_store().find_element_user(GRAMMARS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "grammars" element
         */
        public boolean isSetGrammars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GRAMMARS$2) != 0;
            }
        }
        
        /**
         * Sets the "grammars" element
         */
        public void setGrammars(net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars grammars)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars target = null;
                target = (net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars)get_store().find_element_user(GRAMMARS$2, 0);
                if (target == null)
                {
                    target = (net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars)get_store().add_element_user(GRAMMARS$2);
                }
                target.set(grammars);
            }
        }
        
        /**
         * Appends and returns a new empty "grammars" element
         */
        public net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars addNewGrammars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars target = null;
                target = (net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars)get_store().add_element_user(GRAMMARS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "grammars" element
         */
        public void unsetGrammars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GRAMMARS$2, 0);
            }
        }
        
        /**
         * Gets a List of "resources" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources> getResourcesList()
        {
            final class ResourcesList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources>
            {
                public net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources get(int i)
                    { return ApplicationImpl.this.getResourcesArray(i); }
                
                public net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources set(int i, net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources o)
                {
                    net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources old = ApplicationImpl.this.getResourcesArray(i);
                    ApplicationImpl.this.setResourcesArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources o)
                    { ApplicationImpl.this.insertNewResources(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources old = ApplicationImpl.this.getResourcesArray(i);
                    ApplicationImpl.this.removeResources(i);
                    return old;
                }
                
                public int size()
                    { return ApplicationImpl.this.sizeOfResourcesArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourcesList();
            }
        }
        
        /**
         * Gets array of all "resources" elements
         * @deprecated
         */
        public net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources[] getResourcesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources>();
                get_store().find_all_element_users(RESOURCES$4, targetList);
                net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources[] result = new net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resources" element
         */
        public net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources getResourcesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources)get_store().find_element_user(RESOURCES$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resources" element
         */
        public int sizeOfResourcesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCES$4);
            }
        }
        
        /**
         * Sets array of all "resources" element
         */
        public void setResourcesArray(net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources[] resourcesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resourcesArray, RESOURCES$4);
            }
        }
        
        /**
         * Sets ith "resources" element
         */
        public void setResourcesArray(int i, net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources resources)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources)get_store().find_element_user(RESOURCES$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(resources);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resources" element
         */
        public net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources insertNewResources(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources)get_store().insert_element_user(RESOURCES$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resources" element
         */
        public net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources addNewResources()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourcesDocument.Resources)get_store().add_element_user(RESOURCES$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "resources" element
         */
        public void removeResources(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCES$4, i);
            }
        }
        
        /**
         * Gets a List of "resource_type" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType> getResourceTypeList()
        {
            final class ResourceTypeList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType>
            {
                public net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType get(int i)
                    { return ApplicationImpl.this.getResourceTypeArray(i); }
                
                public net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType set(int i, net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType o)
                {
                    net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType old = ApplicationImpl.this.getResourceTypeArray(i);
                    ApplicationImpl.this.setResourceTypeArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType o)
                    { ApplicationImpl.this.insertNewResourceType(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType old = ApplicationImpl.this.getResourceTypeArray(i);
                    ApplicationImpl.this.removeResourceType(i);
                    return old;
                }
                
                public int size()
                    { return ApplicationImpl.this.sizeOfResourceTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceTypeList();
            }
        }
        
        /**
         * Gets array of all "resource_type" elements
         * @deprecated
         */
        public net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType[] getResourceTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType>();
                get_store().find_all_element_users(RESOURCETYPE$6, targetList);
                net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType[] result = new net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resource_type" element
         */
        public net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType getResourceTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType)get_store().find_element_user(RESOURCETYPE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resource_type" element
         */
        public int sizeOfResourceTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCETYPE$6);
            }
        }
        
        /**
         * Sets array of all "resource_type" element
         */
        public void setResourceTypeArray(net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType[] resourceTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resourceTypeArray, RESOURCETYPE$6);
            }
        }
        
        /**
         * Sets ith "resource_type" element
         */
        public void setResourceTypeArray(int i, net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType resourceType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType)get_store().find_element_user(RESOURCETYPE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(resourceType);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource_type" element
         */
        public net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType insertNewResourceType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType)get_store().insert_element_user(RESOURCETYPE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource_type" element
         */
        public net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType addNewResourceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType target = null;
                target = (net.java.dev.wadl.x2009.x02.ResourceTypeDocument.ResourceType)get_store().add_element_user(RESOURCETYPE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "resource_type" element
         */
        public void removeResourceType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCETYPE$6, i);
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
                    { return ApplicationImpl.this.getMethodArray(i); }
                
                public net.java.dev.wadl.x2009.x02.MethodDocument.Method set(int i, net.java.dev.wadl.x2009.x02.MethodDocument.Method o)
                {
                    net.java.dev.wadl.x2009.x02.MethodDocument.Method old = ApplicationImpl.this.getMethodArray(i);
                    ApplicationImpl.this.setMethodArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.MethodDocument.Method o)
                    { ApplicationImpl.this.insertNewMethod(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.MethodDocument.Method remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.MethodDocument.Method old = ApplicationImpl.this.getMethodArray(i);
                    ApplicationImpl.this.removeMethod(i);
                    return old;
                }
                
                public int size()
                    { return ApplicationImpl.this.sizeOfMethodArray(); }
                
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
                get_store().find_all_element_users(METHOD$8, targetList);
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
                target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().find_element_user(METHOD$8, i);
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
                return get_store().count_elements(METHOD$8);
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
                arraySetterHelper(methodArray, METHOD$8);
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
                target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().find_element_user(METHOD$8, i);
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
                target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().insert_element_user(METHOD$8, i);
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
                target = (net.java.dev.wadl.x2009.x02.MethodDocument.Method)get_store().add_element_user(METHOD$8);
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
                get_store().remove_element(METHOD$8, i);
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
                    { return ApplicationImpl.this.getRepresentationArray(i); }
                
                public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation set(int i, net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation o)
                {
                    net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation old = ApplicationImpl.this.getRepresentationArray(i);
                    ApplicationImpl.this.setRepresentationArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation o)
                    { ApplicationImpl.this.insertNewRepresentation(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation old = ApplicationImpl.this.getRepresentationArray(i);
                    ApplicationImpl.this.removeRepresentation(i);
                    return old;
                }
                
                public int size()
                    { return ApplicationImpl.this.sizeOfRepresentationArray(); }
                
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
                get_store().find_all_element_users(REPRESENTATION$10, targetList);
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
                target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().find_element_user(REPRESENTATION$10, i);
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
                return get_store().count_elements(REPRESENTATION$10);
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
                arraySetterHelper(representationArray, REPRESENTATION$10);
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
                target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().find_element_user(REPRESENTATION$10, i);
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
                target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().insert_element_user(REPRESENTATION$10, i);
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
                target = (net.java.dev.wadl.x2009.x02.RepresentationDocument.Representation)get_store().add_element_user(REPRESENTATION$10);
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
                get_store().remove_element(REPRESENTATION$10, i);
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
                    { return ApplicationImpl.this.getParamArray(i); }
                
                public net.java.dev.wadl.x2009.x02.ParamDocument.Param set(int i, net.java.dev.wadl.x2009.x02.ParamDocument.Param o)
                {
                    net.java.dev.wadl.x2009.x02.ParamDocument.Param old = ApplicationImpl.this.getParamArray(i);
                    ApplicationImpl.this.setParamArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.ParamDocument.Param o)
                    { ApplicationImpl.this.insertNewParam(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.ParamDocument.Param remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.ParamDocument.Param old = ApplicationImpl.this.getParamArray(i);
                    ApplicationImpl.this.removeParam(i);
                    return old;
                }
                
                public int size()
                    { return ApplicationImpl.this.sizeOfParamArray(); }
                
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
                get_store().find_all_element_users(PARAM$12, targetList);
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
                target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().find_element_user(PARAM$12, i);
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
                return get_store().count_elements(PARAM$12);
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
                arraySetterHelper(paramArray, PARAM$12);
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
                target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().find_element_user(PARAM$12, i);
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
                target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().insert_element_user(PARAM$12, i);
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
                target = (net.java.dev.wadl.x2009.x02.ParamDocument.Param)get_store().add_element_user(PARAM$12);
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
                get_store().remove_element(PARAM$12, i);
            }
        }
    }
}
