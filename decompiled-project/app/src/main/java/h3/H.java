package h3;

import A0.C0028q;
import B0.C0168b0;
import B0.H0;
import Q.C0480b;
import Q.C0498k;
import Q.C0505n0;
import Q.C0506o;
import Q.W;
import a0.C0691r;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserManager;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import g3.AbstractC1186e;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import l2.C1481z;
import l2.EnumC1474s;
import l2.InterfaceC1477v;
import l2.InterfaceC1479x;
import m0.AbstractC1537f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import v2.C2133e;
import y1.T;
import y7.u0;

/* loaded from: classes.dex */
public abstract class H implements T {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17661a = 0;

    public static L9.c A(int i7, Throwable th) {
        Integer num = (i7 & 1) != 0 ? null : 4404;
        kotlin.jvm.internal.l.e(th, "<this>");
        if (th instanceof SocketTimeoutException) {
            return new L9.a("Không thể kết nối tới server, vui lòng thử link khác nhé");
        }
        int i10 = L9.c.f6423d;
        return new L9.c(num != null ? num.intValue() : 4999, th.getMessage(), th.getCause());
    }

    public static HashMap B(String str) {
        try {
            return K(new JSONObject(str));
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    public static int C(long j) {
        if (j > 2147483647L) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static String D(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e2) {
                throw new IOException("Could not serialize number", e2);
            }
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            E(obj, jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException e10) {
            throw new IOException("Failed to serialize JSON", e10);
        }
    }

    public static void E(Object obj, JSONStringer jSONStringer) {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                E(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
            return;
        }
        if (!(obj instanceof Collection)) {
            jSONStringer.value(obj);
            return;
        }
        jSONStringer.array();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            E(it.next(), jSONStringer);
        }
        jSONStringer.endArray();
    }

    public static Xb.e F(Xb.g gVar, int i7) {
        kotlin.jvm.internal.l.e(gVar, "<this>");
        boolean z8 = i7 > 0;
        Integer valueOf = Integer.valueOf(i7);
        if (z8) {
            if (gVar.f11027c <= 0) {
                i7 = -i7;
            }
            return new Xb.e(gVar.f11025a, gVar.f11026b, i7);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static int[] G(Collection collection) {
        if (collection instanceof Q6.a) {
            Q6.a aVar = (Q6.a) collection;
            return Arrays.copyOfRange(aVar.f8666a, aVar.f8667b, aVar.f8668c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final double H(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Xb.e, Xb.g] */
    public static Xb.g I(int i7, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new Xb.e(i7, i10 - 1, 1);
        }
        Xb.g gVar = Xb.g.f11032d;
        return Xb.g.f11032d;
    }

    public static Object J(Object obj) {
        if (obj instanceof JSONObject) {
            return K((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj.equals(JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            arrayList.add(J(jSONArray.get(i7)));
        }
        return arrayList;
    }

    public static HashMap K(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, J(jSONObject.get(next)));
        }
        return hashMap;
    }

    public static final void d(w2.r rVar, C0506o c0506o, int i7) {
        c0506o.U(294589392);
        if ((((c0506o.i(rVar) ? 4 : 2) | i7) & 3) == 2 && c0506o.x()) {
            c0506o.N();
        } else {
            Z.g z8 = q3.f.z(c0506o);
            W j = C0480b.j(rVar.b().f24984e, c0506o);
            List list = (List) j.getValue();
            boolean booleanValue = ((Boolean) c0506o.k(H0.f1686a)).booleanValue();
            boolean g = c0506o.g(list);
            Object H10 = c0506o.H();
            Object obj = C0498k.f8409a;
            Object obj2 = H10;
            if (g || H10 == obj) {
                C0691r c0691r = new C0691r();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    C2133e c2133e = (C2133e) obj3;
                    if (booleanValue || c2133e.f24973v.j.f19242d.compareTo(EnumC1474s.f19230d) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                c0691r.addAll(arrayList);
                c0506o.d0(c0691r);
                obj2 = c0691r;
            }
            C0691r c0691r2 = (C0691r) obj2;
            boolean z10 = false;
            e(c0691r2, (List) j.getValue(), c0506o, 0);
            W j10 = C0480b.j(rVar.b().f24985f, c0506o);
            Object H11 = c0506o.H();
            if (H11 == obj) {
                H11 = new C0691r();
                c0506o.d0(H11);
            }
            C0691r c0691r3 = (C0691r) H11;
            c0506o.S(-367418626);
            ListIterator listIterator = c0691r2.listIterator();
            while (true) {
                C0028q c0028q = (C0028q) listIterator;
                if (!c0028q.hasNext()) {
                    break;
                }
                C2133e c2133e2 = (C2133e) c0028q.next();
                v2.q qVar = c2133e2.f24967b;
                kotlin.jvm.internal.l.c(qVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                w2.q qVar2 = (w2.q) qVar;
                boolean i10 = c0506o.i(rVar) | c0506o.i(c2133e2);
                Object H12 = c0506o.H();
                if (i10 || H12 == obj) {
                    H12 = new okhttp3.internal.http2.g(3, rVar, c2133e2);
                    c0506o.d0(H12);
                }
                tc.b.d((Rb.a) H12, qVar2.f25703f, Y.f.d(1129586364, new w2.o(c2133e2, rVar, z8, c0691r3, qVar2), c0506o), c0506o, 384);
                z8 = z8;
                z10 = false;
            }
            c0506o.p(z10);
            Set set = (Set) j10.getValue();
            boolean g2 = c0506o.g(j10) | c0506o.i(rVar);
            Object H13 = c0506o.H();
            if (g2 || H13 == obj) {
                H13 = new w2.p(j10, rVar, c0691r3, null);
                c0506o.d0(H13);
            }
            C0480b.f(set, c0691r3, (Rb.e) H13, c0506o);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new ac.o(rVar, i7);
        }
    }

    public static final void e(final C0691r c0691r, List list, C0506o c0506o, int i7) {
        c0506o.U(1537894851);
        if ((((c0506o.i(c0691r) ? 4 : 2) | i7 | (c0506o.i(list) ? 32 : 16)) & 19) == 18 && c0506o.x()) {
            c0506o.N();
        } else {
            final boolean booleanValue = ((Boolean) c0506o.k(H0.f1686a)).booleanValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final C2133e c2133e = (C2133e) it.next();
                C1481z c1481z = c2133e.f24973v.j;
                boolean h10 = c0506o.h(booleanValue) | c0506o.i(c0691r) | c0506o.i(c2133e);
                Object H10 = c0506o.H();
                if (h10 || H10 == C0498k.f8409a) {
                    H10 = new Rb.c() { // from class: w2.k
                        @Override // Rb.c
                        public final Object invoke(Object obj) {
                            final C2133e c2133e2 = c2133e;
                            final boolean z8 = booleanValue;
                            final C0691r c0691r2 = c0691r;
                            InterfaceC1477v interfaceC1477v = new InterfaceC1477v() { // from class: w2.m
                                @Override // l2.InterfaceC1477v
                                public final void onStateChanged(InterfaceC1479x interfaceC1479x, l2.r rVar) {
                                    C2133e c2133e3 = c2133e2;
                                    boolean z10 = z8;
                                    C0691r c0691r3 = c0691r2;
                                    if (z10 && !c0691r3.contains(c2133e3)) {
                                        c0691r3.add(c2133e3);
                                    }
                                    if (rVar == l2.r.ON_START && !c0691r3.contains(c2133e3)) {
                                        c0691r3.add(c2133e3);
                                    }
                                    if (rVar == l2.r.ON_STOP) {
                                        c0691r3.remove(c2133e3);
                                    }
                                }
                            };
                            c2133e2.f24973v.j.a(interfaceC1477v);
                            return new C0168b0(4, c2133e2, interfaceC1477v);
                        }
                    };
                    c0506o.d0(H10);
                }
                C0480b.c(c1481z, (Rb.c) H10, c0506o);
            }
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new w2.l(c0691r, list, i7, 0);
        }
    }

    public static int f(long j) {
        int i7 = (int) j;
        Q5.e.j(j, "Out of range: %s", ((long) i7) == j);
        return i7;
    }

    public static long g(long j, long j10) {
        return j < j10 ? j10 : j;
    }

    public static long h(long j, long j10) {
        return j > j10 ? j10 : j;
    }

    public static double i(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float j(float f4, float f10, float f11) {
        if (f10 <= f11) {
            return f4 < f10 ? f10 : f4 > f11 ? f11 : f4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static int k(int i7, int i10, int i11) {
        if (i10 <= i11) {
            return i7 < i10 ? i10 : i7 > i11 ? i11 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long l(long j, long j10, long j11) {
        if (j10 <= j11) {
            return j < j10 ? j10 : j > j11 ? j11 : j;
        }
        StringBuilder l10 = X.c.l(j11, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        l10.append(j10);
        l10.append('.');
        throw new IllegalArgumentException(l10.toString());
    }

    public static zc.e m(zc.p pVar, xc.l lVar) {
        Stream filter;
        if (pVar.f()) {
            pVar.e();
            lVar.getClass();
            filter = android.support.v4.media.session.b.F(lVar, xc.l.class).filter(new zc.f(pVar, lVar, 1));
        } else {
            pVar.e();
            lVar.getClass();
            filter = android.support.v4.media.session.b.F(lVar, xc.l.class).filter(new zc.f(pVar, lVar, 0));
        }
        return (zc.e) filter.collect(Collectors.toCollection(new wc.d(6)));
    }

    public static int n(int i7, int i10) {
        if (i10 <= 1073741823) {
            return Math.min(Math.max(i7, i10), 1073741823);
        }
        throw new IllegalArgumentException(Tb.a.w("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i10), 1073741823));
    }

    public static G5.c o(byte[] bArr, Parcelable.Creator creator) {
        com.google.android.gms.common.internal.G.g(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        G5.c cVar = (G5.c) creator.createFromParcel(obtain);
        obtain.recycle();
        return cVar;
    }

    public static final boolean q(int i7, int i10) {
        return i7 == i10;
    }

    public static long r(T7.o oVar) {
        long j = 8;
        if (!(oVar instanceof T7.j) && !(oVar instanceof T7.p)) {
            if (oVar instanceof T7.a) {
                j = 4;
            } else {
                if (!(oVar instanceof T7.v)) {
                    throw new IllegalArgumentException("Unknown leaf node type: " + oVar.getClass());
                }
                j = ((T7.v) oVar).f9365c.length() + 2;
            }
        }
        if (oVar.f9354a.isEmpty()) {
            return j;
        }
        return r((T7.o) oVar.f9354a) + j + 24;
    }

    public static long s(T7.s sVar) {
        if (sVar.isEmpty()) {
            return 4L;
        }
        if (sVar.p()) {
            return r((T7.o) sVar);
        }
        O7.k.b("Unexpected node type: " + sVar.getClass(), sVar instanceof T7.f);
        Iterator it = sVar.iterator();
        long j = 1;
        while (it.hasNext()) {
            j = j + r5.f9359a.f9331a.length() + 4 + s(((T7.q) it.next()).f9360b);
        }
        return !sVar.e().isEmpty() ? j + 12 + r((T7.o) sVar.e()) : j;
    }

    public static InvocationHandler t() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = AbstractC1186e.b();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static ColorStateList u(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC1537f.s(drawable)) {
            return null;
        }
        return AbstractC1537f.b(AbstractC1537f.c(drawable));
    }

    public static String v(int i7) {
        switch (i7) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
            case 12:
            default:
                return o.l(i7, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static final int w(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static int x(int[] iArr, int i7, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i7) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final int y(int i7, int i10) {
        return (i7 >> i10) & 31;
    }

    public static boolean z(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public abstract void L(int i7, byte[] bArr, int i10);

    @Override // y1.T
    public void b() {
    }

    @Override // y1.T
    public void c() {
    }

    public void p(I request) {
        kotlin.jvm.internal.l.e(request, "request");
        List x2 = u0.x(request);
        i3.p pVar = (i3.p) this;
        if (x2.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new i3.m(pVar, null, 2, x2).S();
    }
}
