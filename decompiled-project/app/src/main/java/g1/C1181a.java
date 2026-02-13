package g1;

import d1.C1038a;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1181a extends c {

    /* renamed from: v, reason: collision with root package name */
    public int f17221v;

    /* renamed from: w, reason: collision with root package name */
    public int f17222w;

    /* renamed from: x, reason: collision with root package name */
    public C1038a f17223x;

    public boolean getAllowsGoneWidget() {
        return this.f17223x.f16315t0;
    }

    public int getMargin() {
        return this.f17223x.f16316u0;
    }

    public int getType() {
        return this.f17221v;
    }

    @Override // g1.c
    public final void h(d1.d dVar, boolean z8) {
        int i7 = this.f17221v;
        this.f17222w = i7;
        if (z8) {
            if (i7 == 5) {
                this.f17222w = 1;
            } else if (i7 == 6) {
                this.f17222w = 0;
            }
        } else if (i7 == 5) {
            this.f17222w = 0;
        } else if (i7 == 6) {
            this.f17222w = 1;
        }
        if (dVar instanceof C1038a) {
            ((C1038a) dVar).f16314s0 = this.f17222w;
        }
    }

    public void setAllowsGoneWidget(boolean z8) {
        this.f17223x.f16315t0 = z8;
    }

    public void setDpMargin(int i7) {
        this.f17223x.f16316u0 = (int) ((i7 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i7) {
        this.f17223x.f16316u0 = i7;
    }

    public void setType(int i7) {
        this.f17221v = i7;
    }
}
