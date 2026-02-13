package Ea;

import Db.q;
import Q.C0498k;
import Q.C0506o;
import Q.W;
import com.kt.apps.core.tv.model.TVChannelLinkStream;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;
import java.util.List;
import v2.C2133e;
import w.C2182i;

/* loaded from: classes2.dex */
public final class h implements Rb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MobileMainActivity f3840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f3841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f3842c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f3843d;

    public h(W w10, W w11, MobileMainActivity mobileMainActivity, List list) {
        this.f3840a = mobileMainActivity;
        this.f3841b = list;
        this.f3842c = w10;
        this.f3843d = w11;
    }

    @Override // Rb.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        C2182i composable = (C2182i) obj;
        C2133e it = (C2133e) obj2;
        C0506o c0506o = (C0506o) obj3;
        ((Number) obj4).intValue();
        kotlin.jvm.internal.l.e(composable, "$this$composable");
        kotlin.jvm.internal.l.e(it, "it");
        TVChannelLinkStream tVChannelLinkStream = (TVChannelLinkStream) this.f3842c.getValue();
        MobileMainActivity mobileMainActivity = this.f3840a;
        E9.h k = mobileMainActivity.k();
        boolean booleanValue = ((Boolean) this.f3843d.getValue()).booleanValue();
        c0506o.S(5004770);
        boolean i7 = c0506o.i(mobileMainActivity);
        Object H10 = c0506o.H();
        Object obj5 = C0498k.f8409a;
        if (i7 || H10 == obj5) {
            H10 = new d(mobileMainActivity, 1);
            c0506o.d0(H10);
        }
        Rb.c cVar = (Rb.c) H10;
        c0506o.p(false);
        c0506o.S(5004770);
        boolean i10 = c0506o.i(mobileMainActivity);
        Object H11 = c0506o.H();
        if (i10 || H11 == obj5) {
            H11 = new e(mobileMainActivity, 1);
            c0506o.d0(H11);
        }
        c0506o.p(false);
        c2.i.a(this.f3841b, cVar, k, (Rb.a) H11, tVChannelLinkStream, booleanValue, c0506o, 0);
        return q.f3365a;
    }
}
