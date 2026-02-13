package k5;

import N6.F;
import N6.H;
import N6.t0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class w {

    /* renamed from: e, reason: collision with root package name */
    public int f18973e;

    /* renamed from: f, reason: collision with root package name */
    public int f18974f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f18975h;

    /* renamed from: l, reason: collision with root package name */
    public t0 f18977l;

    /* renamed from: m, reason: collision with root package name */
    public int f18978m;

    /* renamed from: n, reason: collision with root package name */
    public t0 f18979n;

    /* renamed from: o, reason: collision with root package name */
    public int f18980o;

    /* renamed from: p, reason: collision with root package name */
    public int f18981p;

    /* renamed from: q, reason: collision with root package name */
    public int f18982q;

    /* renamed from: r, reason: collision with root package name */
    public t0 f18983r;

    /* renamed from: s, reason: collision with root package name */
    public t0 f18984s;

    /* renamed from: t, reason: collision with root package name */
    public int f18985t;

    /* renamed from: u, reason: collision with root package name */
    public int f18986u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18987v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18988w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18989x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f18990y;

    /* renamed from: z, reason: collision with root package name */
    public HashSet f18991z;

    /* renamed from: a, reason: collision with root package name */
    public int f18969a = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: b, reason: collision with root package name */
    public int f18970b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: c, reason: collision with root package name */
    public int f18971c = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: d, reason: collision with root package name */
    public int f18972d = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: i, reason: collision with root package name */
    public int f18976i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public int j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    public boolean k = true;

    public w() {
        F f4 = H.f7232b;
        t0 t0Var = t0.f7341e;
        this.f18977l = t0Var;
        this.f18978m = 0;
        this.f18979n = t0Var;
        this.f18980o = 0;
        this.f18981p = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f18982q = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f18983r = t0Var;
        this.f18984s = t0Var;
        this.f18985t = 0;
        this.f18986u = 0;
        this.f18987v = false;
        this.f18988w = false;
        this.f18989x = false;
        this.f18990y = new HashMap();
        this.f18991z = new HashSet();
    }

    public void a(int i7) {
        Iterator it = this.f18990y.values().iterator();
        while (it.hasNext()) {
            if (((v) it.next()).f18967a.f8108c == i7) {
                it.remove();
            }
        }
    }

    public final void b(x xVar) {
        this.f18969a = xVar.f19005a;
        this.f18970b = xVar.f19006b;
        this.f18971c = xVar.f19007c;
        this.f18972d = xVar.f19008d;
        this.f18973e = xVar.f19009e;
        this.f18974f = xVar.f19010f;
        this.g = xVar.f19011u;
        this.f18975h = xVar.f19012v;
        this.f18976i = xVar.f19013w;
        this.j = xVar.f19014x;
        this.k = xVar.f19015y;
        this.f18977l = xVar.f19016z;
        this.f18978m = xVar.f18992A;
        this.f18979n = xVar.f18993B;
        this.f18980o = xVar.f18994C;
        this.f18981p = xVar.f18995D;
        this.f18982q = xVar.f18996E;
        this.f18983r = xVar.f18997F;
        this.f18984s = xVar.f18998G;
        this.f18985t = xVar.f18999H;
        this.f18986u = xVar.f19000I;
        this.f18987v = xVar.f19001J;
        this.f18988w = xVar.f19002K;
        this.f18989x = xVar.L;
        this.f18991z = new HashSet(xVar.f19004N);
        this.f18990y = new HashMap(xVar.f19003M);
    }

    public w c(int i7, int i10) {
        this.f18976i = i7;
        this.j = i10;
        this.k = true;
        return this;
    }
}
