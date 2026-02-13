package Ea;

import Db.q;
import Q.C0498k;
import Q.C0506o;
import Q.W;
import Z.n;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;
import ia.C1355a;
import java.util.Arrays;
import java.util.List;
import q3.s;
import v2.AbstractC2127A;
import v2.u;

/* loaded from: classes2.dex */
public final class i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f3844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MobileMainActivity f3845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f3846c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f3847d;

    public i(W w10, W w11, MobileMainActivity mobileMainActivity, List list) {
        this.f3844a = w10;
        this.f3845b = mobileMainActivity;
        this.f3846c = w11;
        this.f3847d = list;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C0506o c0506o = (C0506o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0506o.x()) {
            c0506o.N();
        } else {
            Context context = (Context) c0506o.k(AndroidCompositionLocals_androidKt.f13207b);
            Object[] copyOf = Arrays.copyOf(new AbstractC2127A[0], 0);
            Hb.b bVar = new Hb.b(2);
            Ga.c cVar = new Ga.c(context, 1);
            s sVar = n.f12102a;
            s sVar2 = new s(24, bVar, cVar, false);
            boolean i7 = c0506o.i(context);
            Object H10 = c0506o.H();
            Object obj3 = C0498k.f8409a;
            if (i7 || H10 == obj3) {
                H10 = new C1355a(context, 1);
                c0506o.d0(H10);
            }
            u uVar = (u) c2.i.w(copyOf, sVar2, (Rb.a) H10, c0506o, 0, 4);
            Fa.a[] aVarArr = Fa.a.f4179a;
            c0506o.S(-1224400529);
            Object obj4 = this.f3844a;
            boolean g = c0506o.g(obj4);
            Object obj5 = this.f3845b;
            boolean i10 = g | c0506o.i(obj5);
            Object obj6 = this.f3846c;
            boolean g2 = i10 | c0506o.g(obj6);
            Object obj7 = this.f3847d;
            boolean i11 = g2 | c0506o.i(obj7);
            Object H11 = c0506o.H();
            if (i11 || H11 == obj3) {
                H11 = new g(obj5, obj7, obj4, obj6, 0);
                c0506o.d0(H11);
            }
            c0506o.p(false);
            tc.b.f(uVar, null, null, null, null, null, null, (Rb.c) H11, c0506o, 48);
        }
        return q.f3365a;
    }
}
