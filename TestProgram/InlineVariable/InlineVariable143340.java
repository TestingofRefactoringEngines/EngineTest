class A{
InvocationHandler handler = (proxy, method, args1) -> null;
        Reflect proxy = (Reflect) Proxy.newProxyInstance(
                            Reflect.class.getClassLoader(),
                            new Class[] { Reflect.class },
                            handler);
}