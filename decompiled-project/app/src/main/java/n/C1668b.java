package n;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import o.AbstractViewOnTouchListenerC1753p0;
import o.C1732f;
import o.C1734g;
import o.C1738i;
import o.C1740j;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1668b extends AbstractViewOnTouchListenerC1753p0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f20897x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ View f20898y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1668b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f20898y = actionMenuItemView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1668b(C1738i c1738i, C1738i c1738i2) {
        super(c1738i2);
        this.f20898y = c1738i;
    }

    @Override // o.AbstractViewOnTouchListenerC1753p0
    public final InterfaceC1664B b() {
        C1732f c1732f;
        switch (this.f20897x) {
            case 0:
                AbstractC1669c abstractC1669c = ((ActionMenuItemView) this.f20898y).f12884A;
                if (abstractC1669c == null || (c1732f = ((C1734g) abstractC1669c).f21497a.f21511H) == null) {
                    return null;
                }
                return c1732f.a();
            default:
                C1732f c1732f2 = ((C1738i) this.f20898y).f21503d.f21510G;
                if (c1732f2 == null) {
                    return null;
                }
                return c1732f2.a();
        }
    }

    @Override // o.AbstractViewOnTouchListenerC1753p0
    public final boolean c() {
        InterfaceC1664B b2;
        switch (this.f20897x) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f20898y;
                InterfaceC1677k interfaceC1677k = actionMenuItemView.f12893y;
                return interfaceC1677k != null && interfaceC1677k.c(actionMenuItemView.f12890v) && (b2 = b()) != null && b2.b();
            default:
                ((C1738i) this.f20898y).f21503d.l();
                return true;
        }
    }

    @Override // o.AbstractViewOnTouchListenerC1753p0
    public boolean d() {
        switch (this.f20897x) {
            case 1:
                C1740j c1740j = ((C1738i) this.f20898y).f21503d;
                if (c1740j.f21512I != null) {
                    return false;
                }
                c1740j.c();
                return true;
            default:
                return super.d();
        }
    }
}
