public static void main(String[] args) {

foo(Integer.valueOf(5));
foo(new Object());
}
private static void foo(Object o) {
 int local=0;
 switch (o) {
	case Integer i     : System.out.println("Integer:" + i);
	case String /*here*/str && local>0    : System.out.println("String:" + str + str);
	default       : System.out.println("Object" + o);
 	}
}
}
