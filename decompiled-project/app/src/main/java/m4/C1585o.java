package m4;

import android.content.Context;
import android.os.Looper;
import o4.C1791e;

/* renamed from: m4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1585o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20451a;

    /* renamed from: b, reason: collision with root package name */
    public final n5.x f20452b;

    /* renamed from: c, reason: collision with root package name */
    public final C1583n f20453c;

    /* renamed from: d, reason: collision with root package name */
    public final C1583n f20454d;

    /* renamed from: e, reason: collision with root package name */
    public final C1583n f20455e;

    /* renamed from: f, reason: collision with root package name */
    public final C1583n f20456f;
    public final Looper g;

    /* renamed from: h, reason: collision with root package name */
    public C1791e f20457h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20458i;
    public int j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20459l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f20460m;

    /* renamed from: n, reason: collision with root package name */
    public final E0 f20461n;

    /* renamed from: o, reason: collision with root package name */
    public final long f20462o;

    /* renamed from: p, reason: collision with root package name */
    public final long f20463p;

    /* renamed from: q, reason: collision with root package name */
    public final C1573i f20464q;

    /* renamed from: r, reason: collision with root package name */
    public final long f20465r;

    /* renamed from: s, reason: collision with root package name */
    public final long f20466s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f20467t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20468u;

    public C1585o(Context context) {
        C1583n c1583n = new C1583n(context, 0);
        C1583n c1583n2 = new C1583n(context, 1);
        C1583n c1583n3 = new C1583n(context, 2);
        C1583n c1583n4 = new C1583n(context, 3);
        context.getClass();
        this.f20451a = context;
        this.f20453c = c1583n;
        this.f20454d = c1583n2;
        this.f20455e = c1583n3;
        this.f20456f = c1583n4;
        int i7 = n5.D.f21141a;
        Looper myLooper = Looper.myLooper();
        this.g = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f20457h = C1791e.f21838u;
        this.j = 0;
        this.f20459l = 1;
        this.f20460m = true;
        this.f20461n = E0.f19887c;
        this.f20462o = 5000L;
        this.f20463p = 15000L;
        this.f20464q = new C1573i(n5.D.M(20L), n5.D.M(500L));
        this.f20452b = n5.x.f21235a;
        this.f20465r = 500L;
        this.f20466s = 2000L;
        this.f20467t = true;
    }
}
