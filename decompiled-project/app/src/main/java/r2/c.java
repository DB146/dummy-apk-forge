package r2;

import D5.d;
import W1.W;
import l2.Y;
import u.U;

/* loaded from: classes.dex */
public class c extends Y {

    /* renamed from: c, reason: collision with root package name */
    public static final W f23651c = new W(1);

    /* renamed from: a, reason: collision with root package name */
    public final U f23652a = new U(0);

    /* renamed from: b, reason: collision with root package name */
    public boolean f23653b = false;

    @Override // l2.Y
    public final void onCleared() {
        U u3 = this.f23652a;
        int f4 = u3.f();
        for (int i7 = 0; i7 < f4; i7++) {
            C1916a c1916a = (C1916a) u3.g(i7);
            d dVar = c1916a.f23646l;
            dVar.a();
            dVar.f3243c = true;
            b bVar = c1916a.f23648n;
            if (bVar != null) {
                c1916a.i(bVar);
            }
            C1916a c1916a2 = dVar.f3241a;
            if (c1916a2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (c1916a2 != c1916a) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f3241a = null;
            if (bVar != null) {
                boolean z8 = bVar.f23650b;
            }
            dVar.f3244d = true;
            dVar.f3242b = false;
            dVar.f3243c = false;
            dVar.f3245e = false;
        }
        int i10 = u3.f24641d;
        Object[] objArr = u3.f24640c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        u3.f24641d = 0;
        u3.f24638a = false;
    }
}
