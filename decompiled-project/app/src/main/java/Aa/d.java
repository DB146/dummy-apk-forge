package Aa;

import A9.C0098j;
import A9.C0135s1;
import A9.C0163z1;
import A9.O0;
import android.os.Bundle;
import android.widget.TextView;
import com.kt.apps.core.utils.AnimationUtilsKt;
import com.kt.apps.media.xemtv.beta.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import va.C2161e;
import y9.D;
import y9.G;
import y9.I;

/* loaded from: classes2.dex */
public final class d extends f<J9.d> {

    /* renamed from: u0, reason: collision with root package name */
    public final O0 f1503u0 = vc.i.o(this, kotlin.jvm.internal.w.a(ta.c.class), new c(this, 0), new c(this, 1), new c(this, 2));

    /* renamed from: v0, reason: collision with root package name */
    public final O0 f1504v0 = vc.i.o(this, kotlin.jvm.internal.w.a(C2161e.class), new c(this, 3), new c(this, 4), new c(this, 5));

    /* renamed from: w0, reason: collision with root package name */
    public final Db.o f1505w0 = android.support.v4.media.session.b.z(new C0163z1(4));

    @Override // y9.AbstractC2464g, W1.C
    public final void b0() {
        super.b0();
        final int i7 = 0;
        ((C2161e) this.f1504v0.getValue()).get_listProgramForChannel().e(H(), new b(new Rb.c(this) { // from class: Aa.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f1498b;

            {
                this.f1498b = this;
            }

            @Override // Rb.c
            public final Object invoke(Object obj) {
                I i10 = (I) obj;
                switch (i7) {
                    case 0:
                        kotlin.jvm.internal.l.b(i10);
                        this.f1498b.u0(i10);
                        return Db.q.f3365a;
                    default:
                        kotlin.jvm.internal.l.b(i10);
                        this.f1498b.u0(i10);
                        return Db.q.f3365a;
                }
            }
        }, 0));
        final int i10 = 1;
        ((ta.c) this.f1503u0.getValue()).getListProgramForChannel().e(H(), new b(new Rb.c(this) { // from class: Aa.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f1498b;

            {
                this.f1498b = this;
            }

            @Override // Rb.c
            public final Object invoke(Object obj) {
                I i102 = (I) obj;
                switch (i10) {
                    case 0:
                        kotlin.jvm.internal.l.b(i102);
                        this.f1498b.u0(i102);
                        return Db.q.f3365a;
                    default:
                        kotlin.jvm.internal.l.b(i102);
                        this.f1498b.u0(i102);
                        return Db.q.f3365a;
                }
            }
        }, 0));
    }

    @Override // y9.AbstractC2464g
    public final int p0() {
        return R.layout.layout_tv_program_schedule;
    }

    @Override // y9.AbstractC2464g
    public final String q0() {
        return "FragmentProgramSchedule";
    }

    @Override // y9.AbstractC2464g
    public final void r0(Bundle bundle) {
        J9.d dVar = (J9.d) o0();
        J1.f currentProgramTitle = ((ta.c) this.f1503u0.getValue()).getCurrentProgramTitle();
        J9.e eVar = (J9.e) dVar;
        eVar.l(1, currentProgramTitle);
        eVar.f5750G = currentProgramTitle;
        synchronized (eVar) {
            eVar.f5753H |= 2;
        }
        eVar.a(1);
        eVar.j();
        ((J9.d) o0()).f5749F.setOnChildSelectedListener(new A4.p(5));
    }

    @Override // y9.AbstractC2464g
    public final void s0() {
        C0135s1 c0135s1 = new C0135s1();
        c0135s1.s((C0098j) this.f1505w0.getValue());
        ((J9.d) o0()).f5749F.setAdapter(c0135s1);
    }

    public final void u0(I i7) {
        boolean z8 = i7 instanceof G;
        Db.o oVar = this.f1505w0;
        if (!z8) {
            if (i7 instanceof D) {
                ((C0098j) oVar.getValue()).i();
                TextView emptyProgramText = ((J9.d) o0()).f5747D;
                kotlin.jvm.internal.l.d(emptyProgramText, "emptyProgramText");
                AnimationUtilsKt.visible(emptyProgramText);
                return;
            }
            return;
        }
        ((C0098j) oVar.getValue()).i();
        G g = (G) i7;
        if (((List) g.f27483a).isEmpty()) {
            TextView emptyProgramText2 = ((J9.d) o0()).f5747D;
            kotlin.jvm.internal.l.d(emptyProgramText2, "emptyProgramText");
            AnimationUtilsKt.visible(emptyProgramText2);
            return;
        }
        TextView emptyProgramText3 = ((J9.d) o0()).f5747D;
        kotlin.jvm.internal.l.d(emptyProgramText3, "emptyProgramText");
        AnimationUtilsKt.gone(emptyProgramText3);
        C0098j c0098j = (C0098j) oVar.getValue();
        int size = ((C0098j) oVar.getValue()).f1233c.size();
        Object obj = g.f27483a;
        c0098j.h(size, (Collection) obj);
        Iterator it = ((List) obj).iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (((N9.a) it.next()).c()) {
                break;
            } else {
                i10++;
            }
        }
        Integer valueOf = Integer.valueOf(i10);
        if (i10 < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            ((J9.d) o0()).f5749F.setSelectedPosition(valueOf.intValue());
        }
    }
}
