package setExample;

import com.google.common.collect.ForwardingSet;

import java.util.Set;

public class EvenSet<E> extends ForwardingSet<E> {

    final Set<E> delegate;

    public EvenSet(Set<E> delegate) {
        this.delegate = delegate;
    }
    @Override
    protected Set<E> delegate() {
        return delegate;
    }

    @Override
    public boolean add(E element) {
        Integer convertedElement = element instanceof Integer ? ((Integer) element) :
                        element instanceof String ? Integer.parseInt((String) element):
                        null;
        if(isEven(convertedElement)){
            return super.add(element);
        }
        throw new IllegalArgumentException("The element isn't an even number");

    }

    private boolean isEven(Integer element){
        return element % 2==0;
    }

}
