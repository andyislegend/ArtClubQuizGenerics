public class StringIsFinal {

    public static void main(String[] args) {
    
        String stringIsFinalClass = myList();
        
    }

    private static <T extends List> T myList() {
        return (T) new ArrayList();
    }

}
