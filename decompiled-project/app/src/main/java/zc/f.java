package zc;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f28376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc.l f28377c;

    public /* synthetic */ f(p pVar, xc.l lVar, int i7) {
        this.f28375a = i7;
        this.f28376b = pVar;
        this.f28377c = lVar;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f28375a) {
            case 0:
                return this.f28376b.b(this.f28377c, (xc.l) obj);
            default:
                return this.f28376b.d(this.f28377c, (xc.q) obj);
        }
    }
}
