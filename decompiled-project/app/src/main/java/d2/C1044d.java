package d2;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1044d extends Drawable implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16495a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16496b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16497c;

    public C1044d(int i7) {
        this.f16495a = i7;
        switch (i7) {
            case 1:
                return;
            default:
                this.f16496b = false;
                this.f16497c = new N3.b();
                return;
        }
    }

    public void a(Drawable drawable) {
        ((ArrayList) ((N3.b) this.f16497c).f7172b).add(new C1043c(drawable, this));
    }

    public void b(Canvas canvas) {
        ((Drawable) this.f16497c).draw(canvas);
    }

    public C1043c c(int i7) {
        return (C1043c) ((ArrayList) ((N3.b) this.f16497c).f7172b).get(i7);
    }

    public void d(float f4, float f10) {
        ((Drawable) this.f16497c).setHotspot(f4, f10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f16495a) {
            case 0:
                ArrayList arrayList = (ArrayList) ((N3.b) this.f16497c).f7172b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((C1043c) arrayList.get(i7)).f16492b.draw(canvas);
                }
                return;
            default:
                if (this.f16496b) {
                    b(canvas);
                    return;
                }
                return;
        }
    }

    public void e(int i7, int i10, int i11, int i12) {
        ((Drawable) this.f16497c).setHotspotBounds(i7, i10, i11, i12);
    }

    public boolean f(boolean z8, boolean z10) {
        return super.setVisible(z8, z10) || ((Drawable) this.f16497c).setVisible(z8, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable;
        switch (this.f16495a) {
            case 0:
                ArrayList arrayList = (ArrayList) ((N3.b) this.f16497c).f7172b;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        drawable = null;
                    } else {
                        drawable = ((C1043c) arrayList.get(i7)).f16492b;
                        if (drawable == null) {
                            i7++;
                        }
                    }
                }
                if (drawable != null) {
                    return drawable.getAlpha();
                }
                return 255;
            default:
                return super.getAlpha();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).getChangingConfigurations();
            default:
                return super.getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        switch (this.f16495a) {
            case 0:
                return (N3.b) this.f16497c;
            default:
                return super.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).getCurrent();
            default:
                return super.getCurrent();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).getIntrinsicHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).getIntrinsicWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).getMinimumHeight();
            default:
                return super.getMinimumHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).getMinimumWidth();
            default:
                return super.getMinimumWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f16495a) {
            case 0:
                return 0;
            default:
                return ((Drawable) this.f16497c).getOpacity();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).getPadding(rect);
            default:
                return super.getPadding(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).getState();
            default:
                return super.getState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).getTransparentRegion();
            default:
                return super.getTransparentRegion();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f16495a) {
            case 0:
                invalidateSelf();
                return;
            default:
                invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).isAutoMirrored();
            default:
                return super.isAutoMirrored();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).isStateful();
            default:
                return super.isStateful();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        switch (this.f16495a) {
            case 1:
                ((Drawable) this.f16497c).jumpToCurrentState();
                return;
            default:
                super.jumpToCurrentState();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        switch (this.f16495a) {
            case 0:
                if (!this.f16496b && super.mutate() == this) {
                    N3.b bVar = new N3.b((N3.b) this.f16497c, this);
                    this.f16497c = bVar;
                    ArrayList arrayList = (ArrayList) bVar.f7172b;
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        Drawable drawable = ((C1043c) arrayList.get(i7)).f16492b;
                        if (drawable != null) {
                            drawable.mutate();
                        }
                    }
                    this.f16496b = true;
                }
                return this;
            default:
                return super.mutate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        switch (this.f16495a) {
            case 0:
                super.onBoundsChange(rect);
                ArrayList arrayList = (ArrayList) ((N3.b) this.f16497c).f7172b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((C1043c) arrayList.get(i7)).b(rect);
                }
                return;
            default:
                ((Drawable) this.f16497c).setBounds(rect);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i7) {
        switch (this.f16495a) {
            case 1:
                return ((Drawable) this.f16497c).setLevel(i7);
            default:
                return super.onLevelChange(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f16495a) {
            case 0:
                scheduleSelf(runnable, j);
                return;
            default:
                scheduleSelf(runnable, j);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        switch (this.f16495a) {
            case 0:
                ArrayList arrayList = (ArrayList) ((N3.b) this.f16497c).f7172b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((C1043c) arrayList.get(i10)).f16492b.setAlpha(i7);
                }
                return;
            default:
                ((Drawable) this.f16497c).setAlpha(i7);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z8) {
        switch (this.f16495a) {
            case 1:
                ((Drawable) this.f16497c).setAutoMirrored(z8);
                return;
            default:
                super.setAutoMirrored(z8);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i7) {
        switch (this.f16495a) {
            case 1:
                ((Drawable) this.f16497c).setChangingConfigurations(i7);
                return;
            default:
                super.setChangingConfigurations(i7);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.f16495a) {
            case 0:
                ArrayList arrayList = (ArrayList) ((N3.b) this.f16497c).f7172b;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((C1043c) arrayList.get(i7)).f16492b.setColorFilter(colorFilter);
                }
                return;
            default:
                ((Drawable) this.f16497c).setColorFilter(colorFilter);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z8) {
        switch (this.f16495a) {
            case 1:
                ((Drawable) this.f16497c).setDither(z8);
                return;
            default:
                super.setDither(z8);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z8) {
        switch (this.f16495a) {
            case 1:
                ((Drawable) this.f16497c).setFilterBitmap(z8);
                return;
            default:
                super.setFilterBitmap(z8);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f10) {
        switch (this.f16495a) {
            case 1:
                if (this.f16496b) {
                    d(f4, f10);
                    return;
                }
                return;
            default:
                super.setHotspot(f4, f10);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i7, int i10, int i11, int i12) {
        switch (this.f16495a) {
            case 1:
                if (this.f16496b) {
                    e(i7, i10, i11, i12);
                    return;
                }
                return;
            default:
                super.setHotspotBounds(i7, i10, i11, i12);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        switch (this.f16495a) {
            case 1:
                if (this.f16496b) {
                    return ((Drawable) this.f16497c).setState(iArr);
                }
                return false;
            default:
                return super.setState(iArr);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        switch (this.f16495a) {
            case 1:
                ((Drawable) this.f16497c).setTint(i7);
                return;
            default:
                super.setTint(i7);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        switch (this.f16495a) {
            case 1:
                ((Drawable) this.f16497c).setTintList(colorStateList);
                return;
            default:
                super.setTintList(colorStateList);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        switch (this.f16495a) {
            case 1:
                ((Drawable) this.f16497c).setTintMode(mode);
                return;
            default:
                super.setTintMode(mode);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z8, boolean z10) {
        switch (this.f16495a) {
            case 1:
                if (this.f16496b) {
                    return f(z8, z10);
                }
                return false;
            default:
                return super.setVisible(z8, z10);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f16495a) {
            case 0:
                unscheduleSelf(runnable);
                return;
            default:
                unscheduleSelf(runnable);
                return;
        }
    }
}
