package L7;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class w implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6405a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0385e f6406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f6407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6408d;

    public w(z zVar, C0385e c0385e, T7.s sVar) {
        this.f6407c = zVar;
        this.f6406b = c0385e;
        this.f6408d = sVar;
    }

    public w(z zVar, HashMap hashMap, C0385e c0385e) {
        this.f6407c = zVar;
        this.f6408d = hashMap;
        this.f6406b = c0385e;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6405a) {
            case 0:
                z zVar = this.f6407c;
                N7.a aVar = zVar.g;
                C0385e c0385e = this.f6406b;
                Q7.f.a(c0385e);
                aVar.e();
                return z.a(zVar, new M7.e(M7.d.f6827e, c0385e, (T7.s) this.f6408d));
            default:
                C0381a z8 = C0381a.z((HashMap) this.f6408d);
                z zVar2 = this.f6407c;
                N7.a aVar2 = zVar2.g;
                C0385e c0385e2 = this.f6406b;
                aVar2.e();
                return z.a(zVar2, new M7.c(M7.d.f6827e, c0385e2, z8));
        }
    }
}
