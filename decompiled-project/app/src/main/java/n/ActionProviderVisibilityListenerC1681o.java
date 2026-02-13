package n;

import android.view.ActionProvider;
import i1.C1290a;

/* renamed from: n.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC1681o implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public C1290a f20997a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f20998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuItemC1685s f20999c;

    public ActionProviderVisibilityListenerC1681o(MenuItemC1685s menuItemC1685s, ActionProvider actionProvider) {
        this.f20999c = menuItemC1685s;
        this.f20998b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z8) {
        C1290a c1290a = this.f20997a;
        if (c1290a != null) {
            MenuC1678l menuC1678l = ((C1680n) c1290a.f18187b).f20970B;
            menuC1678l.f20961v = true;
            menuC1678l.p(true);
        }
    }
}
