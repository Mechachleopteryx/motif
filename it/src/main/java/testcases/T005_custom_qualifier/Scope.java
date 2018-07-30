package testcases.T005_custom_qualifier;

@motif.Scope
public interface Scope {

    String string();

    class Objects {

        String s(@A String a, @B String b) {
            return a + b;
        }

        @A
        String a() {
            return "a";
        }

        @B
        String b() {
            return "b";
        }
    }
}
