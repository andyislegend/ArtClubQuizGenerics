public class TypeInferenceOverdose {

    static <T> void setFirst(T[] ar, T s) {
        ar[0] = s;
    }
    
    public static void main(String[] args) {
        setFirst(new String[10], new Integer(1));
    }

}
