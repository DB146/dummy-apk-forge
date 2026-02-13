package androidx.appcompat.widget;

import A4.s;
import H2.C0288b;
import Q5.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import m4.O0;
import o.AbstractC1737h0;
import o.K0;
import o.L0;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0288b f12990a;

    /* renamed from: b, reason: collision with root package name */
    public final s f12991b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12992c;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        L0.a(context);
        this.f12992c = false;
        K0.a(getContext(), this);
        C0288b c0288b = new C0288b(this);
        this.f12990a = c0288b;
        c0288b.k(attributeSet, i7);
        s sVar = new s(this);
        this.f12991b = sVar;
        sVar.y(attributeSet, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0288b c0288b = this.f12990a;
        if (c0288b != null) {
            c0288b.a();
        }
        s sVar = this.f12991b;
        if (sVar != null) {
            sVar.e();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0288b c0288b = this.f12990a;
        if (c0288b != null) {
            return c0288b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0288b c0288b = this.f12990a;
        if (c0288b != null) {
            return c0288b.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        O0 o02;
        s sVar = this.f12991b;
        if (sVar == null || (o02 = (O0) sVar.f472c) == null) {
            return null;
        }
        return (ColorStateList) o02.f20120c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        O0 o02;
        s sVar = this.f12991b;
        if (sVar == null || (o02 = (O0) sVar.f472c) == null) {
            return null;
        }
        return (PorterDuff.Mode) o02.f20121d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f12991b.f471b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0288b c0288b = this.f12990a;
        if (c0288b != null) {
            c0288b.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0288b c0288b = this.f12990a;
        if (c0288b != null) {
            c0288b.o(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        s sVar = this.f12991b;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        s sVar = this.f12991b;
        if (sVar != null && drawable != null && !this.f12992c) {
            sVar.f470a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (sVar != null) {
            sVar.e();
            if (this.f12992c) {
                return;
            }
            ImageView imageView = (ImageView) sVar.f471b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(sVar.f470a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f12992c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        s sVar = this.f12991b;
        if (sVar != null) {
            ImageView imageView = (ImageView) sVar.f471b;
            if (i7 != 0) {
                Drawable x2 = e.x(imageView.getContext(), i7);
                if (x2 != null) {
                    AbstractC1737h0.a(x2);
                }
                imageView.setImageDrawable(x2);
            } else {
                imageView.setImageDrawable(null);
            }
            sVar.e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        s sVar = this.f12991b;
        if (sVar != null) {
            sVar.e();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0288b c0288b = this.f12990a;
        if (c0288b != null) {
            c0288b.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0288b c0288b = this.f12990a;
        if (c0288b != null) {
            c0288b.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        s sVar = this.f12991b;
        if (sVar != null) {
            if (((O0) sVar.f472c) == null) {
                sVar.f472c = new Object();
            }
            O0 o02 = (O0) sVar.f472c;
            o02.f20120c = colorStateList;
            o02.f20119b = true;
            sVar.e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        s sVar = this.f12991b;
        if (sVar != null) {
            if (((O0) sVar.f472c) == null) {
                sVar.f472c = new Object();
            }
            O0 o02 = (O0) sVar.f472c;
            o02.f20121d = mode;
            o02.f20118a = true;
            sVar.e();
        }
    }
}
