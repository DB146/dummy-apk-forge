package com.google.firebase.auth;

import T6.a;
import X.c;
import Y6.i;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import e3.RunnableC1077b;
import h3.H;
import j8.InterfaceC1387b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n7.AbstractC1712c;
import n7.C;
import n7.C1711b;
import n7.C1713d;
import n7.C1715f;
import n7.C1716g;
import n7.D;
import n7.E;
import n7.F;
import n7.l;
import n7.q;
import n7.y;
import o7.AbstractC1822l;
import o7.C1813c;
import o7.C1815e;
import o7.C1816f;
import o7.C1818h;
import o7.InterfaceC1811a;
import o7.m;
import o7.n;
import o7.r;
import o7.t;
import o7.u;
import o7.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r8.o;

/* loaded from: classes.dex */
public class FirebaseAuth implements InterfaceC1811a {

    /* renamed from: a, reason: collision with root package name */
    public final i f15828a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f15829b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f15830c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f15831d;

    /* renamed from: e, reason: collision with root package name */
    public final zzach f15832e;

    /* renamed from: f, reason: collision with root package name */
    public l f15833f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f15834h;

    /* renamed from: i, reason: collision with root package name */
    public final String f15835i;
    public a j;
    public final RecaptchaAction k;

    /* renamed from: l, reason: collision with root package name */
    public final RecaptchaAction f15836l;

    /* renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f15837m;

    /* renamed from: n, reason: collision with root package name */
    public final o f15838n;

    /* renamed from: o, reason: collision with root package name */
    public final u f15839o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1387b f15840p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1387b f15841q;

    /* renamed from: r, reason: collision with root package name */
    public r f15842r;

    /* renamed from: s, reason: collision with root package name */
    public final Executor f15843s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f15844t;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f15845u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00f7  */
    /* JADX WARN: Type inference failed for: r4v14, types: [n7.f, o7.t] */
    /* JADX WARN: Type inference failed for: r6v10, types: [n7.f, o7.t] */
    /* JADX WARN: Type inference failed for: r6v9, types: [n7.f, o7.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FirebaseAuth(i iVar, InterfaceC1387b interfaceC1387b, InterfaceC1387b interfaceC1387b2, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, Executor executor3) {
        JSONObject jSONObject;
        C1815e p10;
        String string;
        i iVar2;
        C1711b c1711b;
        C1711b c1711b2;
        zzahn zzb;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        zzach zzachVar = new zzach(iVar, executor, scheduledExecutorService);
        iVar.b();
        Context context = iVar.f12041a;
        String g = iVar.g();
        o oVar = new o(10, false);
        G.g(context);
        G.d(g);
        oVar.f23857b = g;
        Context applicationContext = context.getApplicationContext();
        oVar.f23858c = applicationContext;
        oVar.f23859d = applicationContext.getSharedPreferences("com.google.firebase.auth.api.Store." + g, 0);
        oVar.f23860e = new I5.a("StorageHelpers", new String[0]);
        u uVar = u.f22109b;
        this.f15829b = new CopyOnWriteArrayList();
        this.f15830c = new CopyOnWriteArrayList();
        this.f15831d = new CopyOnWriteArrayList();
        this.g = new Object();
        this.f15834h = new Object();
        this.k = RecaptchaAction.custom("getOobCode");
        this.f15836l = RecaptchaAction.custom("signInWithPassword");
        this.f15837m = RecaptchaAction.custom("signUpPassword");
        RecaptchaAction.custom("sendVerificationCode");
        RecaptchaAction.custom("mfaSmsEnrollment");
        RecaptchaAction.custom("mfaSmsSignIn");
        this.f15828a = iVar;
        this.f15832e = zzachVar;
        this.f15838n = oVar;
        G.g(uVar);
        this.f15839o = uVar;
        this.f15840p = interfaceC1387b;
        this.f15841q = interfaceC1387b2;
        this.f15843s = executor;
        this.f15844t = executor2;
        this.f15845u = executor3;
        String o10 = oVar.o("com.google.firebase.auth.FIREBASE_USER");
        if (!TextUtils.isEmpty(o10)) {
            try {
                jSONObject = new JSONObject(o10);
            } catch (Exception unused) {
                I5.a aVar = (I5.a) oVar.f23860e;
                Log.i(aVar.f5230a, aVar.d("Failed to restore user data from persistent storage.", new Object[0]));
            }
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                p10 = oVar.p(jSONObject);
                this.f15833f = p10;
                if (p10 != null) {
                    o oVar2 = this.f15838n;
                    oVar2.getClass();
                    String o11 = oVar2.o("com.google.firebase.auth.GET_TOKEN_RESPONSE." + p10.f22070b.f22060a);
                    if (o11 != null) {
                        try {
                            zzb = zzahn.zzb(o11);
                        } catch (zzaag unused2) {
                            I5.a aVar2 = (I5.a) oVar2.f23860e;
                            Log.i(aVar2.f5230a, aVar2.d("Failed to restore token data from persistent storage.", new Object[0]));
                        }
                        if (zzb != null) {
                            d(this, this.f15833f, zzb, false, false);
                        }
                    }
                    zzb = null;
                    if (zzb != null) {
                    }
                }
                this.f15839o.f22110a.getClass();
                i iVar3 = this.f15828a;
                iVar3.b();
                SharedPreferences sharedPreferences = iVar3.f12041a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
                string = sharedPreferences.getString("firebaseAppName", "");
                iVar2 = this.f15828a;
                iVar2.b();
                if (iVar2.f12042b.equals(string)) {
                    return;
                }
                if (!sharedPreferences.contains("verifyAssertionRequest")) {
                    if (!sharedPreferences.contains("recaptchaToken")) {
                        if (sharedPreferences.contains("statusCode")) {
                            Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""), null, null);
                            sharedPreferences.getLong("timestamp", 0L);
                            n.b(sharedPreferences);
                            Tasks.forException(zzaei.zza(status));
                            return;
                        }
                        return;
                    }
                    String string2 = sharedPreferences.getString("recaptchaToken", "");
                    String string3 = sharedPreferences.getString("operation", "");
                    sharedPreferences.getLong("timestamp", 0L);
                    string3.getClass();
                    if (string3.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                        Tasks.forResult(string2);
                    }
                    n.b(sharedPreferences);
                    return;
                }
                String string4 = sharedPreferences.getString("verifyAssertionRequest", "");
                zzait zzaitVar = (zzait) H.o(string4 == null ? null : Base64.decode(string4, 10), zzait.CREATOR);
                String string5 = sharedPreferences.getString("operation", "");
                String string6 = sharedPreferences.getString("tenantId", null);
                String string7 = sharedPreferences.getString("firebaseUserUid", "");
                sharedPreferences.getLong("timestamp", 0L);
                if (string6 != null) {
                    G.d(string6);
                    synchronized (this.f15834h) {
                        this.f15835i = string6;
                    }
                    zzaitVar.zzb(string6);
                }
                string5.getClass();
                char c10 = 65535;
                switch (string5.hashCode()) {
                    case -98509410:
                        if (string5.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 175006864:
                        if (string5.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 1450464913:
                        if (string5.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        if (((C1815e) this.f15833f).f22070b.f22060a.equals(string7)) {
                            l lVar = this.f15833f;
                            F C2 = F.C(zzaitVar);
                            G.g(lVar);
                            AbstractC1712c z8 = C2.z();
                            if (!(z8 instanceof C1713d)) {
                                if (!(z8 instanceof n7.r)) {
                                    this.f15832e.zzc(this.f15828a, lVar, z8, lVar.t(), new C1715f(this, objArr == true ? 1 : 0));
                                    break;
                                } else {
                                    this.f15832e.zzb(this.f15828a, lVar, (n7.r) z8, this.f15835i, (t) new C1715f(this, objArr2 == true ? 1 : 0));
                                    break;
                                }
                            } else {
                                C1713d c1713d = (C1713d) z8;
                                if (!"password".equals(!TextUtils.isEmpty(c1713d.f21282b) ? "password" : "emailLink")) {
                                    String str = c1713d.f21283c;
                                    G.d(str);
                                    int i7 = C1711b.f21278c;
                                    G.d(str);
                                    try {
                                        c1711b = new C1711b(str);
                                    } catch (IllegalArgumentException unused3) {
                                        c1711b = null;
                                    }
                                    if (c1711b != null && !TextUtils.equals(this.f15835i, c1711b.f21280b)) {
                                        Tasks.forException(zzaei.zza(new Status(17072, null, null, null)));
                                        break;
                                    } else {
                                        new C(this, true, lVar, c1713d).P(this, this.f15835i, this.k);
                                        break;
                                    }
                                } else {
                                    String str2 = c1713d.f21282b;
                                    G.d(str2);
                                    String t5 = lVar.t();
                                    new D(this, c1713d.f21281a, true, lVar, str2, t5).P(this, t5, this.f15836l);
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        if (((C1815e) this.f15833f).f22070b.f22060a.equals(string7)) {
                            l lVar2 = this.f15833f;
                            F C10 = F.C(zzaitVar);
                            G.g(lVar2);
                            this.f15832e.zza(this.f15828a, lVar2, C10.z(), (String) null, (t) new C1715f(this, objArr3 == true ? 1 : 0));
                            break;
                        }
                        break;
                    case 2:
                        AbstractC1712c z10 = F.C(zzaitVar).z();
                        if (!(z10 instanceof C1713d)) {
                            boolean z11 = z10 instanceof n7.r;
                            i iVar4 = this.f15828a;
                            zzach zzachVar2 = this.f15832e;
                            if (!z11) {
                                zzachVar2.zza(iVar4, z10, this.f15835i, new C1716g(this));
                                break;
                            } else {
                                zzachVar2.zza(iVar4, (n7.r) z10, this.f15835i, (v) new C1716g(this));
                                break;
                            }
                        } else {
                            C1713d c1713d2 = (C1713d) z10;
                            if (!TextUtils.isEmpty(c1713d2.f21283c)) {
                                String str3 = c1713d2.f21283c;
                                G.d(str3);
                                int i10 = C1711b.f21278c;
                                G.d(str3);
                                try {
                                    c1711b2 = new C1711b(str3);
                                } catch (IllegalArgumentException unused4) {
                                    c1711b2 = null;
                                }
                                if (c1711b2 != null && !TextUtils.equals(this.f15835i, c1711b2.f21280b)) {
                                    Tasks.forException(zzaei.zza(new Status(17072, null, null, null)));
                                    break;
                                } else {
                                    new C(this, false, null, c1713d2).P(this, this.f15835i, this.k);
                                    break;
                                }
                            } else {
                                String str4 = c1713d2.f21282b;
                                G.g(str4);
                                String str5 = this.f15835i;
                                new D(this, c1713d2.f21281a, false, null, str4, str5).P(this, str5, this.f15836l);
                                break;
                            }
                        }
                        break;
                }
                n.b(sharedPreferences);
                return;
            }
        }
        p10 = null;
        this.f15833f = p10;
        if (p10 != null) {
        }
        this.f15839o.f22110a.getClass();
        i iVar32 = this.f15828a;
        iVar32.b();
        SharedPreferences sharedPreferences2 = iVar32.f12041a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        string = sharedPreferences2.getString("firebaseAppName", "");
        iVar2 = this.f15828a;
        iVar2.b();
        if (iVar2.f12042b.equals(string)) {
        }
    }

    public static void c(FirebaseAuth firebaseAuth, l lVar) {
        if (lVar != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + ((C1815e) lVar).f22070b.f22060a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f15845u.execute(new RunnableC1077b(firebaseAuth, 7));
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(FirebaseAuth firebaseAuth, l lVar, zzahn zzahnVar, boolean z8, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        l lVar2;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        G.g(lVar);
        G.g(zzahnVar);
        l lVar3 = firebaseAuth.f15833f;
        boolean z15 = lVar3 != null && ((C1815e) lVar).f22070b.f22060a.equals(((C1815e) lVar3).f22070b.f22060a);
        if (!z15 && z10) {
            return;
        }
        l lVar4 = firebaseAuth.f15833f;
        if (lVar4 == null) {
            z12 = true;
            z11 = true;
        } else {
            z11 = (z15 && ((C1815e) lVar4).f22069a.zzc().equals(zzahnVar.zzc())) ? false : true;
            z12 = !z15;
        }
        l lVar5 = firebaseAuth.f15833f;
        if (lVar5 != null) {
            C1815e c1815e = (C1815e) lVar;
            if (c1815e.f22070b.f22060a.equals(((C1815e) lVar5).f22070b.f22060a)) {
                firebaseAuth.f15833f.C(c1815e.f22073e);
                if (!lVar.z()) {
                    ((C1815e) firebaseAuth.f15833f).f22076v = Boolean.FALSE;
                }
                m mVar = c1815e.f22080z;
                if (mVar != null) {
                    arrayList2 = new ArrayList();
                    Iterator it = mVar.f22096a.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((n7.v) it.next());
                    }
                    Iterator it2 = mVar.f22097b.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((y) it2.next());
                    }
                } else {
                    arrayList2 = new ArrayList();
                }
                List list = c1815e.f22068A;
                firebaseAuth.f15833f.D(arrayList2);
                C1815e c1815e2 = (C1815e) firebaseAuth.f15833f;
                if (list == null) {
                    c1815e2.getClass();
                    list = new ArrayList();
                }
                c1815e2.f22068A = list;
                if (z8) {
                    z13 = false;
                    z14 = true;
                } else {
                    o oVar = firebaseAuth.f15838n;
                    l lVar6 = firebaseAuth.f15833f;
                    oVar.getClass();
                    G.g(lVar6);
                    I5.a aVar = (I5.a) oVar.f23860e;
                    JSONObject jSONObject = new JSONObject();
                    if (C1815e.class.isAssignableFrom(lVar6.getClass())) {
                        C1815e c1815e3 = (C1815e) lVar6;
                        try {
                            jSONObject.put("cachedTokenState", c1815e3.f22069a.zzf());
                            i f4 = i.f(c1815e3.f22071c);
                            f4.b();
                            jSONObject.put("applicationName", f4.f12042b);
                            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                            if (c1815e3.f22073e != null) {
                                JSONArray jSONArray = new JSONArray();
                                ArrayList arrayList3 = c1815e3.f22073e;
                                int size = arrayList3.size();
                                if (arrayList3.size() > 30) {
                                    aVar.f("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(arrayList3.size()));
                                    size = 30;
                                }
                                boolean z16 = false;
                                for (int i7 = 0; i7 < size; i7++) {
                                    C1813c c1813c = (C1813c) arrayList3.get(i7);
                                    if (c1813c.f22061b.equals("firebase")) {
                                        z16 = true;
                                    }
                                    if (i7 == size - 1 && !z16) {
                                        break;
                                    }
                                    jSONArray.put(c1813c.z());
                                }
                                if (z16) {
                                    z14 = true;
                                } else {
                                    int i10 = size - 1;
                                    while (true) {
                                        if (i10 >= arrayList3.size() || i10 < 0) {
                                            break;
                                        }
                                        C1813c c1813c2 = (C1813c) arrayList3.get(i10);
                                        if (c1813c2.f22061b.equals("firebase")) {
                                            jSONArray.put(c1813c2.z());
                                            z16 = true;
                                            break;
                                        } else {
                                            if (i10 == arrayList3.size() - 1) {
                                                jSONArray.put(c1813c2.z());
                                            }
                                            i10++;
                                        }
                                    }
                                    z14 = true;
                                    if (!z16) {
                                        aVar.f("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(arrayList3.size()), Integer.valueOf(size));
                                        if (arrayList3.size() < 5) {
                                            StringBuilder sb2 = new StringBuilder("Provider user info list:\n");
                                            Iterator it3 = arrayList3.iterator();
                                            while (it3.hasNext()) {
                                                sb2.append("Provider - " + ((C1813c) it3.next()).f22061b + "\n");
                                            }
                                            aVar.f(sb2.toString(), new Object[0]);
                                        }
                                    }
                                }
                                jSONObject.put("userInfos", jSONArray);
                            } else {
                                z14 = true;
                            }
                            jSONObject.put("anonymous", c1815e3.z());
                            jSONObject.put("version", "2");
                            C1816f c1816f = c1815e3.f22077w;
                            if (c1816f != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("lastSignInTimestamp", c1816f.f22081a);
                                    jSONObject2.put("creationTimestamp", c1816f.f22082b);
                                } catch (JSONException unused) {
                                }
                                jSONObject.put("userMetadata", jSONObject2);
                            }
                            m mVar2 = c1815e3.f22080z;
                            if (mVar2 != null) {
                                arrayList = new ArrayList();
                                Iterator it4 = mVar2.f22096a.iterator();
                                while (it4.hasNext()) {
                                    arrayList.add((n7.v) it4.next());
                                }
                                Iterator it5 = mVar2.f22097b.iterator();
                                while (it5.hasNext()) {
                                    arrayList.add((y) it5.next());
                                }
                            } else {
                                arrayList = new ArrayList();
                            }
                            if (!arrayList.isEmpty()) {
                                JSONArray jSONArray2 = new JSONArray();
                                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                    jSONArray2.put(((q) arrayList.get(i11)).z());
                                }
                                jSONObject.put("userMultiFactorInfo", jSONArray2);
                            }
                            List list2 = c1815e3.f22068A;
                            if (list2 != null && !list2.isEmpty()) {
                                JSONArray jSONArray3 = new JSONArray();
                                for (int i12 = 0; i12 < list2.size(); i12++) {
                                    E e2 = (E) list2.get(i12);
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("credentialId", e2.f21254a);
                                    jSONObject3.put("name", e2.f21255b);
                                    jSONObject3.put("displayName", e2.f21256c);
                                    jSONArray3.put(jSONObject3);
                                }
                                jSONObject.put("passkeyInfo", jSONArray3);
                            }
                            str = jSONObject.toString();
                            z13 = false;
                        } catch (Exception e10) {
                            Log.wtf(aVar.f5230a, aVar.d("Failed to turn object into JSON", new Object[0]), e10);
                            throw new zzaag(e10);
                        }
                    } else {
                        z13 = false;
                        z14 = true;
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        oVar.q("com.google.firebase.auth.FIREBASE_USER", str);
                    }
                }
                if (z11) {
                    l lVar7 = firebaseAuth.f15833f;
                    if (lVar7 != null) {
                        ((C1815e) lVar7).f22069a = zzahnVar;
                    }
                    e(firebaseAuth, lVar7);
                }
                if (z12) {
                    c(firebaseAuth, firebaseAuth.f15833f);
                }
                if (z8) {
                    o oVar2 = firebaseAuth.f15838n;
                    oVar2.getClass();
                    oVar2.q(c.t("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((C1815e) lVar).f22070b.f22060a), zzahnVar.zzf());
                }
                lVar2 = firebaseAuth.f15833f;
                if (lVar2 == null) {
                    if (firebaseAuth.f15842r == null) {
                        i iVar = firebaseAuth.f15828a;
                        G.g(iVar);
                        firebaseAuth.f15842r = new r(iVar);
                    }
                    r rVar = firebaseAuth.f15842r;
                    zzahn zzahnVar2 = ((C1815e) lVar2).f22069a;
                    rVar.getClass();
                    if (zzahnVar2 == null) {
                        return;
                    }
                    long zza = zzahnVar2.zza();
                    if (zza <= 0) {
                        zza = 3600;
                    }
                    long zzb = (zza * 1000) + zzahnVar2.zzb();
                    C1818h c1818h = rVar.f22106b;
                    c1818h.f22089a = zzb;
                    c1818h.f22090b = -1L;
                    if (rVar.f22105a > 0 && !rVar.f22107c) {
                        z13 = z14;
                    }
                    if (z13) {
                        rVar.f22106b.a();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        firebaseAuth.f15833f = lVar;
        if (z8) {
        }
        if (z11) {
        }
        if (z12) {
        }
        if (z8) {
        }
        lVar2 = firebaseAuth.f15833f;
        if (lVar2 == null) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o8.b] */
    public static void e(FirebaseAuth firebaseAuth, l lVar) {
        if (lVar != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + ((C1815e) lVar).f22070b.f22060a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        String zzc = lVar != null ? ((C1815e) lVar).f22069a.zzc() : null;
        ?? obj = new Object();
        obj.f22125a = zzc;
        firebaseAuth.f15845u.execute(new hc.i(5, firebaseAuth, obj, false));
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) i.e().c(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(i iVar) {
        return (FirebaseAuth) iVar.c(FirebaseAuth.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [n7.f, o7.t] */
    public final Task a(boolean z8) {
        l lVar = this.f15833f;
        if (lVar == null) {
            return Tasks.forException(zzaei.zza(new Status(17495, null, null, null)));
        }
        zzahn zzahnVar = ((C1815e) lVar).f22069a;
        if (zzahnVar.zzg() && !z8) {
            return Tasks.forResult(AbstractC1822l.a(zzahnVar.zzc()));
        }
        return this.f15832e.zza(this.f15828a, lVar, zzahnVar.zzd(), (t) new C1715f(this, 1));
    }

    public final void b() {
        o oVar = this.f15838n;
        G.g(oVar);
        l lVar = this.f15833f;
        if (lVar != null) {
            ((SharedPreferences) oVar.f23859d).edit().remove(c.t("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((C1815e) lVar).f22070b.f22060a)).apply();
            this.f15833f = null;
        }
        ((SharedPreferences) oVar.f23859d).edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        e(this, null);
        c(this, null);
        r rVar = this.f15842r;
        if (rVar != null) {
            C1818h c1818h = rVar.f22106b;
            c1818h.f22092d.removeCallbacks(c1818h.f22093e);
        }
    }
}
