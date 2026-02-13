package androidx.compose.foundation.lazy.layout;

import A0.j0;
import Db.q;
import E.l;
import F.C0276u;
import F.D;
import F.E;
import F.RunnableC0258b;
import F.U;
import F.r;
import Q.C0498k;
import Q.C0506o;
import Q.S;
import Q.W;
import Rb.e;
import Rb.f;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import y0.AbstractC2328M;
import y0.C2331P;

/* loaded from: classes.dex */
public final class c extends m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f13173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.m f13174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f13175c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f13176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(D d10, c0.m mVar, e eVar, W w10) {
        super(3);
        this.f13173a = d10;
        this.f13174b = mVar;
        this.f13175c = eVar;
        this.f13176d = w10;
    }

    @Override // Rb.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        c0.m c10;
        Object obj4;
        Z.c cVar = (Z.c) obj;
        C0506o c0506o = (C0506o) obj2;
        ((Number) obj3).intValue();
        Object H10 = c0506o.H();
        S s3 = C0498k.f8409a;
        if (H10 == s3) {
            H10 = new r(cVar, new l(this.f13176d, 1));
            c0506o.d0(H10);
        }
        r rVar = (r) H10;
        Object H11 = c0506o.H();
        if (H11 == s3) {
            H11 = new C2331P(new q3.e(rVar));
            c0506o.d0(H11);
        }
        C2331P c2331p = (C2331P) H11;
        D d10 = this.f13173a;
        if (d10 != null) {
            c0506o.S(204281539);
            c0506o.S(6591363);
            Object obj5 = U.f3954a;
            if (obj5 != null) {
                c0506o.S(1213893039);
                c0506o.p(false);
                obj4 = obj5;
            } else {
                c0506o.S(1213931944);
                View view = (View) c0506o.k(AndroidCompositionLocals_androidKt.f13211f);
                boolean g = c0506o.g(view);
                Object H12 = c0506o.H();
                if (g || H12 == s3) {
                    H12 = new RunnableC0258b(view);
                    c0506o.d0(H12);
                }
                c0506o.p(false);
                obj4 = (RunnableC0258b) H12;
            }
            c0506o.p(false);
            Object[] objArr = {d10, rVar, c2331p, obj4};
            boolean g2 = c0506o.g(d10) | c0506o.i(rVar) | c0506o.i(c2331p) | c0506o.i(obj4);
            Object H13 = c0506o.H();
            if (g2 || H13 == s3) {
                C0276u c0276u = new C0276u(d10, rVar, c2331p, obj4, 0);
                c0506o.d0(c0276u);
                H13 = c0276u;
            }
            Rb.c cVar2 = (Rb.c) H13;
            boolean z8 = false;
            for (Object obj6 : Arrays.copyOf(objArr, 4)) {
                z8 |= c0506o.g(obj6);
            }
            Object H14 = c0506o.H();
            if (z8 || H14 == s3) {
                c0506o.d0(new Q.D(cVar2));
            }
            c0506o.p(false);
        } else {
            c0506o.S(204710145);
            c0506o.p(false);
        }
        int i7 = E.f3905b;
        c0.m mVar = this.f13174b;
        if (d10 != null && (c10 = mVar.c(new TraversablePrefetchStateModifierElement(d10))) != null) {
            mVar = c10;
        }
        boolean g10 = c0506o.g(rVar);
        e eVar = this.f13175c;
        boolean g11 = g10 | c0506o.g(eVar);
        Object H15 = c0506o.H();
        if (g11 || H15 == s3) {
            H15 = new j0(3, rVar, eVar);
            c0506o.d0(H15);
        }
        AbstractC2328M.b(c2331p, mVar, (e) H15, c0506o, 8);
        return q.f3365a;
    }
}
