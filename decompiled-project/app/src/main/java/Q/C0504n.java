package Q;

import a0.C0693t;

/* renamed from: Q.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8428b;

    public /* synthetic */ C0504n(Object obj, int i7) {
        this.f8427a = i7;
        this.f8428b = obj;
    }

    public final void a() {
        switch (this.f8427a) {
            case 0:
                C0506o c0506o = (C0506o) this.f8428b;
                c0506o.f8473z--;
                return;
            default:
                C0693t c0693t = (C0693t) this.f8428b;
                c0693t.j--;
                return;
        }
    }

    public final void b() {
        switch (this.f8427a) {
            case 0:
                ((C0506o) this.f8428b).f8473z++;
                return;
            default:
                ((C0693t) this.f8428b).j++;
                return;
        }
    }
}
