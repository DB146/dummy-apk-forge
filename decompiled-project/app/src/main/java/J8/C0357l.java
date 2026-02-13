package J8;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: J8.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357l implements G8.A {

    /* renamed from: c, reason: collision with root package name */
    public static final C0356k f5701c;

    /* renamed from: a, reason: collision with root package name */
    public final q3.e f5702a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f5703b = new ConcurrentHashMap();

    static {
        int i7 = 0;
        f5701c = new C0356k(i7);
        new C0356k(i7);
    }

    public C0357l(q3.e eVar) {
        this.f5702a = eVar;
    }

    @Override // G8.A
    public final G8.z a(G8.m mVar, N8.a aVar) {
        H8.a aVar2 = (H8.a) aVar.f7386a.getAnnotation(H8.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f5702a, mVar, aVar, aVar2, true);
    }

    public final G8.z b(q3.e eVar, G8.m mVar, N8.a aVar, H8.a aVar2, boolean z8) {
        G8.z a9;
        G8.A a10;
        Object h10 = eVar.l(new N8.a(aVar2.value()), true).h();
        boolean nullSafe = aVar2.nullSafe();
        if (h10 instanceof G8.z) {
            a9 = (G8.z) h10;
        } else {
            if (!(h10 instanceof G8.A)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + h10.getClass().getName() + " as a @JsonAdapter for " + I8.h.k(aVar.f7387b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            G8.A a11 = (G8.A) h10;
            if (z8 && (a10 = (G8.A) this.f5703b.putIfAbsent(aVar.f7386a, a11)) != null) {
                a11 = a10;
            }
            a9 = a11.a(mVar, aVar);
        }
        return (a9 == null || !nullSafe) ? a9 : a9.a();
    }
}
