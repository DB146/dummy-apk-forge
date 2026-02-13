package P4;

import m4.C1555I;

/* renamed from: P4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0465m implements M6.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8102b;

    public /* synthetic */ C0465m(Object obj, int i7) {
        this.f8101a = i7;
        this.f8102b = obj;
    }

    @Override // M6.q
    public final Object get() {
        switch (this.f8101a) {
            case 0:
                try {
                    return (A) ((Class) this.f8102b).getConstructor(null).newInstance(null);
                } catch (Exception e2) {
                    throw new IllegalStateException(e2);
                }
            default:
                return Boolean.valueOf(((C1555I) this.f8102b).f19927M);
        }
    }
}
