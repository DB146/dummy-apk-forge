package N3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import c3.C0888e;
import d2.C1043c;
import d2.C1044d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7171a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7172b;

    public b() {
        this.f7171a = 2;
        this.f7172b = new ArrayList();
    }

    public b(b bVar, C1044d c1044d) {
        this.f7171a = 2;
        int size = ((ArrayList) bVar.f7172b).size();
        this.f7172b = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            ((ArrayList) this.f7172b).add(new C1043c((C1043c) ((ArrayList) bVar.f7172b).get(i7), c1044d));
        }
    }

    public /* synthetic */ b(Object obj, int i7) {
        this.f7171a = i7;
        this.f7172b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f7171a) {
            case 1:
                return ((Drawable.ConstantState) this.f7172b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f7171a) {
            case 0:
                return 0;
            case 1:
                return ((Drawable.ConstantState) this.f7172b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f7171a) {
            case 0:
                return new c(this);
            case 1:
                C0888e c0888e = new C0888e(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f7172b).newDrawable();
                c0888e.f14279a = newDrawable;
                newDrawable.setCallback(c0888e.f14278f);
                return c0888e;
            default:
                C1044d c1044d = new C1044d(false);
                c1044d.f16496b = false;
                c1044d.f16497c = this;
                return c1044d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f7171a) {
            case 0:
                return new c(this);
            case 1:
                C0888e c0888e = new C0888e(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f7172b).newDrawable(resources);
                c0888e.f14279a = newDrawable;
                newDrawable.setCallback(c0888e.f14278f);
                return c0888e;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f7171a) {
            case 1:
                C0888e c0888e = new C0888e(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f7172b).newDrawable(resources, theme);
                c0888e.f14279a = newDrawable;
                newDrawable.setCallback(c0888e.f14278f);
                return c0888e;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
