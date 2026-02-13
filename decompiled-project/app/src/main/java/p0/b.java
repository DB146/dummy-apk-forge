package p0;

import A0.C0005a;
import Eb.v;
import a.AbstractC0672a;
import ia.C1358d;
import j0.AbstractC1362A;
import j0.C1368f;
import j0.F;
import java.util.ArrayList;
import java.util.List;
import l0.InterfaceC1445d;

/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: b, reason: collision with root package name */
    public float[] f22973b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22974c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f22975d = true;

    /* renamed from: e, reason: collision with root package name */
    public long f22976e = j0.n.g;

    /* renamed from: f, reason: collision with root package name */
    public List f22977f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public C1368f f22978h;

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.m f22979i;
    public final C0005a j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public float f22980l;

    /* renamed from: m, reason: collision with root package name */
    public float f22981m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22982n;

    public b() {
        int i7 = q.f23027a;
        this.f22977f = v.f3891a;
        this.g = true;
        this.j = new C0005a(this, 27);
        this.k = "";
        this.f22980l = 1.0f;
        this.f22981m = 1.0f;
        this.f22982n = true;
    }

    @Override // p0.m
    public final void a(InterfaceC1445d interfaceC1445d) {
        if (this.f22982n) {
            float[] fArr = this.f22973b;
            if (fArr == null) {
                fArr = AbstractC1362A.g();
                this.f22973b = fArr;
            } else {
                AbstractC1362A.u(fArr);
            }
            AbstractC1362A.C(fArr, 0.0f, 0.0f);
            if (fArr.length >= 16) {
                double d10 = 0.0f * 0.017453292519943295d;
                float sin = (float) Math.sin(d10);
                float cos = (float) Math.cos(d10);
                float f4 = fArr[0];
                float f10 = fArr[4];
                float f11 = (sin * f10) + (cos * f4);
                float f12 = -sin;
                float f13 = (f10 * cos) + (f4 * f12);
                float f14 = fArr[1];
                float f15 = fArr[5];
                float f16 = (sin * f15) + (cos * f14);
                float f17 = (f15 * cos) + (f14 * f12);
                float f18 = fArr[2];
                float f19 = fArr[6];
                float f20 = (sin * f19) + (cos * f18);
                float f21 = (f19 * cos) + (f18 * f12);
                float f22 = fArr[3];
                float f23 = fArr[7];
                fArr[0] = f11;
                fArr[1] = f16;
                fArr[2] = f20;
                fArr[3] = (sin * f23) + (cos * f22);
                fArr[4] = f13;
                fArr[5] = f17;
                fArr[6] = f21;
                fArr[7] = (cos * f23) + (f12 * f22);
            }
            float f24 = this.f22980l;
            float f25 = this.f22981m;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f24;
                fArr[1] = fArr[1] * f24;
                fArr[2] = fArr[2] * f24;
                fArr[3] = fArr[3] * f24;
                fArr[4] = fArr[4] * f25;
                fArr[5] = fArr[5] * f25;
                fArr[6] = fArr[6] * f25;
                fArr[7] = fArr[7] * f25;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            AbstractC1362A.C(fArr, -0.0f, -0.0f);
            this.f22982n = false;
        }
        if (this.g) {
            if (!this.f22977f.isEmpty()) {
                C1368f c1368f = this.f22978h;
                if (c1368f == null) {
                    c1368f = j0.h.a();
                    this.f22978h = c1368f;
                }
                AbstractC0672a.t(this.f22977f, c1368f);
            }
            this.g = false;
        }
        Q7.h u3 = interfaceC1445d.u();
        long D10 = u3.D();
        u3.x().i();
        try {
            C1358d c1358d = (C1358d) u3.f8695b;
            float[] fArr2 = this.f22973b;
            Q7.h hVar = (Q7.h) c1358d.f18487b;
            if (fArr2 != null) {
                hVar.x().n(fArr2);
            }
            C1368f c1368f2 = this.f22978h;
            if (!this.f22977f.isEmpty() && c1368f2 != null) {
                hVar.x().a(c1368f2);
            }
            ArrayList arrayList = this.f22974c;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((m) arrayList.get(i7)).a(interfaceC1445d);
            }
        } finally {
            u3.x().g();
            u3.U(D10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Rb.c, kotlin.jvm.internal.m] */
    @Override // p0.m
    public final Rb.c b() {
        return this.f22979i;
    }

    @Override // p0.m
    public final void d(C0005a c0005a) {
        this.f22979i = c0005a;
    }

    public final void e(int i7, m mVar) {
        ArrayList arrayList = this.f22974c;
        if (i7 < arrayList.size()) {
            arrayList.set(i7, mVar);
        } else {
            arrayList.add(mVar);
        }
        g(mVar);
        mVar.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.f22975d && j != 16) {
            long j10 = this.f22976e;
            if (j10 == 16) {
                this.f22976e = j;
                return;
            }
            int i7 = q.f23027a;
            if (j0.n.h(j10) == j0.n.h(j) && j0.n.g(j10) == j0.n.g(j) && j0.n.e(j10) == j0.n.e(j)) {
                return;
            }
            this.f22975d = false;
            this.f22976e = j0.n.g;
        }
    }

    public final void g(m mVar) {
        if (mVar instanceof f) {
            F f4 = ((f) mVar).f22996b;
            if (this.f22975d && f4 != null) {
                f(f4.f18525e);
                return;
            }
            return;
        }
        if (mVar instanceof b) {
            b bVar = (b) mVar;
            if (bVar.f22975d && this.f22975d) {
                f(bVar.f22976e);
            } else {
                this.f22975d = false;
                this.f22976e = j0.n.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.k);
        ArrayList arrayList = this.f22974c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) arrayList.get(i7);
            sb2.append("\t");
            sb2.append(mVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
