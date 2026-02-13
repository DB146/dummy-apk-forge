package wc;

import java.util.IdentityHashMap;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class g extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f25886b;

    public /* synthetic */ g(Supplier supplier, int i7) {
        this.f25885a = i7;
        this.f25886b = supplier;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f25885a) {
            case 0:
                return ((d) this.f25886b).get();
            case 1:
                ((d) this.f25886b).getClass();
                return new char[2];
            default:
                ((d) this.f25886b).getClass();
                return new IdentityHashMap();
        }
    }
}
