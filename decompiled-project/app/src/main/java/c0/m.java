package c0;

/* loaded from: classes.dex */
public interface m {
    Object a(Object obj, Rb.e eVar);

    boolean b(Rb.c cVar);

    default m c(m mVar) {
        return mVar == j.f14110a ? this : new g(this, mVar);
    }
}
