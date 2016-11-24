public class Compressor<T> {

    String compress(Collection<?> obj) {
        String s = "";
        for (Object o : obj)
            s += "";
        return s;
    }

    int compress(List<Integer> list) {
        int result = 0;
        for (int i: list)
            result+=i;
        return result;
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1","2","3");
        System.out.println(new Compressor().compress(list));
    }

}
