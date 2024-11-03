package Expection_Basic;

public  class FList implements MyList {
    private int arr[];
    private int CurrIndex;
    private final int size;

    public FList() {
        super();
        this.size = 5;
        this.CurrIndex = 0;
        this.arr = new int[size];
    }

    @Override
    public void InsertElement(int ele) throws Exception  {
        if (CurrIndex == size) {
            throw new Exception("List is Full,Sorry you can not add more element.");
        }
        arr[CurrIndex++] = ele;
    }

    @Override
    public int RetriveElement(int index)throws Exception {
        // Corrected the condition to use || (logical OR) instead of &&
        if (index < 0 || index >= CurrIndex) {
            throw new Exception("Invalid index. Element cannot be retrieved.");
        }
        return arr[index];
    }
}
