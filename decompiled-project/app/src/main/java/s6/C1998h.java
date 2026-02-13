package s6;

import android.view.SubMenu;
import n.C1680n;
import n.MenuC1678l;
import n.SubMenuC1666D;

/* renamed from: s6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1998h extends MenuC1678l {
    @Override // n.MenuC1678l, android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        C1680n a9 = a(i7, i10, i11, charSequence);
        SubMenuC1666D subMenuC1666D = new SubMenuC1666D(this.f20954a, this, a9);
        a9.f20971C = subMenuC1666D;
        subMenuC1666D.setHeaderTitle(a9.f20989e);
        return subMenuC1666D;
    }
}
