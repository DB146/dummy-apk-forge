package v6;

import android.graphics.Typeface;
import o7.o;
import s6.C1992b;

/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2146a extends Y6.b {
    public final Typeface k;

    /* renamed from: l, reason: collision with root package name */
    public final o f25078l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25079m;

    public C2146a(o oVar, Typeface typeface) {
        this.k = typeface;
        this.f25078l = oVar;
    }

    @Override // Y6.b
    public final void t(int i7) {
        if (this.f25079m) {
            return;
        }
        C1992b c1992b = (C1992b) this.f25078l.f22101b;
        if (c1992b.j(this.k)) {
            c1992b.h(false);
        }
    }

    @Override // Y6.b
    public final void u(Typeface typeface, boolean z8) {
        if (this.f25079m) {
            return;
        }
        C1992b c1992b = (C1992b) this.f25078l.f22101b;
        if (c1992b.j(typeface)) {
            c1992b.h(false);
        }
    }
}
