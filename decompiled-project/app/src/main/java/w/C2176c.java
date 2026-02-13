package w;

import java.util.LinkedHashMap;
import x.AbstractC2232b;
import x.C2240j;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2176c extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final C2176c f25548b = new C2176c(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2176c f25549c = new C2176c(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C2176c f25550d = new C2176c(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final C2176c f25551e = new C2176c(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final C2176c f25552f = new C2176c(1, 4);

    /* renamed from: u, reason: collision with root package name */
    public static final C2176c f25553u = new C2176c(1, 5);

    /* renamed from: v, reason: collision with root package name */
    public static final C2176c f25554v = new C2176c(1, 6);

    /* renamed from: w, reason: collision with root package name */
    public static final C2176c f25555w = new C2176c(1, 7);

    /* renamed from: x, reason: collision with root package name */
    public static final C2176c f25556x = new C2176c(1, 8);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2176c(int i7, int i10) {
        super(i7);
        this.f25557a = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f25557a) {
            case 0:
                H a9 = AbstractC2173C.a(AbstractC2232b.k(220, null, 4), 2).a(new H(new V((J) null, (C2194v) null, new N(j0.G.f18526b, AbstractC2232b.k(220, null, 4)), (LinkedHashMap) null, 55)));
                I b2 = AbstractC2173C.b(AbstractC2232b.k(90, null, 6), 2);
                int i7 = androidx.compose.animation.a.f13123b;
                return new w(a9, b2, 0.0f, new T(C2180g.f25575b));
            case 1:
                return obj;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                long j = ((j0.G) obj).f18528a;
                return new C2240j(j0.G.b(j), j0.G.c(j));
            case 4:
                C2240j c2240j = (C2240j) obj;
                float f4 = c2240j.f26108a;
                float f10 = c2240j.f26109b;
                return new j0.G((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
            case 5:
                return AbstractC2232b.j(7, null);
            case 6:
                ((Number) obj).intValue();
                return 0;
            case 7:
                ((Number) obj).intValue();
                return 0;
            default:
                return AbstractC2173C.f25489c;
        }
    }
}
