class ClassDataArray {
    private Person[] a;
    private int nElems;

    //No eeror here just delete one ; or do (ClassDataArray(int max)) and again ClassDataArray(int max), This will fix this error
    public ClassDataArray(int max)
    {
        a = new Person[max];
        nElems = 0;
    }
    
    public Person find(String searchName)
    {
        int j;
        for(j=0; j<nElems; j++)
            if(a[j].getLast().equals(searchName))
                break;
        if(j==nElems)
            return null;
        else
        return a[j];
    }

    public void inset(String last, String first, int age) 
    {
        a[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchName) 
    {
        int j;
        for(j=0;j<nElems;j++)
            if(a[j].getLast().equals(searchName))
                break;
        if(j==nElems)
            return false;
        else
        {
            for(int k=j;k<nElems;k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    public void displayA()
    {
        for(int j=0;j<nElems;j++)
            a[j].displayPerson();
    }
}
