import java.io.Serializable;

class AcrossJVMSerializationFeature {
    public boolean isWriteReplace(Object method) {
        return true;
    }
    public Object writeReplace(Object proxy) {
        return proxy;
    }
}

class ProxyClass implements Serializable {
    @Override
    public String toString() {
        return "ProxyClass Instance";
    }
}

public class SerializationExample {
    public Object handleProxy(Object method, Object proxy) {
        if (new AcrossJVMSerializationFeature().isWriteReplace(method)) {
            return new AcrossJVMSerializationFeature().writeReplace(proxy);
        }
        return null;
    }

    public static void main(String[] args) {
        SerializationExample example = new SerializationExample();
        Object method = new Object();
        ProxyClass proxy = new ProxyClass();
        Object result = example.handleProxy(method, proxy);
        System.out.println(result);
    }
}    