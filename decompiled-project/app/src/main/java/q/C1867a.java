package q;

import java.util.HashMap;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1867a extends C1872f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f23324e = new HashMap();

    @Override // q.C1872f
    public final C1869c b(Object obj) {
        return (C1869c) this.f23324e.get(obj);
    }

    @Override // q.C1872f
    public final Object i(Object obj) {
        Object i7 = super.i(obj);
        this.f23324e.remove(obj);
        return i7;
    }
}
