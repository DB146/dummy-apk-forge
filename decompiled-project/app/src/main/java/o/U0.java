package o;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class U0 implements InterfaceC1731e0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f21436a;

    /* renamed from: b, reason: collision with root package name */
    public int f21437b;

    /* renamed from: c, reason: collision with root package name */
    public View f21438c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f21439d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f21440e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f21441f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f21442h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f21443i;
    public CharSequence j;
    public Window.Callback k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21444l;

    /* renamed from: m, reason: collision with root package name */
    public C1740j f21445m;

    /* renamed from: n, reason: collision with root package name */
    public int f21446n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f21447o;

    public final void a(int i7) {
        View view;
        int i10 = this.f21437b ^ i7;
        this.f21437b = i7;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                int i11 = this.f21437b & 4;
                Toolbar toolbar = this.f21436a;
                if (i11 != 0) {
                    Drawable drawable = this.f21441f;
                    if (drawable == null) {
                        drawable = this.f21447o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            int i12 = i10 & 8;
            Toolbar toolbar2 = this.f21436a;
            if (i12 != 0) {
                if ((i7 & 8) != 0) {
                    toolbar2.setTitle(this.f21442h);
                    toolbar2.setSubtitle(this.f21443i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) == 0 || (view = this.f21438c) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f21437b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f21436a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f21446n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f21437b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) != 0) {
            drawable = this.f21440e;
            if (drawable == null) {
                drawable = this.f21439d;
            }
        } else {
            drawable = this.f21439d;
        }
        this.f21436a.setLogo(drawable);
    }
}
