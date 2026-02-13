package Ba;

import W1.C;
import android.view.View;
import hb.C1268a;
import y9.AbstractC2456A;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f2265b;

    public /* synthetic */ n(int i7, C c10) {
        this.f2264a = i7;
        this.f2265b = c10;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C c10 = this.f2265b;
        switch (this.f2264a) {
            case 0:
                s sVar = (s) c10;
                C1268a c1268a = sVar.f2292g1;
                La.g gVar = sVar.f2276Q0;
                if (gVar == null) {
                    kotlin.jvm.internal.l.j("voiceSelectorManager");
                    throw null;
                }
                qb.r d10 = gVar.d(com.bumptech.glide.c.f(new Db.j("extra:reset_setting", Boolean.TRUE)));
                qb.b bVar = new qb.b(p.f2269c, lb.b.f19616e);
                d10.b(bVar);
                c1268a.d(bVar);
                return false;
            default:
                Db.o oVar = AbstractC2456A.g2;
                view.setSelected(!view.isSelected());
                AbstractC2456A abstractC2456A = (AbstractC2456A) c10;
                abstractC2456A.h1(com.bumptech.glide.c.f(new Db.j("extra:reset_setting", Boolean.TRUE)));
                abstractC2456A.Q0();
                return false;
        }
    }
}
