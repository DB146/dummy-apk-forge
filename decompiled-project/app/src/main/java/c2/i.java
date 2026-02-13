package c2;

import A0.C;
import A0.C0020i;
import A0.C0021j;
import A0.G0;
import A0.InterfaceC0022k;
import B0.AbstractC0169c;
import C.C0229n;
import C.D;
import Db.q;
import Q.C0480b;
import Q.C0498k;
import Q.C0505n0;
import Q.C0506o;
import Q.C0521x;
import Q.InterfaceC0493h0;
import Q.S;
import Q.W;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.google.shortcuts.ShortcutInfoChangeListenerImpl;
import androidx.core.google.shortcuts.TrampolineActivity;
import c.AbstractC0876t;
import c.C0853A;
import c.InterfaceC0854B;
import cb.InterfaceC0919a;
import cc.E;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.internal.appindex.zzk;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.media.xemtv.App;
import com.kt.apps.media.xemtv.beta.R;
import ea.C1111f;
import h3.C1249k;
import j0.AbstractC1362A;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l2.InterfaceC1479x;
import m1.C1544b;
import m5.InterfaceC1616m;
import n5.AbstractC1705a;
import ra.C1953a;
import tss.r.core.ads.ui.ProductDetailsActivity;
import v2.C2128B;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C1544b f14158a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile ArrayList f14159b;

    public static final void a(final List groups, final Rb.c cVar, final E9.h hVar, final Rb.a onClosePlayer, final TVChannelLinkStream tVChannelLinkStream, final boolean z8, C0506o c0506o, final int i7) {
        kotlin.jvm.internal.l.e(groups, "groups");
        kotlin.jvm.internal.l.e(onClosePlayer, "onClosePlayer");
        c0506o.U(-2094348292);
        if (((i7 | (c0506o.i(groups) ? 4 : 2) | (c0506o.i(cVar) ? 32 : 16) | (c0506o.i(hVar) ? 256 : 128) | (c0506o.i(onClosePlayer) ? 2048 : 1024) | (c0506o.i(tVChannelLinkStream) ? 16384 : 8192)) & 9363) == 9362 && c0506o.x()) {
            c0506o.N();
        } else {
            S s3 = C0498k.f8409a;
            Context context = (Context) c0506o.k(AndroidCompositionLocals_androidKt.f13207b);
            c0506o.S(5004770);
            boolean g = c0506o.g(tVChannelLinkStream);
            Object H10 = c0506o.H();
            if (g || H10 == s3) {
                H10 = C0480b.o(Boolean.valueOf(tVChannelLinkStream != null));
                c0506o.d0(H10);
            }
            c0506o.p(false);
            N.w.a(androidx.compose.foundation.a.a(androidx.compose.animation.c.a(androidx.compose.foundation.layout.b.f13155b), j0.n.f18548b, AbstractC1362A.f18492a), null, null, null, null, 0, 0L, 0L, null, Y.f.d(-125640051, new Ga.n(tVChannelLinkStream, groups, cVar, context, hVar, (W) H10, onClosePlayer), c0506o), c0506o, 805306368);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new Rb.e(groups, cVar, hVar, onClosePlayer, tVChannelLinkStream, z8, i7) { // from class: Ga.a

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f4400a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Rb.c f4401b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ E9.h f4402c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Rb.a f4403d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ TVChannelLinkStream f4404e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f4405f;

                @Override // Rb.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int u3 = C0480b.u(1);
                    E9.h hVar2 = this.f4402c;
                    TVChannelLinkStream tVChannelLinkStream2 = this.f4404e;
                    boolean z10 = this.f4405f;
                    c2.i.a(this.f4400a, this.f4401b, hVar2, this.f4403d, tVChannelLinkStream2, z10, (C0506o) obj, u3);
                    return q.f3365a;
                }
            };
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v24 ??, still in use, count: 1, list:
          (r1v24 ?? I:java.lang.Object) from 0x0386: INVOKE (r14v13 ?? I:Q.o), (r1v24 ?? I:java.lang.Object) VIRTUAL call: Q.o.d0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final void b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v24 ??, still in use, count: 1, list:
          (r1v24 ?? I:java.lang.Object) from 0x0386: INVOKE (r14v13 ?? I:Q.o), (r1v24 ?? I:java.lang.Object) VIRTUAL call: Q.o.d0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r42v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [c.t, java.lang.Object, d.f] */
    public static final void c(boolean z8, Rb.e eVar, C0506o c0506o, int i7) {
        int i10;
        c0506o.U(-642000585);
        if ((i7 & 6) == 0) {
            i10 = (c0506o.h(z8) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= c0506o.i(eVar) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && c0506o.x()) {
            c0506o.N();
        } else {
            W r10 = C0480b.r(eVar, c0506o);
            Object H10 = c0506o.H();
            S s3 = C0498k.f8409a;
            if (H10 == s3) {
                C0521x c0521x = new C0521x(C0480b.k(c0506o));
                c0506o.d0(c0521x);
                H10 = c0521x;
            }
            E e2 = ((C0521x) H10).f8567a;
            Object H11 = c0506o.H();
            Object obj = H11;
            if (H11 == s3) {
                Rb.e eVar2 = (Rb.e) r10.getValue();
                ?? abstractC0876t = new AbstractC0876t(z8);
                abstractC0876t.f16290d = e2;
                abstractC0876t.f16291e = eVar2;
                c0506o.d0(abstractC0876t);
                obj = abstractC0876t;
            }
            d.f fVar = (d.f) obj;
            boolean g = c0506o.g((Rb.e) r10.getValue()) | c0506o.g(e2);
            Object H12 = c0506o.H();
            if (g || H12 == s3) {
                fVar.f16291e = (Rb.e) r10.getValue();
                fVar.f16290d = e2;
                c0506o.d0(Db.q.f3365a);
            }
            Boolean valueOf = Boolean.valueOf(z8);
            boolean i11 = ((i10 & 14) == 4) | c0506o.i(fVar);
            Object H13 = c0506o.H();
            Object obj2 = null;
            if (i11 || H13 == s3) {
                H13 = new d.g(fVar, z8, null);
                c0506o.d0(H13);
            }
            C0480b.e(c0506o, (Rb.e) H13, valueOf);
            InterfaceC0854B interfaceC0854B = (InterfaceC0854B) c0506o.k(d.c.f16283a);
            if (interfaceC0854B == null) {
                c0506o.S(544166745);
                View view = (View) c0506o.k(AndroidCompositionLocals_androidKt.f13211f);
                kotlin.jvm.internal.l.e(view, "<this>");
                while (true) {
                    if (view == null) {
                        interfaceC0854B = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                    InterfaceC0854B interfaceC0854B2 = tag instanceof InterfaceC0854B ? (InterfaceC0854B) tag : null;
                    if (interfaceC0854B2 != null) {
                        interfaceC0854B = interfaceC0854B2;
                        break;
                    } else {
                        Object q10 = android.support.v4.media.session.b.q(view);
                        view = q10 instanceof View ? (View) q10 : null;
                    }
                }
                c0506o.p(false);
            } else {
                c0506o.S(544164296);
                c0506o.p(false);
            }
            if (interfaceC0854B == null) {
                c0506o.S(544168748);
                Context context = (Context) c0506o.k(AndroidCompositionLocals_androidKt.f13207b);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof InterfaceC0854B) {
                        obj2 = context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                interfaceC0854B = (InterfaceC0854B) obj2;
                c0506o.p(false);
            } else {
                c0506o.S(544164377);
                c0506o.p(false);
            }
            if (interfaceC0854B == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C0853A a9 = interfaceC0854B.a();
            InterfaceC1479x interfaceC1479x = (InterfaceC1479x) c0506o.k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean i12 = c0506o.i(a9) | c0506o.i(interfaceC1479x) | c0506o.i(fVar);
            Object H14 = c0506o.H();
            if (i12 || H14 == s3) {
                H14 = new D(a9, interfaceC1479x, fVar, 3);
                c0506o.d0(H14);
            }
            C0480b.d(interfaceC1479x, a9, (Rb.c) H14, c0506o);
        }
        C0505n0 r11 = c0506o.r();
        if (r11 != null) {
            r11.f8432d = new d.h(z8, eVar, i7);
        }
    }

    public static final void d(C0506o c0506o, c0.m mVar) {
        C0229n c0229n = C0229n.f2414c;
        int i7 = c0506o.f8449P;
        c0.m c10 = c0.o.c(c0506o, mVar);
        InterfaceC0493h0 m10 = c0506o.m();
        InterfaceC0022k.g.getClass();
        C c11 = C0021j.f241b;
        G0 g02 = c0506o.f8451a;
        c0506o.W();
        if (c0506o.f8448O) {
            c0506o.l(c11);
        } else {
            c0506o.g0();
        }
        C0480b.s(c0506o, C0021j.f244e, c0229n);
        C0480b.s(c0506o, C0021j.f243d, m10);
        C0480b.s(c0506o, C0021j.f242c, c10);
        C0020i c0020i = C0021j.f245f;
        if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i7))) {
            c0506o.d0(Integer.valueOf(i7));
            c0506o.c(Integer.valueOf(i7), c0020i);
        }
        c0506o.p(true);
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(InterfaceC1616m interfaceC1616m) {
        if (interfaceC1616m != null) {
            try {
                interfaceC1616m.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void g(v2.s sVar, String str, Y.e eVar) {
        C2128B c2128b = sVar.f25022f;
        c2128b.getClass();
        sVar.f25023h.add(new w2.j((w2.i) c2128b.b(O5.b.s(w2.i.class)), str, eVar).a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [vc.f, java.lang.Object] */
    public static vc.f h(String str) {
        ?? obj = new Object();
        vc.d dVar = new vc.d();
        obj.f25473a = dVar;
        vc.i.C(str, "url");
        try {
            dVar.f25451a = new C1111f(new URL(str)).l();
            return obj;
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(y.S.b("The supplied URL, '", str, "', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls"), e2);
        }
    }

    public static void i(long j, n5.v vVar, s4.v[] vVarArr) {
        int i7;
        while (true) {
            if (vVar.a() <= 1) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (vVar.a() == 0) {
                    i7 = -1;
                    break;
                }
                int v10 = vVar.v();
                i10 += v10;
                if (v10 != 255) {
                    i7 = i10;
                    break;
                }
            }
            int i11 = 0;
            while (true) {
                if (vVar.a() == 0) {
                    i11 = -1;
                    break;
                }
                int v11 = vVar.v();
                i11 += v11;
                if (v11 != 255) {
                    break;
                }
            }
            int i12 = vVar.f21230b + i11;
            if (i11 == -1 || i11 > vVar.a()) {
                AbstractC1705a.S("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i12 = vVar.f21231c;
            } else if (i7 == 4 && i11 >= 8) {
                int v12 = vVar.v();
                int A10 = vVar.A();
                int h10 = A10 == 49 ? vVar.h() : 0;
                int v13 = vVar.v();
                if (A10 == 47) {
                    vVar.H(1);
                }
                boolean z8 = v12 == 181 && (A10 == 49 || A10 == 47) && v13 == 3;
                if (A10 == 49) {
                    z8 &= h10 == 1195456820;
                }
                if (z8) {
                    j(j, vVar, vVarArr);
                }
            }
            vVar.G(i12);
        }
    }

    public static void j(long j, n5.v vVar, s4.v[] vVarArr) {
        int v10 = vVar.v();
        if ((v10 & 64) != 0) {
            vVar.H(1);
            int i7 = (v10 & 31) * 3;
            int i10 = vVar.f21230b;
            for (s4.v vVar2 : vVarArr) {
                vVar.G(i10);
                vVar2.c(i7, vVar);
                if (j != -9223372036854775807L) {
                    vVar2.e(j, 1, i7, 0, null);
                }
            }
        }
    }

    public static Intent k(Context context, Jc.a bannerAd) {
        kotlin.jvm.internal.l.e(bannerAd, "bannerAd");
        Jc.e eVar = new Jc.e(bannerAd.f5779a, bannerAd.f5780b, bannerAd.f5781c, bannerAd.f5782d, bannerAd.f5783e, bannerAd.f5784f, bannerAd.f5785u, bannerAd.f5786v, bannerAd.f5787w, bannerAd.f5788x, bannerAd.f5789y, bannerAd.f5790z, bannerAd.f5771A, bannerAd.f5772B, bannerAd.f5773C, bannerAd.f5774D, bannerAd.f5775E);
        Intent intent = new Intent(context, (Class<?>) ProductDetailsActivity.class);
        intent.putExtra("extra_banner_ad", eVar);
        return intent;
    }

    public static final long l() {
        return Thread.currentThread().getId();
    }

    public static final boolean m(int i7, int i10) {
        return i7 == i10;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String[], java.io.Serializable] */
    public static final Serializable n(byte b2, DataInputStream dataInputStream) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i7 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r02 = new Boolean[readInt];
            while (i7 < readInt) {
                r02[i7] = Boolean.valueOf(dataInputStream.readBoolean());
                i7++;
            }
            return r02;
        }
        if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r03 = new Byte[readInt2];
            while (i7 < readInt2) {
                r03[i7] = Byte.valueOf(dataInputStream.readByte());
                i7++;
            }
            return r03;
        }
        if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r04 = new Integer[readInt3];
            while (i7 < readInt3) {
                r04[i7] = Integer.valueOf(dataInputStream.readInt());
                i7++;
            }
            return r04;
        }
        if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r05 = new Long[readInt4];
            while (i7 < readInt4) {
                r05[i7] = Long.valueOf(dataInputStream.readLong());
                i7++;
            }
            return r05;
        }
        if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r06 = new Float[readInt5];
            while (i7 < readInt5) {
                r06[i7] = Float.valueOf(dataInputStream.readFloat());
                i7++;
            }
            return r06;
        }
        if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r07 = new Double[readInt6];
            while (i7 < readInt6) {
                r07[i7] = Double.valueOf(dataInputStream.readDouble());
                i7++;
            }
            return r07;
        }
        if (b2 != 14) {
            throw new IllegalStateException(h3.o.l(b2, "Unsupported type "));
        }
        int readInt7 = dataInputStream.readInt();
        ?? r12 = new String[readInt7];
        while (i7 < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (kotlin.jvm.internal.l.a(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r12[i7] = readUTF;
            i7++;
        }
        return r12;
    }

    public static final String o(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static Object p(Class cls, Object obj) {
        if (obj instanceof InterfaceC0919a) {
            return cls.cast(obj);
        }
        if (obj instanceof cb.b) {
            return p(cls, ((cb.b) obj).e());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + InterfaceC0919a.class + " or " + cb.b.class);
    }

    public static final Class q(Yb.c cVar) {
        kotlin.jvm.internal.l.e(cVar, "<this>");
        Class a9 = ((kotlin.jvm.internal.d) cVar).a();
        kotlin.jvm.internal.l.c(a9, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a9;
    }

    public static final Class r(Yb.c cVar) {
        kotlin.jvm.internal.l.e(cVar, "<this>");
        Class a9 = ((kotlin.jvm.internal.d) cVar).a();
        if (!a9.isPrimitive()) {
            return a9;
        }
        String name = a9.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? a9 : Double.class;
            case 104431:
                return !name.equals("int") ? a9 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? a9 : Byte.class;
            case 3052374:
                return !name.equals("char") ? a9 : Character.class;
            case 3327612:
                return !name.equals("long") ? a9 : Long.class;
            case 3625364:
                return !name.equals("void") ? a9 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? a9 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? a9 : Float.class;
            case 109413500:
                return !name.equals("short") ? a9 : Short.class;
            default:
                return a9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List s(App app) {
        Bundle bundle;
        if (f14159b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = app.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(app.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null) {
                    String string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl");
                    if (string != null) {
                        try {
                            arrayList.add((ShortcutInfoChangeListenerImpl) Class.forName(string, false, i.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, app));
                        } catch (Exception unused) {
                        }
                    }
                    while (it.hasNext()) {
                    }
                }
            }
            if (f14159b == null) {
                f14159b = arrayList;
            }
        }
        return f14159b;
    }

    public static int t(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 4) {
            return 2;
        }
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 32) {
            return 5;
        }
        if (i7 == 64) {
            return 6;
        }
        if (i7 == 128) {
            return 7;
        }
        if (i7 == 256) {
            return 8;
        }
        if (i7 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(h3.o.l(i7, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean u(byte b2) {
        return b2 > -65;
    }

    public static void v(O9.a aVar, AbstractC0169c obj) {
        Bundle e2 = com.bumptech.glide.c.e();
        kotlin.jvm.internal.l.e(obj, "obj");
        Bundle e10 = com.bumptech.glide.c.e();
        e10.putAll(e2);
        e10.putAll((Bundle) obj.f1862b);
        ((C1953a) aVar).a((String) obj.f1861a, e10);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r12v0 ?? I:Q.o), (r8v0 ?? I:java.lang.Object) VIRTUAL call: Q.o.d0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static final java.lang.Object w(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x004f: INVOKE (r12v0 ?? I:Q.o), (r8v0 ?? I:java.lang.Object) VIRTUAL call: Q.o.d0(java.lang.Object):void A[MD:(java.lang.Object):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public static void x(App app) {
        if (Build.VERSION.SDK_INT >= 25) {
            A1.a.f(app.getSystemService(A1.a.g())).reportShortcutUsed("com.kt.apps.media.xemtv.2");
        }
        Iterator it = ((ArrayList) s(app)).iterator();
        while (it.hasNext()) {
            ShortcutInfoChangeListenerImpl shortcutInfoChangeListenerImpl = (ShortcutInfoChangeListenerImpl) it.next();
            List<String> singletonList = Collections.singletonList("com.kt.apps.media.xemtv.2");
            shortcutInfoChangeListenerImpl.getClass();
            for (String str : singletonList) {
                Intent intent = new Intent(shortcutInfoChangeListenerImpl.f13270a, (Class<?>) TrampolineActivity.class);
                intent.setAction("androidx.core.content.pm.SHORTCUT_LISTENER");
                intent.putExtra("id", str);
                String uri = intent.toUri(1);
                Bundle bundle = new Bundle();
                G.g(uri);
                shortcutInfoChangeListenerImpl.f13272c.end(new zzk("ViewAction", "", uri, null, null, bundle));
            }
        }
    }

    public static byte[] y(C1249k data) {
        kotlin.jvm.internal.l.e(data, "data");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                HashMap hashMap = data.f17699a;
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    z(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                tc.b.o(dataOutputStream, null);
                kotlin.jvm.internal.l.d(byteArray, "{\n                ByteAr…          }\n            }");
                return byteArray;
            } finally {
            }
        } catch (IOException e2) {
            h3.z.e().d(h3.l.f17700a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void z(DataOutputStream dataOutputStream, String str, Object obj) {
        int i7;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + kotlin.jvm.internal.w.a(obj.getClass()).c());
            }
            Object[] objArr = (Object[]) obj;
            kotlin.jvm.internal.e a9 = kotlin.jvm.internal.w.a(objArr.getClass());
            if (a9.equals(kotlin.jvm.internal.w.a(Boolean[].class))) {
                i7 = 8;
            } else if (a9.equals(kotlin.jvm.internal.w.a(Byte[].class))) {
                i7 = 9;
            } else if (a9.equals(kotlin.jvm.internal.w.a(Integer[].class))) {
                i7 = 10;
            } else if (a9.equals(kotlin.jvm.internal.w.a(Long[].class))) {
                i7 = 11;
            } else if (a9.equals(kotlin.jvm.internal.w.a(Float[].class))) {
                i7 = 12;
            } else if (a9.equals(kotlin.jvm.internal.w.a(Double[].class))) {
                i7 = 13;
            } else {
                if (!a9.equals(kotlin.jvm.internal.w.a(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + kotlin.jvm.internal.w.a(objArr.getClass()).b());
                }
                i7 = 14;
            }
            dataOutputStream.writeByte(i7);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i7 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i7 == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i7 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i7 == 11) {
                    Long l10 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l10 != null ? l10.longValue() : 0L);
                } else if (i7 == 12) {
                    Float f4 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f4 != null ? f4.floatValue() : 0.0f);
                } else if (i7 == 13) {
                    Double d10 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d10 != null ? d10.doubleValue() : 0.0d);
                } else if (i7 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }
}
