package c0;

/* loaded from: classes.dex */
public interface k extends m {
    @Override // c0.m
    default Object a(Object obj, Rb.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // c0.m
    default boolean b(Rb.c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }
}
