package p9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import c2.x;
import com.journeyapps.barcodescanner.BarcodeView;
import ea.C1111f;
import i1.C1290a;
import java.util.ArrayList;
import n5.u;

/* loaded from: classes2.dex */
public abstract class e extends ViewGroup {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f23161N = 0;

    /* renamed from: A, reason: collision with root package name */
    public r f23162A;

    /* renamed from: B, reason: collision with root package name */
    public r f23163B;

    /* renamed from: C, reason: collision with root package name */
    public Rect f23164C;

    /* renamed from: D, reason: collision with root package name */
    public r f23165D;

    /* renamed from: E, reason: collision with root package name */
    public Rect f23166E;

    /* renamed from: F, reason: collision with root package name */
    public Rect f23167F;

    /* renamed from: G, reason: collision with root package name */
    public r f23168G;

    /* renamed from: H, reason: collision with root package name */
    public double f23169H;

    /* renamed from: I, reason: collision with root package name */
    public q9.l f23170I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f23171J;

    /* renamed from: K, reason: collision with root package name */
    public final x f23172K;
    public final C1290a L;

    /* renamed from: M, reason: collision with root package name */
    public final d f23173M;

    /* renamed from: a, reason: collision with root package name */
    public q9.f f23174a;

    /* renamed from: b, reason: collision with root package name */
    public final WindowManager f23175b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f23176c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23177d;

    /* renamed from: e, reason: collision with root package name */
    public SurfaceView f23178e;

    /* renamed from: f, reason: collision with root package name */
    public TextureView f23179f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23180u;

    /* renamed from: v, reason: collision with root package name */
    public final E5.o f23181v;

    /* renamed from: w, reason: collision with root package name */
    public int f23182w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f23183x;

    /* renamed from: y, reason: collision with root package name */
    public A4.s f23184y;

    /* renamed from: z, reason: collision with root package name */
    public q9.i f23185z;

    /* JADX WARN: Type inference failed for: r5v4, types: [E5.o, java.lang.Object] */
    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23177d = false;
        this.f23180u = false;
        this.f23182w = -1;
        this.f23183x = new ArrayList();
        this.f23185z = new q9.i();
        this.f23166E = null;
        this.f23167F = null;
        this.f23168G = null;
        this.f23169H = 0.1d;
        this.f23170I = null;
        this.f23171J = false;
        BarcodeView barcodeView = (BarcodeView) this;
        int i7 = 1;
        this.f23172K = new x(barcodeView, i7);
        C1861b c1861b = new C1861b(barcodeView, i7);
        this.L = new C1290a(barcodeView, 15);
        this.f23173M = new d(barcodeView, 0);
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        b(attributeSet);
        this.f23175b = (WindowManager) context.getSystemService("window");
        this.f23176c = new Handler(c1861b);
        this.f23181v = new Object();
    }

    public static void a(BarcodeView barcodeView) {
        if (barcodeView.f23174a == null || barcodeView.getDisplayRotation() == barcodeView.f23182w) {
            return;
        }
        barcodeView.g();
        barcodeView.c();
    }

    private int getDisplayRotation() {
        return this.f23175b.getDefaultDisplay().getRotation();
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, T8.h.f9380a);
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f23168G = new r(dimension, dimension2);
        }
        this.f23177d = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.f23170I = new q9.j(0);
        } else if (integer == 2) {
            this.f23170I = new q9.j(1);
        } else if (integer == 3) {
            this.f23170I = new q9.j(2);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [q9.f, java.lang.Object] */
    public final void c() {
        int i7 = 1;
        int i10 = 0;
        q3.f.E();
        Log.d("e", "resume()");
        if (this.f23174a != null) {
            Log.w("e", "initCamera called twice");
        } else {
            Context context = getContext();
            ?? obj = new Object();
            obj.f23570f = false;
            obj.g = true;
            obj.f23572i = new q9.i();
            q9.e eVar = new q9.e(obj, i10);
            obj.j = new q9.e(obj, i7);
            obj.k = new q9.e(obj, 2);
            obj.f23573l = new q9.e(obj, 3);
            q3.f.E();
            if (u.g == null) {
                u.g = new u(4);
            }
            u uVar = u.g;
            obj.f23565a = uVar;
            q9.h hVar = new q9.h(context);
            obj.f23567c = hVar;
            hVar.g = obj.f23572i;
            obj.f23571h = new Handler();
            q9.i iVar = this.f23185z;
            if (!obj.f23570f) {
                obj.f23572i = iVar;
                hVar.g = iVar;
            }
            this.f23174a = obj;
            obj.f23568d = this.f23176c;
            q3.f.E();
            obj.f23570f = true;
            obj.g = false;
            synchronized (uVar.f21225e) {
                uVar.f21222b++;
                uVar.d(eVar);
            }
            this.f23182w = getDisplayRotation();
        }
        if (this.f23165D != null) {
            e();
        } else {
            SurfaceView surfaceView = this.f23178e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f23172K);
            } else {
                TextureView textureView = this.f23179f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f23179f.getSurfaceTexture();
                        this.f23165D = new r(this.f23179f.getWidth(), this.f23179f.getHeight());
                        e();
                    } else {
                        this.f23179f.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC1862c(this));
                    }
                }
            }
        }
        requestLayout();
        E5.o oVar = this.f23181v;
        Context context2 = getContext();
        C1290a c1290a = this.L;
        q qVar = (q) oVar.f3714c;
        if (qVar != null) {
            qVar.disable();
        }
        oVar.f3714c = null;
        oVar.f3713b = null;
        oVar.f3715d = null;
        Context applicationContext = context2.getApplicationContext();
        oVar.f3715d = c1290a;
        oVar.f3713b = (WindowManager) applicationContext.getSystemService("window");
        q qVar2 = new q(oVar, applicationContext);
        oVar.f3714c = qVar2;
        qVar2.enable();
        oVar.f3712a = ((WindowManager) oVar.f3713b).getDefaultDisplay().getRotation();
    }

    public final void d(C1111f c1111f) {
        if (this.f23180u || this.f23174a == null) {
            return;
        }
        Log.i("e", "Starting preview");
        q9.f fVar = this.f23174a;
        fVar.f23566b = c1111f;
        q3.f.E();
        if (!fVar.f23570f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
        fVar.f23565a.d(fVar.k);
        this.f23180u = true;
        ((BarcodeView) this).h();
        this.f23173M.g();
    }

    public final void e() {
        Rect rect;
        float f4;
        r rVar = this.f23165D;
        if (rVar == null || this.f23163B == null || (rect = this.f23164C) == null) {
            return;
        }
        if (this.f23178e != null && rVar.equals(new r(rect.width(), this.f23164C.height()))) {
            SurfaceHolder holder = this.f23178e.getHolder();
            C1111f c1111f = new C1111f(10);
            if (holder == null) {
                throw new IllegalArgumentException("surfaceHolder may not be null");
            }
            c1111f.f16837b = holder;
            d(c1111f);
            return;
        }
        TextureView textureView = this.f23179f;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.f23163B != null) {
            int width = this.f23179f.getWidth();
            int height = this.f23179f.getHeight();
            r rVar2 = this.f23163B;
            float f10 = height;
            float f11 = width / f10;
            float f12 = rVar2.f23214a / rVar2.f23215b;
            float f13 = 1.0f;
            if (f11 < f12) {
                float f14 = f12 / f11;
                f4 = 1.0f;
                f13 = f14;
            } else {
                f4 = f11 / f12;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f13, f4);
            float f15 = width;
            matrix.postTranslate((f15 - (f13 * f15)) / 2.0f, (f10 - (f4 * f10)) / 2.0f);
            this.f23179f.setTransform(matrix);
        }
        SurfaceTexture surfaceTexture = this.f23179f.getSurfaceTexture();
        C1111f c1111f2 = new C1111f(10);
        if (surfaceTexture == null) {
            throw new IllegalArgumentException("surfaceTexture may not be null");
        }
        c1111f2.f16838c = surfaceTexture;
        d(c1111f2);
    }

    public q9.f getCameraInstance() {
        return this.f23174a;
    }

    public q9.i getCameraSettings() {
        return this.f23185z;
    }

    public Rect getFramingRect() {
        return this.f23166E;
    }

    public r getFramingRectSize() {
        return this.f23168G;
    }

    public double getMarginFraction() {
        return this.f23169H;
    }

    public Rect getPreviewFramingRect() {
        return this.f23167F;
    }

    public q9.l getPreviewScalingStrategy() {
        q9.l lVar = this.f23170I;
        return lVar != null ? lVar : this.f23179f != null ? new q9.j(0) : new q9.j(1);
    }

    public r getPreviewSize() {
        return this.f23163B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23177d) {
            TextureView textureView = new TextureView(getContext());
            this.f23179f = textureView;
            textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC1862c(this));
            addView(this.f23179f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f23178e = surfaceView;
        surfaceView.getHolder().addCallback(this.f23172K);
        addView(this.f23178e);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [A4.s, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        r rVar = new r(i11 - i7, i12 - i10);
        this.f23162A = rVar;
        q9.f fVar = this.f23174a;
        if (fVar != null && fVar.f23569e == null) {
            int displayRotation = getDisplayRotation();
            ?? obj = new Object();
            obj.f472c = new q9.j(1);
            obj.f470a = displayRotation;
            obj.f471b = rVar;
            this.f23184y = obj;
            obj.f472c = getPreviewScalingStrategy();
            q9.f fVar2 = this.f23174a;
            A4.s sVar = this.f23184y;
            fVar2.f23569e = sVar;
            fVar2.f23567c.f23584h = sVar;
            q3.f.E();
            if (!fVar2.f23570f) {
                throw new IllegalStateException("CameraInstance is not open");
            }
            fVar2.f23565a.d(fVar2.j);
            boolean z10 = this.f23171J;
            if (z10) {
                q9.f fVar3 = this.f23174a;
                fVar3.getClass();
                q3.f.E();
                if (fVar3.f23570f) {
                    fVar3.f23565a.d(new T8.a(3, fVar3, z10));
                }
            }
        }
        SurfaceView surfaceView = this.f23178e;
        if (surfaceView == null) {
            TextureView textureView = this.f23179f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f23164C;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f23171J);
        return bundle;
    }

    public void setCameraSettings(q9.i iVar) {
        this.f23185z = iVar;
    }

    public void setFramingRectSize(r rVar) {
        this.f23168G = rVar;
    }

    public void setMarginFraction(double d10) {
        if (d10 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f23169H = d10;
    }

    public void setPreviewScalingStrategy(q9.l lVar) {
        this.f23170I = lVar;
    }

    public void setTorch(boolean z8) {
        this.f23171J = z8;
        q9.f fVar = this.f23174a;
        if (fVar != null) {
            q3.f.E();
            if (fVar.f23570f) {
                fVar.f23565a.d(new T8.a(3, fVar, z8));
            }
        }
    }

    public void setUseTextureView(boolean z8) {
        this.f23177d = z8;
    }
}
