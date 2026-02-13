package cc;

/* loaded from: classes2.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f14481a = new ThreadLocal();

    public static AbstractC0921a0 a() {
        ThreadLocal threadLocal = f14481a;
        AbstractC0921a0 abstractC0921a0 = (AbstractC0921a0) threadLocal.get();
        if (abstractC0921a0 != null) {
            return abstractC0921a0;
        }
        C0936i c0936i = new C0936i(Thread.currentThread());
        threadLocal.set(c0936i);
        return c0936i;
    }
}
