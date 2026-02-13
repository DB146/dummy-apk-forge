package m;

import h3.H;
import o.U0;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1527i extends H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19671b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19672c;

    /* renamed from: d, reason: collision with root package name */
    public int f19673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19674e;

    public C1527i(C1528j c1528j) {
        this.f19671b = 0;
        this.f19674e = c1528j;
        this.f19672c = false;
        this.f19673d = 0;
    }

    public C1527i(U0 u02, int i7) {
        this.f19671b = 1;
        this.f19674e = u02;
        this.f19673d = i7;
        this.f19672c = false;
    }

    @Override // y1.T
    public final void a() {
        switch (this.f19671b) {
            case 0:
                int i7 = this.f19673d + 1;
                this.f19673d = i7;
                C1528j c1528j = (C1528j) this.f19674e;
                if (i7 == c1528j.f19675a.size()) {
                    H h10 = c1528j.f19678d;
                    if (h10 != null) {
                        h10.a();
                    }
                    this.f19673d = 0;
                    this.f19672c = false;
                    c1528j.f19679e = false;
                    return;
                }
                return;
            default:
                if (this.f19672c) {
                    return;
                }
                ((U0) this.f19674e).f21436a.setVisibility(this.f19673d);
                return;
        }
    }

    @Override // h3.H, y1.T
    public void b() {
        switch (this.f19671b) {
            case 1:
                this.f19672c = true;
                return;
            default:
                return;
        }
    }

    @Override // h3.H, y1.T
    public final void c() {
        switch (this.f19671b) {
            case 0:
                if (this.f19672c) {
                    return;
                }
                this.f19672c = true;
                H h10 = ((C1528j) this.f19674e).f19678d;
                if (h10 != null) {
                    h10.c();
                    return;
                }
                return;
            default:
                ((U0) this.f19674e).f21436a.setVisibility(0);
                return;
        }
    }
}
