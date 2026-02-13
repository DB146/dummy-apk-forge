package p9;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class j implements P8.q {

    /* renamed from: a, reason: collision with root package name */
    public final P8.i f23201a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23202b = new ArrayList();

    public j(P8.i iVar) {
        this.f23201a = iVar;
    }

    @Override // P8.q
    public final void a(P8.p pVar) {
        this.f23202b.add(pVar);
    }

    public P8.b b(P8.k kVar) {
        return new P8.b(new V8.g(kVar));
    }
}
