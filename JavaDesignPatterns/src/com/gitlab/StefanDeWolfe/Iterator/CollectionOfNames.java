package com.gitlab.StefanDeWolfe.Iterator;

public class CollectionOfNames implements Container {
    public String name[] = {"Stefan", "Joe","Jane","John","Joanna"};

    @Override
    public Iterator getIterator() {
        return new CollectionofNamesIterate() ;
    }
    private class CollectionofNamesIterate implements Iterator {
        int i;
        @Override
        public boolean hasNext() {
            if (i < name.length) {
                return true;
            }
            return false;
        }
        @Override
        public Object next() {
            if(this.hasNext()) {
                return name[i++];
            }
            return null;
        }
    }
}

