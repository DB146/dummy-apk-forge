package android.support.v4.media.session;

import A9.C0098j;
import A9.C0139t1;
import B0.b1;
import H2.C0297k;
import I2.E;
import M1.C0405u;
import Q5.e;
import T7.f;
import T7.i;
import T7.j;
import T7.k;
import T7.p;
import T7.s;
import T7.v;
import V0.n;
import V0.o;
import Zb.h;
import a3.AbstractC0715G;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import b3.g;
import c.AbstractC0862f;
import cc.B;
import com.kt.apps.media.xemtv.beta.R;
import f.C1117a;
import java.lang.reflect.Field;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.jvm.internal.l;
import l1.AbstractC1449a;
import n5.D;
import ob.C1837e;
import p0.t;
import qb.d;
import qb.m;
import xc.r;
import y1.O;
import y7.u0;
import z9.C2601a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f12877a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f12878b = true;

    /* renamed from: c, reason: collision with root package name */
    public static Field f12879c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f12880d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f12881e = 0;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.c, android.content.ContextWrapper] */
    public static Drawable A(Context context, int i7, Resources.Theme theme) {
        if (theme != null) {
            ?? contextWrapper = new ContextWrapper(context);
            contextWrapper.f19622b = theme;
            contextWrapper.a(theme.getResources().getConfiguration());
            context = contextWrapper;
        }
        return e.x(context, i7);
    }

    public static final long B(long j, float f4) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f4) & 4294967295L);
        o[] oVarArr = n.f9986b;
        return floatToRawIntBits;
    }

    public static final void C(View view, Q2.e eVar) {
        l.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, eVar);
    }

    public static Stream F(xc.l lVar, Class cls) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new r(lVar, cls), 273), false);
    }

    public static String G(int i7) {
        Object[] objArr = {Integer.valueOf(Color.red(i7)), Integer.valueOf(Color.green(i7)), Integer.valueOf(Color.blue(i7)), Double.valueOf(Color.alpha(i7) / 255.0d)};
        int i10 = D.f21141a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static Bundle H(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static final byte[] I(byte[] bArr, int i7, byte[] bArr2, int i10, int i11) {
        if (i11 < 0 || bArr.length - i11 < i7 || bArr2.length - i11 < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr3[i12] = (byte) (bArr[i12 + i7] ^ bArr2[i12 + i10]);
        }
        return bArr3;
    }

    public static s a(Object obj, s sVar) {
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    sVar = com.bumptech.glide.c.K(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return k.f9348e;
            }
            if (obj instanceof String) {
                return new v((String) obj, sVar);
            }
            if (obj instanceof Long) {
                return new p((Long) obj, sVar);
            }
            if (obj instanceof Integer) {
                return new p(Long.valueOf(((Integer) obj).intValue()), sVar);
            }
            if (obj instanceof Double) {
                return new j((Double) obj, sVar);
            }
            if (obj instanceof Boolean) {
                return new T7.a((Boolean) obj, sVar);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new RuntimeException("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".sv")) {
                    return new i(map2, sVar);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        s a9 = a(map2.get(str), k.f9348e);
                        if (!a9.isEmpty()) {
                            hashMap.put(T7.c.b(str), a9);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i7 = 0; i7 < list.size(); i7++) {
                    String str2 = "" + i7;
                    s a10 = a(list.get(i7), k.f9348e);
                    if (!a10.isEmpty()) {
                        hashMap.put(T7.c.b(str2), a10);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return k.f9348e;
            }
            C0297k c0297k = f.f9334d;
            return new f(hashMap.size() < 25 ? I7.b.E(new ArrayList(hashMap.keySet()), hashMap, c0297k) : q3.i.l(new ArrayList(hashMap.keySet()), hashMap, c0297k), sVar);
        } catch (ClassCastException e2) {
            throw new RuntimeException("Failed to parse node", e2);
        }
    }

    public static final i0.c b(long j, long j10) {
        int i7 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        return new i0.c(Float.intBitsToFloat(i7), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i10));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [A9.j, z9.a] */
    public static final void c(C0098j c0098j) {
        l.e(c0098j, "<this>");
        c0098j.i();
        Iterator it = ((List) C2601a.f28334f.getValue()).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ?? c0098j2 = new C0098j(new F9.a(1));
            for (int i7 = 0; i7 < intValue; i7++) {
                c0098j2.g(Integer.valueOf(i7));
            }
            c0098j.g(new C0139t1(c0098j2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [A9.j, z9.a] */
    public static final void d(C0098j c0098j) {
        l.e(c0098j, "<this>");
        c0098j.i();
        Iterator it = ((List) C2601a.f28334f.getValue()).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ?? c0098j2 = new C0098j(new F9.a(0));
            for (int i7 = 0; i7 < intValue; i7++) {
                c0098j2.g(Integer.valueOf(i7));
            }
            c0098j.g(new C0139t1(c0098j2));
        }
    }

    public static final void e(View view) {
        l.e(view, "<this>");
        h w10 = O5.b.w(new O(view, null));
        while (w10.hasNext()) {
            ArrayList arrayList = r((View) w10.next()).f4280a;
            for (int s3 = u0.s(arrayList); -1 < s3; s3--) {
                ((b1) arrayList.get(s3)).f1860a.c();
            }
        }
    }

    public static byte[] f(byte[]... bArr) {
        int i7 = 0;
        for (byte[] bArr2 : bArr) {
            if (i7 > com.google.android.gms.common.api.f.API_PRIORITY_OTHER - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i7 += bArr2.length;
        }
        byte[] bArr3 = new byte[i7];
        int i10 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i10, bArr4.length);
            i10 += bArr4.length;
        }
        return bArr3;
    }

    public static final C1837e g(E db2, Rb.c cVar) {
        l.e(db2, "db");
        Hb.i k = db2.k();
        B b2 = B.f14467b;
        Hb.i minusKey = k.minusKey(b2);
        N2.a aVar = new N2.a(db2, cVar, null);
        if (minusKey.get(b2) == null) {
            return new C1837e(new F8.a(23, minusKey, aVar), 0);
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + minusKey).toString());
    }

    public static final void h(p0.b bVar, p0.p pVar) {
        int size = pVar.f23026b.size();
        for (int i7 = 0; i7 < size; i7++) {
            p0.r rVar = (p0.r) pVar.f23026b.get(i7);
            if (rVar instanceof t) {
                p0.f fVar = new p0.f();
                t tVar = (t) rVar;
                fVar.f22997c = tVar.f23032a;
                fVar.f22999e = true;
                fVar.c();
                fVar.f23001h.c(0);
                fVar.c();
                fVar.c();
                fVar.f22996b = tVar.f23033b;
                fVar.c();
                fVar.c();
                fVar.c();
                fVar.c();
                fVar.c();
                fVar.c();
                fVar.c();
                fVar.c();
                fVar.f23000f = true;
                fVar.c();
                fVar.f22998d = 1.0f;
                fVar.f23000f = true;
                fVar.c();
                fVar.f23000f = true;
                fVar.c();
                bVar.e(i7, fVar);
            } else if (rVar instanceof p0.p) {
                p0.b bVar2 = new p0.b();
                p0.p pVar2 = (p0.p) rVar;
                pVar2.getClass();
                bVar2.k = "";
                bVar2.c();
                bVar2.f22982n = true;
                bVar2.c();
                bVar2.f22980l = 1.0f;
                bVar2.f22982n = true;
                bVar2.c();
                bVar2.f22981m = 1.0f;
                bVar2.f22982n = true;
                bVar2.c();
                bVar2.f22982n = true;
                bVar2.c();
                bVar2.f22982n = true;
                bVar2.c();
                bVar2.f22982n = true;
                bVar2.c();
                bVar2.f22982n = true;
                bVar2.c();
                bVar2.f22977f = pVar2.f23025a;
                bVar2.g = true;
                bVar2.c();
                h(bVar2, pVar2);
                bVar.e(i7, bVar2);
            }
        }
    }

    public static final d i(E db2, Rb.c cVar) {
        l.e(db2, "db");
        Hb.i k = db2.k();
        B b2 = B.f14467b;
        Hb.i minusKey = k.minusKey(b2);
        N2.b bVar = new N2.b(db2, cVar, null);
        if (minusKey.get(b2) == null) {
            return new d(new F8.a(25, minusKey, bVar), 0);
        }
        throw new IllegalArgumentException(("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + minusKey).toString());
    }

    public static final m j(E db2, String[] strArr, Rb.c cVar) {
        l.e(db2, "db");
        return new m(new F8.a(24, db2.k(), new C0405u(Tb.a.i(db2, true, strArr, cVar), 1)), 2);
    }

    public static final tb.b k(E db2, boolean z8, Rb.c cVar) {
        l.e(db2, "db");
        Hb.i k = db2.k();
        B b2 = B.f14467b;
        Hb.i minusKey = k.minusKey(b2);
        N2.c cVar2 = new N2.c(db2, z8, cVar, null);
        if (minusKey.get(b2) == null) {
            return new tb.b(new F8.a(26, minusKey, cVar2), 0);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + minusKey).toString());
    }

    public static void l(Object obj, String str, String str2) {
        String w10 = w(str);
        if (Log.isLoggable(w10, 3)) {
            Log.d(w10, String.format(str2, obj));
        }
    }

    public static void m(Exception exc, String str, String str2) {
        String w10 = w(str);
        if (Log.isLoggable(w10, 6)) {
            Log.e(w10, str2, exc);
        }
    }

    public static final Q2.e n(View view) {
        l.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            Q2.e eVar = tag instanceof Q2.e ? (Q2.e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object q10 = q(view);
            view = q10 instanceof View ? (View) q10 : null;
        }
        return null;
    }

    public static Drawable o(Context context, Context context2, int i7, Resources.Theme theme) {
        try {
            if (f12877a) {
                return A(context2, i7, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return AbstractC1449a.getDrawable(context2, i7);
        } catch (NoClassDefFoundError unused2) {
            f12877a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = n1.k.f21047a;
        return resources.getDrawable(i7, theme);
    }

    public static Object p(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC0862f.b(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C1117a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final ViewParent q(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final G1.a r(View view) {
        G1.a aVar = (G1.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        G1.a aVar2 = new G1.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static SharedPreferences s(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r9.longValue() != r2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r0.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r1.moveToNext() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r2 = r2.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r1.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        r8 = b3.g.d(r1);
        r2 = r8.f13817a.getAsLong("channel_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        if (r2 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r2 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList t(Context context, Long l10) {
        l.e(context, "context");
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(b3.i.f13827a, g.f13825d, null, null, null);
            if (cursor != null) {
            }
        } catch (IllegalArgumentException unused) {
        } catch (Throwable th) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public static final long u(double d10) {
        return B(4294967296L, (float) d10);
    }

    public static final long v(int i7) {
        return B(4294967296L, i7);
    }

    public static String w(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Db.g, java.lang.Object, Db.n] */
    /* JADX WARN: Type inference failed for: r2v5, types: [Db.r, Db.g, java.lang.Object] */
    public static Db.g y(Db.h hVar, Rb.a aVar) {
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            return new Db.o(aVar);
        }
        Db.p pVar = Db.p.f3364a;
        if (ordinal == 1) {
            ?? obj = new Object();
            obj.f3359a = aVar;
            obj.f3360b = pVar;
            return obj;
        }
        if (ordinal != 2) {
            throw new Db.d(1);
        }
        ?? obj2 = new Object();
        obj2.f3366a = aVar;
        obj2.f3367b = pVar;
        return obj2;
    }

    public static Db.o z(Rb.a initializer) {
        l.e(initializer, "initializer");
        return new Db.o(initializer);
    }

    public void D(View view, float f4) {
        if (f12878b) {
            try {
                AbstractC0715G.b(view, f4);
                return;
            } catch (NoSuchMethodError unused) {
                f12878b = false;
            }
        }
        view.setAlpha(f4);
    }

    public void E(View view, int i7) {
        if (!f12880d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f12879c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f12880d = true;
        }
        Field field = f12879c;
        if (field != null) {
            try {
                f12879c.setInt(view, i7 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public float x(View view) {
        if (f12878b) {
            try {
                return AbstractC0715G.a(view);
            } catch (NoSuchMethodError unused) {
                f12878b = false;
            }
        }
        return view.getAlpha();
    }
}
