package N3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends Drawable implements f, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final b f7173a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7174b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7175c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7176d;

    /* renamed from: f, reason: collision with root package name */
    public int f7178f;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7180v;

    /* renamed from: w, reason: collision with root package name */
    public Paint f7181w;

    /* renamed from: x, reason: collision with root package name */
    public Rect f7182x;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7177e = true;

    /* renamed from: u, reason: collision with root package name */
    public final int f7179u = -1;

    public c(b bVar) {
        this.f7173a = bVar;
    }

    public final void a() {
        W3.g.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f7176d);
        g gVar = (g) this.f7173a.f7172b;
        if (gVar.f7188a.f26194l.f26176c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f7174b) {
            return;
        }
        this.f7174b = true;
        if (gVar.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = gVar.f7190c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !gVar.f7193f) {
            gVar.f7193f = true;
            gVar.j = false;
            gVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f7176d) {
            return;
        }
        if (this.f7180v) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f7182x == null) {
                this.f7182x = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f7182x);
            this.f7180v = false;
        }
        g gVar = (g) this.f7173a.f7172b;
        e eVar = gVar.f7195i;
        Bitmap bitmap = eVar != null ? eVar.f7187u : gVar.f7196l;
        if (this.f7182x == null) {
            this.f7182x = new Rect();
        }
        Rect rect = this.f7182x;
        if (this.f7181w == null) {
            this.f7181w = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f7181w);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f7173a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((g) this.f7173a.f7172b).f7200p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((g) this.f7173a.f7172b).f7199o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f7174b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f7180v = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f7181w == null) {
            this.f7181w = new Paint(2);
        }
        this.f7181w.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f7181w == null) {
            this.f7181w = new Paint(2);
        }
        this.f7181w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z10) {
        W3.g.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f7176d);
        this.f7177e = z8;
        if (!z8) {
            this.f7174b = false;
            g gVar = (g) this.f7173a.f7172b;
            ArrayList arrayList = gVar.f7190c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                gVar.f7193f = false;
            }
        } else if (this.f7175c) {
            a();
        }
        return super.setVisible(z8, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f7175c = true;
        this.f7178f = 0;
        if (this.f7177e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f7175c = false;
        this.f7174b = false;
        g gVar = (g) this.f7173a.f7172b;
        ArrayList arrayList = gVar.f7190c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            gVar.f7193f = false;
        }
    }
}
