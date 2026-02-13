package h5;

import android.text.Layout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f17808a;

    /* renamed from: b, reason: collision with root package name */
    public int f17809b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17810c;

    /* renamed from: d, reason: collision with root package name */
    public int f17811d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17812e;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public String f17816l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f17819o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f17820p;

    /* renamed from: r, reason: collision with root package name */
    public C1252b f17822r;

    /* renamed from: f, reason: collision with root package name */
    public int f17813f = -1;
    public int g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f17814h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f17815i = -1;
    public int j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f17817m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f17818n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f17821q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f17823s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f17810c && gVar.f17810c) {
                this.f17809b = gVar.f17809b;
                this.f17810c = true;
            }
            if (this.f17814h == -1) {
                this.f17814h = gVar.f17814h;
            }
            if (this.f17815i == -1) {
                this.f17815i = gVar.f17815i;
            }
            if (this.f17808a == null && (str = gVar.f17808a) != null) {
                this.f17808a = str;
            }
            if (this.f17813f == -1) {
                this.f17813f = gVar.f17813f;
            }
            if (this.g == -1) {
                this.g = gVar.g;
            }
            if (this.f17818n == -1) {
                this.f17818n = gVar.f17818n;
            }
            if (this.f17819o == null && (alignment2 = gVar.f17819o) != null) {
                this.f17819o = alignment2;
            }
            if (this.f17820p == null && (alignment = gVar.f17820p) != null) {
                this.f17820p = alignment;
            }
            if (this.f17821q == -1) {
                this.f17821q = gVar.f17821q;
            }
            if (this.j == -1) {
                this.j = gVar.j;
                this.k = gVar.k;
            }
            if (this.f17822r == null) {
                this.f17822r = gVar.f17822r;
            }
            if (this.f17823s == Float.MAX_VALUE) {
                this.f17823s = gVar.f17823s;
            }
            if (!this.f17812e && gVar.f17812e) {
                this.f17811d = gVar.f17811d;
                this.f17812e = true;
            }
            if (this.f17817m != -1 || (i7 = gVar.f17817m) == -1) {
                return;
            }
            this.f17817m = i7;
        }
    }
}
