public class IntegerIteration<T> {

    public List<Integer> numbers() {
        return Arrays.asList(1,2);
    }

    public static void main(String[] args) {
        IntegerIteration quiz = new IntegerIteration();

        for (Integer i: quiz.numbers()) {
            System.out.println(i);
        }
    }

}
