package h3;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: h3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1236B extends I2.I {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17653d = 0;

    public /* synthetic */ C1236B(Class cls) {
        super(cls);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1236B(Class cls, TimeUnit repeatIntervalTimeUnit) {
        super(cls);
        kotlin.jvm.internal.l.e(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        q3.p pVar = (q3.p) this.f5049b;
        long millis = repeatIntervalTimeUnit.toMillis(60L);
        pVar.getClass();
        String str = q3.p.f23402y;
        if (millis < 900000) {
            z.e().h(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long g = H.g(millis, 900000L);
        long g2 = H.g(millis, 900000L);
        if (g < 900000) {
            z.e().h(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        pVar.f23409h = H.g(g, 900000L);
        if (g2 < 300000) {
            z.e().h(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (g2 > pVar.f23409h) {
            z.e().h(str, "Flex duration greater than interval duration; Changed to " + g);
        }
        pVar.f23410i = H.l(g2, 300000L, pVar.f23409h);
    }

    @Override // I2.I
    public final I d() {
        switch (this.f17653d) {
            case 0:
                return new I((UUID) this.f5048a, (q3.p) this.f5049b, (Set) this.f5050c);
            default:
                q3.p pVar = (q3.p) this.f5049b;
                if (pVar.f23416q) {
                    throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
                }
                return new I((UUID) this.f5048a, pVar, (Set) this.f5050c);
        }
    }
}
