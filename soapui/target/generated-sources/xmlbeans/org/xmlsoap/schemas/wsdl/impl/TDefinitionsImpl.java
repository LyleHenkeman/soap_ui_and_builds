/*
 * XML Type:  tDefinitions
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.xmlsoap.schemas.wsdl.TDefinitions
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.impl;
/**
 * An XML tDefinitions(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public class TDefinitionsImpl extends org.xmlsoap.schemas.wsdl.impl.TExtensibleDocumentedImpl implements org.xmlsoap.schemas.wsdl.TDefinitions
{
    private static final long serialVersionUID = 1L;
    
    public TDefinitionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "import");
    private static final javax.xml.namespace.QName TYPES$2 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "types");
    private static final javax.xml.namespace.QName MESSAGE$4 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "message");
    private static final javax.xml.namespace.QName PORTTYPE$6 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "portType");
    private static final javax.xml.namespace.QName BINDING$8 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "binding");
    private static final javax.xml.namespace.QName SERVICE$10 = 
        new javax.xml.namespace.QName("http://schemas.xmlsoap.org/wsdl/", "service");
    private static final javax.xml.namespace.QName TARGETNAMESPACE$12 = 
        new javax.xml.namespace.QName("", "targetNamespace");
    private static final javax.xml.namespace.QName NAME$14 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets a List of "import" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.TImport> getImportList()
    {
        final class ImportList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.TImport>
        {
            public org.xmlsoap.schemas.wsdl.TImport get(int i)
                { return TDefinitionsImpl.this.getImportArray(i); }
            
            public org.xmlsoap.schemas.wsdl.TImport set(int i, org.xmlsoap.schemas.wsdl.TImport o)
            {
                org.xmlsoap.schemas.wsdl.TImport old = TDefinitionsImpl.this.getImportArray(i);
                TDefinitionsImpl.this.setImportArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.TImport o)
                { TDefinitionsImpl.this.insertNewImport(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.TImport remove(int i)
            {
                org.xmlsoap.schemas.wsdl.TImport old = TDefinitionsImpl.this.getImportArray(i);
                TDefinitionsImpl.this.removeImport(i);
                return old;
            }
            
            public int size()
                { return TDefinitionsImpl.this.sizeOfImportArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ImportList();
        }
    }
    
    /**
     * Gets array of all "import" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.wsdl.TImport[] getImportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.TImport> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.TImport>();
            get_store().find_all_element_users(IMPORT$0, targetList);
            org.xmlsoap.schemas.wsdl.TImport[] result = new org.xmlsoap.schemas.wsdl.TImport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "import" element
     */
    public org.xmlsoap.schemas.wsdl.TImport getImportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TImport target = null;
            target = (org.xmlsoap.schemas.wsdl.TImport)get_store().find_element_user(IMPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "import" element
     */
    public int sizeOfImportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORT$0);
        }
    }
    
    /**
     * Sets array of all "import" element
     */
    public void setImportArray(org.xmlsoap.schemas.wsdl.TImport[] ximportArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ximportArray, IMPORT$0);
        }
    }
    
    /**
     * Sets ith "import" element
     */
    public void setImportArray(int i, org.xmlsoap.schemas.wsdl.TImport ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TImport target = null;
            target = (org.xmlsoap.schemas.wsdl.TImport)get_store().find_element_user(IMPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ximport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "import" element
     */
    public org.xmlsoap.schemas.wsdl.TImport insertNewImport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TImport target = null;
            target = (org.xmlsoap.schemas.wsdl.TImport)get_store().insert_element_user(IMPORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "import" element
     */
    public org.xmlsoap.schemas.wsdl.TImport addNewImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TImport target = null;
            target = (org.xmlsoap.schemas.wsdl.TImport)get_store().add_element_user(IMPORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "import" element
     */
    public void removeImport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORT$0, i);
        }
    }
    
    /**
     * Gets a List of "types" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.TTypes> getTypesList()
    {
        final class TypesList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.TTypes>
        {
            public org.xmlsoap.schemas.wsdl.TTypes get(int i)
                { return TDefinitionsImpl.this.getTypesArray(i); }
            
            public org.xmlsoap.schemas.wsdl.TTypes set(int i, org.xmlsoap.schemas.wsdl.TTypes o)
            {
                org.xmlsoap.schemas.wsdl.TTypes old = TDefinitionsImpl.this.getTypesArray(i);
                TDefinitionsImpl.this.setTypesArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.TTypes o)
                { TDefinitionsImpl.this.insertNewTypes(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.TTypes remove(int i)
            {
                org.xmlsoap.schemas.wsdl.TTypes old = TDefinitionsImpl.this.getTypesArray(i);
                TDefinitionsImpl.this.removeTypes(i);
                return old;
            }
            
            public int size()
                { return TDefinitionsImpl.this.sizeOfTypesArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TypesList();
        }
    }
    
    /**
     * Gets array of all "types" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.wsdl.TTypes[] getTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.TTypes> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.TTypes>();
            get_store().find_all_element_users(TYPES$2, targetList);
            org.xmlsoap.schemas.wsdl.TTypes[] result = new org.xmlsoap.schemas.wsdl.TTypes[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "types" element
     */
    public org.xmlsoap.schemas.wsdl.TTypes getTypesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TTypes target = null;
            target = (org.xmlsoap.schemas.wsdl.TTypes)get_store().find_element_user(TYPES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "types" element
     */
    public int sizeOfTypesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPES$2);
        }
    }
    
    /**
     * Sets array of all "types" element
     */
    public void setTypesArray(org.xmlsoap.schemas.wsdl.TTypes[] typesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(typesArray, TYPES$2);
        }
    }
    
    /**
     * Sets ith "types" element
     */
    public void setTypesArray(int i, org.xmlsoap.schemas.wsdl.TTypes types)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TTypes target = null;
            target = (org.xmlsoap.schemas.wsdl.TTypes)get_store().find_element_user(TYPES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(types);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "types" element
     */
    public org.xmlsoap.schemas.wsdl.TTypes insertNewTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TTypes target = null;
            target = (org.xmlsoap.schemas.wsdl.TTypes)get_store().insert_element_user(TYPES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "types" element
     */
    public org.xmlsoap.schemas.wsdl.TTypes addNewTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TTypes target = null;
            target = (org.xmlsoap.schemas.wsdl.TTypes)get_store().add_element_user(TYPES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "types" element
     */
    public void removeTypes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPES$2, i);
        }
    }
    
    /**
     * Gets a List of "message" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.TMessage> getMessageList()
    {
        final class MessageList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.TMessage>
        {
            public org.xmlsoap.schemas.wsdl.TMessage get(int i)
                { return TDefinitionsImpl.this.getMessageArray(i); }
            
            public org.xmlsoap.schemas.wsdl.TMessage set(int i, org.xmlsoap.schemas.wsdl.TMessage o)
            {
                org.xmlsoap.schemas.wsdl.TMessage old = TDefinitionsImpl.this.getMessageArray(i);
                TDefinitionsImpl.this.setMessageArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.TMessage o)
                { TDefinitionsImpl.this.insertNewMessage(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.TMessage remove(int i)
            {
                org.xmlsoap.schemas.wsdl.TMessage old = TDefinitionsImpl.this.getMessageArray(i);
                TDefinitionsImpl.this.removeMessage(i);
                return old;
            }
            
            public int size()
                { return TDefinitionsImpl.this.sizeOfMessageArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MessageList();
        }
    }
    
    /**
     * Gets array of all "message" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.wsdl.TMessage[] getMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.TMessage> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.TMessage>();
            get_store().find_all_element_users(MESSAGE$4, targetList);
            org.xmlsoap.schemas.wsdl.TMessage[] result = new org.xmlsoap.schemas.wsdl.TMessage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "message" element
     */
    public org.xmlsoap.schemas.wsdl.TMessage getMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TMessage target = null;
            target = (org.xmlsoap.schemas.wsdl.TMessage)get_store().find_element_user(MESSAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "message" element
     */
    public int sizeOfMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$4);
        }
    }
    
    /**
     * Sets array of all "message" element
     */
    public void setMessageArray(org.xmlsoap.schemas.wsdl.TMessage[] messageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageArray, MESSAGE$4);
        }
    }
    
    /**
     * Sets ith "message" element
     */
    public void setMessageArray(int i, org.xmlsoap.schemas.wsdl.TMessage message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TMessage target = null;
            target = (org.xmlsoap.schemas.wsdl.TMessage)get_store().find_element_user(MESSAGE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(message);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message" element
     */
    public org.xmlsoap.schemas.wsdl.TMessage insertNewMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TMessage target = null;
            target = (org.xmlsoap.schemas.wsdl.TMessage)get_store().insert_element_user(MESSAGE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message" element
     */
    public org.xmlsoap.schemas.wsdl.TMessage addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TMessage target = null;
            target = (org.xmlsoap.schemas.wsdl.TMessage)get_store().add_element_user(MESSAGE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "message" element
     */
    public void removeMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$4, i);
        }
    }
    
    /**
     * Gets a List of "portType" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.TPortType> getPortTypeList()
    {
        final class PortTypeList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.TPortType>
        {
            public org.xmlsoap.schemas.wsdl.TPortType get(int i)
                { return TDefinitionsImpl.this.getPortTypeArray(i); }
            
            public org.xmlsoap.schemas.wsdl.TPortType set(int i, org.xmlsoap.schemas.wsdl.TPortType o)
            {
                org.xmlsoap.schemas.wsdl.TPortType old = TDefinitionsImpl.this.getPortTypeArray(i);
                TDefinitionsImpl.this.setPortTypeArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.TPortType o)
                { TDefinitionsImpl.this.insertNewPortType(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.TPortType remove(int i)
            {
                org.xmlsoap.schemas.wsdl.TPortType old = TDefinitionsImpl.this.getPortTypeArray(i);
                TDefinitionsImpl.this.removePortType(i);
                return old;
            }
            
            public int size()
                { return TDefinitionsImpl.this.sizeOfPortTypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PortTypeList();
        }
    }
    
    /**
     * Gets array of all "portType" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.wsdl.TPortType[] getPortTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.TPortType> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.TPortType>();
            get_store().find_all_element_users(PORTTYPE$6, targetList);
            org.xmlsoap.schemas.wsdl.TPortType[] result = new org.xmlsoap.schemas.wsdl.TPortType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "portType" element
     */
    public org.xmlsoap.schemas.wsdl.TPortType getPortTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPortType target = null;
            target = (org.xmlsoap.schemas.wsdl.TPortType)get_store().find_element_user(PORTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "portType" element
     */
    public int sizeOfPortTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTTYPE$6);
        }
    }
    
    /**
     * Sets array of all "portType" element
     */
    public void setPortTypeArray(org.xmlsoap.schemas.wsdl.TPortType[] portTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portTypeArray, PORTTYPE$6);
        }
    }
    
    /**
     * Sets ith "portType" element
     */
    public void setPortTypeArray(int i, org.xmlsoap.schemas.wsdl.TPortType portType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPortType target = null;
            target = (org.xmlsoap.schemas.wsdl.TPortType)get_store().find_element_user(PORTTYPE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(portType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "portType" element
     */
    public org.xmlsoap.schemas.wsdl.TPortType insertNewPortType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPortType target = null;
            target = (org.xmlsoap.schemas.wsdl.TPortType)get_store().insert_element_user(PORTTYPE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "portType" element
     */
    public org.xmlsoap.schemas.wsdl.TPortType addNewPortType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TPortType target = null;
            target = (org.xmlsoap.schemas.wsdl.TPortType)get_store().add_element_user(PORTTYPE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "portType" element
     */
    public void removePortType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTTYPE$6, i);
        }
    }
    
    /**
     * Gets a List of "binding" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.TBinding> getBindingList()
    {
        final class BindingList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.TBinding>
        {
            public org.xmlsoap.schemas.wsdl.TBinding get(int i)
                { return TDefinitionsImpl.this.getBindingArray(i); }
            
            public org.xmlsoap.schemas.wsdl.TBinding set(int i, org.xmlsoap.schemas.wsdl.TBinding o)
            {
                org.xmlsoap.schemas.wsdl.TBinding old = TDefinitionsImpl.this.getBindingArray(i);
                TDefinitionsImpl.this.setBindingArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.TBinding o)
                { TDefinitionsImpl.this.insertNewBinding(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.TBinding remove(int i)
            {
                org.xmlsoap.schemas.wsdl.TBinding old = TDefinitionsImpl.this.getBindingArray(i);
                TDefinitionsImpl.this.removeBinding(i);
                return old;
            }
            
            public int size()
                { return TDefinitionsImpl.this.sizeOfBindingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BindingList();
        }
    }
    
    /**
     * Gets array of all "binding" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.wsdl.TBinding[] getBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.TBinding> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.TBinding>();
            get_store().find_all_element_users(BINDING$8, targetList);
            org.xmlsoap.schemas.wsdl.TBinding[] result = new org.xmlsoap.schemas.wsdl.TBinding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "binding" element
     */
    public org.xmlsoap.schemas.wsdl.TBinding getBindingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TBinding target = null;
            target = (org.xmlsoap.schemas.wsdl.TBinding)get_store().find_element_user(BINDING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "binding" element
     */
    public int sizeOfBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINDING$8);
        }
    }
    
    /**
     * Sets array of all "binding" element
     */
    public void setBindingArray(org.xmlsoap.schemas.wsdl.TBinding[] bindingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bindingArray, BINDING$8);
        }
    }
    
    /**
     * Sets ith "binding" element
     */
    public void setBindingArray(int i, org.xmlsoap.schemas.wsdl.TBinding binding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TBinding target = null;
            target = (org.xmlsoap.schemas.wsdl.TBinding)get_store().find_element_user(BINDING$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(binding);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "binding" element
     */
    public org.xmlsoap.schemas.wsdl.TBinding insertNewBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TBinding target = null;
            target = (org.xmlsoap.schemas.wsdl.TBinding)get_store().insert_element_user(BINDING$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "binding" element
     */
    public org.xmlsoap.schemas.wsdl.TBinding addNewBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TBinding target = null;
            target = (org.xmlsoap.schemas.wsdl.TBinding)get_store().add_element_user(BINDING$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "binding" element
     */
    public void removeBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINDING$8, i);
        }
    }
    
    /**
     * Gets a List of "service" elements
     */
    public java.util.List<org.xmlsoap.schemas.wsdl.TService> getServiceList()
    {
        final class ServiceList extends java.util.AbstractList<org.xmlsoap.schemas.wsdl.TService>
        {
            public org.xmlsoap.schemas.wsdl.TService get(int i)
                { return TDefinitionsImpl.this.getServiceArray(i); }
            
            public org.xmlsoap.schemas.wsdl.TService set(int i, org.xmlsoap.schemas.wsdl.TService o)
            {
                org.xmlsoap.schemas.wsdl.TService old = TDefinitionsImpl.this.getServiceArray(i);
                TDefinitionsImpl.this.setServiceArray(i, o);
                return old;
            }
            
            public void add(int i, org.xmlsoap.schemas.wsdl.TService o)
                { TDefinitionsImpl.this.insertNewService(i).set(o); }
            
            public org.xmlsoap.schemas.wsdl.TService remove(int i)
            {
                org.xmlsoap.schemas.wsdl.TService old = TDefinitionsImpl.this.getServiceArray(i);
                TDefinitionsImpl.this.removeService(i);
                return old;
            }
            
            public int size()
                { return TDefinitionsImpl.this.sizeOfServiceArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServiceList();
        }
    }
    
    /**
     * Gets array of all "service" elements
     * @deprecated
     */
    public org.xmlsoap.schemas.wsdl.TService[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.xmlsoap.schemas.wsdl.TService> targetList = new java.util.ArrayList<org.xmlsoap.schemas.wsdl.TService>();
            get_store().find_all_element_users(SERVICE$10, targetList);
            org.xmlsoap.schemas.wsdl.TService[] result = new org.xmlsoap.schemas.wsdl.TService[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service" element
     */
    public org.xmlsoap.schemas.wsdl.TService getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TService target = null;
            target = (org.xmlsoap.schemas.wsdl.TService)get_store().find_element_user(SERVICE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service" element
     */
    public int sizeOfServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$10);
        }
    }
    
    /**
     * Sets array of all "service" element
     */
    public void setServiceArray(org.xmlsoap.schemas.wsdl.TService[] serviceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceArray, SERVICE$10);
        }
    }
    
    /**
     * Sets ith "service" element
     */
    public void setServiceArray(int i, org.xmlsoap.schemas.wsdl.TService service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TService target = null;
            target = (org.xmlsoap.schemas.wsdl.TService)get_store().find_element_user(SERVICE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(service);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service" element
     */
    public org.xmlsoap.schemas.wsdl.TService insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TService target = null;
            target = (org.xmlsoap.schemas.wsdl.TService)get_store().insert_element_user(SERVICE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service" element
     */
    public org.xmlsoap.schemas.wsdl.TService addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.wsdl.TService target = null;
            target = (org.xmlsoap.schemas.wsdl.TService)get_store().add_element_user(SERVICE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "service" element
     */
    public void removeService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$10, i);
        }
    }
    
    /**
     * Gets the "targetNamespace" attribute
     */
    public java.lang.String getTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetNamespace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$12);
            return target;
        }
    }
    
    /**
     * True if has "targetNamespace" attribute
     */
    public boolean isSetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TARGETNAMESPACE$12) != null;
        }
    }
    
    /**
     * Sets the "targetNamespace" attribute
     */
    public void setTargetNamespace(java.lang.String targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAMESPACE$12);
            }
            target.setStringValue(targetNamespace);
        }
    }
    
    /**
     * Sets (as xml) the "targetNamespace" attribute
     */
    public void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TARGETNAMESPACE$12);
            }
            target.set(targetNamespace);
        }
    }
    
    /**
     * Unsets the "targetNamespace" attribute
     */
    public void unsetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TARGETNAMESPACE$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
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
    public org.apache.xmlbeans.XmlNCName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$14);
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
            return get_store().find_attribute_user(NAME$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$14);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlNCName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$14);
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
            get_store().remove_attribute(NAME$14);
        }
    }
}
