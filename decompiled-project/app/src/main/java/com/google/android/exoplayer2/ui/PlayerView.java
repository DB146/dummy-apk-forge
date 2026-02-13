package com.google.android.exoplayer2.ui;

import C9.h;
import N6.H;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import i1.C1290a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l1.AbstractC1449a;
import l5.AbstractC1498l;
import l5.C1496j;
import l5.InterfaceC1487a;
import l5.InterfaceC1495i;
import l5.ViewOnLayoutChangeListenerC1497k;
import m4.C1549C;
import m4.C1581m;
import m4.x0;
import n5.AbstractC1705a;
import n5.D;
import n5.e;
import o5.m;
import o5.w;
import p5.l;

@Deprecated
/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f14738N = 0;

    /* renamed from: A, reason: collision with root package name */
    public x0 f14739A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f14740B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC1495i f14741C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14742D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f14743E;

    /* renamed from: F, reason: collision with root package name */
    public int f14744F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f14745G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f14746H;

    /* renamed from: I, reason: collision with root package name */
    public int f14747I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f14748J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f14749K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public int f14750M;

    /* renamed from: a, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC1497k f14751a;

    /* renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f14752b;

    /* renamed from: c, reason: collision with root package name */
    public final View f14753c;

    /* renamed from: d, reason: collision with root package name */
    public final View f14754d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14755e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f14756f;

    /* renamed from: u, reason: collision with root package name */
    public final SubtitleView f14757u;

    /* renamed from: v, reason: collision with root package name */
    public final View f14758v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f14759w;

    /* renamed from: x, reason: collision with root package name */
    public final C1496j f14760x;

    /* renamed from: y, reason: collision with root package name */
    public final FrameLayout f14761y;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f14762z;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i7;
        boolean z8;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        boolean z15;
        ViewOnLayoutChangeListenerC1497k viewOnLayoutChangeListenerC1497k = new ViewOnLayoutChangeListenerC1497k(this);
        this.f14751a = viewOnLayoutChangeListenerC1497k;
        if (isInEditMode()) {
            this.f14752b = null;
            this.f14753c = null;
            this.f14754d = null;
            this.f14755e = false;
            this.f14756f = null;
            this.f14757u = null;
            this.f14758v = null;
            this.f14759w = null;
            this.f14760x = null;
            this.f14761y = null;
            this.f14762z = null;
            ImageView imageView = new ImageView(context);
            if (D.f21141a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(D.t(context, resources, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(D.t(context, resources2, R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i16 = R.layout.exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1498l.f19522d, 0, 0);
            try {
                z12 = obtainStyledAttributes.hasValue(23);
                i11 = obtainStyledAttributes.getColor(23, 0);
                i16 = obtainStyledAttributes.getResourceId(12, R.layout.exo_player_view);
                z13 = obtainStyledAttributes.getBoolean(28, true);
                i14 = obtainStyledAttributes.getResourceId(6, 0);
                boolean z16 = obtainStyledAttributes.getBoolean(29, true);
                i10 = obtainStyledAttributes.getInt(24, 1);
                i12 = obtainStyledAttributes.getInt(14, 0);
                int i17 = obtainStyledAttributes.getInt(22, 5000);
                boolean z17 = obtainStyledAttributes.getBoolean(8, true);
                boolean z18 = obtainStyledAttributes.getBoolean(2, true);
                int integer = obtainStyledAttributes.getInteger(20, 0);
                this.f14745G = obtainStyledAttributes.getBoolean(9, this.f14745G);
                z8 = obtainStyledAttributes.getBoolean(7, true);
                obtainStyledAttributes.recycle();
                z11 = z17;
                i13 = integer;
                i7 = i17;
                z10 = z18;
                z14 = z16;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i7 = 5000;
            z8 = true;
            i10 = 1;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            z10 = true;
            z11 = true;
            z12 = false;
            z13 = true;
            i14 = 0;
            z14 = true;
        }
        LayoutInflater.from(context).inflate(i16, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f14752b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i12);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f14753c = findViewById;
        if (findViewById != null && z12) {
            findViewById.setBackgroundColor(i11);
        }
        if (aspectRatioFrameLayout == null || i10 == 0) {
            i15 = 0;
            this.f14754d = null;
            z15 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i10 == 2) {
                this.f14754d = new TextureView(context);
            } else if (i10 == 3) {
                try {
                    int i18 = l.f23100z;
                    this.f14754d = (View) l.class.getConstructor(Context.class).newInstance(context);
                    z15 = true;
                    this.f14754d.setLayoutParams(layoutParams);
                    this.f14754d.setOnClickListener(viewOnLayoutChangeListenerC1497k);
                    i15 = 0;
                    this.f14754d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f14754d, 0);
                } catch (Exception e2) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else if (i10 != 4) {
                this.f14754d = new SurfaceView(context);
            } else {
                try {
                    int i19 = m.f22019b;
                    this.f14754d = (View) m.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e10) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            }
            z15 = false;
            this.f14754d.setLayoutParams(layoutParams);
            this.f14754d.setOnClickListener(viewOnLayoutChangeListenerC1497k);
            i15 = 0;
            this.f14754d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f14754d, 0);
        }
        this.f14755e = z15;
        this.f14761y = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f14762z = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f14756f = imageView2;
        this.f14742D = (!z13 || imageView2 == null) ? i15 : 1;
        if (i14 != 0) {
            this.f14743E = AbstractC1449a.getDrawable(getContext(), i14);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f14757u = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f14758v = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f14744F = i13;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f14759w = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C1496j c1496j = (C1496j) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (c1496j != null) {
            this.f14760x = c1496j;
        } else if (findViewById3 != null) {
            C1496j c1496j2 = new C1496j(context, attributeSet);
            this.f14760x = c1496j2;
            c1496j2.setId(R.id.exo_controller);
            c1496j2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(c1496j2, indexOfChild);
        } else {
            this.f14760x = null;
        }
        C1496j c1496j3 = this.f14760x;
        this.f14747I = c1496j3 != null ? i7 : i15;
        this.L = z11;
        this.f14748J = z10;
        this.f14749K = z8;
        this.f14740B = (!z14 || c1496j3 == null) ? i15 : 1;
        if (c1496j3 != null) {
            c1496j3.b();
            this.f14760x.f19489b.add(viewOnLayoutChangeListenerC1497k);
        }
        if (z14) {
            setClickable(true);
        }
        j();
    }

    public static void a(TextureView textureView, int i7) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i7 != 0) {
            float f4 = width / 2.0f;
            float f10 = height / 2.0f;
            matrix.postRotate(i7, f4, f10);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f4, f10);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        x0 x0Var = this.f14739A;
        return x0Var != null && ((C1549C) x0Var).g0() && ((C1549C) this.f14739A).c0();
    }

    public final void c(boolean z8) {
        if (!(b() && this.f14749K) && m()) {
            C1496j c1496j = this.f14760x;
            boolean z10 = c1496j.d() && c1496j.getShowTimeoutMs() <= 0;
            boolean e2 = e();
            if (z8 || z10 || e2) {
                f(e2);
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f4 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f14752b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f4);
                }
                ImageView imageView = this.f14756f;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        x0 x0Var = this.f14739A;
        if (x0Var != null && ((C1549C) x0Var).g0()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z8 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C1496j c1496j = this.f14760x;
        if (z8 && m() && !c1496j.d()) {
            c(true);
        } else {
            if ((!m() || !c1496j.a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                if (!z8 || !m()) {
                    return false;
                }
                c(true);
                return false;
            }
            c(true);
        }
        return true;
    }

    public final boolean e() {
        x0 x0Var = this.f14739A;
        if (x0Var == null) {
            return true;
        }
        int d02 = ((C1549C) x0Var).d0();
        return this.f14748J && (d02 == 1 || d02 == 4 || !((C1549C) this.f14739A).c0());
    }

    public final void f(boolean z8) {
        if (m()) {
            int i7 = z8 ? 0 : this.f14747I;
            C1496j c1496j = this.f14760x;
            c1496j.setShowTimeoutMs(i7);
            if (!c1496j.d()) {
                c1496j.setVisibility(0);
                Iterator it = c1496j.f19489b.iterator();
                while (it.hasNext()) {
                    InterfaceC1495i interfaceC1495i = (InterfaceC1495i) it.next();
                    c1496j.getVisibility();
                    ViewOnLayoutChangeListenerC1497k viewOnLayoutChangeListenerC1497k = (ViewOnLayoutChangeListenerC1497k) interfaceC1495i;
                    viewOnLayoutChangeListenerC1497k.getClass();
                    viewOnLayoutChangeListenerC1497k.f19518c.j();
                }
                c1496j.g();
                c1496j.f();
                c1496j.i();
                c1496j.j();
                c1496j.k();
                boolean V7 = D.V(c1496j.f19484U);
                View view = c1496j.f19497f;
                View view2 = c1496j.f19495e;
                if (V7 && view2 != null) {
                    view2.requestFocus();
                } else if (!V7 && view != null) {
                    view.requestFocus();
                }
                boolean V10 = D.V(c1496j.f19484U);
                if (V10 && view2 != null) {
                    view2.sendAccessibilityEvent(8);
                } else if (!V10 && view != null) {
                    view.sendAccessibilityEvent(8);
                }
            }
            c1496j.c();
        }
    }

    public final void g() {
        if (!m() || this.f14739A == null) {
            return;
        }
        C1496j c1496j = this.f14760x;
        if (!c1496j.d()) {
            c(true);
        } else if (this.L) {
            c1496j.b();
        }
    }

    public List<C1290a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f14762z;
        if (frameLayout != null) {
            arrayList.add(new C1290a(frameLayout, 6));
        }
        C1496j c1496j = this.f14760x;
        if (c1496j != null) {
            arrayList.add(new C1290a(c1496j, 6));
        }
        return H.F(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f14761y;
        AbstractC1705a.o(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.f14748J;
    }

    public boolean getControllerHideOnTouch() {
        return this.L;
    }

    public int getControllerShowTimeoutMs() {
        return this.f14747I;
    }

    public Drawable getDefaultArtwork() {
        return this.f14743E;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f14762z;
    }

    public x0 getPlayer() {
        return this.f14739A;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14752b;
        AbstractC1705a.n(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f14757u;
    }

    public boolean getUseArtwork() {
        return this.f14742D;
    }

    public boolean getUseController() {
        return this.f14740B;
    }

    public View getVideoSurfaceView() {
        return this.f14754d;
    }

    public final void h() {
        w wVar;
        x0 x0Var = this.f14739A;
        if (x0Var != null) {
            C1549C c1549c = (C1549C) x0Var;
            c1549c.E0();
            wVar = c1549c.f19868u0;
        } else {
            wVar = w.f22047e;
        }
        int i7 = wVar.f22048a;
        int i10 = wVar.f22049b;
        float f4 = (i10 == 0 || i7 == 0) ? 0.0f : (i7 * wVar.f22051d) / i10;
        View view = this.f14754d;
        if (view instanceof TextureView) {
            int i11 = wVar.f22050c;
            if (f4 > 0.0f && (i11 == 90 || i11 == 270)) {
                f4 = 1.0f / f4;
            }
            int i12 = this.f14750M;
            ViewOnLayoutChangeListenerC1497k viewOnLayoutChangeListenerC1497k = this.f14751a;
            if (i12 != 0) {
                view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1497k);
            }
            this.f14750M = i11;
            if (i11 != 0) {
                view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1497k);
            }
            a((TextureView) view, this.f14750M);
        }
        float f10 = this.f14755e ? 0.0f : f4;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14752b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (((m4.C1549C) r5.f14739A).c0() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z8;
        View view = this.f14758v;
        if (view != null) {
            x0 x0Var = this.f14739A;
            if (x0Var != null && ((C1549C) x0Var).d0() == 2) {
                int i7 = this.f14744F;
                z8 = true;
                if (i7 != 2) {
                    if (i7 == 1) {
                    }
                }
                view.setVisibility(z8 ? 0 : 8);
            }
            z8 = false;
            view.setVisibility(z8 ? 0 : 8);
        }
    }

    public final void j() {
        C1496j c1496j = this.f14760x;
        if (c1496j == null || !this.f14740B) {
            setContentDescription(null);
        } else if (c1496j.getVisibility() == 0) {
            setContentDescription(this.L ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void k() {
        TextView textView = this.f14759w;
        if (textView != null) {
            CharSequence charSequence = this.f14746H;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            x0 x0Var = this.f14739A;
            if (x0Var != null) {
                C1549C c1549c = (C1549C) x0Var;
                c1549c.E0();
                C1581m c1581m = c1549c.f19872w0.f20487f;
            }
            textView.setVisibility(8);
        }
    }

    public final void l(boolean z8) {
        x0 x0Var = this.f14739A;
        View view = this.f14753c;
        ImageView imageView = this.f14756f;
        boolean z10 = false;
        if (x0Var != null && ((h) x0Var).o(30)) {
            C1549C c1549c = (C1549C) x0Var;
            if (!c1549c.Z().f20114a.isEmpty()) {
                if (z8 && !this.f14745G && view != null) {
                    view.setVisibility(0);
                }
                if (c1549c.Z().a(2)) {
                    if (imageView != null) {
                        imageView.setImageResource(android.R.color.transparent);
                        imageView.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (view != null) {
                    view.setVisibility(0);
                }
                if (this.f14742D) {
                    AbstractC1705a.n(imageView);
                    c1549c.E0();
                    byte[] bArr = c1549c.f19842a0.f20328x;
                    if (bArr != null) {
                        z10 = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    }
                    if (z10 || d(this.f14743E)) {
                        return;
                    }
                }
                if (imageView != null) {
                    imageView.setImageResource(android.R.color.transparent);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
        }
        if (this.f14745G) {
            return;
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            imageView.setVisibility(4);
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final boolean m() {
        if (!this.f14740B) {
            return false;
        }
        AbstractC1705a.n(this.f14760x);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m() || this.f14739A == null) {
            return false;
        }
        c(true);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        g();
        return super.performClick();
    }

    public void setAspectRatioListener(InterfaceC1487a interfaceC1487a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14752b;
        AbstractC1705a.n(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC1487a);
    }

    public void setControllerAutoShow(boolean z8) {
        this.f14748J = z8;
    }

    public void setControllerHideDuringAds(boolean z8) {
        this.f14749K = z8;
    }

    public void setControllerHideOnTouch(boolean z8) {
        AbstractC1705a.n(this.f14760x);
        this.L = z8;
        j();
    }

    public void setControllerShowTimeoutMs(int i7) {
        C1496j c1496j = this.f14760x;
        AbstractC1705a.n(c1496j);
        this.f14747I = i7;
        if (c1496j.d()) {
            f(e());
        }
    }

    public void setControllerVisibilityListener(InterfaceC1495i interfaceC1495i) {
        C1496j c1496j = this.f14760x;
        AbstractC1705a.n(c1496j);
        InterfaceC1495i interfaceC1495i2 = this.f14741C;
        if (interfaceC1495i2 == interfaceC1495i) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = c1496j.f19489b;
        if (interfaceC1495i2 != null) {
            copyOnWriteArrayList.remove(interfaceC1495i2);
        }
        this.f14741C = interfaceC1495i;
        if (interfaceC1495i != null) {
            copyOnWriteArrayList.add(interfaceC1495i);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC1705a.m(this.f14759w != null);
        this.f14746H = charSequence;
        k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f14743E != drawable) {
            this.f14743E = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(e eVar) {
        if (eVar != null) {
            k();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z8) {
        if (this.f14745G != z8) {
            this.f14745G = z8;
            l(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setPlayer(x0 x0Var) {
        boolean z8;
        x0 x0Var2;
        AbstractC1705a.m(Looper.myLooper() == Looper.getMainLooper());
        if (x0Var != null) {
            if (((C1549C) x0Var).f19822F != Looper.getMainLooper()) {
                z8 = false;
                AbstractC1705a.h(z8);
                x0Var2 = this.f14739A;
                if (x0Var2 != x0Var) {
                    return;
                }
                View view = this.f14754d;
                ViewOnLayoutChangeListenerC1497k viewOnLayoutChangeListenerC1497k = this.f14751a;
                if (x0Var2 != null) {
                    C1549C c1549c = (C1549C) x0Var2;
                    c1549c.m0(viewOnLayoutChangeListenerC1497k);
                    if (((h) x0Var2).o(27)) {
                        if (view instanceof TextureView) {
                            TextureView textureView = (TextureView) view;
                            c1549c.E0();
                            if (textureView != null && textureView == c1549c.f19856j0) {
                                c1549c.M();
                            }
                        } else if (view instanceof SurfaceView) {
                            SurfaceView surfaceView = (SurfaceView) view;
                            c1549c.E0();
                            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
                            c1549c.E0();
                            if (holder != null && holder == c1549c.f19853g0) {
                                c1549c.M();
                            }
                        }
                    }
                }
                SubtitleView subtitleView = this.f14757u;
                if (subtitleView != null) {
                    subtitleView.setCues(null);
                }
                this.f14739A = x0Var;
                boolean m10 = m();
                C1496j c1496j = this.f14760x;
                if (m10) {
                    c1496j.setPlayer(x0Var);
                }
                i();
                k();
                l(true);
                if (x0Var == null) {
                    if (c1496j != null) {
                        c1496j.b();
                        return;
                    }
                    return;
                }
                h hVar = (h) x0Var;
                if (hVar.o(27)) {
                    if (view instanceof TextureView) {
                        ((C1549C) x0Var).x0((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        ((C1549C) x0Var).w0((SurfaceView) view);
                    }
                    h();
                }
                if (subtitleView != null && hVar.o(28)) {
                    C1549C c1549c2 = (C1549C) x0Var;
                    c1549c2.E0();
                    subtitleView.setCues(c1549c2.f19864r0.f12744a);
                }
                ((C1549C) x0Var).K(viewOnLayoutChangeListenerC1497k);
                c(false);
                return;
            }
        }
        z8 = true;
        AbstractC1705a.h(z8);
        x0Var2 = this.f14739A;
        if (x0Var2 != x0Var) {
        }
    }

    public void setRepeatToggleModes(int i7) {
        C1496j c1496j = this.f14760x;
        AbstractC1705a.n(c1496j);
        c1496j.setRepeatToggleModes(i7);
    }

    public void setResizeMode(int i7) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14752b;
        AbstractC1705a.n(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i7);
    }

    public void setShowBuffering(int i7) {
        if (this.f14744F != i7) {
            this.f14744F = i7;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z8) {
        C1496j c1496j = this.f14760x;
        AbstractC1705a.n(c1496j);
        c1496j.setShowFastForwardButton(z8);
    }

    public void setShowMultiWindowTimeBar(boolean z8) {
        C1496j c1496j = this.f14760x;
        AbstractC1705a.n(c1496j);
        c1496j.setShowMultiWindowTimeBar(z8);
    }

    public void setShowNextButton(boolean z8) {
        C1496j c1496j = this.f14760x;
        AbstractC1705a.n(c1496j);
        c1496j.setShowNextButton(z8);
    }

    public void setShowPreviousButton(boolean z8) {
        C1496j c1496j = this.f14760x;
        AbstractC1705a.n(c1496j);
        c1496j.setShowPreviousButton(z8);
    }

    public void setShowRewindButton(boolean z8) {
        C1496j c1496j = this.f14760x;
        AbstractC1705a.n(c1496j);
        c1496j.setShowRewindButton(z8);
    }

    public void setShowShuffleButton(boolean z8) {
        C1496j c1496j = this.f14760x;
        AbstractC1705a.n(c1496j);
        c1496j.setShowShuffleButton(z8);
    }

    public void setShutterBackgroundColor(int i7) {
        View view = this.f14753c;
        if (view != null) {
            view.setBackgroundColor(i7);
        }
    }

    public void setUseArtwork(boolean z8) {
        AbstractC1705a.m((z8 && this.f14756f == null) ? false : true);
        if (this.f14742D != z8) {
            this.f14742D = z8;
            l(false);
        }
    }

    public void setUseController(boolean z8) {
        boolean z10 = true;
        C1496j c1496j = this.f14760x;
        AbstractC1705a.m((z8 && c1496j == null) ? false : true);
        if (!z8 && !hasOnClickListeners()) {
            z10 = false;
        }
        setClickable(z10);
        if (this.f14740B == z8) {
            return;
        }
        this.f14740B = z8;
        if (m()) {
            c1496j.setPlayer(this.f14739A);
        } else if (c1496j != null) {
            c1496j.b();
            c1496j.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        View view = this.f14754d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i7);
        }
    }
}
