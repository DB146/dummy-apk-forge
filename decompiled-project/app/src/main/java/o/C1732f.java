package o;

import android.content.Context;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;
import n.AbstractC1686t;
import n.C1688v;
import n.MenuC1678l;
import n.SubMenuC1666D;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1732f extends C1688v {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f21489l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1740j f21490m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732f(C1740j c1740j, Context context, SubMenuC1666D subMenuC1666D, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC1666D, false);
        this.f21490m = c1740j;
        if (!subMenuC1666D.f20880O.f()) {
            View view2 = c1740j.f21523w;
            this.f21013e = view2 == null ? (View) c1740j.f21522v : view2;
        }
        R7.b bVar = c1740j.f21514K;
        this.f21015h = bVar;
        AbstractC1686t abstractC1686t = this.f21016i;
        if (abstractC1686t != null) {
            abstractC1686t.j(bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732f(C1740j c1740j, Context context, MenuC1678l menuC1678l, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC1678l, true);
        this.f21490m = c1740j;
        this.f21014f = 8388613;
        R7.b bVar = c1740j.f21514K;
        this.f21015h = bVar;
        AbstractC1686t abstractC1686t = this.f21016i;
        if (abstractC1686t != null) {
            abstractC1686t.j(bVar);
        }
    }

    @Override // n.C1688v
    public final void c() {
        switch (this.f21489l) {
            case 0:
                C1740j c1740j = this.f21490m;
                c1740j.f21511H = null;
                c1740j.getClass();
                super.c();
                return;
            default:
                C1740j c1740j2 = this.f21490m;
                MenuC1678l menuC1678l = c1740j2.f21517c;
                if (menuC1678l != null) {
                    menuC1678l.c(true);
                }
                c1740j2.f21510G = null;
                super.c();
                return;
        }
    }
}
