public class ILoveExceptions {
    public static <T> T foo() {
        try {
            return (T) new Integer(42);
        } catch (ClassCastException e) {
            return (T) "ArtClub";
        }
    }
    public static void main(String[] args) {
        System.out.println(ILoveExceptions.<String>foo());
    }
}
