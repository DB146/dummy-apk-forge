package vc;

import A9.O0;
import Db.q;
import Eb.o;
import H0.t;
import K0.m;
import M1.C0391f;
import M1.C0393h;
import M1.C0397l;
import W1.C;
import Y5.C0658x;
import a.AbstractC0672a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import ea.C1112g;
import h3.C1235A;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import l2.AbstractC1456G;
import l2.d0;
import n5.v;
import o2.C1779a;
import q3.n;
import v2.C2138j;
import v2.k;
import y.S;
import y7.u0;

/* loaded from: classes2.dex */
public abstract class i implements androidx.leanback.transition.f {

    /* renamed from: a, reason: collision with root package name */
    public static long f25478a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f25479b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f25480c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f25481d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25482e = 0;

    public i() {
        new ConcurrentHashMap();
    }

    public static void A(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    public static void B(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void C(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(S.b("The '", str2, "' parameter must not be empty."));
        }
    }

    public static void D(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    public static void E(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(S.b("The parameter '", str, "' must not be null."));
        }
    }

    public static void F(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float G(EdgeEffect edgeEffect, float f4, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1.c.c(edgeEffect, f4, f10);
        }
        C1.b.a(edgeEffect, f4, f10);
        return f4;
    }

    public static C1112g H(v vVar) {
        vVar.H(1);
        int x2 = vVar.x();
        long j = vVar.f21230b + x2;
        int i7 = x2 / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i10 = 0;
        while (true) {
            if (i10 >= i7) {
                break;
            }
            long p10 = vVar.p();
            if (p10 == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = p10;
            jArr2[i10] = vVar.p();
            vVar.H(2);
            i10++;
        }
        vVar.H((int) (j - vVar.f21230b));
        return new C1112g(12, jArr, jArr2);
    }

    public static String I(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(List list, C0397l c0397l, Jb.c cVar) {
        C0391f c0391f;
        int i7;
        List list2;
        Iterator it;
        kotlin.jvm.internal.v vVar;
        Throwable th;
        if (cVar instanceof C0391f) {
            C0391f c0391f2 = (C0391f) cVar;
            int i10 = c0391f2.f6671d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0391f2.f6671d = i10 - Integer.MIN_VALUE;
                c0391f = c0391f2;
                Object obj = c0391f.f6670c;
                Object obj2 = Ib.a.f5345a;
                i7 = c0391f.f6671d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    ArrayList arrayList = new ArrayList();
                    C0393h c0393h = new C0393h(list, arrayList, null);
                    c0391f.f6668a = arrayList;
                    c0391f.f6671d = 1;
                    if (c0397l.a(c0393h, c0391f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0391f.f6669b;
                        vVar = (kotlin.jvm.internal.v) c0391f.f6668a;
                        try {
                            com.bumptech.glide.c.c0(obj);
                            vVar = vVar;
                        } catch (Throwable th2) {
                            Object obj3 = vVar.f19134a;
                            if (obj3 == null) {
                                vVar.f19134a = th2;
                                vVar = vVar;
                            } else {
                                AbstractC0672a.c((Throwable) obj3, th2);
                                vVar = vVar;
                            }
                        }
                        while (it.hasNext()) {
                            Rb.c cVar2 = (Rb.c) it.next();
                            c0391f.f6668a = vVar;
                            c0391f.f6669b = it;
                            c0391f.f6671d = 2;
                            if (cVar2.invoke(c0391f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) vVar.f19134a;
                        if (th == null) {
                            return q.f3365a;
                        }
                        throw th;
                    }
                    list2 = (List) c0391f.f6668a;
                    com.bumptech.glide.c.c0(obj);
                }
                Object obj4 = new Object();
                it = list2.iterator();
                vVar = obj4;
                while (it.hasNext()) {
                }
                th = (Throwable) vVar.f19134a;
                if (th == null) {
                }
            }
        }
        c0391f = new Jb.c(cVar);
        Object obj5 = c0391f.f6670c;
        Object obj22 = Ib.a.f5345a;
        i7 = c0391f.f6671d;
        if (i7 != 0) {
        }
        Object obj42 = new Object();
        it = list2.iterator();
        vVar = obj42;
        while (it.hasNext()) {
        }
        th = (Throwable) vVar.f19134a;
        if (th == null) {
        }
    }

    public static String f(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb2.toString();
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] h(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            jArr[i7] = iArr[i7];
        }
        return jArr;
    }

    public static final void i(int i7, int i10) {
        if (i7 > i10) {
            throw new IndexOutOfBoundsException(A3.c.e(i7, i10, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static final O0 o(C c10, kotlin.jvm.internal.e eVar, Rb.a aVar, Rb.a aVar2, Rb.a aVar3) {
        l.e(c10, "<this>");
        return new O0(eVar, aVar, aVar3, aVar2);
    }

    public static final int q(int i7, List list) {
        int i10;
        int i11 = ((m) o.e0(list)).f5918c;
        if (i7 > ((m) o.e0(list)).f5918c) {
            P0.a.a("Index " + i7 + " should be less or equal than last line's end " + i11);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                i10 = -(i12 + 1);
                break;
            }
            i10 = (i12 + size) >>> 1;
            m mVar = (m) list.get(i10);
            char c10 = mVar.f5917b > i7 ? (char) 1 : mVar.f5918c <= i7 ? (char) 65535 : (char) 0;
            if (c10 >= 0) {
                if (c10 <= 0) {
                    break;
                }
                size = i10 - 1;
            } else {
                i12 = i10 + 1;
            }
        }
        if (i10 < 0 || i10 >= list.size()) {
            StringBuilder r10 = h3.o.r(i10, "Found paragraph index ", " should be in range [0, ");
            r10.append(list.size());
            r10.append(").\nDebug info: index=");
            r10.append(i7);
            r10.append(", paragraphs=[");
            r10.append(X0.a.a(null, 31, list));
            r10.append(']');
            P0.a.a(r10.toString());
        }
        return i10;
    }

    public static final int r(int i7, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            m mVar = (m) list.get(i11);
            char c10 = mVar.f5919d > i7 ? (char) 1 : mVar.f5920e <= i7 ? (char) 65535 : (char) 0;
            if (c10 < 0) {
                i10 = i11 + 1;
            } else {
                if (c10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static float s(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static C2138j t(d0 d0Var) {
        Za.d factory = k.f24988a;
        C1779a extras = C1779a.f21662b;
        l.e(factory, "factory");
        l.e(extras, "extras");
        n nVar = new n(d0Var, factory, extras);
        kotlin.jvm.internal.e a9 = w.a(C2138j.class);
        String b2 = a9.b();
        if (b2 != null) {
            return (C2138j) nVar.l(a9, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final Object u(H0.i iVar, t tVar) {
        Object g = iVar.f4494a.g(tVar);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static void v(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean w() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Z2.a.c();
        }
        try {
            if (f25479b == null) {
                f25478a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f25479b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f25479b.invoke(null, Long.valueOf(f25478a))).booleanValue();
        } catch (Exception e2) {
            v("isTagEnabled", e2);
            return false;
        }
    }

    public static void x(String str, boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void y(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, h3.A] */
    public static final C1235A z(C1235A tracer, String label, Executor executor, Rb.a aVar) {
        l.e(tracer, "tracer");
        l.e(label, "label");
        l.e(executor, "executor");
        Tb.a.q(new L7.h(executor, tracer, label, aVar, new AbstractC1456G(C1235A.f17652c)));
        return new Object();
    }

    @Override // androidx.leanback.transition.f
    public float b(View view) {
        return view.getTranslationX();
    }

    @Override // androidx.leanback.transition.f
    public Property c() {
        return View.TRANSLATION_X;
    }

    public abstract i e(Serializable serializable);

    public abstract Typeface j(Context context, n1.e eVar, Resources resources, int i7);

    public abstract Typeface k(Context context, v1.h[] hVarArr, int i7);

    public Typeface l(Context context, List list, int i7) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface m(Context context, InputStream inputStream) {
        File u3 = u0.u(context);
        if (u3 == null) {
            return null;
        }
        try {
            if (u0.l(u3, inputStream)) {
                return Typeface.createFromFile(u3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            u3.delete();
        }
    }

    public Typeface n(Context context, Resources resources, int i7, String str, int i10) {
        File u3 = u0.u(context);
        if (u3 == null) {
            return null;
        }
        try {
            if (u0.k(u3, resources, i7)) {
                return Typeface.createFromFile(u3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            u3.delete();
        }
    }

    public v1.h p(v1.h[] hVarArr, int i7) {
        new C0658x(16);
        int i10 = (i7 & 1) == 0 ? 400 : 700;
        boolean z8 = (i7 & 2) != 0;
        v1.h hVar = null;
        int i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (v1.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.f24955c - i10) * 2) + (hVar2.f24956d == z8 ? 0 : 1);
            if (hVar == null || i11 > abs) {
                hVar = hVar2;
                i11 = abs;
            }
        }
        return hVar;
    }
}
