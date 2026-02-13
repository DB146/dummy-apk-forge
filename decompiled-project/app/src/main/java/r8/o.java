package r8;

import A0.C0005a;
import A9.v3;
import B0.C0170c0;
import Eb.D;
import F.C0259c;
import L7.C0385e;
import M1.C0386a;
import M1.N;
import Y5.C0613f0;
import Y5.C0646q0;
import Y5.F;
import Y5.W;
import android.app.Notification;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import cc.B;
import cc.E;
import cc.InterfaceC0937i0;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.internal.p002firebaseauthapi.zzbe;
import com.google.android.gms.internal.p002firebaseauthapi.zzcn;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import h3.H;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import o4.C1794h;
import o4.J;
import o7.C1813c;
import o7.C1815e;
import o7.C1816f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.C2046I;
import u.C2053f;
import u.Q;

/* loaded from: classes.dex */
public final class o implements R7.e {

    /* renamed from: f, reason: collision with root package name */
    public static o f23855f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23856a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23857b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23858c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23859d;

    /* renamed from: e, reason: collision with root package name */
    public Object f23860e;

    public o(int i7) {
        this.f23856a = i7;
        switch (i7) {
            case 1:
                v3 v3Var = new v3();
                this.f23857b = v3Var;
                v3 v3Var2 = new v3();
                this.f23858c = v3Var2;
                this.f23859d = v3Var2;
                this.f23860e = v3Var;
                return;
            case 2:
                this.f23857b = new Object();
                long[] jArr = Q.f24633a;
                this.f23858c = new C2046I();
                return;
            default:
                this.f23857b = null;
                this.f23858c = null;
                this.f23859d = null;
                this.f23860e = new ArrayDeque();
                return;
        }
    }

    public /* synthetic */ o(int i7, boolean z8) {
        this.f23856a = i7;
    }

    public o(Q7.e eVar) {
        T7.q qVar;
        T7.q d10;
        this.f23856a = 4;
        T7.l lVar = eVar.f8684e;
        this.f23857b = new R7.b(lVar, 0);
        this.f23858c = lVar;
        if (!eVar.b()) {
            qVar = T7.q.f9357c;
        } else {
            if (!eVar.b()) {
                throw new IllegalArgumentException("Cannot get index start name if start has not been set");
            }
            T7.c cVar = eVar.f8681b;
            cVar = cVar == null ? T7.c.f9328b : cVar;
            T7.l lVar2 = eVar.f8684e;
            if (!eVar.b()) {
                throw new IllegalArgumentException("Cannot get index start value if start has not been set");
            }
            qVar = lVar2.c(cVar, eVar.f8680a);
        }
        this.f23859d = qVar;
        T7.s sVar = eVar.f8682c;
        if (sVar == null) {
            d10 = eVar.f8684e.d();
        } else {
            if (sVar == null) {
                throw new IllegalArgumentException("Cannot get index end name if start has not been set");
            }
            T7.c cVar2 = eVar.f8683d;
            cVar2 = cVar2 == null ? T7.c.f9329c : cVar2;
            T7.l lVar3 = eVar.f8684e;
            if (sVar == null) {
                throw new IllegalArgumentException("Cannot get index end value if start has not been set");
            }
            d10 = lVar3.c(cVar2, sVar);
        }
        this.f23860e = d10;
    }

    public o(C0613f0 c0613f0, String str) {
        this.f23856a = 5;
        Objects.requireNonNull(c0613f0);
        this.f23860e = c0613f0;
        G.d(str);
        this.f23857b = str;
        this.f23858c = new Bundle();
    }

    public o(Context context) {
        this.f23856a = 9;
        this.f23857b = context;
        this.f23858c = C1794h.f21846c;
        this.f23860e = J.f21751a;
    }

    public o(E e2, C0005a c0005a, N n6) {
        this.f23856a = 3;
        this.f23857b = e2;
        this.f23858c = n6;
        this.f23859d = Q5.e.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, 6);
        this.f23860e = new C0386a();
        InterfaceC0937i0 interfaceC0937i0 = (InterfaceC0937i0) e2.l().get(B.f14467b);
        if (interfaceC0937i0 != null) {
            interfaceC0937i0.invokeOnCompletion(new C0170c0(10, c0005a, this));
        }
    }

    public o(Matcher matcher, String input) {
        this.f23856a = 6;
        kotlin.jvm.internal.l.e(input, "input");
        this.f23858c = matcher;
        this.f23857b = input;
        this.f23859d = new V.k(this, 1);
    }

    public o(k1.q qVar) {
        int i7;
        ArrayList arrayList;
        int i10;
        this.f23856a = 8;
        new ArrayList();
        this.f23860e = new Bundle();
        this.f23859d = qVar;
        Context context = qVar.f18785a;
        this.f23857b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f23858c = k1.r.a(context, qVar.f18798q);
        } else {
            this.f23858c = new Notification.Builder(qVar.f18785a);
        }
        Notification notification = qVar.f18800s;
        int i11 = 0;
        ((Notification.Builder) this.f23858c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(qVar.f18789e).setContentText(qVar.f18790f).setContentInfo(null).setContentIntent(qVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(qVar.f18792i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f23858c;
        IconCompat iconCompat = qVar.f18791h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.g(context));
        ((Notification.Builder) this.f23858c).setSubText(null).setUsesChronometer(false).setPriority(qVar.j);
        Iterator it = qVar.f18786b.iterator();
        while (it.hasNext()) {
            k1.k kVar = (k1.k) it.next();
            int i12 = Build.VERSION.SDK_INT;
            if (kVar.f18776b == null && (i10 = kVar.f18779e) != 0) {
                kVar.f18776b = IconCompat.b(i10);
            }
            IconCompat iconCompat2 = kVar.f18776b;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.g(null) : null, kVar.f18780f, kVar.g);
            Bundle bundle = kVar.f18775a;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            boolean z8 = kVar.f18777c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z8);
            builder2.setAllowGeneratedReplies(z8);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i12 >= 28) {
                k1.s.a(builder2);
            }
            if (i12 >= 29) {
                k1.g.d(builder2);
            }
            if (i12 >= 31) {
                k1.t.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", kVar.f18778d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f23858c).addAction(builder2.build());
        }
        Bundle bundle3 = qVar.f18795n;
        if (bundle3 != null) {
            ((Bundle) this.f23860e).putAll(bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f23858c).setShowWhen(qVar.k);
        ((Notification.Builder) this.f23858c).setLocalOnly(qVar.f18794m);
        ((Notification.Builder) this.f23858c).setGroup(null);
        ((Notification.Builder) this.f23858c).setSortKey(null);
        ((Notification.Builder) this.f23858c).setGroupSummary(false);
        ((Notification.Builder) this.f23858c).setCategory(null);
        ((Notification.Builder) this.f23858c).setColor(qVar.f18796o);
        ((Notification.Builder) this.f23858c).setVisibility(qVar.f18797p);
        ((Notification.Builder) this.f23858c).setPublicVersion(null);
        ((Notification.Builder) this.f23858c).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = qVar.f18801t;
        ArrayList arrayList3 = qVar.f18787c;
        if (i13 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    throw h3.o.j(it2);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C2053f c2053f = new C2053f(arrayList2.size() + arrayList.size());
                    c2053f.addAll(arrayList);
                    c2053f.addAll(arrayList2);
                    arrayList2 = new ArrayList(c2053f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) this.f23858c).addPerson((String) it3.next());
            }
        }
        ArrayList arrayList4 = qVar.f18788d;
        if (arrayList4.size() > 0) {
            if (qVar.f18795n == null) {
                qVar.f18795n = new Bundle();
            }
            Bundle bundle4 = qVar.f18795n.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                String num = Integer.toString(i14);
                k1.k kVar2 = (k1.k) arrayList4.get(i14);
                Bundle bundle7 = new Bundle();
                if (kVar2.f18776b == null && (i7 = kVar2.f18779e) != 0) {
                    kVar2.f18776b = IconCompat.b(i7);
                }
                IconCompat iconCompat3 = kVar2.f18776b;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i11);
                bundle7.putCharSequence("title", kVar2.f18780f);
                bundle7.putParcelable("actionIntent", kVar2.g);
                Bundle bundle8 = kVar2.f18775a;
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", kVar2.f18777c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", kVar2.f18778d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
                i14++;
                i11 = 0;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (qVar.f18795n == null) {
                qVar.f18795n = new Bundle();
            }
            qVar.f18795n.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f23860e).putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i15 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f23858c).setExtras(qVar.f18795n);
        ((Notification.Builder) this.f23858c).setRemoteInputHistory(null);
        if (i15 >= 26) {
            k1.r.b((Notification.Builder) this.f23858c);
            k1.r.d((Notification.Builder) this.f23858c);
            k1.r.e((Notification.Builder) this.f23858c);
            k1.r.f((Notification.Builder) this.f23858c);
            k1.r.c((Notification.Builder) this.f23858c);
            if (!TextUtils.isEmpty(qVar.f18798q)) {
                ((Notification.Builder) this.f23858c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                throw h3.o.j(it4);
            }
        }
        if (i15 >= 29) {
            k1.g.b((Notification.Builder) this.f23858c, qVar.f18799r);
            k1.g.c((Notification.Builder) this.f23858c);
        }
    }

    public static synchronized o f() {
        o oVar;
        synchronized (o.class) {
            try {
                if (f23855f == null) {
                    f23855f = new o(0);
                }
                oVar = f23855f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, F.c] */
    public C0259c a(Object obj) {
        C0259c c0259c = (C0259c) this.f23860e;
        if (this.f23859d == obj && c0259c != null) {
            return c0259c;
        }
        C2046I c2046i = (C2046I) this.f23858c;
        Object g = c2046i.g(obj);
        Object obj2 = g;
        if (g == null) {
            ?? obj3 = new Object();
            C0259c c0259c2 = (C0259c) this.f23857b;
            obj3.f3965a = c0259c2.f3965a;
            obj3.f3966b = c0259c2.f3966b;
            c2046i.l(obj, obj3);
            obj2 = obj3;
        }
        C0259c c0259c3 = (C0259c) obj2;
        this.f23859d = obj;
        this.f23860e = c0259c3;
        return c0259c3;
    }

    @Override // R7.e
    public T7.m b(T7.m mVar, T7.c cVar, T7.s sVar, C0385e c0385e, R7.d dVar, R7.a aVar) {
        if (!l(new T7.q(cVar, sVar))) {
            sVar = T7.k.f9348e;
        }
        return ((R7.b) this.f23857b).b(mVar, cVar, sVar, c0385e, dVar, aVar);
    }

    @Override // R7.e
    public R7.b c() {
        return (R7.b) this.f23857b;
    }

    @Override // R7.e
    public T7.m d(T7.m mVar, T7.m mVar2, R7.a aVar) {
        T7.m mVar3;
        if (mVar2.f9350a.p()) {
            mVar3 = new T7.m(T7.k.f9348e, (T7.l) this.f23858c);
        } else {
            T7.m mVar4 = new T7.m(mVar2.f9350a.s(T7.k.f9348e), mVar2.f9352c, mVar2.f9351b);
            Iterator it = mVar2.iterator();
            mVar3 = mVar4;
            while (it.hasNext()) {
                T7.q qVar = (T7.q) it.next();
                if (!l(qVar)) {
                    mVar3 = mVar3.i(qVar.f9359a, T7.k.f9348e);
                }
            }
        }
        ((R7.b) this.f23857b).d(mVar, mVar3, aVar);
        return mVar3;
    }

    public List e() {
        if (((D) this.f23860e) == null) {
            this.f23860e = new D(this);
        }
        D d10 = (D) this.f23860e;
        kotlin.jvm.internal.l.b(d10);
        return d10;
    }

    @Override // R7.e
    public T7.m g(T7.m mVar, T7.s sVar) {
        return mVar;
    }

    @Override // R7.e
    public T7.l getIndex() {
        return (T7.l) this.f23858c;
    }

    public Xb.g h() {
        Matcher matcher = (Matcher) this.f23858c;
        return H.I(matcher.start(), matcher.end());
    }

    public boolean i(Context context) {
        if (((Boolean) this.f23859d) == null) {
            this.f23859d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f23858c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f23859d).booleanValue();
    }

    public boolean j(Context context) {
        if (((Boolean) this.f23858c) == null) {
            this.f23858c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f23858c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f23858c).booleanValue();
    }

    @Override // R7.e
    public boolean k() {
        return true;
    }

    public boolean l(T7.q qVar) {
        T7.l lVar = (T7.l) this.f23858c;
        return lVar.compare((T7.q) this.f23859d, qVar) <= 0 && lVar.compare(qVar, (T7.q) this.f23860e) <= 0;
    }

    public o m() {
        Matcher matcher = (Matcher) this.f23858c;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        String str = (String) this.f23857b;
        if (end > str.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(str);
        kotlin.jvm.internal.l.d(matcher2, "matcher(...)");
        if (matcher2.find(end)) {
            return new o(matcher2, str);
        }
        return null;
    }

    public Bundle n() {
        char c10;
        if (((Bundle) this.f23859d) == null) {
            C0613f0 c0613f0 = (C0613f0) this.f23860e;
            SharedPreferences N10 = c0613f0.N();
            C0646q0 c0646q0 = (C0646q0) c0613f0.f3094a;
            String string = N10.getString((String) this.f23857b, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i7);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c10 = 1;
                                }
                                c10 = 65535;
                            } else if (hashCode == 108) {
                                if (string3.equals("l")) {
                                    c10 = 2;
                                }
                                c10 = 65535;
                            } else if (hashCode == 115) {
                                if (string3.equals("s")) {
                                    c10 = 0;
                                }
                                c10 = 65535;
                            } else if (hashCode != 3352) {
                                if (hashCode == 3445 && string3.equals("la")) {
                                    c10 = 4;
                                }
                                c10 = 65535;
                            } else {
                                if (string3.equals("ia")) {
                                    c10 = 3;
                                }
                                c10 = 65535;
                            }
                            if (c10 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c10 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (c10 == 3) {
                                zzql.zza();
                                if (c0646q0.f11910d.T(null, F.f11285Q0)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i10 = 0; i10 < length; i10++) {
                                        iArr[i10] = jSONArray2.optInt(i10);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (c10 != 4) {
                                W w10 = c0646q0.f11912f;
                                C0646q0.l(w10);
                                w10.f11577f.b(string3, "Unrecognized persisted bundle type. Type");
                            } else {
                                zzql.zza();
                                if (c0646q0.f11910d.T(null, F.f11285Q0)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i11 = 0; i11 < length2; i11++) {
                                        jArr[i11] = jSONArray3.optLong(i11);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            W w11 = c0646q0.f11912f;
                            C0646q0.l(w11);
                            w11.f11577f.a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f23859d = bundle;
                } catch (JSONException unused2) {
                    W w12 = c0646q0.f11912f;
                    C0646q0.l(w12);
                    w12.f11577f.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f23859d) == null) {
                this.f23859d = (Bundle) this.f23858c;
            }
        }
        Bundle bundle2 = (Bundle) this.f23859d;
        G.g(bundle2);
        return new Bundle(bundle2);
    }

    public String o(String str) {
        String str2;
        String string = ((SharedPreferences) this.f23859d).getString(str, null);
        if (string == null) {
            return null;
        }
        if (!string.startsWith("ENCRYPTED:")) {
            return string;
        }
        o7.q a9 = o7.q.a((Context) this.f23858c, (String) this.f23857b);
        String substring = string.substring(10);
        a9.getClass();
        G.g(substring);
        zzmy zzmyVar = a9.f22104b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzbe) a9.f22104b.zza().zza(zzcn.zza(), zzbe.class)).zza(Base64.decode(substring, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e2) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e2.getMessage());
            return null;
        }
    }

    public C1815e p(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        C1816f a9;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z8 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i7 = 0; i7 < length; i7++) {
                arrayList.add(C1813c.t(jSONArray3.getString(i7)));
            }
            C1815e c1815e = new C1815e(Y6.i.f(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzahn zzb = zzahn.zzb(string);
                G.g(zzb);
                c1815e.f22069a = zzb;
            }
            if (!z8) {
                c1815e.f22076v = Boolean.FALSE;
            }
            c1815e.f22075u = str;
            if (jSONObject.has("userMetadata") && (a9 = C1816f.a(jSONObject.getJSONObject("userMetadata"))) != null) {
                c1815e.f22077w = a9;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i10));
                    String optString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(optString) ? n7.v.C(jSONObject2) : Objects.equals(optString, "totp") ? n7.y.C(jSONObject2) : null);
                }
                c1815e.D(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList3.add(n7.E.z(new JSONObject(jSONArray.getString(i11))));
                }
                c1815e.f22068A = arrayList3;
            }
            return c1815e;
        } catch (zzaag e2) {
            e = e2;
            Log.wtf(((I5.a) this.f23860e).f5230a, e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e10) {
            e = e10;
            Log.wtf(((I5.a) this.f23860e).f5230a, e);
            return null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            Log.wtf(((I5.a) this.f23860e).f5230a, e);
            return null;
        } catch (JSONException e12) {
            e = e12;
            Log.wtf(((I5.a) this.f23860e).f5230a, e);
            return null;
        }
    }

    public void q(String str, String str2) {
        String encodeToString;
        o7.q a9 = o7.q.a((Context) this.f23858c, (String) this.f23857b);
        a9.getClass();
        G.g(str2);
        zzmy zzmyVar = a9.f22104b;
        String str3 = null;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        } else {
            try {
                synchronized (zzmyVar) {
                    encodeToString = Base64.encodeToString(((zzbe) a9.f22104b.zza().zza(zzcn.zza(), zzbe.class)).zzb(str2.getBytes(StandardCharsets.UTF_8), null), 2);
                }
                str3 = encodeToString;
            } catch (GeneralSecurityException e2) {
                Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e2.getMessage());
            }
        }
        if (str3 != null) {
            ((SharedPreferences) this.f23859d).edit().putString(str, "ENCRYPTED:".concat(str3)).apply();
        }
    }

    public void r(Bundle bundle) {
        Iterator<String> it;
        JSONObject jSONObject;
        boolean T10;
        W w10;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C0613f0 c0613f0 = (C0613f0) this.f23860e;
        SharedPreferences.Editor edit = c0613f0.N().edit();
        int size = bundle2.size();
        String str = (String) this.f23857b;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Object obj = bundle2.get(next);
                if (obj != null) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                        zzql.zza();
                        C0646q0 c0646q0 = (C0646q0) c0613f0.f3094a;
                        T10 = c0646q0.f11910d.T(null, F.f11285Q0);
                        it = it2;
                        w10 = c0646q0.f11912f;
                    } catch (JSONException e2) {
                        e = e2;
                        it = it2;
                    }
                    if (T10) {
                        try {
                        } catch (JSONException e10) {
                            e = e10;
                            W w11 = ((C0646q0) c0613f0.f3094a).f11912f;
                            C0646q0.l(w11);
                            w11.f11577f.b(e, "Cannot serialize bundle value to SharedPreferences");
                            it2 = it;
                        }
                        if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            C0646q0.l(w10);
                            w10.f11577f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                        it2 = it;
                    } else {
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            C0646q0.l(w10);
                            w10.f11577f.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                        it2 = it;
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f23859d = bundle2;
    }

    public String toString() {
        switch (this.f23856a) {
            case 1:
                return "horizontal=" + ((v3) this.f23858c) + "; vertical=" + ((v3) this.f23857b);
            default:
                return super.toString();
        }
    }
}
