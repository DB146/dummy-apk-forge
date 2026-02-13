package L3;

import C3.A;
import C3.w;
import D3.f;
import N3.e;
import W3.g;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.n;
import q3.s;
import x3.C2262d;

/* loaded from: classes.dex */
public final class b implements A, w {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f6284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6285b;

    public b(int i7, Drawable drawable) {
        this.f6285b = i7;
        g.c(drawable, "Argument must not be null");
        this.f6284a = drawable;
    }

    private final void e() {
    }

    @Override // C3.w
    public void a() {
        switch (this.f6285b) {
            case 1:
                ((N3.g) ((N3.c) this.f6284a).f7173a.f7172b).f7196l.prepareToDraw();
                return;
            default:
                Drawable drawable = this.f6284a;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    return;
                } else {
                    if (drawable instanceof N3.c) {
                        ((N3.g) ((N3.c) drawable).f7173a.f7172b).f7196l.prepareToDraw();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // C3.A
    public final int b() {
        switch (this.f6285b) {
            case 0:
                Drawable drawable = this.f6284a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                N3.g gVar = (N3.g) ((N3.c) this.f6284a).f7173a.f7172b;
                C2262d c2262d = gVar.f7188a;
                return (c2262d.j.length * 4) + c2262d.f26189d.limit() + c2262d.f26193i.length + gVar.f7198n;
        }
    }

    @Override // C3.A
    public final Class c() {
        switch (this.f6285b) {
            case 0:
                return this.f6284a.getClass();
            default:
                return N3.c.class;
        }
    }

    @Override // C3.A
    public final void d() {
        f fVar;
        f fVar2;
        f fVar3;
        switch (this.f6285b) {
            case 0:
                return;
            default:
                N3.c cVar = (N3.c) this.f6284a;
                cVar.stop();
                cVar.f7176d = true;
                N3.g gVar = (N3.g) cVar.f7173a.f7172b;
                gVar.f7190c.clear();
                Bitmap bitmap = gVar.f7196l;
                if (bitmap != null) {
                    gVar.f7192e.g(bitmap);
                    gVar.f7196l = null;
                }
                gVar.f7193f = false;
                e eVar = gVar.f7195i;
                n nVar = gVar.f7191d;
                if (eVar != null) {
                    nVar.n(eVar);
                    gVar.f7195i = null;
                }
                e eVar2 = gVar.k;
                if (eVar2 != null) {
                    nVar.n(eVar2);
                    gVar.k = null;
                }
                e eVar3 = gVar.f7197m;
                if (eVar3 != null) {
                    nVar.n(eVar3);
                    gVar.f7197m = null;
                }
                C2262d c2262d = gVar.f7188a;
                c2262d.f26194l = null;
                byte[] bArr = c2262d.f26193i;
                s sVar = c2262d.f26188c;
                if (bArr != null && (fVar3 = (f) sVar.f23439c) != null) {
                    fVar3.g(bArr);
                }
                int[] iArr = c2262d.j;
                if (iArr != null && (fVar2 = (f) sVar.f23439c) != null) {
                    fVar2.g(iArr);
                }
                Bitmap bitmap2 = c2262d.f26195m;
                if (bitmap2 != null) {
                    ((D3.a) sVar.f23438b).g(bitmap2);
                }
                c2262d.f26195m = null;
                c2262d.f26189d = null;
                c2262d.f26201s = null;
                byte[] bArr2 = c2262d.f26190e;
                if (bArr2 != null && (fVar = (f) sVar.f23439c) != null) {
                    fVar.g(bArr2);
                }
                gVar.j = true;
                return;
        }
    }

    @Override // C3.A
    public final Object get() {
        Drawable drawable = this.f6284a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
