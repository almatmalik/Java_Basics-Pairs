import java.util.NoSuchElementException;
import java.util.Objects;

class Pair <F,S>{
    private final F first;
    private final S second;
    private Pair(F first, S second){
        this.first = first;
        this.second = second;
    }
    public static <F,S> Pair <F,S> of(F first, S second){
        return new Pair <> (first, second);

    }
    public F getFirst(){
       /* if (first == null)
            throw new NoSuchElementException("First value not presented");*/
        return first;
    }
    public S getSecond(){
      /*  if (second == null)
            throw new NoSuchElementException("Second value not presented");*/
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(getFirst(), pair.getFirst()) && Objects.equals(getSecond(), pair.getSecond());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(), getSecond());
    }
}
