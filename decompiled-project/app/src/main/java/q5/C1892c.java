package q5;

import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: q5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1892c {

    /* renamed from: a, reason: collision with root package name */
    public int f23482a;

    /* renamed from: b, reason: collision with root package name */
    public int f23483b;

    /* renamed from: c, reason: collision with root package name */
    public int f23484c;

    /* renamed from: d, reason: collision with root package name */
    public int f23485d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23486e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23487f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlexboxLayoutManager f23488h;

    public C1892c(FlexboxLayoutManager flexboxLayoutManager) {
        this.f23488h = flexboxLayoutManager;
    }

    public static void a(C1892c c1892c) {
        FlexboxLayoutManager flexboxLayoutManager = c1892c.f23488h;
        if (flexboxLayoutManager.o1() || !flexboxLayoutManager.f14826t) {
            c1892c.f23484c = c1892c.f23486e ? flexboxLayoutManager.f14811B.i() : flexboxLayoutManager.f14811B.m();
        } else {
            c1892c.f23484c = c1892c.f23486e ? flexboxLayoutManager.f14811B.i() : flexboxLayoutManager.f13717n - flexboxLayoutManager.f14811B.m();
        }
    }

    public static void b(C1892c c1892c) {
        c1892c.f23482a = -1;
        c1892c.f23483b = -1;
        c1892c.f23484c = Integer.MIN_VALUE;
        c1892c.f23487f = false;
        c1892c.g = false;
        FlexboxLayoutManager flexboxLayoutManager = c1892c.f23488h;
        if (flexboxLayoutManager.o1()) {
            int i7 = flexboxLayoutManager.f14823q;
            if (i7 == 0) {
                c1892c.f23486e = flexboxLayoutManager.f14822p == 1;
                return;
            } else {
                c1892c.f23486e = i7 == 2;
                return;
            }
        }
        int i10 = flexboxLayoutManager.f14823q;
        if (i10 == 0) {
            c1892c.f23486e = flexboxLayoutManager.f14822p == 3;
        } else {
            c1892c.f23486e = i10 == 2;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f23482a + ", mFlexLinePosition=" + this.f23483b + ", mCoordinate=" + this.f23484c + ", mPerpendicularCoordinate=" + this.f23485d + ", mLayoutFromEnd=" + this.f23486e + ", mValid=" + this.f23487f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
