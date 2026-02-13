package sb;

import hb.InterfaceC1269b;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1394e;
import jb.InterfaceC1396g;
import kb.EnumC1437b;
import xb.C2273a;
import y7.u0;
import yb.C2476f;
import yb.C2477g;
import yb.InterfaceC2474d;
import yb.InterfaceC2475e;

/* loaded from: classes2.dex */
public final class k extends AtomicInteger implements InterfaceC1269b, gb.l {

    /* renamed from: C, reason: collision with root package name */
    public static final j[] f24280C = new j[0];

    /* renamed from: D, reason: collision with root package name */
    public static final j[] f24281D = new j[0];

    /* renamed from: A, reason: collision with root package name */
    public final ArrayDeque f24282A;

    /* renamed from: B, reason: collision with root package name */
    public int f24283B;

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24284a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1394e f24285b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24286c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24287d;

    /* renamed from: e, reason: collision with root package name */
    public volatile InterfaceC2474d f24288e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f24289f;

    /* renamed from: u, reason: collision with root package name */
    public final C2273a f24290u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f24291v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f24292w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1269b f24293x;

    /* renamed from: y, reason: collision with root package name */
    public long f24294y;

    /* renamed from: z, reason: collision with root package name */
    public int f24295z;

    /* JADX WARN: Type inference failed for: r0v0, types: [xb.a, java.util.concurrent.atomic.AtomicReference] */
    public k(gb.l lVar, InterfaceC1394e interfaceC1394e, int i7, int i10) {
        this.f24284a = lVar;
        this.f24285b = interfaceC1394e;
        this.f24286c = i7;
        this.f24287d = i10;
        if (i7 != Integer.MAX_VALUE) {
            this.f24282A = new ArrayDeque(i7);
        }
        this.f24292w = new AtomicReference(f24280C);
    }

    @Override // gb.l
    public final void a() {
        if (this.f24289f) {
            return;
        }
        this.f24289f = true;
        h();
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f24291v = true;
        if (f()) {
            this.f24290u.c();
        }
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        if (EnumC1437b.o(this.f24293x, interfaceC1269b)) {
            this.f24293x = interfaceC1269b;
            this.f24284a.c(this);
        }
    }

    public final boolean d() {
        if (this.f24291v) {
            return true;
        }
        if (((Throwable) this.f24290u.get()) == null) {
            return false;
        }
        f();
        this.f24290u.f(this.f24284a);
        return true;
    }

    @Override // gb.l
    public final void e(Object obj) {
        if (this.f24289f) {
            return;
        }
        try {
            Object apply = this.f24285b.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
            gb.k kVar = (gb.k) apply;
            if (this.f24286c != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i7 = this.f24283B;
                        if (i7 == this.f24286c) {
                            this.f24282A.offer(kVar);
                            return;
                        }
                        this.f24283B = i7 + 1;
                    } finally {
                    }
                }
            }
            k(kVar);
        } catch (Throwable th) {
            u0.L(th);
            this.f24293x.b();
            onError(th);
        }
    }

    public final boolean f() {
        this.f24293x.b();
        AtomicReference atomicReference = this.f24292w;
        j[] jVarArr = f24281D;
        j[] jVarArr2 = (j[]) atomicReference.getAndSet(jVarArr);
        if (jVarArr2 == jVarArr) {
            return false;
        }
        for (j jVar : jVarArr2) {
            jVar.getClass();
            EnumC1437b.a(jVar);
        }
        return true;
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f24291v;
    }

    public final void h() {
        if (getAndIncrement() == 0) {
            i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        if (r10 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        r10 = r9.f24277b;
        r11 = r9.f24278c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        if (r10 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (r11 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r11.isEmpty() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        j(r9);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r5 != r8) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        r11 = r10.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0083, code lost:
    
        if (r11 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0086, code lost:
    
        r0.e(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008d, code lost:
    
        if (d() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0090, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0091, code lost:
    
        y7.u0.L(r10);
        kb.EnumC1437b.a(r9);
        r12.f24290u.b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a0, code lost:
    
        if (d() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a3, code lost:
    
        j(r9);
        r4 = r4 + 1;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00aa, code lost:
    
        if (r5 != r8) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        int i7;
        gb.l lVar = this.f24284a;
        int i10 = 1;
        while (!d()) {
            InterfaceC2474d interfaceC2474d = this.f24288e;
            int i11 = 0;
            if (interfaceC2474d != null) {
                while (!d()) {
                    Object poll = interfaceC2474d.poll();
                    if (poll != null) {
                        lVar.e(poll);
                        i11++;
                    }
                }
                return;
            }
            if (i11 == 0) {
                boolean z8 = this.f24289f;
                InterfaceC2474d interfaceC2474d2 = this.f24288e;
                j[] jVarArr = (j[]) this.f24292w.get();
                int length = jVarArr.length;
                if (this.f24286c != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i7 = this.f24282A.size();
                    }
                } else {
                    i7 = 0;
                }
                if (z8 && ((interfaceC2474d2 == null || interfaceC2474d2.isEmpty()) && length == 0 && i7 == 0)) {
                    this.f24290u.f(this.f24284a);
                    return;
                }
                if (length != 0) {
                    int min = Math.min(length - 1, this.f24295z);
                    int i12 = 0;
                    while (i12 < length) {
                        if (d()) {
                            return;
                        }
                        j jVar = jVarArr[min];
                        InterfaceC2475e interfaceC2475e = jVar.f24278c;
                    }
                    this.f24295z = min;
                }
                if (i11 == 0) {
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else if (this.f24286c != Integer.MAX_VALUE) {
                    l(i11);
                }
            } else if (this.f24286c != Integer.MAX_VALUE) {
                l(i11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(j jVar) {
        j[] jVarArr;
        while (true) {
            AtomicReference atomicReference = this.f24292w;
            j[] jVarArr2 = (j[]) atomicReference.get();
            int length = jVarArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    i7 = -1;
                    break;
                } else if (jVarArr2[i7] == jVar) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 < 0) {
                return;
            }
            if (length == 1) {
                jVarArr = f24280C;
            } else {
                j[] jVarArr3 = new j[length - 1];
                System.arraycopy(jVarArr2, 0, jVarArr3, 0, i7);
                System.arraycopy(jVarArr2, i7 + 1, jVarArr3, i7, (length - i7) - 1);
                jVarArr = jVarArr3;
            }
            while (!atomicReference.compareAndSet(jVarArr2, jVarArr)) {
                if (atomicReference.get() != jVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (decrementAndGet() == 0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(gb.k kVar) {
        boolean z8;
        do {
            z8 = false;
            if (!(kVar instanceof InterfaceC1396g)) {
                this.f24294y++;
                j jVar = new j(this);
                while (true) {
                    AtomicReference atomicReference = this.f24292w;
                    j[] jVarArr = (j[]) atomicReference.get();
                    if (jVarArr == f24281D) {
                        EnumC1437b.a(jVar);
                        return;
                    }
                    int length = jVarArr.length;
                    j[] jVarArr2 = new j[length + 1];
                    System.arraycopy(jVarArr, 0, jVarArr2, 0, length);
                    jVarArr2[length] = jVar;
                    while (!atomicReference.compareAndSet(jVarArr, jVarArr2)) {
                        if (atomicReference.get() != jVarArr) {
                            break;
                        }
                    }
                    kVar.b(jVar);
                    return;
                }
            }
            try {
                Object obj = ((InterfaceC1396g) kVar).get();
                if (obj != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.f24284a.e(obj);
                    } else {
                        InterfaceC2474d interfaceC2474d = this.f24288e;
                        if (interfaceC2474d == null) {
                            interfaceC2474d = this.f24286c == Integer.MAX_VALUE ? new C2477g(this.f24287d) : new C2476f(this.f24286c);
                            this.f24288e = interfaceC2474d;
                        }
                        interfaceC2474d.offer(obj);
                        if (getAndIncrement() != 0) {
                            return;
                        }
                    }
                    i();
                }
            } catch (Throwable th) {
                u0.L(th);
                this.f24290u.b(th);
                h();
            }
            if (this.f24286c == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                try {
                    kVar = (gb.k) this.f24282A.poll();
                    if (kVar == null) {
                        this.f24283B--;
                        z8 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!z8);
        h();
    }

    public final void l(int i7) {
        while (true) {
            int i10 = i7 - 1;
            if (i7 == 0) {
                return;
            }
            synchronized (this) {
                try {
                    gb.k kVar = (gb.k) this.f24282A.poll();
                    if (kVar == null) {
                        this.f24283B--;
                    } else {
                        k(kVar);
                    }
                } finally {
                }
            }
            i7 = i10;
        }
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (this.f24289f) {
            com.bumptech.glide.d.t(th);
        } else if (this.f24290u.b(th)) {
            this.f24289f = true;
            h();
        }
    }
}
