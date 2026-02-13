package Y5;

import H2.C0297k;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzql;
import i2.C1332t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class S0 extends H {

    /* renamed from: A, reason: collision with root package name */
    public PriorityQueue f11539A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f11540B;

    /* renamed from: C, reason: collision with root package name */
    public C0 f11541C;

    /* renamed from: D, reason: collision with root package name */
    public final AtomicLong f11542D;

    /* renamed from: E, reason: collision with root package name */
    public long f11543E;

    /* renamed from: F, reason: collision with root package name */
    public final R7.b f11544F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f11545G;

    /* renamed from: H, reason: collision with root package name */
    public I0 f11546H;

    /* renamed from: I, reason: collision with root package name */
    public R0 f11547I;

    /* renamed from: J, reason: collision with root package name */
    public I0 f11548J;

    /* renamed from: K, reason: collision with root package name */
    public final R7.b f11549K;

    /* renamed from: c, reason: collision with root package name */
    public La.f f11550c;

    /* renamed from: d, reason: collision with root package name */
    public E0 f11551d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f11552e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11553f;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f11554u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f11555v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f11556w;

    /* renamed from: x, reason: collision with root package name */
    public int f11557x;

    /* renamed from: y, reason: collision with root package name */
    public I0 f11558y;

    /* renamed from: z, reason: collision with root package name */
    public I0 f11559z;

    public S0(C0646q0 c0646q0) {
        super(c0646q0);
        this.f11552e = new CopyOnWriteArraySet();
        this.f11555v = new Object();
        this.f11556w = false;
        this.f11557x = 1;
        this.f11545G = true;
        this.f11549K = new R7.b(this);
        this.f11554u = new AtomicReference();
        this.f11541C = C0.f11229c;
        this.f11543E = -1L;
        this.f11542D = new AtomicLong(0L);
        this.f11544F = new R7.b(c0646q0, 14);
    }

    @Override // Y5.H
    public final boolean M() {
        return false;
    }

    public final void N(C0 c02) {
        J();
        boolean z8 = (c02.i(B0.ANALYTICS_STORAGE) && c02.i(B0.AD_STORAGE)) || ((C0646q0) this.f3094a).o().S();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        if (z8 != c0646q0.f11902N) {
            C0640o0 c0640o02 = c0646q0.f11913u;
            C0646q0.l(c0640o02);
            c0640o02.J();
            c0646q0.f11902N = z8;
            C0613f0 c0613f0 = ((C0646q0) this.f3094a).f11911e;
            C0646q0.j(c0613f0);
            c0613f0.J();
            Boolean valueOf = c0613f0.N().contains("measurement_enabled_from_api") ? Boolean.valueOf(c0613f0.N().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z8 || valueOf == null || valueOf.booleanValue()) {
                Z(Boolean.valueOf(z8), false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r5 > 500) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r6 > 500) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(String str, String str2, Bundle bundle, boolean z8, boolean z10, long j) {
        String str3;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z11 = !z10 || this.f11551d == null || M1.h0(str2);
            String str4 = str == null ? "app" : str;
            Bundle bundle3 = new Bundle(bundle2);
            for (String str5 : bundle3.keySet()) {
                Object obj = bundle3.get(str5);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str5, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i7 = 0; i7 < parcelableArr.length; i7++) {
                        Parcelable parcelable = parcelableArr[i7];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i7] = new Bundle((Bundle) parcelable);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            C0640o0 c0640o0 = ((C0646q0) this.f3094a).f11913u;
            C0646q0.l(c0640o0);
            c0640o0.S(new M0(this, str4, str2, j, bundle3, z10, z11, z8));
            return;
        }
        C0605c1 c0605c1 = ((C0646q0) this.f3094a).f11918z;
        C0646q0.k(c0605c1);
        synchronized (c0605c1.f11695z) {
            try {
                if (!c0605c1.f11694y) {
                    W w10 = ((C0646q0) c0605c1.f3094a).f11912f;
                    C0646q0.l(w10);
                    w10.f11582y.a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        ((C0646q0) c0605c1.f3094a).f11910d.getClass();
                    }
                    W w11 = ((C0646q0) c0605c1.f3094a).f11912f;
                    C0646q0.l(w11);
                    w11.f11582y.b(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        ((C0646q0) c0605c1.f3094a).f11910d.getClass();
                    }
                    W w12 = ((C0646q0) c0605c1.f3094a).f11912f;
                    C0646q0.l(w12);
                    w12.f11582y.b(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                    return;
                }
                if (string2 == null) {
                    zzdf zzdfVar = c0605c1.f11690u;
                    str3 = zzdfVar != null ? c0605c1.Q(zzdfVar.zzb) : "Activity";
                } else {
                    str3 = string2;
                }
                Z0 z02 = c0605c1.f11686c;
                if (c0605c1.f11691v && z02 != null) {
                    c0605c1.f11691v = false;
                    boolean equals = Objects.equals(z02.f11612b, str3);
                    boolean equals2 = Objects.equals(z02.f11611a, string);
                    if (equals && equals2) {
                        W w13 = ((C0646q0) c0605c1.f3094a).f11912f;
                        C0646q0.l(w13);
                        w13.f11582y.a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C0646q0 c0646q0 = (C0646q0) c0605c1.f3094a;
                W w14 = c0646q0.f11912f;
                C0646q0.l(w14);
                w14.f11573B.c("Logging screen view with name, class", string == null ? "null" : string, str3 == null ? "null" : str3);
                Z0 z03 = c0605c1.f11686c == null ? c0605c1.f11687d : c0605c1.f11686c;
                M1 m12 = c0646q0.f11915w;
                C0646q0.j(m12);
                Z0 z04 = new Z0(string, str3, m12.F0(), true, j);
                c0605c1.f11686c = z04;
                c0605c1.f11687d = z03;
                c0605c1.f11692w = z04;
                c0646q0.f11917y.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C0640o0 c0640o02 = c0646q0.f11913u;
                C0646q0.l(c0640o02);
                c0640o02.S(new RunnableC0649s0(c0605c1, bundle2, z04, z03, elapsedRealtime));
            } finally {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final void P() {
        /*
            Method dump skipped, instructions count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y5.S0.P():void");
    }

    public final void Q(String str, String str2, Bundle bundle) {
        J();
        ((C0646q0) this.f3094a).f11917y.getClass();
        R(str, str2, bundle, System.currentTimeMillis());
    }

    public final void R(String str, String str2, Bundle bundle, long j) {
        J();
        S(str, str2, j, bundle, true, this.f11551d == null || M1.h0(str2), true);
    }

    public final void S(String str, String str2, long j, Bundle bundle, boolean z8, boolean z10, boolean z11) {
        M5.b bVar;
        C0615g c0615g;
        W w10;
        boolean z12;
        C0605c1 c0605c1;
        boolean a9;
        String str3;
        t1 t1Var;
        long j10;
        int i7;
        t1 t1Var2;
        boolean Q3;
        boolean z13;
        ArrayList arrayList;
        Bundle[] bundleArr;
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.g(bundle);
        J();
        K();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        boolean a10 = c0646q0.a();
        W w11 = c0646q0.f11912f;
        if (!a10) {
            C0646q0.l(w11);
            w11.f11572A.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = c0646q0.q().f11475y;
        if (list != null && !list.contains(str2)) {
            C0646q0.l(w11);
            w11.f11572A.c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f11553f) {
            this.f11553f = true;
            try {
                boolean z14 = c0646q0.f11908b;
                Context context = c0646q0.f11907a;
                try {
                    (!z14 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e2) {
                    C0646q0.l(w11);
                    w11.f11580w.b(e2, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                C0646q0.l(w11);
                w11.f11583z.a("Tag Manager is not found and thus will not be used");
            }
        }
        E e10 = F.f11323g1;
        C0615g c0615g2 = c0646q0.f11910d;
        boolean T10 = c0615g2.T(null, e10);
        M5.b bVar2 = c0646q0.f11917y;
        if (!T10 && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            bVar2.getClass();
            bVar = bVar2;
            c0615g = c0615g2;
            w10 = w11;
            U(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            bVar = bVar2;
            c0615g = c0615g2;
            w10 = w11;
        }
        M1 m12 = c0646q0.f11915w;
        C0613f0 c0613f0 = c0646q0.f11911e;
        if (z8 && !M1.f11455x[0].equals(str2)) {
            C0646q0.j(m12);
            C0646q0.j(c0613f0);
            m12.U(bundle, c0613f0.f11740M.n());
        }
        R7.b bVar3 = this.f11549K;
        Q q10 = c0646q0.f11916x;
        if (!z11 && !"_iap".equals(str2)) {
            C0646q0.j(m12);
            int i10 = 2;
            if (m12.J0("event", str2)) {
                if (m12.L0("event", D0.f11235a, D0.f11236b, str2)) {
                    ((C0646q0) m12.f3094a).getClass();
                    if (m12.M0(40, "event", str2)) {
                        i10 = 0;
                    }
                } else {
                    i10 = 13;
                }
            }
            if (i10 != 0) {
                C0646q0.l(w10);
                w10.f11579v.b(q10.a(str2), "Invalid public event name. Event will not be logged (FE)");
                C0646q0.j(m12);
                M1.Z(bVar3, null, i10, "_ev", M1.O(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
        }
        W w12 = w10;
        C0605c1 c0605c12 = c0646q0.f11918z;
        C0646q0.k(c0605c12);
        Z0 P10 = c0605c12.P(false);
        if (P10 != null && !bundle.containsKey("_sc")) {
            P10.f11614d = true;
        }
        M1.A0(P10, bundle, z8 && !z11);
        boolean equals = "am".equals(str);
        boolean h02 = M1.h0(str2);
        if (!z8 || this.f11551d == null || h02) {
            z12 = equals;
        } else {
            if (!equals) {
                C0646q0.l(w12);
                w12.f11572A.c("Passing event to registered event handler (FE)", q10.a(str2), q10.e(bundle));
                com.google.android.gms.common.internal.G.g(this.f11551d);
                ((q3.l) this.f11551d).B(str, str2, bundle, j);
                return;
            }
            z12 = true;
        }
        if (c0646q0.h()) {
            C0646q0.j(m12);
            int N02 = m12.N0(str2);
            if (N02 != 0) {
                C0646q0.l(w12);
                w12.f11579v.b(q10.a(str2), "Invalid event name. Event will not be logged (FE)");
                String O10 = M1.O(str2, 40, true);
                int length = str2 != null ? str2.length() : 0;
                C0646q0.j(m12);
                M1.Z(bVar3, null, N02, "_ev", O10, length);
                return;
            }
            Bundle R10 = m12.R(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z11);
            com.google.android.gms.common.internal.G.g(R10);
            C0646q0.k(c0605c12);
            Z0 P11 = c0605c12.P(false);
            t1 t1Var3 = c0646q0.f11914v;
            W w13 = w12;
            if (P11 == null || !"_ae".equals(str2)) {
                c0605c1 = c0605c12;
            } else {
                C0646q0.k(t1Var3);
                A4.e eVar = t1Var3.f11949f;
                ((C0646q0) ((t1) eVar.f380d).f3094a).f11917y.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                c0605c1 = c0605c12;
                long j11 = elapsedRealtime - eVar.f378b;
                eVar.f378b = elapsedRealtime;
                if (j11 > 0) {
                    m12.q0(R10, j11);
                }
            }
            boolean equals2 = "auto".equals(str);
            C0646q0 c0646q02 = (C0646q0) m12.f3094a;
            if (!equals2 && "_ssr".equals(str2)) {
                String string2 = R10.getString("_ffr");
                int i11 = M5.e.f6790a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                C0613f0 c0613f02 = c0646q02.f11911e;
                C0646q0.j(c0613f02);
                if (Objects.equals(string2, c0613f02.f11738J.t())) {
                    W w14 = c0646q02.f11912f;
                    C0646q0.l(w14);
                    w14.f11572A.a("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    C0613f0 c0613f03 = c0646q02.f11911e;
                    C0646q0.j(c0613f03);
                    c0613f03.f11738J.u(string2);
                }
            } else if ("_ae".equals(str2)) {
                C0613f0 c0613f04 = c0646q02.f11911e;
                C0646q0.j(c0613f04);
                String t5 = c0613f04.f11738J.t();
                if (!TextUtils.isEmpty(t5)) {
                    R10.putString("_ffr", t5);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(R10);
            if (c0615g.T(null, F.f11293U0)) {
                C0646q0.k(t1Var3);
                t1Var3.J();
                a9 = t1Var3.f11947d;
            } else {
                C0646q0.j(c0613f0);
                a9 = c0613f0.f11735G.a();
            }
            C0646q0.j(c0613f0);
            if (c0613f0.f11732D.f() > 0 && c0613f0.T(j) && a9) {
                C0646q0.l(w13);
                w13.f11573B.a("Current session is expired, remove the session number, ID, and engagement time");
                bVar.getClass();
                str3 = "_ae";
                t1Var = t1Var3;
                w13 = w13;
                i7 = 0;
                U(System.currentTimeMillis(), null, "auto", "_sid");
                bVar.getClass();
                U(System.currentTimeMillis(), null, "auto", "_sno");
                bVar.getClass();
                U(System.currentTimeMillis(), null, "auto", "_se");
                j10 = 0;
                c0613f0.f11733E.g(0L);
            } else {
                str3 = "_ae";
                t1Var = t1Var3;
                j10 = 0;
                i7 = 0;
            }
            if (R10.getLong("extend_session", j10) == 1) {
                C0646q0.l(w13);
                w13.f11573B.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                C0646q0.k(t1Var);
                t1Var2 = t1Var;
                t1Var2.f11948e.J(j);
            } else {
                t1Var2 = t1Var;
            }
            ArrayList arrayList3 = new ArrayList(R10.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i12 = i7;
            while (i12 < size) {
                String str4 = (String) arrayList3.get(i12);
                if (str4 != null) {
                    C0646q0.j(m12);
                    Object obj = R10.get(str4);
                    if (obj instanceof Bundle) {
                        arrayList = arrayList3;
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else {
                        arrayList = arrayList3;
                        if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList4 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                        } else {
                            bundleArr = null;
                        }
                    }
                    if (bundleArr != null) {
                        R10.putParcelableArray(str4, bundleArr);
                    }
                } else {
                    arrayList = arrayList3;
                }
                i12++;
                arrayList3 = arrayList;
            }
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                Bundle bundle2 = (Bundle) arrayList2.get(i13);
                String str5 = i13 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str);
                if (z10) {
                    bundle2 = m12.k0(bundle2);
                }
                Bundle bundle3 = bundle2;
                M1 m13 = m12;
                t1 t1Var4 = t1Var2;
                C0648s c0648s = new C0648s(str5, new r(bundle3), str, j);
                C0632l1 o10 = c0646q0.o();
                o10.getClass();
                o10.J();
                o10.K();
                o10.V();
                P n6 = ((C0646q0) o10.f3094a).n();
                n6.getClass();
                Parcel obtain = Parcel.obtain();
                U5.a0.a(c0648s, obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                if (marshall.length > 131072) {
                    W w15 = ((C0646q0) n6.f3094a).f11912f;
                    C0646q0.l(w15);
                    w15.f11578u.a("Event is too long for local database. Sending event directly to service");
                    z13 = true;
                    Q3 = false;
                } else {
                    Q3 = n6.Q(0, marshall);
                    z13 = true;
                }
                o10.X(new E5.j(o10, o10.Z(z13), Q3, c0648s, 2));
                if (!z12) {
                    Iterator it = this.f11552e.iterator();
                    while (it.hasNext()) {
                        ((F0) it.next()).a(str, str2, new Bundle(bundle3), j);
                    }
                }
                i13++;
                t1Var2 = t1Var4;
                m12 = m13;
            }
            t1 t1Var5 = t1Var2;
            C0646q0.k(c0605c1);
            if (c0605c1.P(false) == null || !str3.equals(str2)) {
                return;
            }
            C0646q0.k(t1Var5);
            bVar.getClass();
            t1Var5.f11949f.a(SystemClock.elapsedRealtime(), true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(String str, String str2, Object obj, boolean z8, long j) {
        int i7;
        int i10;
        int length;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (!z8) {
            M1 m12 = c0646q0.f11915w;
            C0646q0.j(m12);
            i7 = 6;
            if (m12.J0("user property", str2)) {
                if (m12.L0("user property", D0.f11242i, null, str2)) {
                    ((C0646q0) m12.f3094a).getClass();
                    if (m12.M0(24, "user property", str2)) {
                        i7 = 0;
                    }
                } else {
                    i10 = 15;
                }
            }
            R7.b bVar = this.f11549K;
            if (i7 == 0) {
                C0646q0.j(c0646q0.f11915w);
                String O10 = M1.O(str2, 24, true);
                length = str2 != null ? str2.length() : 0;
                C0646q0.j(c0646q0.f11915w);
                M1.Z(bVar, null, i7, "_ev", O10, length);
                return;
            }
            String str3 = str == null ? "app" : str;
            if (obj == null) {
                C0640o0 c0640o0 = c0646q0.f11913u;
                C0646q0.l(c0640o0);
                c0640o0.S(new RunnableC0649s0(this, str3, str2, (Object) null, j));
                return;
            }
            M1 m13 = c0646q0.f11915w;
            C0646q0.j(m13);
            int W10 = m13.W(obj, str2);
            M1 m14 = c0646q0.f11915w;
            if (W10 != 0) {
                C0646q0.j(m14);
                String O11 = M1.O(str2, 24, true);
                length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
                C0646q0.j(m14);
                M1.Z(bVar, null, W10, "_ev", O11, length);
                return;
            }
            C0646q0.j(m14);
            Object X10 = m14.X(obj, str2);
            if (X10 != null) {
                C0640o0 c0640o02 = c0646q0.f11913u;
                C0646q0.l(c0640o02);
                c0640o02.S(new RunnableC0649s0(this, str3, str2, X10, j));
                return;
            }
            return;
        }
        M1 m15 = c0646q0.f11915w;
        C0646q0.j(m15);
        i10 = m15.O0(str2);
        i7 = i10;
        R7.b bVar2 = this.f11549K;
        if (i7 == 0) {
        }
    }

    public final void U(long j, Object obj, String str, String str2) {
        Object obj2;
        String str3;
        boolean Q3;
        Object obj3 = obj;
        com.google.android.gms.common.internal.G.d(str);
        com.google.android.gms.common.internal.G.d(str2);
        J();
        K();
        boolean equals = "allow_personalized_ads".equals(str2);
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (equals) {
            String str4 = "_npa";
            if (obj3 instanceof String) {
                String str5 = (String) obj3;
                if (!TextUtils.isEmpty(str5)) {
                    long j10 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    obj3 = Long.valueOf(j10);
                    C0613f0 c0613f0 = c0646q0.f11911e;
                    C0646q0.j(c0613f0);
                    c0613f0.f11729A.u(j10 == 1 ? "true" : "false");
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11573B.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj3);
                    obj2 = obj3;
                    str3 = str4;
                }
            }
            if (obj3 == null) {
                C0613f0 c0613f02 = c0646q0.f11911e;
                C0646q0.j(c0613f02);
                c0613f02.f11729A.u("unset");
            } else {
                str4 = str2;
            }
            W w102 = c0646q0.f11912f;
            C0646q0.l(w102);
            w102.f11573B.c("Setting user property(FE)", "non_personalized_ads(_npa)", obj3);
            obj2 = obj3;
            str3 = str4;
        } else {
            obj2 = obj3;
            str3 = str2;
        }
        if (!c0646q0.a()) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11573B.a("User property not set since app measurement is disabled");
            return;
        }
        if (c0646q0.h()) {
            K1 k12 = new K1(j, obj2, str3, str);
            C0632l1 o10 = c0646q0.o();
            o10.J();
            o10.K();
            o10.V();
            P n6 = ((C0646q0) o10.f3094a).n();
            n6.getClass();
            Parcel obtain = Parcel.obtain();
            U5.a0.b(k12, obtain);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                W w12 = ((C0646q0) n6.f3094a).f11912f;
                C0646q0.l(w12);
                w12.f11578u.a("User property too long for local database. Sending directly to service");
                Q3 = false;
            } else {
                Q3 = n6.Q(1, marshall);
            }
            o10.X(new E5.j(o10, o10.Z(true), Q3, k12, 1));
        }
    }

    public final void V() {
        J();
        K();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (c0646q0.h()) {
            C0615g c0615g = c0646q0.f11910d;
            ((C0646q0) c0615g.f3094a).getClass();
            Boolean V7 = c0615g.V("google_analytics_deferred_deep_link_enabled");
            if (V7 != null && V7.booleanValue()) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11572A.a("Deferred Deep Link feature enabled.");
                C0640o0 c0640o0 = c0646q0.f11913u;
                C0646q0.l(c0640o0);
                c0640o0.S(new H0(this, 2));
            }
            C0632l1 o10 = c0646q0.o();
            o10.J();
            o10.K();
            O1 Z7 = o10.Z(true);
            o10.V();
            C0646q0 c0646q02 = (C0646q0) o10.f3094a;
            c0646q02.f11910d.T(null, F.f11312c1);
            c0646q02.n().Q(3, new byte[0]);
            o10.X(new RunnableC0617g1(o10, Z7, 1));
            this.f11545G = false;
            C0613f0 c0613f0 = c0646q0.f11911e;
            C0646q0.j(c0613f0);
            c0613f0.J();
            String string = c0613f0.N().getString("previous_os_version", null);
            ((C0646q0) c0613f0.f3094a).p().L();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = c0613f0.N().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c0646q0.p().L();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            Q("auto", "_ou", bundle);
        }
    }

    public final void W(Bundle bundle, long j) {
        Bundle bundle2 = new Bundle(bundle);
        boolean isEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (!isEmpty) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11580w.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        D0.e(bundle2, "app_id", String.class, null);
        D0.e(bundle2, "origin", String.class, null);
        D0.e(bundle2, "name", String.class, null);
        D0.e(bundle2, "value", Object.class, null);
        D0.e(bundle2, "trigger_event_name", String.class, null);
        D0.e(bundle2, "trigger_timeout", Long.class, 0L);
        D0.e(bundle2, "timed_out_event_name", String.class, null);
        D0.e(bundle2, "timed_out_event_params", Bundle.class, null);
        D0.e(bundle2, "triggered_event_name", String.class, null);
        D0.e(bundle2, "triggered_event_params", Bundle.class, null);
        D0.e(bundle2, "time_to_live", Long.class, 0L);
        D0.e(bundle2, "expired_event_name", String.class, null);
        D0.e(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.G.d(bundle2.getString("name"));
        com.google.android.gms.common.internal.G.d(bundle2.getString("origin"));
        com.google.android.gms.common.internal.G.g(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        M1 m12 = c0646q0.f11915w;
        C0646q0.j(m12);
        int O02 = m12.O0(string);
        Q q10 = c0646q0.f11916x;
        W w11 = c0646q0.f11912f;
        if (O02 != 0) {
            C0646q0.l(w11);
            w11.f11577f.b(q10.c(string), "Invalid conditional user property name");
            return;
        }
        M1 m13 = c0646q0.f11915w;
        C0646q0.j(m13);
        if (m13.W(obj, string) != 0) {
            C0646q0.l(w11);
            w11.f11577f.c("Invalid conditional user property value", q10.c(string), obj);
            return;
        }
        Object X10 = m13.X(obj, string);
        if (X10 == null) {
            C0646q0.l(w11);
            w11.f11577f.c("Unable to normalize conditional user property value", q10.c(string), obj);
            return;
        }
        D0.d(bundle2, X10);
        long j10 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j10 > 15552000000L || j10 < 1)) {
            C0646q0.l(w11);
            w11.f11577f.c("Invalid conditional user property timeout", q10.c(string), Long.valueOf(j10));
            return;
        }
        long j11 = bundle2.getLong("time_to_live");
        if (j11 <= 15552000000L && j11 >= 1) {
            C0640o0 c0640o0 = c0646q0.f11913u;
            C0646q0.l(c0640o0);
            c0640o0.S(new O0(this, bundle2, 0));
        } else {
            C0646q0.l(w11);
            w11.f11577f.c("Invalid conditional user property time to live", q10.c(string), Long.valueOf(j11));
        }
    }

    public final void X(String str, String str2, Bundle bundle) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        c0646q0.f11917y.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        com.google.android.gms.common.internal.G.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new O0(this, bundle2, 1));
    }

    public final void Y(C0 c02, long j, boolean z8) {
        J();
        K();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        C0 Q3 = c0613f0.Q();
        long j10 = this.f11543E;
        int i7 = c02.f11231b;
        W w10 = c0646q0.f11912f;
        if (j <= j10 && C0.l(Q3.f11231b, i7)) {
            C0646q0.l(w10);
            w10.f11583z.b(c02, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C0613f0 c0613f02 = c0646q0.f11911e;
        C0646q0.j(c0613f02);
        c0613f02.J();
        if (!C0.l(i7, c0613f02.N().getInt("consent_source", 100))) {
            C0646q0.l(w10);
            w10.f11583z.b(Integer.valueOf(i7), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor edit = c0613f02.N().edit();
        edit.putString("consent_settings", c02.g());
        edit.putInt("consent_source", i7);
        edit.apply();
        C0646q0.l(w10);
        w10.f11573B.b(c02, "Setting storage consent(FE)");
        this.f11543E = j;
        if (c0646q0.o().T()) {
            C0632l1 o10 = c0646q0.o();
            o10.J();
            o10.K();
            o10.X(new RunnableC0626j1(o10, 2));
        } else {
            C0632l1 o11 = c0646q0.o();
            o11.J();
            o11.K();
            if (o11.S()) {
                o11.X(new RunnableC0617g1(o11, o11.Z(false)));
            }
        }
        if (z8) {
            c0646q0.o().N(new AtomicReference());
        }
    }

    public final void Z(Boolean bool, boolean z8) {
        J();
        K();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        w10.f11572A.b(bool, "Setting app measurement enabled (FE)");
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        c0613f0.J();
        SharedPreferences.Editor edit = c0613f0.N().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z8) {
            c0613f0.J();
            SharedPreferences.Editor edit2 = c0613f0.N().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.J();
        if (c0646q0.f11902N || !(bool == null || bool.booleanValue())) {
            a0();
        }
    }

    public final void a0() {
        J();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        C0613f0 c0613f0 = c0646q0.f11911e;
        C0646q0.j(c0613f0);
        String t5 = c0613f0.f11729A.t();
        if (t5 != null) {
            boolean equals = "unset".equals(t5);
            M5.b bVar = c0646q0.f11917y;
            if (equals) {
                bVar.getClass();
                U(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long valueOf = Long.valueOf(true != "true".equals(t5) ? 0L : 1L);
                bVar.getClass();
                U(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        boolean a9 = c0646q0.a();
        W w10 = c0646q0.f11912f;
        if (!a9 || !this.f11545G) {
            C0646q0.l(w10);
            w10.f11572A.a("Updating Scion state (FE)");
            C0632l1 o10 = c0646q0.o();
            o10.J();
            o10.K();
            o10.X(new RunnableC0617g1(o10, o10.Z(true), 3));
            return;
        }
        C0646q0.l(w10);
        w10.f11572A.a("Recording app launch after enabling measurement for the first time (FE)");
        V();
        t1 t1Var = c0646q0.f11914v;
        C0646q0.k(t1Var);
        t1Var.f11948e.H();
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        c0640o0.S(new H0(this));
    }

    public final void b0() {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (!(c0646q0.f11907a.getApplicationContext() instanceof Application) || this.f11550c == null) {
            return;
        }
        ((Application) c0646q0.f11907a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f11550c);
    }

    public final void c0(Bundle bundle, int i7, long j) {
        Boolean bool;
        String str;
        EnumC0663z0 enumC0663z0;
        K();
        C0 c02 = C0.f11229c;
        B0[] b0Arr = A0.STORAGE.f11204a;
        int length = b0Arr.length;
        int i10 = 0;
        while (true) {
            bool = null;
            if (i10 >= length) {
                str = null;
                break;
            }
            String str2 = b0Arr[i10].f11227a;
            if (bundle.containsKey(str2) && (str = bundle.getString(str2)) != null) {
                if ((str.equals("granted") ? Boolean.TRUE : str.equals("denied") ? Boolean.FALSE : null) == null) {
                    break;
                }
            }
            i10++;
        }
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (str != null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11582y.b(str, "Ignoring invalid consent setting");
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11582y.a("Valid consent values are 'granted', 'denied'");
        }
        C0640o0 c0640o0 = c0646q0.f11913u;
        C0646q0.l(c0640o0);
        boolean P10 = c0640o0.P();
        C0 b2 = C0.b(i7, bundle);
        Iterator it = b2.f11230a.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            enumC0663z0 = EnumC0663z0.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((EnumC0663z0) it.next()) != enumC0663z0) {
                e0(b2, P10);
                break;
            }
        }
        C0639o c10 = C0639o.c(i7, bundle);
        Iterator it2 = c10.f11862e.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((EnumC0663z0) it2.next()) != enumC0663z0) {
                d0(c10, P10);
                break;
            }
        }
        if (bundle != null) {
            int ordinal = C0.d(bundle.getString("ad_personalization")).ordinal();
            if (ordinal == 2) {
                bool = Boolean.FALSE;
            } else if (ordinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str3 = i7 == -30 ? "tcf" : "app";
            if (P10) {
                U(j, bool.toString(), str3, "allow_personalized_ads");
            } else {
                T(str3, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void d0(C0639o c0639o, boolean z8) {
        E5.k kVar = new E5.k(this, c0639o);
        if (z8) {
            J();
            kVar.run();
        } else {
            C0640o0 c0640o0 = ((C0646q0) this.f3094a).f11913u;
            C0646q0.l(c0640o0);
            c0640o0.S(kVar);
        }
    }

    public final void e0(C0 c02, boolean z8) {
        boolean z10;
        C0 c03;
        boolean z11;
        boolean z12;
        K();
        int i7 = c02.f11231b;
        if (i7 != -10) {
            EnumC0663z0 enumC0663z0 = (EnumC0663z0) c02.f11230a.get(B0.AD_STORAGE);
            if (enumC0663z0 == null) {
                enumC0663z0 = EnumC0663z0.UNINITIALIZED;
            }
            EnumC0663z0 enumC0663z02 = EnumC0663z0.UNINITIALIZED;
            if (enumC0663z0 == enumC0663z02) {
                EnumC0663z0 enumC0663z03 = (EnumC0663z0) c02.f11230a.get(B0.ANALYTICS_STORAGE);
                if (enumC0663z03 == null) {
                    enumC0663z03 = enumC0663z02;
                }
                if (enumC0663z03 == enumC0663z02) {
                    W w10 = ((C0646q0) this.f3094a).f11912f;
                    C0646q0.l(w10);
                    w10.f11582y.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f11555v) {
            try {
                z10 = false;
                if (C0.l(i7, this.f11541C.f11231b)) {
                    C0 c04 = this.f11541C;
                    EnumMap enumMap = c02.f11230a;
                    B0[] b0Arr = (B0[]) enumMap.keySet().toArray(new B0[0]);
                    int length = b0Arr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            z11 = false;
                            break;
                        }
                        B0 b02 = b0Arr[i10];
                        EnumC0663z0 enumC0663z04 = (EnumC0663z0) enumMap.get(b02);
                        EnumC0663z0 enumC0663z05 = (EnumC0663z0) c04.f11230a.get(b02);
                        EnumC0663z0 enumC0663z06 = EnumC0663z0.DENIED;
                        if (enumC0663z04 == enumC0663z06 && enumC0663z05 != enumC0663z06) {
                            z11 = true;
                            break;
                        }
                        i10++;
                    }
                    B0 b03 = B0.ANALYTICS_STORAGE;
                    if (c02.i(b03) && !this.f11541C.i(b03)) {
                        z10 = true;
                    }
                    C0 k = c02.k(this.f11541C);
                    this.f11541C = k;
                    c03 = k;
                    z12 = z10;
                    z10 = true;
                } else {
                    c03 = c02;
                    z11 = false;
                    z12 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z10) {
            W w11 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w11);
            w11.f11583z.b(c03, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f11542D.getAndIncrement();
        if (z11) {
            this.f11554u.set(null);
            P0 p02 = new P0(this, c03, andIncrement, z12, 0);
            if (z8) {
                J();
                p02.run();
                return;
            } else {
                C0640o0 c0640o0 = ((C0646q0) this.f3094a).f11913u;
                C0646q0.l(c0640o0);
                c0640o0.U(p02);
                return;
            }
        }
        P0 p03 = new P0(this, c03, andIncrement, z12, 1);
        if (z8) {
            J();
            p03.run();
        } else if (i7 == 30 || i7 == -10) {
            C0640o0 c0640o02 = ((C0646q0) this.f3094a).f11913u;
            C0646q0.l(c0640o02);
            c0640o02.U(p03);
        } else {
            C0640o0 c0640o03 = ((C0646q0) this.f3094a).f11913u;
            C0646q0.l(c0640o03);
            c0640o03.S(p03);
        }
    }

    public final void f0() {
        zzql.zza();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (c0646q0.f11910d.T(null, F.f11285Q0)) {
            C0640o0 c0640o0 = c0646q0.f11913u;
            C0646q0.l(c0640o0);
            boolean P10 = c0640o0.P();
            W w10 = c0646q0.f11912f;
            if (P10) {
                C0646q0.l(w10);
                w10.f11577f.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C1332t.e()) {
                C0646q0.l(w10);
                w10.f11577f.a("Cannot get trigger URIs from main thread");
                return;
            }
            K();
            C0646q0.l(w10);
            w10.f11573B.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C0646q0.l(c0640o0);
            c0640o0.T(atomicReference, 10000L, "get trigger URIs", new N0(this, atomicReference, 5, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                C0646q0.l(w10);
                w10.f11579v.a("Timed out waiting for get trigger URIs");
            } else {
                C0646q0.l(c0640o0);
                c0640o0.S(new E5.k(19, this, list));
            }
        }
    }

    public final PriorityQueue g0() {
        if (this.f11539A == null) {
            this.f11539A = new PriorityQueue(Comparator.comparing(Q0.f11537a, C0297k.f4735b));
        }
        return this.f11539A;
    }

    public final void h0() {
        x1 x1Var;
        J();
        this.f11540B = false;
        if (g0().isEmpty() || this.f11556w || (x1Var = (x1) g0().poll()) == null) {
            return;
        }
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        M1 m12 = c0646q0.f11915w;
        C0646q0.j(m12);
        D2.d d02 = m12.d0();
        if (d02 != null) {
            this.f11556w = true;
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            U u3 = w10.f11573B;
            String str = x1Var.f11993a;
            u3.b(str, "Registering trigger URI");
            R6.a e2 = d02.e(Uri.parse(str));
            if (e2 != null) {
                e2.a(new E5.k(10, e2, new q3.c(this, x1Var)), new J0(this));
            } else {
                this.f11556w = false;
                g0().add(x1Var);
            }
        }
    }
}
