package Y5;

import A0.C0005a;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.zzcu;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class M1 extends AbstractC0659x0 {

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f11454w = {"firebase_", "google_", "ga_"};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f11455x = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f11456c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f11457d;

    /* renamed from: e, reason: collision with root package name */
    public int f11458e;

    /* renamed from: f, reason: collision with root package name */
    public D2.d f11459f;

    /* renamed from: u, reason: collision with root package name */
    public Boolean f11460u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f11461v;

    public M1(C0646q0 c0646q0) {
        super(c0646q0);
        this.f11461v = null;
        this.f11457d = new AtomicLong(0L);
    }

    public static void A0(Z0 z02, Bundle bundle, boolean z8) {
        if (bundle != null && z02 != null) {
            if (!bundle.containsKey("_sc") || z8) {
                String str = z02.f11611a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = z02.f11612b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", z02.f11613c);
                return;
            }
            z8 = false;
        }
        if (bundle != null && z02 == null && z8) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean C0(int i7, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i7);
        return true;
    }

    public static boolean H0(String str) {
        com.google.android.gms.common.internal.G.d(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String O(String str, int i7, boolean z8) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i7) {
            return str;
        }
        if (z8) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i7))).concat("...");
        }
        return null;
    }

    public static boolean R0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void Z(R7.b bVar, String str, int i7, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        C0(i7, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i7 == 6 || i7 == 7 || i7 == 2) {
            bundle.putLong("_el", i10);
        }
        bVar.x(str, "_err", bundle);
    }

    public static MessageDigest a0() {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long b0(byte[] bArr) {
        com.google.android.gms.common.internal.G.g(bArr);
        int length = bArr.length;
        int i7 = 0;
        com.google.android.gms.common.internal.G.j(length > 0);
        long j = 0;
        for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
            j += (bArr[i10] & 255) << i7;
            i7 += 8;
        }
        return j;
    }

    public static boolean c0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean f0(String str) {
        String str2 = (String) F.f11346r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean h0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean i0(String str, String[] strArr) {
        com.google.android.gms.common.internal.G.g(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] n0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList y0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0609e c0609e = (C0609e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c0609e.f11711a);
            bundle.putString("origin", c0609e.f11712b);
            bundle.putLong("creation_timestamp", c0609e.f11714d);
            bundle.putString("name", c0609e.f11713c.f11429b);
            Object t5 = c0609e.f11713c.t();
            com.google.android.gms.common.internal.G.g(t5);
            D0.d(bundle, t5);
            bundle.putBoolean("active", c0609e.f11715e);
            String str = c0609e.f11716f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C0648s c0648s = c0609e.f11717u;
            if (c0648s != null) {
                bundle.putString("timed_out_event_name", c0648s.f11929a);
                r rVar = c0648s.f11930b;
                if (rVar != null) {
                    bundle.putBundle("timed_out_event_params", rVar.D());
                }
            }
            bundle.putLong("trigger_timeout", c0609e.f11718v);
            C0648s c0648s2 = c0609e.f11719w;
            if (c0648s2 != null) {
                bundle.putString("triggered_event_name", c0648s2.f11929a);
                r rVar2 = c0648s2.f11930b;
                if (rVar2 != null) {
                    bundle.putBundle("triggered_event_params", rVar2.D());
                }
            }
            bundle.putLong("triggered_timestamp", c0609e.f11713c.f11430c);
            bundle.putLong("time_to_live", c0609e.f11720x);
            C0648s c0648s3 = c0609e.f11721y;
            if (c0648s3 != null) {
                bundle.putString("expired_event_name", c0648s3.f11929a);
                r rVar3 = c0648s3.f11930b;
                if (rVar3 != null) {
                    bundle.putBundle("expired_event_params", rVar3.D());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean z0(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.G.g(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final String B0() {
        byte[] bArr = new byte[16];
        G0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object D0(int i7, Object obj, boolean z8, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return O(obj.toString(), i7, z8);
        }
        if (!z10 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle k02 = k0((Bundle) parcelable);
                if (!k02.isEmpty()) {
                    arrayList.add(k02);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int E0(String str) {
        boolean equals = "_ldl".equals(str);
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (equals) {
            c0646q0.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            c0646q0.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            c0646q0.getClass();
            return 100;
        }
        c0646q0.getClass();
        return 36;
    }

    public final long F0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f11457d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f11457d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long nanoTime = System.nanoTime();
            ((C0646q0) this.f3094a).f11917y.getClass();
            long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
            int i7 = this.f11458e + 1;
            this.f11458e = i7;
            j = nextLong + i7;
        }
        return j;
    }

    public final SecureRandom G0() {
        J();
        if (this.f11456c == null) {
            this.f11456c = new SecureRandom();
        }
        return this.f11456c;
    }

    public final Bundle I0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = uri.getQueryParameter("gbraid");
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            for (String str11 : uri.getQueryParameterNames()) {
                if (str11.startsWith("gad_")) {
                    String queryParameter10 = uri.getQueryParameter(str11);
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString(str11, queryParameter10);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(e2, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final boolean J0(String str, String str2) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (str2 == null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11579v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11579v.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            W w12 = c0646q0.f11912f;
            C0646q0.l(w12);
            w12.f11579v.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                W w13 = c0646q0.f11912f;
                C0646q0.l(w13);
                w13.f11579v.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    @Override // Y5.AbstractC0659x0
    public final boolean K() {
        return true;
    }

    public final boolean K0(String str, String str2) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (str2 == null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11579v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11579v.b(str, "Name is required and can't be empty. Type");
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            if (codePointAt != 95) {
                W w12 = c0646q0.f11912f;
                C0646q0.l(w12);
                w12.f11579v.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            codePointAt = 95;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                W w13 = c0646q0.f11912f;
                C0646q0.l(w13);
                w13.f11579v.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    public final boolean L0(String str, String[] strArr, String[] strArr2, String str2) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (str2 == null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11579v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        String[] strArr3 = f11454w;
        for (int i7 = 0; i7 < 3; i7++) {
            if (str2.startsWith(strArr3[i7])) {
                W w11 = c0646q0.f11912f;
                C0646q0.l(w11);
                w11.f11579v.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !i0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && i0(str2, strArr2)) {
            return true;
        }
        W w12 = c0646q0.f11912f;
        C0646q0.l(w12);
        w12.f11579v.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean M0(int i7, String str, String str2) {
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (str2 == null) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11579v.b(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i7) {
            return true;
        }
        W w11 = c0646q0.f11912f;
        C0646q0.l(w11);
        w11.f11579v.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i7), str2);
        return false;
    }

    public final boolean N(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (isEmpty) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11579v.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        com.google.android.gms.common.internal.G.g(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        W w11 = c0646q0.f11912f;
        C0646q0.l(w11);
        w11.f11579v.b(W.R(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final int N0(String str) {
        if (!K0("event", str)) {
            return 2;
        }
        if (!L0("event", D0.f11235a, D0.f11236b, str)) {
            return 13;
        }
        ((C0646q0) this.f3094a).getClass();
        return !M0(40, "event", str) ? 2 : 0;
    }

    public final int O0(String str) {
        if (!K0("user property", str)) {
            return 6;
        }
        if (!L0("user property", D0.f11242i, null, str)) {
            return 15;
        }
        ((C0646q0) this.f3094a).getClass();
        return !M0(24, "user property", str) ? 6 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(String str, String str2, Object obj, Bundle bundle, List list, boolean z8, boolean z10) {
        int i7;
        int i10;
        int size;
        J();
        boolean R02 = R0(obj);
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (R02) {
            if (!z10) {
                return 21;
            }
            if (!i0(str2, D0.g)) {
                return 20;
            }
            C0632l1 o10 = c0646q0.o();
            o10.J();
            o10.K();
            if (o10.Q()) {
                M1 m12 = ((C0646q0) o10.f3094a).f11915w;
                C0646q0.j(m12);
                if (m12.p0() < 200900) {
                    return 25;
                }
            }
            boolean z11 = obj instanceof Parcelable[];
            if (z11) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                W w10 = c0646q0.f11912f;
                C0646q0.l(w10);
                w10.f11582y.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                if (z11) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i7 = 17;
                i10 = 500;
                if (!h0(str) || h0(str2)) {
                    c0646q0.f11910d.getClass();
                    i10 = Math.max(500, 256);
                } else {
                    c0646q0.f11910d.getClass();
                }
                if (!S0("param", str2, i10, obj)) {
                    return i7;
                }
                if (!z10) {
                    return 4;
                }
                if (obj instanceof Bundle) {
                    T0(str, str2, (Bundle) obj, list, z8);
                } else if (obj instanceof Parcelable[]) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (!(parcelable instanceof Bundle)) {
                            W w11 = c0646q0.f11912f;
                            C0646q0.l(w11);
                            w11.f11582y.c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                            return 4;
                        }
                        T0(str, str2, (Bundle) parcelable, list, z8);
                    }
                } else {
                    if (!(obj instanceof ArrayList)) {
                        return 4;
                    }
                    ArrayList arrayList2 = (ArrayList) obj;
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        Object obj2 = arrayList2.get(i11);
                        if (!(obj2 instanceof Bundle)) {
                            W w12 = c0646q0.f11912f;
                            C0646q0.l(w12);
                            w12.f11582y.c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                            return 4;
                        }
                        T0(str, str2, (Bundle) obj2, list, z8);
                    }
                }
                return i7;
            }
        }
        i7 = 0;
        i10 = 500;
        if (h0(str)) {
        }
        c0646q0.f11910d.getClass();
        i10 = Math.max(500, 256);
        if (!S0("param", str2, i10, obj)) {
        }
    }

    public final int P0(String str) {
        if (!J0("event param", str)) {
            return 3;
        }
        if (!L0("event param", null, null, str)) {
            return 14;
        }
        ((C0646q0) this.f3094a).getClass();
        return !M0(40, "event param", str) ? 3 : 0;
    }

    public final Object Q(Object obj, String str) {
        boolean equals = "_ev".equals(str);
        int i7 = 500;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (equals) {
            c0646q0.f11910d.getClass();
            return D0(Math.max(500, 256), obj, true, true);
        }
        if (h0(str)) {
            c0646q0.f11910d.getClass();
            i7 = Math.max(500, 256);
        } else {
            c0646q0.f11910d.getClass();
        }
        return D0(i7, obj, false, true);
    }

    public final int Q0(String str) {
        if (!K0("event param", str)) {
            return 3;
        }
        if (!L0("event param", null, null, str)) {
            return 14;
        }
        ((C0646q0) this.f3094a).getClass();
        return !M0(40, "event param", str) ? 3 : 0;
    }

    public final Bundle R(String str, Bundle bundle, List list, boolean z8) {
        int P02;
        int i7;
        List list2 = list;
        boolean i02 = i0(str, D0.f11238d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        M1 m12 = ((C0646q0) c0646q0.f11910d.f3094a).f11915w;
        C0646q0.j(m12);
        int i10 = m12.o0(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (list2 == null || !list2.contains(str2)) {
                P02 = !z8 ? P0(str2) : 0;
                if (P02 == 0) {
                    P02 = Q0(str2);
                }
            } else {
                P02 = 0;
            }
            if (P02 != 0) {
                V(bundle2, P02, str2, P02 == 3 ? str2 : null);
                bundle2.remove(str2);
                i7 = i10;
            } else {
                i7 = i10;
                int P10 = P(str, str2, bundle.get(str2), bundle2, list, z8, i02);
                if (P10 == 17) {
                    V(bundle2, 17, str2, Boolean.FALSE);
                } else if (P10 != 0 && !"_ev".equals(str2)) {
                    V(bundle2, P10, P10 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (H0(str2)) {
                    int i12 = i11 + 1;
                    if (i12 > i7) {
                        if (!c0646q0.f11910d.T(null, F.f11321f1) || !z10) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 37);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i7);
                            sb2.append(" params");
                            String sb3 = sb2.toString();
                            W w10 = c0646q0.f11912f;
                            C0646q0.l(w10);
                            Q q10 = c0646q0.f11916x;
                            w10.f11579v.c(sb3, q10.a(str), q10.e(bundle));
                        }
                        C0(5, bundle2);
                        bundle2.remove(str2);
                        z10 = true;
                    }
                    i11 = i12;
                    i10 = i7;
                    list2 = list;
                }
            }
            i10 = i7;
            list2 = list;
        }
        return bundle2;
    }

    public final void S(X x2, int i7) {
        Bundle bundle = (Bundle) x2.f11589e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z8 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (H0(str) && (i10 = i10 + 1) > i7) {
                C0646q0 c0646q0 = (C0646q0) this.f3094a;
                if (!c0646q0.f11910d.T(null, F.f11321f1) || !z8) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i7);
                    sb2.append(" params");
                    String sb3 = sb2.toString();
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    Q q10 = c0646q0.f11916x;
                    w10.f11579v.c(sb3, q10.a((String) x2.f11587c), q10.e(bundle));
                    C0(5, bundle);
                }
                bundle.remove(str);
                z8 = true;
            }
        }
    }

    public final boolean S0(String str, String str2, int i7, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i7) {
                W w10 = ((C0646q0) this.f3094a).f11912f;
                C0646q0.l(w10);
                w10.f11582y.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    public final void T(Parcelable[] parcelableArr, int i7) {
        com.google.android.gms.common.internal.G.g(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            boolean z8 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (H0(str) && !i0(str, D0.f11241h) && (i10 = i10 + 1) > i7) {
                    C0646q0 c0646q0 = (C0646q0) this.f3094a;
                    if (!c0646q0.f11910d.T(null, F.f11321f1) || !z8) {
                        W w10 = c0646q0.f11912f;
                        C0646q0.l(w10);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i7);
                        sb2.append(" item-scoped custom parameters");
                        String sb3 = sb2.toString();
                        Q q10 = c0646q0.f11916x;
                        w10.f11579v.c(sb3, q10.b(str), q10.e(bundle));
                    }
                    C0(28, bundle);
                    bundle.remove(str);
                    z8 = true;
                }
            }
        }
    }

    public final void T0(String str, String str2, Bundle bundle, List list, boolean z8) {
        int P02;
        int i7;
        W w10;
        String str3;
        int P10;
        if (bundle == null) {
            return;
        }
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        M1 m12 = ((C0646q0) c0646q0.f11910d.f3094a).f11915w;
        C0646q0.j(m12);
        int i10 = true != m12.o0(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list == null || !list.contains(str4)) {
                P02 = !z8 ? P0(str4) : 0;
                if (P02 == 0) {
                    P02 = Q0(str4);
                }
            } else {
                P02 = 0;
            }
            if (P02 != 0) {
                V(bundle, P02, str4, P02 == 3 ? str4 : null);
                bundle.remove(str4);
                i7 = i10;
            } else {
                boolean R02 = R0(bundle.get(str4));
                W w11 = c0646q0.f11912f;
                if (R02) {
                    C0646q0.l(w11);
                    w11.f11582y.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    P10 = 22;
                    w10 = w11;
                    str3 = str4;
                    i7 = i10;
                } else {
                    w10 = w11;
                    str3 = str4;
                    i7 = i10;
                    P10 = P(str, str4, bundle.get(str4), bundle, list, z8, false);
                }
                if (P10 != 0 && !"_ev".equals(str3)) {
                    V(bundle, P10, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (H0(str3) && !i0(str3, D0.f11241h)) {
                    int i12 = i11 + 1;
                    boolean o02 = o0(231100000);
                    Q q10 = c0646q0.f11916x;
                    if (o02) {
                        W w12 = w10;
                        if (i12 > i7) {
                            if (!c0646q0.f11910d.T(null, F.f11321f1) || !z10) {
                                C0646q0.l(w12);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 55);
                                sb2.append("Item can't contain more than ");
                                sb2.append(i7);
                                sb2.append(" item-scoped custom params");
                                w12.f11579v.c(sb2.toString(), q10.a(str), q10.e(bundle));
                            }
                            C0(28, bundle);
                            bundle.remove(str3);
                            i11 = i12;
                            i10 = i7;
                            z10 = true;
                        }
                    } else {
                        C0646q0.l(w10);
                        w10.f11579v.c("Item array not supported on client's version of Google Play Services (Android Only)", q10.a(str), q10.e(bundle));
                        C0(23, bundle);
                        bundle.remove(str3);
                    }
                    i11 = i12;
                }
            }
            i10 = i7;
        }
    }

    public final void U(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                M1 m12 = ((C0646q0) this.f3094a).f11915w;
                C0646q0.j(m12);
                m12.Y(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void V(Bundle bundle, int i7, String str, Object obj) {
        if (C0(i7, bundle)) {
            ((C0646q0) this.f3094a).getClass();
            bundle.putString("_ev", O(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int W(Object obj, String str) {
        return "_ldl".equals(str) ? S0("user property referrer", str, E0(str), obj) : S0("user property", str, E0(str), obj) ? 0 : 7;
    }

    public final Object X(Object obj, String str) {
        return "_ldl".equals(str) ? D0(E0(str), obj, true, false) : D0(E0(str), obj, false, false);
    }

    public final void Y(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11582y.c("Not putting event parameter. Invalid value type. name, type", c0646q0.f11916x.b(str), simpleName);
        }
    }

    public final D2.d d0() {
        E2.f fVar;
        Object obj;
        if (this.f11459f == null) {
            Context context = ((C0646q0) this.f3094a).f11907a;
            kotlin.jvm.internal.l.e(context, "context");
            StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
            int i7 = Build.VERSION.SDK_INT;
            B2.b bVar = B2.b.f2032a;
            sb2.append(i7 >= 33 ? bVar.a() : 0);
            Log.d("MeasurementManager", sb2.toString());
            if ((i7 >= 33 ? bVar.a() : 0) >= 5) {
                Object systemService = context.getSystemService((Class<Object>) E2.b.j());
                kotlin.jvm.internal.l.d(systemService, "context.getSystemService…ementManager::class.java)");
                fVar = new E2.f(E2.b.c(systemService));
            } else {
                B2.a aVar = B2.a.f2031a;
                if (((i7 == 31 || i7 == 32) ? aVar.a() : 0) >= 9) {
                    try {
                        obj = new C0005a(context, 8).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb3 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i10 = Build.VERSION.SDK_INT;
                        sb3.append((i10 == 31 || i10 == 32) ? aVar.a() : 0);
                        Log.d("MeasurementManager", sb3.toString());
                        obj = null;
                    }
                    fVar = (E2.f) obj;
                } else {
                    fVar = null;
                }
            }
            this.f11459f = fVar != null ? new D2.d(fVar) : null;
        }
        return this.f11459f;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e0() {
        int extensionVersion;
        int i7;
        long j;
        int extensionVersion2;
        Object e2;
        Integer num;
        J();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        N q10 = c0646q0.q();
        W w10 = c0646q0.f11912f;
        if (!f0(q10.P())) {
            return 0L;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z8 = false;
        Integer num2 = null;
        if (i10 < 30) {
            j = 4;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion < 4) {
                j = 8;
            } else {
                if (i10 >= 30) {
                    extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion2 > 3) {
                        i7 = SdkExtensions.getExtensionVersion(1000000);
                        j = i7 >= ((Integer) F.f11334l0.a(null)).intValue() ? 16L : 0L;
                    }
                }
                i7 = 0;
                if (i7 >= ((Integer) F.f11334l0.a(null)).intValue()) {
                }
            }
        }
        if (!g0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.f11460u == null) {
                D2.d d02 = d0();
                if (d02 != null) {
                    try {
                        num = (Integer) d02.b().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    z8 = true;
                                }
                            } catch (InterruptedException e10) {
                                e2 = e10;
                                num2 = num;
                                C0646q0.l(w10);
                                w10.f11580w.b(e2, "Measurement manager api exception");
                                this.f11460u = Boolean.FALSE;
                                num = num2;
                                C0646q0.l(w10);
                                w10.f11573B.b(num, "Measurement manager api status result");
                                z8 = this.f11460u.booleanValue();
                                if (!z8) {
                                }
                                if (j == 0) {
                                }
                            } catch (CancellationException e11) {
                                e2 = e11;
                                num2 = num;
                                C0646q0.l(w10);
                                w10.f11580w.b(e2, "Measurement manager api exception");
                                this.f11460u = Boolean.FALSE;
                                num = num2;
                                C0646q0.l(w10);
                                w10.f11573B.b(num, "Measurement manager api status result");
                                z8 = this.f11460u.booleanValue();
                                if (!z8) {
                                }
                                if (j == 0) {
                                }
                            } catch (ExecutionException e12) {
                                e2 = e12;
                                num2 = num;
                                C0646q0.l(w10);
                                w10.f11580w.b(e2, "Measurement manager api exception");
                                this.f11460u = Boolean.FALSE;
                                num = num2;
                                C0646q0.l(w10);
                                w10.f11573B.b(num, "Measurement manager api status result");
                                z8 = this.f11460u.booleanValue();
                                if (!z8) {
                                }
                                if (j == 0) {
                                }
                            } catch (TimeoutException e13) {
                                e2 = e13;
                                num2 = num;
                                C0646q0.l(w10);
                                w10.f11580w.b(e2, "Measurement manager api exception");
                                this.f11460u = Boolean.FALSE;
                                num = num2;
                                C0646q0.l(w10);
                                w10.f11573B.b(num, "Measurement manager api status result");
                                z8 = this.f11460u.booleanValue();
                                if (!z8) {
                                }
                                if (j == 0) {
                                }
                            }
                        }
                        this.f11460u = Boolean.valueOf(z8);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e14) {
                        e2 = e14;
                    }
                    C0646q0.l(w10);
                    w10.f11573B.b(num, "Measurement manager api status result");
                }
                if (!z8) {
                    j = 64;
                }
            }
            z8 = this.f11460u.booleanValue();
            if (!z8) {
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public final boolean g0(String str) {
        J();
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        if (O5.c.a(c0646q0.f11907a).f3530b.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        W w10 = c0646q0.f11912f;
        C0646q0.l(w10);
        w10.f11572A.b(str, "Permission not granted");
        return false;
    }

    public final boolean j0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C0646q0) this.f3094a).f11910d.N("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle k0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object Q3 = Q(bundle.get(str), str);
                if (Q3 == null) {
                    C0646q0 c0646q0 = (C0646q0) this.f3094a;
                    W w10 = c0646q0.f11912f;
                    C0646q0.l(w10);
                    w10.f11582y.b(c0646q0.f11916x.b(str), "Param value can't be null");
                } else {
                    Y(bundle2, str, Q3);
                }
            }
        }
        return bundle2;
    }

    public final C0648s l0(String str, Bundle bundle, String str2, long j, boolean z8) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (N0(str) != 0) {
            C0646q0 c0646q0 = (C0646q0) this.f3094a;
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.b(c0646q0.f11916x.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle R10 = R(str, bundle2, Collections.singletonList("_o"), true);
        if (z8) {
            R10 = k0(R10);
        }
        com.google.android.gms.common.internal.G.g(R10);
        return new C0648s(str, new r(R10), str2, j);
    }

    public final boolean m0(Context context, String str) {
        Signature[] signatureArr;
        C0646q0 c0646q0 = (C0646q0) this.f3094a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo h10 = O5.c.a(context).h(64, str);
            if (h10 == null || (signatureArr = h10.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e2) {
            W w10 = c0646q0.f11912f;
            C0646q0.l(w10);
            w10.f11577f.b(e2, "Package name not found");
            return true;
        } catch (CertificateException e10) {
            W w11 = c0646q0.f11912f;
            C0646q0.l(w11);
            w11.f11577f.b(e10, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean o0(int i7) {
        Boolean bool = ((C0646q0) this.f3094a).o().f11816e;
        if (p0() < i7 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int p0() {
        if (this.f11461v == null) {
            F5.f fVar = F5.f.f4100b;
            Context context = ((C0646q0) this.f3094a).f11907a;
            fVar.getClass();
            this.f11461v = Integer.valueOf(F5.f.a(context) / 1000);
        }
        return this.f11461v.intValue();
    }

    public final void q0(Bundle bundle, long j) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(Long.valueOf(j10), "Params already contained engagement");
        } else {
            j10 = 0;
        }
        bundle.putLong("_et", j + j10);
    }

    public final void r0(String str, zzcu zzcuVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(e2, "Error returning string value to wrapper");
        }
    }

    public final void s0(zzcu zzcuVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(e2, "Error returning long value to wrapper");
        }
    }

    public final void t0(zzcu zzcuVar, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i7);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(e2, "Error returning int value to wrapper");
        }
    }

    public final void u0(zzcu zzcuVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(e2, "Error returning byte array to wrapper");
        }
    }

    public final void v0(zzcu zzcuVar, boolean z8) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z8);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(e2, "Error returning boolean value to wrapper");
        }
    }

    public final void w0(zzcu zzcuVar, Bundle bundle) {
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(e2, "Error returning bundle value to wrapper");
        }
    }

    public final void x0(zzcu zzcuVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            W w10 = ((C0646q0) this.f3094a).f11912f;
            C0646q0.l(w10);
            w10.f11580w.b(e2, "Error returning bundle list to wrapper");
        }
    }
}
