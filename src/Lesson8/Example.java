package Lesson8;

import java.util.HashSet;


public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Example)) {
            return false;
        }
        Example other = (Example) obj;
        boolean firstEquals = (this.first == null && other.first == null) || (this.first != null && this.first.equals(other.first));
        boolean lastEquals = (this.last == null && other.last == null) || (this.last != null && this.last.equals(other.last));
        boolean hashEquals = this.hashCode() == other.hashCode();
        return firstEquals && lastEquals && hashEquals;
    }

    @Override
    public int hashCode() {
        int result = 31 * first.hashCode();
        result = 31 * result + last.hashCode();
        return result;
    }



    public static void main(String[] args) {
        HashSet<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}
