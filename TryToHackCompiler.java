public class TryToHackCompiler {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        List list = integers;
        List<Number> numbers = list;
        numbers.add(9.78d);

        System.out.println(numbers.get(0));
        System.out.println(integers.get(0));
    }
}
