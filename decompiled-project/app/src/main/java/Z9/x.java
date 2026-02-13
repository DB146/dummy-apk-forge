package Z9;

import A9.Y2;
import A9.Z2;
import A9.a3;
import B0.AbstractC0187l;
import P4.C0463k;
import P4.Y;
import a.AbstractC0672a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bc.C0849a;
import c7.C0914c;
import c7.InterfaceC0913b;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import i2.C1312U;
import ia.C1358d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import m4.C1586o0;
import n5.AbstractC1705a;
import r7.C1948d;
import s4.C1979g;
import y.S;

/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12324a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f12325b = 0;

    public static final void E(String key) {
        kotlin.jvm.internal.l.e(key, "key");
        throw new IllegalArgumentException(S.b("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void F(Intent intent) {
        int parseInt;
        int i7;
        String string;
        String string2;
        Object[] objArr;
        String string3;
        String string4;
        long parseLong;
        String str;
        String str2;
        if (S(intent)) {
            G("_nr", intent.getExtras());
        }
        int i10 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : j()) {
            Y3.f fVar = (Y3.f) FirebaseMessaging.f15862l.get();
            if (fVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            s8.d dVar = null;
            r4 = null;
            String str3 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    i7 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            Y6.i e2 = Y6.i.e();
                            Object obj2 = k8.d.f19035m;
                            string = (String) Tasks.await(((k8.d) e2.c(k8.e.class)).c());
                        } catch (InterruptedException | ExecutionException e10) {
                            throw new RuntimeException(e10);
                        }
                    }
                    String str4 = string;
                    Y6.i e11 = Y6.i.e();
                    e11.b();
                    String packageName = e11.f12041a.getPackageName();
                    s8.b bVar = !C1358d.p(extras) ? s8.b.DISPLAY_NOTIFICATION : s8.b.DATA_MESSAGE;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        objArr = 2;
                        if (objArr == 2) {
                            i10 = 5;
                        } else if (objArr == 1) {
                            i10 = 10;
                        }
                        int i11 = i10;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        String str5 = string3 != null ? string3 : "";
                        string4 = extras.getString("from");
                        if (string4 != null && string4.startsWith("/topics/")) {
                            str3 = string4;
                        }
                        String str6 = str3 != null ? str3 : "";
                        String string5 = extras.getString("collapse_key");
                        String str7 = string5 != null ? string5 : "";
                        String string6 = extras.getString("google.c.a.m_l");
                        String str8 = string6 != null ? string6 : "";
                        String string7 = extras.getString("google.c.a.c_l");
                        String str9 = string7 != null ? string7 : "";
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e12) {
                                Log.w("FirebaseMessaging", "error parsing project number", e12);
                            }
                            dVar = new s8.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i11, i7, str6, str8, str9);
                        }
                        Y6.i e13 = Y6.i.e();
                        e13.b();
                        Y6.m mVar = e13.f12043c;
                        str = mVar.f12058e;
                        if (str != null) {
                            try {
                                parseLong = Long.parseLong(str);
                            } catch (NumberFormatException e14) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e14);
                            }
                            dVar = new s8.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i11, i7, str6, str8, str9);
                        }
                        e13.b();
                        str2 = mVar.f12055b;
                        if (str2.startsWith("1:")) {
                            String[] split = str2.split(":");
                            if (split.length >= 2) {
                                String str10 = split[1];
                                if (!str10.isEmpty()) {
                                    try {
                                        parseLong = Long.parseLong(str10);
                                    } catch (NumberFormatException e15) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e15);
                                    }
                                }
                            }
                            parseLong = 0;
                        } else {
                            try {
                                parseLong = Long.parseLong(str2);
                            } catch (NumberFormatException e16) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e16);
                            }
                        }
                        dVar = new s8.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i11, i7, str6, str8, str9);
                    }
                    if ("high".equals(string2)) {
                        if (!"normal".equals(string2)) {
                            objArr = 0;
                        }
                        objArr = 2;
                    } else {
                        objArr = 1;
                    }
                    if (objArr == 2) {
                    }
                    int i112 = i10;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 != null) {
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                        str3 = string4;
                    }
                    if (str3 != null) {
                    }
                    String string52 = extras.getString("collapse_key");
                    if (string52 != null) {
                    }
                    String string62 = extras.getString("google.c.a.m_l");
                    if (string62 != null) {
                    }
                    String string72 = extras.getString("google.c.a.c_l");
                    if (string72 != null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    Y6.i e132 = Y6.i.e();
                    e132.b();
                    Y6.m mVar2 = e132.f12043c;
                    str = mVar2.f12058e;
                    if (str != null) {
                    }
                    e132.b();
                    str2 = mVar2.f12055b;
                    if (str2.startsWith("1:")) {
                    }
                    dVar = new s8.d(parseLong > 0 ? parseLong : 0L, str5, str4, bVar, packageName, str7, i112, i7, str6, str8, str9);
                }
                i7 = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str42 = string;
                Y6.i e112 = Y6.i.e();
                e112.b();
                String packageName2 = e112.f12041a.getPackageName();
                s8.b bVar2 = !C1358d.p(extras) ? s8.b.DISPLAY_NOTIFICATION : s8.b.DATA_MESSAGE;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if ("high".equals(string2)) {
                }
                if (objArr == 2) {
                }
                int i1122 = i10;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                if (str3 != null) {
                }
                String string522 = extras.getString("collapse_key");
                if (string522 != null) {
                }
                String string622 = extras.getString("google.c.a.m_l");
                if (string622 != null) {
                }
                String string722 = extras.getString("google.c.a.c_l");
                if (string722 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                Y6.i e1322 = Y6.i.e();
                e1322.b();
                Y6.m mVar22 = e1322.f12043c;
                str = mVar22.f12058e;
                if (str != null) {
                }
                e1322.b();
                str2 = mVar22.f12055b;
                if (str2.startsWith("1:")) {
                }
                dVar = new s8.d(parseLong > 0 ? parseLong : 0L, str5, str42, bVar2, packageName2, str7, i1122, i7, str6, str8, str9);
            }
            if (dVar == null) {
                return;
            }
            try {
                ((b4.o) fVar).a("FCM_CLIENT_EVENT_LOGGING", new Y3.c("proto"), new C1948d(4)).z(new Y3.a(new s8.e(dVar), Y3.d.f11149a, new Y3.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new Y(26));
            } catch (RuntimeException e17) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e17);
            }
        }
    }

    public static void G(String str, Bundle bundle) {
        try {
            Y6.i.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String str2 = C1358d.p(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC0913b interfaceC0913b = (InterfaceC0913b) Y6.i.e().c(InterfaceC0913b.class);
            if (interfaceC0913b != null) {
                ((C0914c) interfaceC0913b).a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static Typeface H(Configuration configuration, Typeface typeface) {
        int weight;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31 || AbstractC0187l.b(configuration) == Integer.MAX_VALUE || AbstractC0187l.b(configuration) == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        create = Typeface.create(typeface, O5.b.j(AbstractC0187l.b(configuration) + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static final long M(long j, long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final void N(Object[] objArr, int i7, int i10) {
        kotlin.jvm.internal.l.e(objArr, "<this>");
        while (i7 < i10) {
            objArr[i7] = null;
            i7++;
        }
    }

    public static final long O(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static boolean S(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static D4.e T(int i7, C1979g c1979g, n5.v vVar) {
        D4.e b2 = D4.e.b(c1979g, vVar);
        while (true) {
            int i10 = b2.f3224a;
            if (i10 == i7) {
                return b2;
            }
            h3.o.u(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = b2.f3225b + 8;
            if (j > 2147483647L) {
                throw C1586o0.c("Chunk is too large (~2GB+) to skip; id: " + i10);
            }
            c1979g.r((int) j);
            b2 = D4.e.b(c1979g, vVar);
        }
    }

    public static long U(long j, long j10, long j11, int i7) {
        return j + n5.D.T(j10 - j11, 1000000L, i7);
    }

    public static String V(long j) {
        int i7 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i7) == Float.intBitsToFloat(i10)) {
            return "CornerRadius.circular(" + AbstractC0672a.v(Float.intBitsToFloat(i7)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC0672a.v(Float.intBitsToFloat(i7)) + ", " + AbstractC0672a.v(Float.intBitsToFloat(i10)) + ')';
    }

    public static final boolean a(Object[] objArr, int i7, int i10, List list) {
        if (i10 != list.size()) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!kotlin.jvm.internal.l.a(objArr[i7 + i11], list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public static final String b(Object[] objArr, int i7, int i10, Eb.h hVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i7 + i11];
            if (obj == hVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [A9.Z2, java.lang.Object] */
    public static Z2 c(View view, float f4, float f10, int i7) {
        if (i7 > 0) {
            Y2 y22 = a3.f1056a;
            Y6.b.w(view, i7);
        } else {
            view.setOutlineProvider(a3.f1056a);
        }
        ?? obj = new Object();
        obj.f1048a = view;
        obj.f1049b = f4;
        obj.f1050c = f10;
        view.setZ(f4);
        return obj;
    }

    public static boolean f(C1979g c1979g) {
        n5.v vVar = new n5.v(8);
        int i7 = D4.e.b(c1979g, vVar).f3224a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        c1979g.x(vVar.f21229a, 0, 4, false);
        vVar.G(0);
        int h10 = vVar.h();
        if (h10 == 1463899717) {
            return true;
        }
        AbstractC1705a.t("WavHeaderReader", "Unsupported form type: " + h10);
        return false;
    }

    public static C1312U i(k5.s sVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (sVar.c(i10, elapsedRealtime)) {
                i7++;
            }
        }
        return new C1312U(1, 0, length, i7);
    }

    public static boolean j() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Y6.i.e();
            Y6.i e2 = Y6.i.e();
            e2.b();
            Context context = e2.f12041a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final Kb.b k(Enum[] entries) {
        kotlin.jvm.internal.l.e(entries, "entries");
        return new Kb.b(entries);
    }

    public static final boolean l(long j, long j10) {
        return j == j10;
    }

    public static final int m(N0.k kVar, int i7) {
        boolean z8 = kotlin.jvm.internal.l.f(kVar.f7143a, N0.k.f7139b.f7143a) >= 0;
        boolean a9 = N0.i.a(i7, 1);
        if (a9 && z8) {
            return 3;
        }
        if (z8) {
            return 1;
        }
        return a9 ? 2 : 0;
    }

    public static final long v(C0463k c0463k) {
        DragEvent dragEvent = (DragEvent) c0463k.f8074b;
        float x2 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (Float.floatToRawIntBits(x2) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L);
    }

    public static final long z(long j) {
        if (j < 0) {
            int i7 = C0849a.f13994d;
            return C0849a.f13993c;
        }
        int i10 = C0849a.f13994d;
        return C0849a.f13992b;
    }

    public abstract boolean A();

    public abstract boolean B(float f4);

    public abstract boolean C(View view);

    public abstract boolean D(float f4, float f10);

    public void I(View view, int i7) {
    }

    public abstract void J(int i7);

    public abstract void K(View view, int i7, int i10);

    public abstract void L(View view, float f4, float f10);

    public abstract void P(boolean z8);

    public abstract void Q(boolean z8);

    public abstract boolean R(View view, float f4);

    public abstract boolean W(View view, int i7);

    public abstract void X(ViewGroup.MarginLayoutParams marginLayoutParams, int i7);

    public abstract void Y(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i10);

    public abstract TransformationMethod Z(TransformationMethod transformationMethod);

    public abstract int d(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float e(int i7);

    public abstract int g(View view, int i7);

    public abstract int h(View view, int i7);

    public abstract int n(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int o();

    public abstract InputFilter[] p(InputFilter[] inputFilterArr);

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract int t(View view);

    public abstract int u(CoordinatorLayout coordinatorLayout);

    public abstract int w();

    public int x(View view) {
        return 0;
    }

    public int y() {
        return 0;
    }
}
