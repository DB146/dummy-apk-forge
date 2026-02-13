package y6;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public float f27075a;

    /* renamed from: b, reason: collision with root package name */
    public float f27076b;

    /* renamed from: c, reason: collision with root package name */
    public float f27077c;

    /* renamed from: d, reason: collision with root package name */
    public float f27078d;

    /* renamed from: e, reason: collision with root package name */
    public float f27079e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f27080f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public s() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f4) {
        float f10 = this.f27078d;
        if (f10 == f4) {
            return;
        }
        float f11 = ((f4 - f10) + 360.0f) % 360.0f;
        if (f11 > 180.0f) {
            return;
        }
        float f12 = this.f27076b;
        float f13 = this.f27077c;
        o oVar = new o(f12, f13, f12, f13);
        oVar.f27069f = this.f27078d;
        oVar.g = f11;
        this.g.add(new C2407m(oVar));
        this.f27078d = f4;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f27080f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((q) arrayList.get(i7)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y6.q, y6.p, java.lang.Object] */
    public final void c(float f4, float f10) {
        ?? qVar = new q();
        qVar.f27070b = f4;
        qVar.f27071c = f10;
        this.f27080f.add(qVar);
        C2408n c2408n = new C2408n(qVar, this.f27076b, this.f27077c);
        float b2 = c2408n.b() + 270.0f;
        float b10 = c2408n.b() + 270.0f;
        a(b2);
        this.g.add(c2408n);
        this.f27078d = b10;
        this.f27076b = f4;
        this.f27077c = f10;
    }

    public final void d(float f4, float f10, float f11) {
        this.f27075a = f4;
        this.f27076b = 0.0f;
        this.f27077c = f4;
        this.f27078d = f10;
        this.f27079e = (f10 + f11) % 360.0f;
        this.f27080f.clear();
        this.g.clear();
    }
}
