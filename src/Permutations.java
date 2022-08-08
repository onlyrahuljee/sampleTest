import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Permutations {

    public static void main(String[] args) {

        String dictionary="a";
        String input="aaabaa";
        getPermutations(dictionary,input);
    }

    private static void getPermutations(String dictionary, String input) {
        int totalLength = input.length();
        AtomicInteger counter = new AtomicInteger();
        IntStream.range(0, totalLength).forEach(i -> {
            if (input.charAt(i) != dictionary.charAt(0)) {
                getPermutationString(dictionary, counter.get());
                counter.set(0);
            } else counter.getAndIncrement();
        });
        if(counter.get() !=0)
            getPermutationString(dictionary, counter.get());
    }

    private static void getPermutationString(String dictionary, int counter) {

        StringBuffer sb=new StringBuffer();
        for (AtomicInteger i = new AtomicInteger(counter); i.get() > 0; i.getAndDecrement()) {
            sb.append(dictionary);
            IntStream.range(0, i.get()).mapToObj(j -> sb.toString()).forEach(System.out::print);
        }

    }


}
