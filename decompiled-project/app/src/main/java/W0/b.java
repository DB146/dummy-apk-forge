package W0;

import V0.h;
import u.AbstractC2065s;
import u.U;
import v.AbstractC2121a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f10251a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    public static volatile U f10252b = new U(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f10253c;

    static {
        Object[] objArr = new Object[0];
        f10253c = objArr;
        synchronized (objArr) {
            f10252b.e((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f10252b.e((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f10252b.e((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f10252b.e((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f10252b.e((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f10252b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        h.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f4) {
        float d10;
        a aVar;
        if (f4 < 1.03f) {
            return null;
        }
        int i7 = (int) (f4 * 100.0f);
        a aVar2 = (a) f10252b.c(i7);
        if (aVar2 != null) {
            return aVar2;
        }
        U u3 = f10252b;
        if (u3.f24638a) {
            AbstractC2065s.a(u3);
        }
        int a9 = AbstractC2121a.a(u3.f24641d, i7, u3.f24639b);
        if (a9 >= 0) {
            return (a) f10252b.g(a9);
        }
        int i10 = -(a9 + 1);
        int i11 = i10 - 1;
        if (i10 >= f10252b.f()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f4});
            b(f4, cVar);
            return cVar;
        }
        float[] fArr = f10251a;
        if (i11 < 0) {
            aVar = new c(fArr, fArr);
            d10 = 1.0f;
        } else {
            d10 = f10252b.d(i11) / 100.0f;
            aVar = (a) f10252b.g(i11);
        }
        float d11 = f10252b.d(i10) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, d10 == d11 ? 0.0f : (f4 - d10) / (d11 - d10))) * 1.0f) + 0.0f;
        a aVar3 = (a) f10252b.g(i10);
        float[] fArr2 = new float[9];
        for (int i12 = 0; i12 < 9; i12++) {
            float f10 = fArr[i12];
            float b2 = aVar.b(f10);
            fArr2[i12] = ((aVar3.b(f10) - b2) * max) + b2;
        }
        c cVar2 = new c(fArr, fArr2);
        b(f4, cVar2);
        return cVar2;
    }

    public static void b(float f4, c cVar) {
        synchronized (f10253c) {
            U clone = f10252b.clone();
            clone.e((int) (f4 * 100.0f), cVar);
            f10252b = clone;
        }
    }
}
