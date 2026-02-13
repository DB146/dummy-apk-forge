package B0;

import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import Q.C0515t;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0825b;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Set;

/* loaded from: classes.dex */
public final class x1 extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f2015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y.e f2016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(y1 y1Var, Y.e eVar, int i7) {
        super(2);
        this.f2014a = i7;
        this.f2015b = y1Var;
        this.f2016c = eVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2014a) {
            case 0:
                C0506o c0506o = (C0506o) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0506o.K(intValue & 1, (intValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(this.f2015b.f2021a, this.f2016c, c0506o, 0);
                } else {
                    c0506o.N();
                }
                return Db.q.f3365a;
            default:
                C0506o c0506o2 = (C0506o) obj;
                int intValue2 = ((Number) obj2).intValue();
                boolean z8 = false;
                if (c0506o2.K(intValue2 & 1, (intValue2 & 3) != 2)) {
                    y1 y1Var = this.f2015b;
                    Object tag = y1Var.f2021a.getTag(R.id.inspection_slot_table_set);
                    if ((tag instanceof Set) && (!(tag instanceof Sb.a) || (tag instanceof Sb.e))) {
                        z8 = true;
                    }
                    Set set = z8 ? (Set) tag : null;
                    D d10 = y1Var.f2021a;
                    if (set == null) {
                        Object parent = d10.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof Sb.a) && !(tag2 instanceof Sb.e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        C0515t c0515t = c0506o2.f8450Q;
                        if (c0515t == null) {
                            c0515t = new C0515t(c0506o2.g);
                            c0506o2.f8450Q = c0515t;
                        }
                        set.add(c0515t);
                        c0506o2.f8463p = true;
                        c0506o2.f8436B = true;
                        c0506o2.f8453c.o();
                        c0506o2.f8441G.o();
                        Q.C0 c02 = c0506o2.f8442H;
                        Q.z0 z0Var = c02.f8277a;
                        c02.f8281e = z0Var.f8595x;
                        c02.f8282f = z0Var.f8596y;
                    }
                    boolean i7 = c0506o2.i(y1Var);
                    Object H10 = c0506o2.H();
                    Q.S s3 = C0498k.f8409a;
                    if (i7 || H10 == s3) {
                        H10 = new v1(y1Var, null);
                        c0506o2.d0(H10);
                    }
                    C0480b.e(c0506o2, (Rb.e) H10, d10);
                    boolean i10 = c0506o2.i(y1Var);
                    Object H11 = c0506o2.H();
                    if (i10 || H11 == s3) {
                        H11 = new w1(y1Var, null);
                        c0506o2.d0(H11);
                    }
                    C0480b.e(c0506o2, (Rb.e) H11, d10);
                    C0480b.a(AbstractC0825b.f13769a.a(set), Y.f.d(-1193460702, new x1(y1Var, this.f2016c, 0), c0506o2), c0506o2, 56);
                } else {
                    c0506o2.N();
                }
                return Db.q.f3365a;
        }
    }
}
