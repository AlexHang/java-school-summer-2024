public class MyGenericClass <T extends Integer,V>{
    private T firstParam;
    private V secondParam;

    public T getFirstParam() {
        return firstParam;
    }

    public void setFirstParam(T firstParam) {
        this.firstParam = firstParam;
    }

    public V getSecondParam() {
        return secondParam;
    }

    public void setSecondParam(V secondParam) {
        this.secondParam = secondParam;
    }
}
