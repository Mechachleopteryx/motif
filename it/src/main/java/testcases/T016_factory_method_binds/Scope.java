package testcases.T016_factory_method_binds;

@motif.Scope
public interface Scope {

    B b();

    abstract class Objects {
        abstract A a();

        abstract B b(A a);
    }
}
