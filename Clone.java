public class Clone<T extends Cloneable> {

    public void doSomething(T param) {
    T copy = (T) param.clone(); 
    }
    
}
