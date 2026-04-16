nterface Eff<A, B> {
        B f(A a);
    }

    abstract class POne<A> {
        abstract A _1();
    
        static <A> POne<Hooray<A>> sequence(final Hooray<POne<A>> as) {
            return new POne<Hooray<A>>() {
                public Hooray<A> _1() {
 return as.map(POne.<A>__1()
);
                }
            };
        }

        static <A> Eff<POne<A>, A> __1() {
            return new Eff<POne<A>, A>() {
                public A f(final POne<A> p) {
 return p._1()
;
                }
            };
        }

    }

    final class ProductOne {
    
    }

    final class Hooray<A> {
        public <B> Hooray<B> map(final Eff<A, B> f) {
            return null;
        }
    }

