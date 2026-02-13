package R3;

import A3.o;
import java.util.ArrayList;
import p0.h;
import p0.j;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8845a;

    public e(int i7) {
        switch (i7) {
            case 1:
                this.f8845a = new ArrayList(32);
                return;
            default:
                this.f8845a = new ArrayList();
                return;
        }
    }

    public void a(float f4, float f10, float f11, float f12, float f13, float f14) {
        this.f8845a.add(new j(f4, f10, f11, f12, f13, f14));
    }

    public synchronized o b(Class cls) {
        int size = this.f8845a.size();
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) this.f8845a.get(i7);
            if (dVar.f8843a.isAssignableFrom(cls)) {
                return dVar.f8844b;
            }
        }
        return null;
    }

    public void c(float f4, float f10) {
        this.f8845a.add(new h(f4, f10));
    }
}
