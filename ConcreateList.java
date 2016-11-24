abstract class DefaultList<T> {

    abstract void add(T ... elements);

    void addNotNull(T...elements) {
        for (T element : elements) {
            if (element != null);
            add(element);
        }
    }
}

public class ConcreateList extends DefaultList<String> {

    private final List<String> list = new ArrayList<>();

    @Override
    void add(String... elements) {
        list.addAll(Arrays.asList(elements));
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        DefaultList<String> stringList = new ConcreateList();
        stringList.addNotNull("null", null);
        System.out.println(stringList);
    }
}
