package a5;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public abstract class f implements h, q4.c {

    /* renamed from: a, reason: collision with root package name */
    public final q4.j f12751a;

    /* renamed from: f, reason: collision with root package name */
    public final q4.h[] f12756f;

    /* renamed from: v, reason: collision with root package name */
    public int f12758v;

    /* renamed from: w, reason: collision with root package name */
    public q4.g f12759w;

    /* renamed from: x, reason: collision with root package name */
    public i f12760x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12761y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12762z;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12752b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f12753c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f12754d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final q4.g[] f12755e = new k[2];

    /* renamed from: u, reason: collision with root package name */
    public int f12757u = 2;

    public f() {
        d[] dVarArr = new d[2];
        int i7 = 0;
        while (true) {
            if (i7 >= this.f12757u) {
                break;
            }
            this.f12755e[i7] = new q4.g(1);
            i7++;
        }
        this.f12756f = dVarArr;
        this.f12758v = 2;
        for (int i10 = 0; i10 < this.f12758v; i10++) {
            this.f12756f[i10] = new d(this, 1);
        }
        q4.j jVar = new q4.j(this);
        this.f12751a = jVar;
        jVar.start();
        int i11 = this.f12757u;
        q4.g[] gVarArr = this.f12755e;
        AbstractC1705a.m(i11 == gVarArr.length);
        for (q4.g gVar : gVarArr) {
            gVar.I(1024);
        }
    }

    @Override // q4.c
    public final void a(k kVar) {
        synchronized (this.f12752b) {
            try {
                i iVar = this.f12760x;
                if (iVar != null) {
                    throw iVar;
                }
                AbstractC1705a.h(kVar == this.f12759w);
                this.f12753c.addLast(kVar);
                if (!this.f12753c.isEmpty() && this.f12758v > 0) {
                    this.f12752b.notify();
                }
                this.f12759w = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract g b(int i7, boolean z8, byte[] bArr);

    public final i c(q4.g gVar, q4.h hVar, boolean z8) {
        k kVar = (k) gVar;
        d dVar = (d) hVar;
        try {
            ByteBuffer byteBuffer = kVar.f23458d;
            byteBuffer.getClass();
            dVar.H(kVar.f23460f, b(byteBuffer.limit(), z8, byteBuffer.array()), kVar.f12764w);
            dVar.f368b &= com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            return null;
        } catch (i e2) {
            return e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007a  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Exception] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        i iVar;
        i iVar2;
        synchronized (this.f12752b) {
            while (!this.f12762z) {
                try {
                    if (!this.f12753c.isEmpty() && this.f12758v > 0) {
                        break;
                    }
                    this.f12752b.wait();
                } finally {
                }
            }
            if (this.f12762z) {
                return false;
            }
            q4.g gVar = (q4.g) this.f12753c.removeFirst();
            q4.h[] hVarArr = this.f12756f;
            int i7 = this.f12758v - 1;
            this.f12758v = i7;
            q4.h hVar = hVarArr[i7];
            boolean z8 = this.f12761y;
            this.f12761y = false;
            if (gVar.i(4)) {
                hVar.a(4);
            } else {
                if (gVar.i(Integer.MIN_VALUE)) {
                    hVar.a(Integer.MIN_VALUE);
                }
                if (gVar.i(134217728)) {
                    hVar.a(134217728);
                }
                try {
                    iVar2 = c(gVar, hVar, z8);
                } catch (OutOfMemoryError e2) {
                    iVar = new Exception("Unexpected decode error", e2);
                    iVar2 = iVar;
                    if (iVar2 != null) {
                    }
                    synchronized (this.f12752b) {
                    }
                } catch (RuntimeException e10) {
                    iVar = new Exception("Unexpected decode error", e10);
                    iVar2 = iVar;
                    if (iVar2 != null) {
                    }
                    synchronized (this.f12752b) {
                    }
                }
                if (iVar2 != null) {
                    synchronized (this.f12752b) {
                        this.f12760x = iVar2;
                    }
                    return false;
                }
            }
            synchronized (this.f12752b) {
                try {
                    if (this.f12761y) {
                        hVar.G();
                    } else if (hVar.i(Integer.MIN_VALUE)) {
                        hVar.G();
                    } else {
                        this.f12754d.addLast(hVar);
                    }
                    gVar.G();
                    int i10 = this.f12757u;
                    this.f12757u = i10 + 1;
                    this.f12755e[i10] = gVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // a5.h
    public final void e(long j) {
    }

    @Override // q4.c
    public final Object f() {
        synchronized (this.f12752b) {
            try {
                i iVar = this.f12760x;
                if (iVar != null) {
                    throw iVar;
                }
                if (this.f12754d.isEmpty()) {
                    return null;
                }
                return (q4.h) this.f12754d.removeFirst();
            } finally {
            }
        }
    }

    @Override // q4.c
    public final void flush() {
        synchronized (this.f12752b) {
            try {
                this.f12761y = true;
                q4.g gVar = this.f12759w;
                if (gVar != null) {
                    gVar.G();
                    int i7 = this.f12757u;
                    this.f12757u = i7 + 1;
                    this.f12755e[i7] = gVar;
                    this.f12759w = null;
                }
                while (!this.f12753c.isEmpty()) {
                    q4.g gVar2 = (q4.g) this.f12753c.removeFirst();
                    gVar2.G();
                    int i10 = this.f12757u;
                    this.f12757u = i10 + 1;
                    this.f12755e[i10] = gVar2;
                }
                while (!this.f12754d.isEmpty()) {
                    ((q4.h) this.f12754d.removeFirst()).G();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q4.c
    public final Object h() {
        q4.g gVar;
        synchronized (this.f12752b) {
            try {
                i iVar = this.f12760x;
                if (iVar != null) {
                    throw iVar;
                }
                AbstractC1705a.m(this.f12759w == null);
                int i7 = this.f12757u;
                if (i7 == 0) {
                    gVar = null;
                } else {
                    q4.g[] gVarArr = this.f12755e;
                    int i10 = i7 - 1;
                    this.f12757u = i10;
                    gVar = gVarArr[i10];
                }
                this.f12759w = gVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // q4.c
    public final void release() {
        synchronized (this.f12752b) {
            this.f12762z = true;
            this.f12752b.notify();
        }
        try {
            this.f12751a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
