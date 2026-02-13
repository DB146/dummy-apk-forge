package zc;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes2.dex */
public abstract class C extends p {

    /* renamed from: a, reason: collision with root package name */
    public final p f28367a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28368b;

    /* renamed from: c, reason: collision with root package name */
    public final wc.g f28369c = new wc.g(new wc.d(7), 2);

    public C(p pVar) {
        this.f28367a = pVar;
        this.f28368b = pVar.f();
    }

    @Override // zc.p
    public boolean b(xc.l lVar, xc.l lVar2) {
        return g(lVar, lVar2);
    }

    @Override // zc.p
    public final boolean c(xc.l lVar, xc.p pVar) {
        return g(lVar, pVar);
    }

    @Override // zc.p
    public void e() {
        ((IdentityHashMap) this.f28369c.get()).clear();
        this.f28367a.e();
    }

    @Override // zc.p
    public final boolean f() {
        return this.f28368b;
    }

    public abstract boolean g(xc.l lVar, xc.q qVar);

    public final boolean h(final xc.l lVar, xc.q qVar) {
        return ((Boolean) ((Map) ((Map) this.f28369c.get()).computeIfAbsent(lVar, wc.c.f25871d)).computeIfAbsent(qVar, new Function() { // from class: zc.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(C.this.f28367a.d(lVar, (xc.q) obj));
            }
        })).booleanValue();
    }
}
