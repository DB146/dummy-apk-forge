package C3;

import A0.G0;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class D implements h, g {

    /* renamed from: a, reason: collision with root package name */
    public final i f2501a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2502b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f2503c;

    /* renamed from: d, reason: collision with root package name */
    public volatile e f2504d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2505e;

    /* renamed from: f, reason: collision with root package name */
    public volatile G3.r f2506f;

    /* renamed from: u, reason: collision with root package name */
    public volatile f f2507u;

    public D(i iVar, k kVar) {
        this.f2501a = iVar;
        this.f2502b = kVar;
    }

    @Override // C3.h
    public final boolean a() {
        if (this.f2505e != null) {
            Object obj = this.f2505e;
            this.f2505e = null;
            try {
                if (!c(obj)) {
                    return true;
                }
            } catch (IOException e2) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e2);
                }
            }
        }
        if (this.f2504d != null && this.f2504d.a()) {
            return true;
        }
        this.f2504d = null;
        this.f2506f = null;
        boolean z8 = false;
        while (!z8 && this.f2503c < this.f2501a.b().size()) {
            ArrayList b2 = this.f2501a.b();
            int i7 = this.f2503c;
            this.f2503c = i7 + 1;
            this.f2506f = (G3.r) b2.get(i7);
            if (this.f2506f != null && (this.f2501a.f2537p.a(this.f2506f.f4329c.d()) || this.f2501a.c(this.f2506f.f4329c.b()) != null)) {
                this.f2506f.f4329c.f(this.f2501a.f2536o, new q3.s(3, this, this.f2506f));
                z8 = true;
            }
        }
        return z8;
    }

    @Override // C3.g
    public final void b(A3.h hVar, Exception exc, com.bumptech.glide.load.data.e eVar, A3.a aVar) {
        this.f2502b.b(hVar, exc, eVar, this.f2506f.f4329c.d());
    }

    public final boolean c(Object obj) {
        int i7 = W3.i.f10608b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z8 = false;
        try {
            com.bumptech.glide.load.data.g g = this.f2501a.f2527c.a().g(obj);
            Object l10 = g.l();
            A3.d d10 = this.f2501a.d(l10);
            G0 g02 = new G0(d10, l10, this.f2501a.f2532i);
            A3.h hVar = this.f2506f.f4327a;
            i iVar = this.f2501a;
            f fVar = new f(hVar, iVar.f2535n);
            E3.a a9 = iVar.f2531h.a();
            a9.d(fVar, g02);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + fVar + ", data: " + obj + ", encoder: " + d10 + ", duration: " + W3.i.a(elapsedRealtimeNanos));
            }
            if (a9.e(fVar) != null) {
                this.f2507u = fVar;
                this.f2504d = new e(Collections.singletonList(this.f2506f.f4327a), this.f2501a, this);
                this.f2506f.f4329c.a();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f2507u + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f2502b.d(this.f2506f.f4327a, g.l(), this.f2506f.f4329c, this.f2506f.f4329c.d(), this.f2506f.f4327a);
                return false;
            } catch (Throwable th) {
                th = th;
                z8 = true;
                if (!z8) {
                    this.f2506f.f4329c.a();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // C3.h
    public final void cancel() {
        G3.r rVar = this.f2506f;
        if (rVar != null) {
            rVar.f4329c.cancel();
        }
    }

    @Override // C3.g
    public final void d(A3.h hVar, Object obj, com.bumptech.glide.load.data.e eVar, A3.a aVar, A3.h hVar2) {
        this.f2502b.d(hVar, obj, eVar, this.f2506f.f4329c.d(), hVar);
    }
}
