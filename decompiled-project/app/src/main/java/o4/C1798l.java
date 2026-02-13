package o4;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import cc.E0;
import ea.C1112g;
import i1.C1290a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m4.C1555I;
import n5.AbstractC1705a;
import org.json.JSONException;
import org.json.JSONObject;
import v8.C2149c;
import v8.C2153g;
import v8.RunnableC2148b;
import x.AbstractC2232b;
import y1.C2355c;
import z.AbstractC2536H;
import z.C2537I;
import z.C2540L;
import z.C2542N;
import z.U;
import z.V;
import z.m0;
import z.p0;
import z.t0;
import z.w0;

/* renamed from: o4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1798l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21855a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21856b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21857c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21858d;

    /* renamed from: e, reason: collision with root package name */
    public Object f21859e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f21860f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f21861h;

    public C1798l(Context context, Q9.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f21856b = applicationContext;
        this.f21857c = aVar;
        int i7 = n5.D.f21141a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f21858d = handler;
        int i10 = n5.D.f21141a;
        this.f21859e = i10 >= 23 ? new C1796j(this) : null;
        this.f21860f = i10 >= 21 ? new F6.j(this, 6) : null;
        Uri uriFor = C1794h.a() ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new C1797k(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public C1798l(HttpURLConnection httpURLConnection, C2153g c2153g, C2149c c2149c, LinkedHashSet linkedHashSet, ka.b bVar, ScheduledExecutorService scheduledExecutorService) {
        this.f21857c = httpURLConnection;
        this.f21858d = c2153g;
        this.f21859e = c2149c;
        this.f21856b = linkedHashSet;
        this.f21860f = bVar;
        this.g = scheduledExecutorService;
        this.f21861h = new Random();
        this.f21855a = false;
    }

    public C1798l(w0 w0Var, C2355c c2355c, Y.c cVar, V0.c cVar2) {
        this.f21856b = w0Var;
        this.f21857c = c2355c;
        this.f21858d = cVar;
        this.f21859e = cVar2;
        this.f21860f = Q5.e.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, 6);
        this.f21861h = new C1112g();
    }

    public static void a(C1798l c1798l, C1794h c1794h) {
        k5.q qVar;
        boolean z8;
        C1555I c1555i;
        if (!c1798l.f21855a || c1794h.equals((C1794h) c1798l.f21861h)) {
            return;
        }
        c1798l.f21861h = c1794h;
        I i7 = (I) ((Q9.a) c1798l.f21857c).f8707b;
        AbstractC1705a.m(i7.f21733f0 == Looper.myLooper());
        if (c1794h.equals(i7.e())) {
            return;
        }
        i7.f21747w = c1794h;
        C1290a c1290a = i7.f21742r;
        if (c1290a != null) {
            L l10 = (L) c1290a.f18187b;
            synchronized (l10.f20352a) {
                qVar = l10.f20351B;
            }
            if (qVar != null) {
                synchronized (qVar.f18955c) {
                    z8 = qVar.g.f18924b0;
                }
                if (!z8 || (c1555i = qVar.f18963a) == null) {
                    return;
                }
                c1555i.f19951v.d(26);
            }
        }
    }

    public static final float b(C1798l c1798l, t0 t0Var, float f4) {
        w0 w0Var = (w0) c1798l.f21856b;
        long g = w0Var.g(w0Var.c(f4));
        w0 w0Var2 = t0Var.f28085a;
        return w0Var.f(w0Var.d(w0.a(w0Var2, w0Var2.j, g, 1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C1798l c1798l, w0 w0Var, C2537I c2537i, float f4, float f10, Jb.c cVar) {
        C2540L c2540l;
        Object obj;
        int i7;
        Object obj2;
        float f11;
        C1798l c1798l2;
        kotlin.jvm.internal.s sVar;
        long b2;
        Object obj3;
        w0 w0Var2 = w0Var;
        c1798l.getClass();
        if (cVar instanceof C2540L) {
            c2540l = (C2540L) cVar;
            int i10 = c2540l.f27902u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2540l.f27902u = i10 - Integer.MIN_VALUE;
                C2540L c2540l2 = c2540l;
                Object obj4 = c2540l2.f27900e;
                obj = Ib.a.f5345a;
                i7 = c2540l2.f27902u;
                Object obj5 = Db.q.f3365a;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj4);
                    ?? obj6 = new Object();
                    obj6.f19134a = c2537i;
                    c1798l.j(c2537i);
                    C2537I i11 = i((ec.d) c1798l.f21860f);
                    if (i11 != null) {
                        c1798l.j(i11);
                        obj6.f19134a = ((C2537I) obj6.f19134a).a(i11);
                    }
                    ?? obj7 = new Object();
                    float f12 = w0Var2.f(w0Var2.d(((C2537I) obj6.f19134a).f27879a));
                    obj7.f19131a = f12;
                    if (AbstractC2536H.a(f12)) {
                        return obj5;
                    }
                    ?? obj8 = new Object();
                    obj8.f19134a = AbstractC2232b.a(30, 0.0f);
                    obj2 = obj5;
                    C2542N c2542n = new C2542N(obj7, obj8, obj6, f4, c1798l, f10, w0Var, null);
                    c2540l2.f27896a = c1798l;
                    c2540l2.f27897b = w0Var2;
                    c2540l2.f27898c = obj7;
                    f11 = f10;
                    c2540l2.f27899d = f11;
                    c2540l2.f27902u = 1;
                    if (c1798l.k(w0Var2, c2542n, c2540l2) == obj) {
                        return obj;
                    }
                    c1798l2 = c1798l;
                    sVar = obj7;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.c.c0(obj4);
                        obj3 = obj5;
                        return obj3;
                    }
                    f11 = c2540l2.f27899d;
                    sVar = c2540l2.f27898c;
                    w0 w0Var3 = c2540l2.f27897b;
                    c1798l2 = c2540l2.f27896a;
                    com.bumptech.glide.c.c0(obj4);
                    w0Var2 = w0Var3;
                    obj2 = obj5;
                }
                C1112g c1112g = (C1112g) c1798l2.f21861h;
                b2 = com.bumptech.glide.c.b(((T7.h) c1112g.f16840b).b(Float.MAX_VALUE), ((T7.h) c1112g.f16841c).b(Float.MAX_VALUE));
                if (b2 == 0) {
                    float c10 = w0Var2.c(Math.signum(sVar.f19131a)) * Math.min(Math.abs(sVar.f19131a) / 100, f11) * 1000;
                    if (c10 == 0.0f) {
                        b2 = 0;
                    } else {
                        b2 = w0Var2.f28124d == V.f27944b ? com.bumptech.glide.c.b(c10, 0.0f) : com.bumptech.glide.c.b(0.0f, c10);
                    }
                }
                c2540l2.f27896a = null;
                c2540l2.f27897b = null;
                c2540l2.f27898c = null;
                c2540l2.f27902u = 2;
                p0 p0Var = (p0) ((Y.c) c1798l2.f21858d).f19117a;
                cc.F.B(p0Var.f28058O.c(), null, 0, new m0(p0Var, b2, null), 3);
                obj3 = obj2;
                if (obj3 == obj) {
                    return obj;
                }
                return obj3;
            }
        }
        c2540l = new C2540L(c1798l, cVar);
        C2540L c2540l22 = c2540l;
        Object obj42 = c2540l22.f27900e;
        obj = Ib.a.f5345a;
        i7 = c2540l22.f27902u;
        Object obj52 = Db.q.f3365a;
        if (i7 != 0) {
        }
        C1112g c1112g2 = (C1112g) c1798l2.f21861h;
        b2 = com.bumptech.glide.c.b(((T7.h) c1112g2.f16840b).b(Float.MAX_VALUE), ((T7.h) c1112g2.f16841c).b(Float.MAX_VALUE));
        if (b2 == 0) {
        }
        c2540l22.f27896a = null;
        c2540l22.f27897b = null;
        c2540l22.f27898c = null;
        c2540l22.f27902u = 2;
        p0 p0Var2 = (p0) ((Y.c) c1798l2.f21858d).f19117a;
        cc.F.B(p0Var2.f28058O.c(), null, 0, new m0(p0Var2, b2, null), 3);
        obj3 = obj2;
        if (obj3 == obj) {
        }
        return obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(C1798l c1798l, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.s sVar, w0 w0Var, kotlin.jvm.internal.v vVar2, long j, Jb.c cVar) {
        z.O o10;
        int i7;
        kotlin.jvm.internal.s sVar2;
        w0 w0Var2;
        kotlin.jvm.internal.v vVar3;
        kotlin.jvm.internal.v vVar4;
        C2537I c2537i;
        boolean z8;
        C1798l c1798l2 = c1798l;
        if (cVar instanceof z.O) {
            z.O o11 = (z.O) cVar;
            int i10 = o11.f27926u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                o11.f27926u = i10 - Integer.MIN_VALUE;
                o10 = o11;
                Object obj = o10.f27925f;
                Ib.a aVar = Ib.a.f5345a;
                i7 = o10.f27926u;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    if (j < 0) {
                        return Boolean.FALSE;
                    }
                    z.P p10 = new z.P(c1798l, null);
                    o10.f27920a = c1798l2;
                    o10.f27921b = vVar;
                    sVar2 = sVar;
                    o10.f27922c = sVar2;
                    w0Var2 = w0Var;
                    o10.f27923d = w0Var2;
                    vVar3 = vVar2;
                    o10.f27924e = vVar3;
                    o10.f27926u = 1;
                    obj = cc.F.M(j, p10, o10);
                    if (obj == aVar) {
                        return aVar;
                    }
                    vVar4 = vVar;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.v vVar5 = o10.f27924e;
                    w0 w0Var3 = o10.f27923d;
                    kotlin.jvm.internal.s sVar3 = o10.f27922c;
                    vVar4 = o10.f27921b;
                    C1798l c1798l3 = o10.f27920a;
                    com.bumptech.glide.c.c0(obj);
                    vVar3 = vVar5;
                    w0Var2 = w0Var3;
                    sVar2 = sVar3;
                    c1798l2 = c1798l3;
                }
                c2537i = (C2537I) obj;
                if (c2537i == null) {
                    boolean z10 = ((C2537I) vVar4.f19134a).f27881c;
                    long j10 = c2537i.f27879a;
                    vVar4.f19134a = new C2537I(j10, c2537i.f27880b, z10);
                    sVar2.f19131a = w0Var2.f(w0Var2.d(j10));
                    vVar3.f19134a = AbstractC2232b.a(30, 0.0f);
                    c1798l2.j(c2537i);
                    z8 = !AbstractC2536H.a(sVar2.f19131a);
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            }
        }
        o10 = new Jb.c(cVar);
        Object obj2 = o10.f27925f;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = o10.f27926u;
        if (i7 != 0) {
        }
        c2537i = (C2537I) obj2;
        if (c2537i == null) {
        }
        return Boolean.valueOf(z8);
    }

    public static C2537I i(ec.d dVar) {
        C2537I c2537i = null;
        Zb.h w10 = O5.b.w(new z.S(new A0.J(dVar, 27), null));
        while (w10.hasNext()) {
            C2537I c2537i2 = (C2537I) w10.next();
            if (c2537i != null) {
                c2537i2 = c2537i.a(c2537i2);
            }
            c2537i = c2537i2;
        }
        return c2537i;
    }

    public void e(int i7, long j) {
        if (i7 == 0) {
            h(new u8.g("Unable to fetch the latest version of the template."));
            return;
        }
        ((ScheduledExecutorService) this.g).schedule(new RunnableC2148b(this, i7, j), ((Random) this.f21861h).nextInt(4), TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [Y6.k, u8.e] */
    public void f(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = X.c.h(str, readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                String str2 = "";
                if (indexOf >= 0 && lastIndexOf >= 0 && indexOf < lastIndexOf) {
                    str2 = str.substring(indexOf, lastIndexOf + 1);
                }
                str = str2;
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e2) {
                        h(new Y6.k("Unable to parse config update message.", e2.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e2);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((ka.b) this.f21860f).a(new u8.g("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        isEmpty = ((LinkedHashSet) this.f21856b).isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = ((C2153g) this.f21858d).g.f25254a.getLong("last_template_version", 0L);
                        long j10 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j10 > j) {
                            e(3, j10);
                        }
                    }
                    str = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x001a -> B:10:0x002f). Please report as a decompilation issue!!! */
    public void g() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f21857c;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    f(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e2) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e2);
                }
            } catch (IOException e10) {
                if (!this.f21855a) {
                    Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e10);
                }
                if (inputStream == null) {
                } else {
                    inputStream.close();
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e11);
                }
            }
            throw th;
        }
    }

    public synchronized void h(u8.e eVar) {
        Iterator it = ((LinkedHashSet) this.f21856b).iterator();
        while (it.hasNext()) {
            ((ka.b) it.next()).a(eVar);
        }
    }

    public void j(C2537I c2537i) {
        long j = c2537i.f27880b;
        C1112g c1112g = (C1112g) this.f21861h;
        c1112g.getClass();
        long j10 = c2537i.f27879a;
        ((T7.h) c1112g.f16840b).a(j, Float.intBitsToFloat((int) (j10 >> 32)));
        ((T7.h) c1112g.f16841c).a(j, Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(w0 w0Var, C2542N c2542n, Jb.c cVar) {
        z.T t5;
        int i7;
        C1798l c1798l;
        if (cVar instanceof z.T) {
            t5 = (z.T) cVar;
            int i10 = t5.f27939d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t5.f27939d = i10 - Integer.MIN_VALUE;
                Object obj = t5.f27937b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = t5.f27939d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    this.f21855a = true;
                    U u3 = new U(w0Var, c2542n, null);
                    t5.f27936a = this;
                    t5.f27939d = 1;
                    E0 e02 = new E0(t5.getContext(), t5, 0);
                    if (O5.b.I(e02, e02, u3) == aVar) {
                        return aVar;
                    }
                    c1798l = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1798l = t5.f27936a;
                    com.bumptech.glide.c.c0(obj);
                }
                c1798l.f21855a = false;
                return Db.q.f3365a;
            }
        }
        t5 = new z.T(this, cVar);
        Object obj2 = t5.f27937b;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = t5.f27939d;
        if (i7 != 0) {
        }
        c1798l.f21855a = false;
        return Db.q.f3365a;
    }
}
