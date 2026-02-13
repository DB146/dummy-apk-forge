package L7;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f6378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0385e f6379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f6380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6381e;

    public /* synthetic */ p(z zVar, A a9, C0385e c0385e, Object obj, int i7) {
        this.f6377a = i7;
        this.f6380d = zVar;
        this.f6378b = a9;
        this.f6379c = c0385e;
        this.f6381e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6377a) {
            case 0:
                A a9 = this.f6378b;
                z zVar = this.f6380d;
                Q7.f fVar = (Q7.f) zVar.f6413c.get(a9);
                if (fVar == null) {
                    return Collections.emptyList();
                }
                C0385e E10 = C0385e.E(fVar.f8685a, this.f6379c);
                C0381a z8 = C0381a.z((HashMap) this.f6381e);
                zVar.g.e();
                return z.b(zVar, fVar, new M7.c(new M7.d(2, fVar.f8686b, true), E10, z8));
            default:
                z zVar2 = this.f6380d;
                Q7.f fVar2 = (Q7.f) zVar2.f6413c.get(this.f6378b);
                if (fVar2 == null) {
                    return Collections.emptyList();
                }
                C0385e c0385e = fVar2.f8685a;
                C0385e c0385e2 = this.f6379c;
                C0385e E11 = C0385e.E(c0385e, c0385e2);
                if (!E11.isEmpty()) {
                    Q7.f.a(c0385e2);
                }
                zVar2.g.e();
                return z.b(zVar2, fVar2, new M7.e(new M7.d(2, fVar2.f8686b, true), E11, (T7.s) this.f6381e));
        }
    }
}
