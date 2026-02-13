package y6;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import q6.C1896a;

/* renamed from: y6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2400f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public C2404j f27011a;

    /* renamed from: b, reason: collision with root package name */
    public C1896a f27012b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f27013c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f27014d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f27015e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f27016f;
    public Rect g;

    /* renamed from: h, reason: collision with root package name */
    public final float f27017h;

    /* renamed from: i, reason: collision with root package name */
    public float f27018i;
    public float j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public float f27019l;

    /* renamed from: m, reason: collision with root package name */
    public float f27020m;

    /* renamed from: n, reason: collision with root package name */
    public int f27021n;

    /* renamed from: o, reason: collision with root package name */
    public int f27022o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint.Style f27023p;

    public C2400f(C2400f c2400f) {
        this.f27013c = null;
        this.f27014d = null;
        this.f27015e = null;
        this.f27016f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.f27017h = 1.0f;
        this.f27018i = 1.0f;
        this.k = 255;
        this.f27019l = 0.0f;
        this.f27020m = 0.0f;
        this.f27021n = 0;
        this.f27022o = 0;
        this.f27023p = Paint.Style.FILL_AND_STROKE;
        this.f27011a = c2400f.f27011a;
        this.f27012b = c2400f.f27012b;
        this.j = c2400f.j;
        this.f27013c = c2400f.f27013c;
        this.f27014d = c2400f.f27014d;
        this.f27016f = c2400f.f27016f;
        this.f27015e = c2400f.f27015e;
        this.k = c2400f.k;
        this.f27017h = c2400f.f27017h;
        this.f27022o = c2400f.f27022o;
        this.f27018i = c2400f.f27018i;
        this.f27019l = c2400f.f27019l;
        this.f27020m = c2400f.f27020m;
        this.f27021n = c2400f.f27021n;
        this.f27023p = c2400f.f27023p;
        if (c2400f.g != null) {
            this.g = new Rect(c2400f.g);
        }
    }

    public C2400f(C2404j c2404j) {
        this.f27013c = null;
        this.f27014d = null;
        this.f27015e = null;
        this.f27016f = PorterDuff.Mode.SRC_IN;
        this.g = null;
        this.f27017h = 1.0f;
        this.f27018i = 1.0f;
        this.k = 255;
        this.f27019l = 0.0f;
        this.f27020m = 0.0f;
        this.f27021n = 0;
        this.f27022o = 0;
        this.f27023p = Paint.Style.FILL_AND_STROKE;
        this.f27011a = c2404j;
        this.f27012b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C2401g c2401g = new C2401g(this);
        c2401g.f27039e = true;
        return c2401g;
    }
}
