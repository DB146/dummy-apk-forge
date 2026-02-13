package q3;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.B0;
import A0.C0018g0;
import A0.InterfaceC0024m;
import A0.K;
import A0.L;
import A0.n0;
import A9.C0096i1;
import B0.c1;
import C.B;
import Eb.v;
import Q.C0;
import Q.C0506o;
import Q.InterfaceC0482c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import d0.C1036d;
import h3.z;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import l1.AbstractC1449a;
import m4.C1586o0;
import q1.AbstractC1875a;
import q1.C1876b;
import u0.C2071a;
import u0.C2080j;
import u0.u;
import v0.C2124a;
import v2.C2128B;
import v2.t;
import x0.AbstractC2256a;

/* loaded from: classes.dex */
public abstract class f {
    public static int C(Context context, int i7) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i7});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final B D(C1876b c1876b) {
        return new B(c1876b.f23341a, c1876b.f23342b, c1876b.f23343c, c1876b.f23344d);
    }

    public static void E() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public static final C1036d a(String str) {
        Set singleton = Collections.singleton(str);
        kotlin.jvm.internal.l.d(singleton, "singleton(...)");
        return new C1036d(singleton);
    }

    public static final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            J6.l lVar = (J6.l) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", lVar.f5560a);
            bundle.putLong("event_timestamp", lVar.f5561b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final M.h c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof M.h) {
                return (M.h) childAt;
            }
        }
        M.h hVar = new M.h(viewGroup.getContext());
        viewGroup.addView(hVar);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup d(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }

    public static final void e(C0096i1 c0096i1, C2080j c2080j) {
        boolean a9 = u.a(c2080j);
        T7.h hVar = (T7.h) c0096i1.f1229c;
        T7.h hVar2 = (T7.h) c0096i1.f1227a;
        if (a9) {
            Eb.n.W((C2124a[]) hVar2.f9343e, null);
            hVar2.f9341c = 0;
            Eb.n.W((C2124a[]) hVar.f9343e, null);
            hVar.f9341c = 0;
            c0096i1.f1228b = 0L;
        }
        boolean b2 = u.b(c2080j);
        long j = c2080j.f24764b;
        if (!b2) {
            List list = c2080j.k;
            if (list == null) {
                list = v.f3891a;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                C2071a c2071a = (C2071a) list.get(i7);
                long j10 = c2071a.f24737a;
                long j11 = c2071a.f24739c;
                hVar2.a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
                hVar.a(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
            }
            long j12 = c2080j.f24771l;
            hVar2.a(j, Float.intBitsToFloat((int) (j12 >> 32)));
            hVar.a(j, Float.intBitsToFloat((int) (j12 & 4294967295L)));
        }
        if (u.b(c2080j) && j - c0096i1.f1228b > 40) {
            Eb.n.W((C2124a[]) hVar2.f9343e, null);
            hVar2.f9341c = 0;
            Eb.n.W((C2124a[]) hVar.f9343e, null);
            hVar.f9341c = 0;
            c0096i1.f1228b = 0L;
        }
        c0096i1.f1228b = j;
    }

    public static final Object f(InterfaceC0024m interfaceC0024m, c1 c1Var, Jb.i iVar) {
        Object obj;
        n0 s3;
        Object h10;
        C0018g0 c0018g0;
        c0.l lVar = (c0.l) interfaceC0024m;
        boolean z8 = lVar.f14113a.f14112B;
        Db.q qVar = Db.q.f3365a;
        if (!z8) {
            return qVar;
        }
        if (!z8) {
            AbstractC2256a.b("visitAncestors called on an unattached node");
        }
        c0.l lVar2 = lVar.f14113a.f14117e;
        L t5 = AbstractC0017g.t(interfaceC0024m);
        loop0: while (true) {
            obj = null;
            if (t5 == null) {
                break;
            }
            if ((((c0.l) t5.f60S.f229f).f14116d & 524288) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f14115c & 524288) != 0) {
                        c0.l lVar3 = lVar2;
                        S.e eVar = null;
                        while (lVar3 != null) {
                            if (lVar3 instanceof E0.a) {
                                obj = lVar3;
                                break loop0;
                            }
                            if ((lVar3.f14115c & 524288) != 0 && (lVar3 instanceof AbstractC0025n)) {
                                int i7 = 0;
                                for (c0.l lVar4 = ((AbstractC0025n) lVar3).f269D; lVar4 != null; lVar4 = lVar4.f14118f) {
                                    if ((lVar4.f14115c & 524288) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            lVar3 = lVar4;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new S.e(new c0.l[16]);
                                            }
                                            if (lVar3 != null) {
                                                eVar.b(lVar3);
                                                lVar3 = null;
                                            }
                                            eVar.b(lVar4);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            lVar3 = AbstractC0017g.e(eVar);
                        }
                    }
                    lVar2 = lVar2.f14117e;
                }
            }
            t5 = t5.t();
            lVar2 = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (B0) c0018g0.f228e;
        }
        E0.a aVar = (E0.a) obj;
        return (aVar != null && (h10 = aVar.h((s3 = AbstractC0017g.s(interfaceC0024m)), new K(8, c1Var, s3), iVar)) == Ib.a.f5345a) ? h10 : qVar;
    }

    public static void g(String str, boolean z8) {
        if (!z8) {
            throw C1586o0.a(str, null);
        }
    }

    public static int h(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void i(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static final v2.u j(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        v2.u uVar = new v2.u(context);
        y2.f fVar = uVar.f25026b;
        C2128B c2128b = fVar.f26780s;
        c2128b.a(new t(c2128b));
        fVar.f26780s.a(new w2.i());
        fVar.f26780s.a(new w2.r());
        return uVar;
    }

    public static final float l(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f4 = 0.0f;
        for (int i7 = 0; i7 < length; i7++) {
            f4 += fArr[i7] * fArr2[i7];
        }
        return f4;
    }

    public static final R6.a n(Executor executor, String str, Rb.a aVar) {
        kotlin.jvm.internal.l.e(executor, "<this>");
        return Tb.a.q(new M9.e(executor, str, aVar, 8));
    }

    public static int o(Context context, int i7, int i10) {
        Integer num;
        TypedValue N10 = Q5.e.N(context, i7);
        if (N10 != null) {
            int i11 = N10.resourceId;
            num = Integer.valueOf(i11 != 0 ? AbstractC1449a.getColor(context, i11) : N10.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i10;
    }

    public static int p(View view, int i7) {
        Context context = view.getContext();
        TypedValue P10 = Q5.e.P(i7, view.getContext(), view.getClass().getCanonicalName());
        int i10 = P10.resourceId;
        return i10 != 0 ? AbstractC1449a.getColor(context, i10) : P10.data;
    }

    public static final String[] q(d0.l lVar) {
        kotlin.jvm.internal.l.c(lVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((C1036d) lVar).f16307b.toArray(new String[0]);
    }

    public static boolean s(int i7) {
        return i7 != 0 && AbstractC1875a.d(i7) > 0.5d;
    }

    public static a1.l t(Hb.i context, Rb.e eVar) {
        kotlin.jvm.internal.l.e(context, "context");
        h3.o.t(1, "start");
        return Tb.a.q(new h3.r(context, 1, eVar));
    }

    public static int u(float f4, int i7, int i10) {
        return AbstractC1875a.f(AbstractC1875a.h(i10, Math.round(Color.alpha(i10) * f4)), i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void v(Context context) {
        LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.l.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.l.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            z.e().a(i3.o.f18373a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            kotlin.jvm.internal.l.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            kotlin.jvm.internal.l.d(noBackupFilesDir, "context.noBackupFilesDir");
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr = i3.o.f18374b;
            int F10 = Eb.B.F(strArr.length);
            if (F10 < 16) {
                F10 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(F10);
            for (String str : strArr) {
                linkedHashMap2.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            Db.j jVar = new Db.j(databasePath2, file);
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = Eb.B.G(jVar);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath2, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        z.e().h(i3.o.f18373a, "Over-writing contents of " + file3);
                    }
                    z.e().a(i3.o.f18373a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static final long w(long j, float f4) {
        return (Float.isNaN(f4) || f4 >= 1.0f) ? j : j0.n.b(j, j0.n.d(j) * f4);
    }

    public static final void x(float[] fArr, float[] fArr2, int i7, float[] fArr3) {
        if (i7 == 0) {
            AbstractC2256a.a("At least one point must be provided");
        }
        int i10 = 2 >= i7 ? i7 - 1 : 2;
        int i11 = i10 + 1;
        float[][] fArr4 = new float[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr4[i12] = new float[i7];
        }
        for (int i13 = 0; i13 < i7; i13++) {
            fArr4[0][i13] = 1.0f;
            for (int i14 = 1; i14 < i11; i14++) {
                fArr4[i14][i13] = fArr4[i14 - 1][i13] * fArr[i13];
            }
        }
        float[][] fArr5 = new float[i11];
        for (int i15 = 0; i15 < i11; i15++) {
            fArr5[i15] = new float[i7];
        }
        float[][] fArr6 = new float[i11];
        for (int i16 = 0; i16 < i11; i16++) {
            fArr6[i16] = new float[i11];
        }
        int i17 = 0;
        while (i17 < i11) {
            float[] destination = fArr5[i17];
            float[] fArr7 = fArr4[i17];
            kotlin.jvm.internal.l.e(fArr7, "<this>");
            kotlin.jvm.internal.l.e(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i7);
            for (int i18 = 0; i18 < i17; i18++) {
                float[] fArr8 = fArr5[i18];
                float l10 = l(destination, fArr8);
                for (int i19 = 0; i19 < i7; i19++) {
                    destination[i19] = destination[i19] - (fArr8[i19] * l10);
                }
            }
            float sqrt = (float) Math.sqrt(l(destination, destination));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f4 = 1.0f / sqrt;
            for (int i20 = 0; i20 < i7; i20++) {
                destination[i20] = destination[i20] * f4;
            }
            float[] fArr9 = fArr6[i17];
            int i21 = 0;
            while (i21 < i11) {
                fArr9[i21] = i21 < i17 ? 0.0f : l(destination, fArr4[i21]);
                i21++;
            }
            i17++;
        }
        for (int i22 = i10; -1 < i22; i22--) {
            float l11 = l(fArr5[i22], fArr2);
            float[] fArr10 = fArr6[i22];
            int i23 = i22 + 1;
            if (i23 <= i10) {
                int i24 = i10;
                while (true) {
                    l11 -= fArr10[i24] * fArr3[i24];
                    if (i24 != i23) {
                        i24--;
                    }
                }
            }
            fArr3[i22] = l11 / fArr10[i22];
        }
    }

    public static final void y(C0 c02, InterfaceC0482c interfaceC0482c, int i7) {
        while (true) {
            int i10 = c02.f8295v;
            if (i7 > i10 && i7 < c02.f8294u) {
                return;
            }
            if (i10 == 0 && i7 == 0) {
                return;
            }
            c02.J();
            if (c02.w(c02.f8295v)) {
                interfaceC0482c.A();
            }
            c02.i();
        }
    }

    public static final Z.g z(C0506o c0506o) {
        c0506o.S(-796079677);
        Z.g gVar = (Z.g) c2.i.w(new Object[0], Z.g.f12090e, Z.h.f12095b, c0506o, 3072, 4);
        gVar.f12093c = (Z.j) c0506o.k(Z.l.f12101a);
        c0506o.p(false);
        return gVar;
    }

    public void A(boolean z8) {
    }

    public abstract void B(boolean z8);

    public abstract String k(int i7, byte[] bArr, int i10);

    public abstract int m(String str, byte[] bArr, int i7, int i10);

    public abstract boolean r();
}
