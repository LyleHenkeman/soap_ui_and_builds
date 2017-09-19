/*
 * An XML document type.
 * Localname: grammars
 * Namespace: http://wadl.dev.java.net/2009/02
 * Java type: net.java.dev.wadl.x2009.x02.GrammarsDocument
 *
 * Automatically generated - do not modify.
 */
package net.java.dev.wadl.x2009.x02.impl;
/**
 * A document containing one grammars(@http://wadl.dev.java.net/2009/02) element.
 *
 * This is a complex type.
 */
public class GrammarsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.GrammarsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GrammarsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GRAMMARS$0 = 
        new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "grammars");
    
    
    /**
     * Gets the "grammars" element
     */
    public net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars getGrammars()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars target = null;
            target = (net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars)get_store().find_element_user(GRAMMARS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars)get_store().find_element_user(GRAMMARS$0, 0);
            if (target == null)
            {
                target = (net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars)get_store().add_element_user(GRAMMARS$0);
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
            target = (net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars)get_store().add_element_user(GRAMMARS$0);
            return target;
        }
    }
    /**
     * An XML grammars(@http://wadl.dev.java.net/2009/02).
     *
     * This is a complex type.
     */
    public static class GrammarsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.java.dev.wadl.x2009.x02.GrammarsDocument.Grammars
    {
        private static final long serialVersionUID = 1L;
        
        public GrammarsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOC$0 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "doc");
        private static final javax.xml.namespace.QName INCLUDE$2 = 
            new javax.xml.namespace.QName("http://wadl.dev.java.net/2009/02", "include");
        
        
        /**
         * Gets a List of "doc" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.DocDocument.Doc> getDocList()
        {
            final class DocList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.DocDocument.Doc>
            {
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc get(int i)
                    { return GrammarsImpl.this.getDocArray(i); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc set(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = GrammarsImpl.this.getDocArray(i);
                    GrammarsImpl.this.setDocArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.DocDocument.Doc o)
                    { GrammarsImpl.this.insertNewDoc(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.DocDocument.Doc remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.DocDocument.Doc old = GrammarsImpl.this.getDocArray(i);
                    GrammarsImpl.this.removeDoc(i);
                    return old;
                }
                
                public int size()
                    { return GrammarsImpl.this.sizeOfDocArray(); }
                
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
         * Gets a List of "include" elements
         */
        public java.util.List<net.java.dev.wadl.x2009.x02.IncludeDocument.Include> getIncludeList()
        {
            final class IncludeList extends java.util.AbstractList<net.java.dev.wadl.x2009.x02.IncludeDocument.Include>
            {
                public net.java.dev.wadl.x2009.x02.IncludeDocument.Include get(int i)
                    { return GrammarsImpl.this.getIncludeArray(i); }
                
                public net.java.dev.wadl.x2009.x02.IncludeDocument.Include set(int i, net.java.dev.wadl.x2009.x02.IncludeDocument.Include o)
                {
                    net.java.dev.wadl.x2009.x02.IncludeDocument.Include old = GrammarsImpl.this.getIncludeArray(i);
                    GrammarsImpl.this.setIncludeArray(i, o);
                    return old;
                }
                
                public void add(int i, net.java.dev.wadl.x2009.x02.IncludeDocument.Include o)
                    { GrammarsImpl.this.insertNewInclude(i).set(o); }
                
                public net.java.dev.wadl.x2009.x02.IncludeDocument.Include remove(int i)
                {
                    net.java.dev.wadl.x2009.x02.IncludeDocument.Include old = GrammarsImpl.this.getIncludeArray(i);
                    GrammarsImpl.this.removeInclude(i);
                    return old;
                }
                
                public int size()
                    { return GrammarsImpl.this.sizeOfIncludeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IncludeList();
            }
        }
        
        /**
         * Gets array of all "include" elements
         * @deprecated
         */
        public net.java.dev.wadl.x2009.x02.IncludeDocument.Include[] getIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<net.java.dev.wadl.x2009.x02.IncludeDocument.Include> targetList = new java.util.ArrayList<net.java.dev.wadl.x2009.x02.IncludeDocument.Include>();
                get_store().find_all_element_users(INCLUDE$2, targetList);
                net.java.dev.wadl.x2009.x02.IncludeDocument.Include[] result = new net.java.dev.wadl.x2009.x02.IncludeDocument.Include[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "include" element
         */
        public net.java.dev.wadl.x2009.x02.IncludeDocument.Include getIncludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.IncludeDocument.Include target = null;
                target = (net.java.dev.wadl.x2009.x02.IncludeDocument.Include)get_store().find_element_user(INCLUDE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "include" element
         */
        public int sizeOfIncludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCLUDE$2);
            }
        }
        
        /**
         * Sets array of all "include" element
         */
        public void setIncludeArray(net.java.dev.wadl.x2009.x02.IncludeDocument.Include[] includeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(includeArray, INCLUDE$2);
            }
        }
        
        /**
         * Sets ith "include" element
         */
        public void setIncludeArray(int i, net.java.dev.wadl.x2009.x02.IncludeDocument.Include include)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.IncludeDocument.Include target = null;
                target = (net.java.dev.wadl.x2009.x02.IncludeDocument.Include)get_store().find_element_user(INCLUDE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(include);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "include" element
         */
        public net.java.dev.wadl.x2009.x02.IncludeDocument.Include insertNewInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.IncludeDocument.Include target = null;
                target = (net.java.dev.wadl.x2009.x02.IncludeDocument.Include)get_store().insert_element_user(INCLUDE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "include" element
         */
        public net.java.dev.wadl.x2009.x02.IncludeDocument.Include addNewInclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                net.java.dev.wadl.x2009.x02.IncludeDocument.Include target = null;
                target = (net.java.dev.wadl.x2009.x02.IncludeDocument.Include)get_store().add_element_user(INCLUDE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "include" element
         */
        public void removeInclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCLUDE$2, i);
            }
        }
    }
}
