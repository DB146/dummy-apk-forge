package N3;

import A3.p;
import C3.m;
import W3.o;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.n;
import java.util.ArrayList;
import x3.C2259a;
import x3.C2262d;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C2262d f7188a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f7189b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7190c;

    /* renamed from: d, reason: collision with root package name */
    public final n f7191d;

    /* renamed from: e, reason: collision with root package name */
    public final D3.a f7192e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7193f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public k f7194h;

    /* renamed from: i, reason: collision with root package name */
    public e f7195i;
    public boolean j;
    public e k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f7196l;

    /* renamed from: m, reason: collision with root package name */
    public e f7197m;

    /* renamed from: n, reason: collision with root package name */
    public int f7198n;

    /* renamed from: o, reason: collision with root package name */
    public int f7199o;

    /* renamed from: p, reason: collision with root package name */
    public int f7200p;

    public g(com.bumptech.glide.b bVar, C2262d c2262d, int i7, int i10, Bitmap bitmap) {
        I3.c cVar = I3.c.f5219b;
        D3.a aVar = bVar.f14599a;
        com.bumptech.glide.f fVar = bVar.f14601c;
        n d10 = com.bumptech.glide.b.d(fVar.getBaseContext());
        k a9 = com.bumptech.glide.b.d(fVar.getBaseContext()).m().a(((S3.f) ((S3.f) ((S3.f) new S3.a().e(m.f2578b)).x()).s()).k(i7, i10));
        this.f7190c = new ArrayList();
        this.f7191d = d10;
        Handler handler = new Handler(Looper.getMainLooper(), new A6.e(this, 2));
        this.f7192e = aVar;
        this.f7189b = handler;
        this.f7194h = a9;
        this.f7188a = c2262d;
        c(cVar, bitmap);
    }

    public final void a() {
        int i7;
        if (!this.f7193f || this.g) {
            return;
        }
        e eVar = this.f7197m;
        if (eVar != null) {
            this.f7197m = null;
            b(eVar);
            return;
        }
        this.g = true;
        C2262d c2262d = this.f7188a;
        int i10 = c2262d.f26194l.f26176c;
        long uptimeMillis = SystemClock.uptimeMillis() + ((i10 <= 0 || (i7 = c2262d.k) < 0) ? 0 : (i7 < 0 || i7 >= i10) ? -1 : ((C2259a) r3.f26178e.get(i7)).f26173i);
        int i11 = (c2262d.k + 1) % c2262d.f26194l.f26176c;
        c2262d.k = i11;
        this.k = new e(this.f7189b, i11, uptimeMillis);
        k E10 = this.f7194h.a((S3.f) new S3.a().r(new V3.d(Double.valueOf(Math.random())))).E(c2262d);
        E10.C(this.k, null, E10, W3.g.f10605a);
    }

    public final void b(e eVar) {
        this.g = false;
        boolean z8 = this.j;
        Handler handler = this.f7189b;
        if (z8) {
            handler.obtainMessage(2, eVar).sendToTarget();
            return;
        }
        if (!this.f7193f) {
            this.f7197m = eVar;
            return;
        }
        if (eVar.f7187u != null) {
            Bitmap bitmap = this.f7196l;
            if (bitmap != null) {
                this.f7192e.g(bitmap);
                this.f7196l = null;
            }
            e eVar2 = this.f7195i;
            this.f7195i = eVar;
            ArrayList arrayList = this.f7190c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) ((f) arrayList.get(size));
                Object callback = cVar.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    cVar.stop();
                    cVar.invalidateSelf();
                } else {
                    cVar.invalidateSelf();
                    e eVar3 = ((g) cVar.f7173a.f7172b).f7195i;
                    if ((eVar3 != null ? eVar3.f7185e : -1) == r5.f7188a.f26194l.f26176c - 1) {
                        cVar.f7178f++;
                    }
                    int i7 = cVar.f7179u;
                    if (i7 != -1 && cVar.f7178f >= i7) {
                        cVar.stop();
                    }
                }
            }
            if (eVar2 != null) {
                handler.obtainMessage(2, eVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(p pVar, Bitmap bitmap) {
        W3.g.c(pVar, "Argument must not be null");
        W3.g.c(bitmap, "Argument must not be null");
        this.f7196l = bitmap;
        this.f7194h = this.f7194h.a(new S3.a().u(pVar, true));
        this.f7198n = o.c(bitmap);
        this.f7199o = bitmap.getWidth();
        this.f7200p = bitmap.getHeight();
    }
}
