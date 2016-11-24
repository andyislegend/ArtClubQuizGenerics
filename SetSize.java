public class SetSizeQuiz {

    public static void main(String[] args) {

        Set<Number> set = new TreeSet<>();
        set.add(1);
        set.add(1L);
        set.add(1.00);

        System.out.println(set.size());
    }
}
