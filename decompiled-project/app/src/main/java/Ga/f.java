package Ga;

import A0.C;
import A0.C0020i;
import A0.C0021j;
import A0.InterfaceC0022k;
import C.AbstractC0224i;
import C.AbstractC0230o;
import C.AbstractC0233s;
import C.C0219d;
import C.F;
import C.u;
import Db.q;
import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import Q.InterfaceC0493h0;
import Q.S;
import Q.W;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import c0.o;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import w.InterfaceC2192t;
import y0.InterfaceC2316A;

/* loaded from: classes2.dex */
public final class f implements Rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f4418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E9.h f4420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f4421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Rb.a f4422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TVChannelLinkStream f4423f;

    public f(F f4, Context context, E9.h hVar, W w10, Rb.a aVar, TVChannelLinkStream tVChannelLinkStream) {
        this.f4418a = f4;
        this.f4419b = context;
        this.f4420c = hVar;
        this.f4421d = w10;
        this.f4422e = aVar;
        this.f4423f = tVChannelLinkStream;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        InterfaceC2192t AnimatedVisibility = (InterfaceC2192t) obj;
        C0506o c0506o = (C0506o) obj2;
        ((Number) obj3).intValue();
        kotlin.jvm.internal.l.e(AnimatedVisibility, "$this$AnimatedVisibility");
        c0.m c10 = androidx.compose.foundation.layout.a.c(13, 0.0f, this.f4418a.c());
        C0219d c0219d = AbstractC0224i.f2402a;
        u a9 = AbstractC0233s.a(c0506o);
        int i7 = c0506o.f8449P;
        InterfaceC0493h0 m10 = c0506o.m();
        c0.m c11 = o.c(c0506o, c10);
        InterfaceC0022k.g.getClass();
        C c12 = C0021j.f241b;
        c0506o.W();
        if (c0506o.f8448O) {
            c0506o.l(c12);
        } else {
            c0506o.g0();
        }
        C0020i c0020i = C0021j.f244e;
        C0480b.s(c0506o, c0020i, a9);
        C0020i c0020i2 = C0021j.f243d;
        C0480b.s(c0506o, c0020i2, m10);
        C0020i c0020i3 = C0021j.f245f;
        if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i7))) {
            c0506o.d0(Integer.valueOf(i7));
            c0506o.c(Integer.valueOf(i7), c0020i3);
        }
        C0020i c0020i4 = C0021j.f242c;
        C0480b.s(c0506o, c0020i4, c11);
        c0.m a10 = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.b.f13154a, 1.6f);
        InterfaceC2316A d10 = AbstractC0230o.d(false);
        int i10 = c0506o.f8449P;
        InterfaceC0493h0 m11 = c0506o.m();
        c0.m c13 = o.c(c0506o, a10);
        c0506o.W();
        if (c0506o.f8448O) {
            c0506o.l(c12);
        } else {
            c0506o.g0();
        }
        C0480b.s(c0506o, c0020i, d10);
        C0480b.s(c0506o, c0020i2, m11);
        if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i10))) {
            c0506o.d0(Integer.valueOf(i10));
            c0506o.c(Integer.valueOf(i10), c0020i3);
        }
        C0480b.s(c0506o, c0020i4, c13);
        c0506o.S(5004770);
        Context context = this.f4419b;
        boolean i11 = c0506o.i(context);
        Object H10 = c0506o.H();
        S s3 = C0498k.f8409a;
        if (i11 || H10 == s3) {
            H10 = new c(context, 0);
            c0506o.d0(H10);
        }
        Rb.c cVar = (Rb.c) H10;
        c0506o.p(false);
        FillElement fillElement = androidx.compose.foundation.layout.b.f13155b;
        c0506o.S(5004770);
        E9.h hVar = this.f4420c;
        boolean i12 = c0506o.i(hVar);
        Object H11 = c0506o.H();
        if (i12 || H11 == s3) {
            H11 = new Ba.o(hVar, 9);
            c0506o.d0(H11);
        }
        c0506o.p(false);
        androidx.compose.ui.viewinterop.a.a(cVar, fillElement, (Rb.c) H11, c0506o, 48);
        Boolean bool = (Boolean) this.f4421d.getValue();
        bool.getClass();
        androidx.compose.animation.a.a(bool, fillElement, null, null, "", null, Y.f.d(-1589664742, new e(this.f4422e, this.f4423f), c0506o), c0506o, 1597488);
        c0506o.p(true);
        c2.i.d(c0506o, androidx.compose.foundation.layout.b.a(20));
        c0506o.p(true);
        return q.f3365a;
    }
}
