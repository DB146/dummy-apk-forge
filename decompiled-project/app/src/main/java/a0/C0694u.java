package a0;

import A0.C0005a;
import B0.C0165a;
import Q.AbstractC0495i0;
import Q.AbstractC0508p;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import u.C2041D;

/* renamed from: a0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694u {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f12426a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12428c;

    /* renamed from: h, reason: collision with root package name */
    public Q9.a f12432h;

    /* renamed from: i, reason: collision with root package name */
    public C0693t f12433i;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f12427b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final C0165a f12429d = new C0165a(this, 5);

    /* renamed from: e, reason: collision with root package name */
    public final C0005a f12430e = new C0005a(this, 20);

    /* renamed from: f, reason: collision with root package name */
    public final S.e f12431f = new S.e(new C0693t[16]);
    public final Object g = new Object();
    public long j = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public C0694u(Rb.c cVar) {
        this.f12426a = (kotlin.jvm.internal.m) cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(C0694u c0694u) {
        boolean z8;
        Set set;
        synchronized (c0694u.g) {
            z8 = c0694u.f12428c;
        }
        if (z8) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            AtomicReference atomicReference = c0694u.f12427b;
            Object obj = atomicReference.get();
            Set set2 = null;
            List list = null;
            List list2 = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC0508p.d("Unexpected notification");
                        throw new Db.d(0);
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z10;
            }
            synchronized (c0694u.g) {
                S.e eVar = c0694u.f12431f;
                Object[] objArr = eVar.f8959a;
                int i7 = eVar.f8961c;
                for (int i10 = 0; i10 < i7; i10++) {
                    z10 = ((C0693t) objArr[i10]).b(set2) || z10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0079, B:13:0x0084, B:15:0x0094, B:17:0x0089, B:21:0x0022, B:24:0x002e, B:26:0x0043, B:28:0x004f, B:30:0x0059, B:32:0x0064, B:39:0x0072, B:42:0x009a), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj) {
        int i7;
        synchronized (this.g) {
            try {
                S.e eVar = this.f12431f;
                int i10 = eVar.f8961c;
                int i11 = 0;
                int i12 = 0;
                while (i11 < i10) {
                    C0693t c0693t = (C0693t) eVar.f8959a[i11];
                    C2041D c2041d = (C2041D) c0693t.f12422f.j(obj);
                    if (c2041d != null) {
                        Object[] objArr = c2041d.f24579b;
                        int[] iArr = c2041d.f24580c;
                        long[] jArr = c2041d.f24578a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j = jArr[i13];
                                i7 = i11;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        if ((j & 255) < 128) {
                                            int i16 = (i13 << 3) + i15;
                                            Object obj2 = objArr[i16];
                                            int i17 = iArr[i16];
                                            c0693t.d(obj, obj2);
                                        }
                                        j >>= 8;
                                    }
                                    if (i14 != 8) {
                                        break;
                                    }
                                }
                                if (i13 == length) {
                                    break;
                                }
                                i13++;
                                i11 = i7;
                            }
                            if (c0693t.f12422f.f24607e == 0) {
                                i12++;
                            } else if (i12 > 0) {
                                Object[] objArr2 = eVar.f8959a;
                                objArr2[i7 - i12] = objArr2[i7];
                            }
                            i11 = i7 + 1;
                        }
                    }
                    i7 = i11;
                    if (c0693t.f12422f.f24607e == 0) {
                    }
                    i11 = i7 + 1;
                }
                int i18 = i10 - i12;
                Arrays.fill(eVar.f8959a, i18, i10, (Object) null);
                eVar.f8961c = i18;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj, Rb.c cVar, Rb.a aVar) {
        Object obj2;
        C0693t c0693t;
        synchronized (this.g) {
            S.e eVar = this.f12431f;
            Object[] objArr = eVar.f8959a;
            int i7 = eVar.f8961c;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i10];
                if (((C0693t) obj2).f12417a == cVar) {
                    break;
                } else {
                    i10++;
                }
            }
            c0693t = (C0693t) obj2;
            if (c0693t == null) {
                kotlin.jvm.internal.l.c(cVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                kotlin.jvm.internal.y.b(1, cVar);
                c0693t = new C0693t(cVar);
                eVar.b(c0693t);
            }
        }
        C0693t c0693t2 = this.f12433i;
        long j = this.j;
        if (j != -1 && j != Y.f.b()) {
            StringBuilder l10 = X.c.l(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            l10.append(Y.f.b());
            l10.append(", name=");
            l10.append(Thread.currentThread().getName());
            l10.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            AbstractC0495i0.a(l10.toString());
        }
        try {
            this.f12433i = c0693t;
            this.j = Y.f.b();
            c0693t.a(obj, this.f12430e, aVar);
        } finally {
            this.f12433i = c0693t2;
            this.j = j;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection, java.lang.Object] */
    public final void d() {
        C0165a c0165a = this.f12429d;
        Q7.h hVar = AbstractC0688o.f12404a;
        AbstractC0688o.f(C0674a.f12366c);
        synchronized (AbstractC0688o.f12405b) {
            AbstractC0688o.g = Eb.o.h0(AbstractC0688o.g, c0165a);
        }
        this.f12432h = new Q9.a(c0165a);
    }
}
