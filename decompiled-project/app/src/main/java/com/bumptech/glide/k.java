package com.bumptech.glide;

import P3.p;
import W3.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import androidx.datastore.preferences.protobuf.b0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import u.C2052e;

/* loaded from: classes.dex */
public final class k extends S3.a {

    /* renamed from: I, reason: collision with root package name */
    public final Context f14656I;

    /* renamed from: J, reason: collision with root package name */
    public final n f14657J;

    /* renamed from: K, reason: collision with root package name */
    public final Class f14658K;
    public final f L;

    /* renamed from: M, reason: collision with root package name */
    public a f14659M;

    /* renamed from: N, reason: collision with root package name */
    public Object f14660N;

    /* renamed from: O, reason: collision with root package name */
    public ArrayList f14661O;

    /* renamed from: P, reason: collision with root package name */
    public k f14662P;

    /* renamed from: Q, reason: collision with root package name */
    public k f14663Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f14664R = true;

    /* renamed from: S, reason: collision with root package name */
    public boolean f14665S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f14666T;

    static {
    }

    public k(b bVar, n nVar, Class cls, Context context) {
        S3.f fVar;
        this.f14657J = nVar;
        this.f14658K = cls;
        this.f14656I = context;
        C2052e c2052e = nVar.f14696a.f14601c.f14630f;
        a aVar = (a) c2052e.get(cls);
        if (aVar == null) {
            Iterator it = ((b0) c2052e.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.f14659M = aVar == null ? f.k : aVar;
        this.L = bVar.f14601c;
        Iterator it2 = nVar.f14704w.iterator();
        while (it2.hasNext()) {
            y((S3.e) it2.next());
        }
        synchronized (nVar) {
            fVar = nVar.f14705x;
        }
        a(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final S3.c A(Object obj, T3.i iVar, z3.c cVar, S3.d dVar, a aVar, g gVar, int i7, int i10, S3.a aVar2, Executor executor) {
        S3.d dVar2;
        S3.d dVar3;
        S3.d dVar4;
        S3.g gVar2;
        int i11;
        int i12;
        g gVar3;
        int i13;
        int i14;
        if (this.f14663Q != null) {
            dVar3 = new S3.b(obj, dVar);
            dVar2 = dVar3;
        } else {
            dVar2 = null;
            dVar3 = dVar;
        }
        k kVar = this.f14662P;
        if (kVar == null) {
            dVar4 = dVar2;
            Object obj2 = this.f14660N;
            ArrayList arrayList = this.f14661O;
            f fVar = this.L;
            gVar2 = new S3.g(this.f14656I, fVar, obj, obj2, this.f14658K, aVar2, i7, i10, gVar, iVar, cVar, arrayList, dVar3, fVar.g, aVar.f14596a, executor);
        } else {
            if (this.f14666T) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            a aVar3 = kVar.f14664R ? aVar : kVar.f14659M;
            if (S3.a.i(kVar.f8998a, 8)) {
                gVar3 = this.f14662P.f9000c;
            } else {
                int ordinal = gVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    gVar3 = g.f14633a;
                } else if (ordinal == 2) {
                    gVar3 = g.f14634b;
                } else {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f9000c);
                    }
                    gVar3 = g.f14635c;
                }
            }
            g gVar4 = gVar3;
            k kVar2 = this.f14662P;
            int i15 = kVar2.f9007x;
            int i16 = kVar2.f9006w;
            if (o.j(i7, i10)) {
                k kVar3 = this.f14662P;
                if (!o.j(kVar3.f9007x, kVar3.f9006w)) {
                    i14 = aVar2.f9007x;
                    i13 = aVar2.f9006w;
                    S3.h hVar = new S3.h(obj, dVar3);
                    Object obj3 = this.f14660N;
                    ArrayList arrayList2 = this.f14661O;
                    f fVar2 = this.L;
                    dVar4 = dVar2;
                    S3.g gVar5 = new S3.g(this.f14656I, fVar2, obj, obj3, this.f14658K, aVar2, i7, i10, gVar, iVar, cVar, arrayList2, hVar, fVar2.g, aVar.f14596a, executor);
                    this.f14666T = true;
                    k kVar4 = this.f14662P;
                    S3.c A10 = kVar4.A(obj, iVar, cVar, hVar, aVar3, gVar4, i14, i13, kVar4, executor);
                    this.f14666T = false;
                    hVar.f9045c = gVar5;
                    hVar.f9046d = A10;
                    gVar2 = hVar;
                }
            }
            i13 = i16;
            i14 = i15;
            S3.h hVar2 = new S3.h(obj, dVar3);
            Object obj32 = this.f14660N;
            ArrayList arrayList22 = this.f14661O;
            f fVar22 = this.L;
            dVar4 = dVar2;
            S3.g gVar52 = new S3.g(this.f14656I, fVar22, obj, obj32, this.f14658K, aVar2, i7, i10, gVar, iVar, cVar, arrayList22, hVar2, fVar22.g, aVar.f14596a, executor);
            this.f14666T = true;
            k kVar42 = this.f14662P;
            S3.c A102 = kVar42.A(obj, iVar, cVar, hVar2, aVar3, gVar4, i14, i13, kVar42, executor);
            this.f14666T = false;
            hVar2.f9045c = gVar52;
            hVar2.f9046d = A102;
            gVar2 = hVar2;
        }
        S3.b bVar = dVar4;
        if (bVar == 0) {
            return gVar2;
        }
        k kVar5 = this.f14663Q;
        int i17 = kVar5.f9007x;
        int i18 = kVar5.f9006w;
        if (o.j(i7, i10)) {
            k kVar6 = this.f14663Q;
            if (!o.j(kVar6.f9007x, kVar6.f9006w)) {
                i12 = aVar2.f9007x;
                i11 = aVar2.f9006w;
                k kVar7 = this.f14663Q;
                S3.c A11 = kVar7.A(obj, iVar, cVar, bVar, kVar7.f14659M, kVar7.f9000c, i12, i11, kVar7, executor);
                bVar.f9012c = gVar2;
                bVar.f9013d = A11;
                return bVar;
            }
        }
        i11 = i18;
        i12 = i17;
        k kVar72 = this.f14663Q;
        S3.c A112 = kVar72.A(obj, iVar, cVar, bVar, kVar72.f14659M, kVar72.f9000c, i12, i11, kVar72, executor);
        bVar.f9012c = gVar2;
        bVar.f9013d = A112;
        return bVar;
    }

    @Override // S3.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        k kVar = (k) super.clone();
        kVar.f14659M = kVar.f14659M.clone();
        if (kVar.f14661O != null) {
            kVar.f14661O = new ArrayList(kVar.f14661O);
        }
        k kVar2 = kVar.f14662P;
        if (kVar2 != null) {
            kVar.f14662P = kVar2.clone();
        }
        k kVar3 = kVar.f14663Q;
        if (kVar3 != null) {
            kVar.f14663Q = kVar3.clone();
        }
        return kVar;
    }

    public final void C(T3.i iVar, z3.c cVar, S3.a aVar, Executor executor) {
        W3.g.b(iVar);
        if (!this.f14665S) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        S3.c A10 = A(new Object(), iVar, cVar, null, this.f14659M, aVar.f9000c, aVar.f9007x, aVar.f9006w, aVar, executor);
        S3.c g = iVar.g();
        if (A10.d(g) && (aVar.f9005v || !g.i())) {
            W3.g.c(g, "Argument must not be null");
            if (g.isRunning()) {
                return;
            }
            g.e();
            return;
        }
        this.f14657J.n(iVar);
        iVar.a(A10);
        n nVar = this.f14657J;
        synchronized (nVar) {
            nVar.f14701f.f7844a.add(iVar);
            p pVar = nVar.f14699d;
            ((Set) pVar.f7842c).add(A10);
            if (pVar.f7841b) {
                A10.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) pVar.f7843d).add(A10);
            } else {
                A10.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Type inference failed for: r2v4, types: [J3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [J3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [J3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [J3.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(ImageView imageView) {
        S3.a aVar;
        Class cls;
        T3.b bVar;
        o.a();
        W3.g.b(imageView);
        if (!S3.a.i(this.f8998a, 2048) && imageView.getScaleType() != null) {
            switch (j.f14654a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().j(J3.o.f5482d, new Object());
                    break;
                case 2:
                    aVar = clone().o(J3.o.f5481c, new Object(), false);
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().o(J3.o.f5480b, new Object(), false);
                    break;
                case 6:
                    aVar = clone().o(J3.o.f5481c, new Object(), false);
                    break;
            }
            this.L.f14627c.getClass();
            cls = this.f14658K;
            if (!Bitmap.class.equals(cls)) {
                bVar = new T3.b(imageView, 0);
            } else {
                if (!Drawable.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
                }
                bVar = new T3.b(imageView, 1);
            }
            C(bVar, null, aVar, W3.g.f10605a);
        }
        aVar = this;
        this.L.f14627c.getClass();
        cls = this.f14658K;
        if (!Bitmap.class.equals(cls)) {
        }
        C(bVar, null, aVar, W3.g.f10605a);
    }

    public final k E(Object obj) {
        if (this.f8995F) {
            return clone().E(obj);
        }
        this.f14660N = obj;
        this.f14665S = true;
        p();
        return this;
    }

    @Override // S3.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (super.equals(kVar)) {
            return Objects.equals(this.f14658K, kVar.f14658K) && this.f14659M.equals(kVar.f14659M) && Objects.equals(this.f14660N, kVar.f14660N) && Objects.equals(this.f14661O, kVar.f14661O) && Objects.equals(this.f14662P, kVar.f14662P) && Objects.equals(this.f14663Q, kVar.f14663Q) && this.f14664R == kVar.f14664R && this.f14665S == kVar.f14665S;
        }
        return false;
    }

    @Override // S3.a
    public final int hashCode() {
        return o.g(this.f14665S ? 1 : 0, o.g(this.f14664R ? 1 : 0, o.h(o.h(o.h(o.h(o.h(o.h(o.h(super.hashCode(), this.f14658K), this.f14659M), this.f14660N), this.f14661O), this.f14662P), this.f14663Q), null)));
    }

    public final k y(S3.e eVar) {
        if (this.f8995F) {
            return clone().y(eVar);
        }
        if (eVar != null) {
            if (this.f14661O == null) {
                this.f14661O = new ArrayList();
            }
            this.f14661O.add(eVar);
        }
        p();
        return this;
    }

    @Override // S3.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final k a(S3.a aVar) {
        W3.g.b(aVar);
        return (k) super.a(aVar);
    }
}
