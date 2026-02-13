package com.google.android.exoplayer2.ui;

import C9.h;
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
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l1.AbstractC1449a;
import l5.AbstractC1498l;
import l5.B;
import l5.G;
import l5.H;
import l5.I;
import l5.InterfaceC1486A;
import l5.InterfaceC1487a;
import l5.J;
import l5.r;
import m4.C1549C;
import m4.C1581m;
import m4.M0;
import m4.N0;
import m4.x0;
import n5.AbstractC1705a;
import n5.D;
import n5.e;
import o5.m;
import o5.w;
import p5.l;

@Deprecated
/* loaded from: classes.dex */
public class StyledPlayerView extends FrameLayout {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f14763N = 0;

    /* renamed from: A, reason: collision with root package name */
    public x0 f14764A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f14765B;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC1486A f14766C;

    /* renamed from: D, reason: collision with root package name */
    public int f14767D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f14768E;

    /* renamed from: F, reason: collision with root package name */
    public int f14769F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f14770G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f14771H;

    /* renamed from: I, reason: collision with root package name */
    public int f14772I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f14773J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f14774K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public int f14775M;

    /* renamed from: a, reason: collision with root package name */
    public final H f14776a;

    /* renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f14777b;

    /* renamed from: c, reason: collision with root package name */
    public final View f14778c;

    /* renamed from: d, reason: collision with root package name */
    public final View f14779d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14780e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f14781f;

    /* renamed from: u, reason: collision with root package name */
    public final SubtitleView f14782u;

    /* renamed from: v, reason: collision with root package name */
    public final View f14783v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f14784w;

    /* renamed from: x, reason: collision with root package name */
    public final B f14785x;

    /* renamed from: y, reason: collision with root package name */
    public final FrameLayout f14786y;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f14787z;

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i7;
        int i10;
        boolean z8;
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        int i17;
        boolean z15;
        H h10 = new H(this);
        this.f14776a = h10;
        if (isInEditMode()) {
            this.f14777b = null;
            this.f14778c = null;
            this.f14779d = null;
            this.f14780e = false;
            this.f14781f = null;
            this.f14782u = null;
            this.f14783v = null;
            this.f14784w = null;
            this.f14785x = null;
            this.f14786y = null;
            this.f14787z = null;
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
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1498l.f19524f, 0, 0);
            try {
                z12 = obtainStyledAttributes.hasValue(28);
                i14 = obtainStyledAttributes.getColor(28, 0);
                int resourceId = obtainStyledAttributes.getResourceId(15, R.layout.exo_styled_player_view);
                z13 = obtainStyledAttributes.getBoolean(33, true);
                i15 = obtainStyledAttributes.getInt(3, 1);
                int resourceId2 = obtainStyledAttributes.getResourceId(9, 0);
                boolean z16 = obtainStyledAttributes.getBoolean(34, true);
                int i18 = obtainStyledAttributes.getInt(29, 1);
                int i19 = obtainStyledAttributes.getInt(17, 0);
                int i20 = obtainStyledAttributes.getInt(26, 5000);
                boolean z17 = obtainStyledAttributes.getBoolean(11, true);
                boolean z18 = obtainStyledAttributes.getBoolean(4, true);
                int integer = obtainStyledAttributes.getInteger(23, 0);
                this.f14770G = obtainStyledAttributes.getBoolean(12, this.f14770G);
                boolean z19 = obtainStyledAttributes.getBoolean(10, true);
                obtainStyledAttributes.recycle();
                z8 = z17;
                z11 = z18;
                z14 = z16;
                i7 = i20;
                i12 = i18;
                i16 = resourceId;
                i11 = i19;
                z10 = z19;
                i10 = integer;
                i13 = resourceId2;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i7 = 5000;
            i10 = 0;
            z8 = true;
            i11 = 0;
            z10 = true;
            i12 = 1;
            i13 = 0;
            z11 = true;
            i14 = 0;
            z12 = false;
            z13 = true;
            i15 = 1;
            z14 = true;
            i16 = R.layout.exo_styled_player_view;
        }
        LayoutInflater.from(context).inflate(i16, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f14777b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i11);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f14778c = findViewById;
        if (findViewById != null && z12) {
            findViewById.setBackgroundColor(i14);
        }
        if (aspectRatioFrameLayout == null || i12 == 0) {
            i17 = 0;
            this.f14779d = null;
            z15 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i12 == 2) {
                this.f14779d = new TextureView(context);
            } else if (i12 == 3) {
                try {
                    int i21 = l.f23100z;
                    this.f14779d = (View) l.class.getConstructor(Context.class).newInstance(context);
                    z15 = true;
                    this.f14779d.setLayoutParams(layoutParams);
                    this.f14779d.setOnClickListener(h10);
                    i17 = 0;
                    this.f14779d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f14779d, 0);
                } catch (Exception e2) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else if (i12 != 4) {
                this.f14779d = new SurfaceView(context);
            } else {
                try {
                    int i22 = m.f22019b;
                    this.f14779d = (View) m.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e10) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            }
            z15 = false;
            this.f14779d.setLayoutParams(layoutParams);
            this.f14779d.setOnClickListener(h10);
            i17 = 0;
            this.f14779d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f14779d, 0);
        }
        this.f14780e = z15;
        this.f14786y = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f14787z = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f14781f = imageView2;
        this.f14767D = (!z13 || i15 == 0 || imageView2 == null) ? i17 : i15;
        if (i13 != 0) {
            this.f14768E = AbstractC1449a.getDrawable(getContext(), i13);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f14782u = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f14783v = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f14769F = i10;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f14784w = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        B b2 = (B) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (b2 != null) {
            this.f14785x = b2;
        } else if (findViewById3 != null) {
            B b10 = new B(context, attributeSet);
            this.f14785x = b10;
            b10.setId(R.id.exo_controller);
            b10.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(b10, indexOfChild);
        } else {
            this.f14785x = null;
        }
        B b11 = this.f14785x;
        this.f14772I = b11 != null ? i7 : i17;
        this.L = z8;
        this.f14773J = z11;
        this.f14774K = z10;
        this.f14765B = (!z14 || b11 == null) ? i17 : 1;
        if (b11 != null) {
            G g = b11.f19293a;
            int i23 = g.f19365z;
            if (i23 != 3 && i23 != 2) {
                g.f();
                g.i(2);
            }
            this.f14785x.f19299d.add(h10);
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
        x0 x0Var = this.f14764A;
        return x0Var != null && ((h) x0Var).o(16) && ((C1549C) this.f14764A).g0() && ((C1549C) this.f14764A).c0();
    }

    public final void c(boolean z8) {
        if (!(b() && this.f14774K) && m()) {
            B b2 = this.f14785x;
            boolean z10 = b2.h() && b2.getShowTimeoutMs() <= 0;
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
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f14767D == 2) {
                    f4 = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f14777b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f4);
                }
                ImageView imageView = this.f14781f;
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        x0 x0Var = this.f14764A;
        if (x0Var != null && ((h) x0Var).o(16) && ((C1549C) this.f14764A).g0()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z8 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        B b2 = this.f14785x;
        if (z8 && m() && !b2.h()) {
            c(true);
        } else {
            if ((!m() || !b2.d(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
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
        x0 x0Var = this.f14764A;
        if (x0Var == null) {
            return true;
        }
        int d02 = ((C1549C) x0Var).d0();
        if (this.f14773J && (!((h) this.f14764A).o(17) || !((C1549C) this.f14764A).Y().p())) {
            if (d02 == 1 || d02 == 4) {
                return true;
            }
            x0 x0Var2 = this.f14764A;
            x0Var2.getClass();
            if (!((C1549C) x0Var2).c0()) {
                return true;
            }
        }
        return false;
    }

    public final void f(boolean z8) {
        if (m()) {
            int i7 = z8 ? 0 : this.f14772I;
            B b2 = this.f14785x;
            b2.setShowTimeoutMs(i7);
            G g = b2.f19293a;
            B b10 = g.f19343a;
            if (!b10.i()) {
                b10.setVisibility(0);
                b10.j();
                View view = b10.f19265C;
                if (view != null) {
                    view.requestFocus();
                }
            }
            g.k();
        }
    }

    public final void g() {
        if (!m() || this.f14764A == null) {
            return;
        }
        B b2 = this.f14785x;
        if (!b2.h()) {
            c(true);
        } else if (this.L) {
            b2.g();
        }
    }

    public List<C1290a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f14787z;
        if (frameLayout != null) {
            arrayList.add(new C1290a(frameLayout, 6));
        }
        B b2 = this.f14785x;
        if (b2 != null) {
            arrayList.add(new C1290a(b2, 6));
        }
        return N6.H.F(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f14786y;
        AbstractC1705a.o(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f14767D;
    }

    public boolean getControllerAutoShow() {
        return this.f14773J;
    }

    public boolean getControllerHideOnTouch() {
        return this.L;
    }

    public int getControllerShowTimeoutMs() {
        return this.f14772I;
    }

    public Drawable getDefaultArtwork() {
        return this.f14768E;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f14787z;
    }

    public x0 getPlayer() {
        return this.f14764A;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14777b;
        AbstractC1705a.n(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f14782u;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f14767D != 0;
    }

    public boolean getUseController() {
        return this.f14765B;
    }

    public View getVideoSurfaceView() {
        return this.f14779d;
    }

    public final void h() {
        w wVar;
        x0 x0Var = this.f14764A;
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
        View view = this.f14779d;
        if (view instanceof TextureView) {
            int i11 = wVar.f22050c;
            if (f4 > 0.0f && (i11 == 90 || i11 == 270)) {
                f4 = 1.0f / f4;
            }
            int i12 = this.f14775M;
            H h10 = this.f14776a;
            if (i12 != 0) {
                view.removeOnLayoutChangeListener(h10);
            }
            this.f14775M = i11;
            if (i11 != 0) {
                view.addOnLayoutChangeListener(h10);
            }
            a((TextureView) view, this.f14775M);
        }
        float f10 = this.f14780e ? 0.0f : f4;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14777b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (((m4.C1549C) r5.f14764A).c0() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z8;
        View view = this.f14783v;
        if (view != null) {
            x0 x0Var = this.f14764A;
            if (x0Var != null && ((C1549C) x0Var).d0() == 2) {
                int i7 = this.f14769F;
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
        B b2 = this.f14785x;
        if (b2 == null || !this.f14765B) {
            setContentDescription(null);
        } else if (b2.h()) {
            setContentDescription(this.L ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void k() {
        TextView textView = this.f14784w;
        if (textView != null) {
            CharSequence charSequence = this.f14771H;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            x0 x0Var = this.f14764A;
            if (x0Var != null) {
                C1549C c1549c = (C1549C) x0Var;
                c1549c.E0();
                C1581m c1581m = c1549c.f19872w0.f20487f;
            }
            textView.setVisibility(8);
        }
    }

    public final void l(boolean z8) {
        x0 x0Var = this.f14764A;
        View view = this.f14778c;
        ImageView imageView = this.f14781f;
        boolean z10 = false;
        if (x0Var != null) {
            h hVar = (h) x0Var;
            if (hVar.o(30)) {
                C1549C c1549c = (C1549C) x0Var;
                if (!c1549c.Z().f20114a.isEmpty()) {
                    if (z8 && !this.f14770G && view != null) {
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
                    if (this.f14767D != 0) {
                        AbstractC1705a.n(imageView);
                        if (hVar.o(18)) {
                            C1549C c1549c2 = (C1549C) hVar;
                            c1549c2.E0();
                            byte[] bArr = c1549c2.f19842a0.f20328x;
                            if (bArr != null) {
                                z10 = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                            }
                        }
                        if (z10 || d(this.f14768E)) {
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
        }
        if (this.f14770G) {
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
        if (!this.f14765B) {
            return false;
        }
        AbstractC1705a.n(this.f14785x);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m() || this.f14764A == null) {
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

    public void setArtworkDisplayMode(int i7) {
        AbstractC1705a.m(i7 == 0 || this.f14781f != null);
        if (this.f14767D != i7) {
            this.f14767D = i7;
            l(false);
        }
    }

    public void setAspectRatioListener(InterfaceC1487a interfaceC1487a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14777b;
        AbstractC1705a.n(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC1487a);
    }

    public void setControllerAutoShow(boolean z8) {
        this.f14773J = z8;
    }

    public void setControllerHideDuringAds(boolean z8) {
        this.f14774K = z8;
    }

    public void setControllerHideOnTouch(boolean z8) {
        AbstractC1705a.n(this.f14785x);
        this.L = z8;
        j();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(r rVar) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setOnFullScreenModeChangedListener(rVar);
    }

    public void setControllerShowTimeoutMs(int i7) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        this.f14772I = i7;
        if (b2.h()) {
            f(e());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(InterfaceC1486A interfaceC1486A) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        InterfaceC1486A interfaceC1486A2 = this.f14766C;
        if (interfaceC1486A2 == interfaceC1486A) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = b2.f19299d;
        if (interfaceC1486A2 != null) {
            copyOnWriteArrayList.remove(interfaceC1486A2);
        }
        this.f14766C = interfaceC1486A;
        if (interfaceC1486A != null) {
            copyOnWriteArrayList.add(interfaceC1486A);
            setControllerVisibilityListener((I) null);
        }
    }

    public void setControllerVisibilityListener(I i7) {
        if (i7 != null) {
            setControllerVisibilityListener((InterfaceC1486A) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC1705a.m(this.f14784w != null);
        this.f14771H = charSequence;
        k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f14768E != drawable) {
            this.f14768E = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(e eVar) {
        if (eVar != null) {
            k();
        }
    }

    public void setFullscreenButtonClickListener(J j) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setOnFullScreenModeChangedListener(this.f14776a);
    }

    public void setKeepContentOnPlayerReset(boolean z8) {
        if (this.f14770G != z8) {
            this.f14770G = z8;
            l(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fa, code lost:
    
        if (r4 != false) goto L72;
     */
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
                x0Var2 = this.f14764A;
                if (x0Var2 != x0Var) {
                    return;
                }
                View view = this.f14779d;
                H h10 = this.f14776a;
                if (x0Var2 != null) {
                    C1549C c1549c = (C1549C) x0Var2;
                    c1549c.m0(h10);
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
                SubtitleView subtitleView = this.f14782u;
                if (subtitleView != null) {
                    subtitleView.setCues(null);
                }
                this.f14764A = x0Var;
                boolean m10 = m();
                B b2 = this.f14785x;
                if (m10) {
                    b2.setPlayer(x0Var);
                }
                i();
                k();
                l(true);
                if (x0Var == null) {
                    if (b2 != null) {
                        b2.g();
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
                    if (hVar.o(30)) {
                        N0 Z7 = ((C1549C) x0Var).Z();
                        boolean z10 = false;
                        int i7 = 0;
                        while (true) {
                            N6.H h11 = Z7.f20114a;
                            if (i7 >= h11.size()) {
                                break;
                            }
                            if (((M0) h11.get(i7)).a() == 2) {
                                M0 m02 = (M0) h11.get(i7);
                                boolean z11 = false;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= m02.f20110d.length) {
                                        break;
                                    }
                                    if (m02.b(i10)) {
                                        z11 = true;
                                        break;
                                    }
                                    i10++;
                                }
                                if (z11) {
                                    z10 = true;
                                    break;
                                }
                            }
                            i7++;
                        }
                    }
                    h();
                }
                if (subtitleView != null && hVar.o(28)) {
                    C1549C c1549c2 = (C1549C) x0Var;
                    c1549c2.E0();
                    subtitleView.setCues(c1549c2.f19864r0.f12744a);
                }
                ((C1549C) x0Var).K(h10);
                c(false);
                return;
            }
        }
        z8 = true;
        AbstractC1705a.h(z8);
        x0Var2 = this.f14764A;
        if (x0Var2 != x0Var) {
        }
    }

    public void setRepeatToggleModes(int i7) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setRepeatToggleModes(i7);
    }

    public void setResizeMode(int i7) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14777b;
        AbstractC1705a.n(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i7);
    }

    public void setShowBuffering(int i7) {
        if (this.f14769F != i7) {
            this.f14769F = i7;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z8) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setShowFastForwardButton(z8);
    }

    public void setShowMultiWindowTimeBar(boolean z8) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setShowMultiWindowTimeBar(z8);
    }

    public void setShowNextButton(boolean z8) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setShowNextButton(z8);
    }

    public void setShowPreviousButton(boolean z8) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setShowPreviousButton(z8);
    }

    public void setShowRewindButton(boolean z8) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setShowRewindButton(z8);
    }

    public void setShowShuffleButton(boolean z8) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setShowShuffleButton(z8);
    }

    public void setShowSubtitleButton(boolean z8) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setShowSubtitleButton(z8);
    }

    public void setShowVrButton(boolean z8) {
        B b2 = this.f14785x;
        AbstractC1705a.n(b2);
        b2.setShowVrButton(z8);
    }

    public void setShutterBackgroundColor(int i7) {
        View view = this.f14778c;
        if (view != null) {
            view.setBackgroundColor(i7);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z8) {
        setArtworkDisplayMode(!z8 ? 1 : 0);
    }

    public void setUseController(boolean z8) {
        boolean z10 = true;
        B b2 = this.f14785x;
        AbstractC1705a.m((z8 && b2 == null) ? false : true);
        if (!z8 && !hasOnClickListeners()) {
            z10 = false;
        }
        setClickable(z10);
        if (this.f14765B == z8) {
            return;
        }
        this.f14765B = z8;
        if (m()) {
            b2.setPlayer(this.f14764A);
        } else if (b2 != null) {
            b2.g();
            b2.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        View view = this.f14779d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i7);
        }
    }
}
