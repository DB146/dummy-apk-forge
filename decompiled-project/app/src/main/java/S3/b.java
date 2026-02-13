package S3;

/* loaded from: classes.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9010a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9011b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f9012c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f9013d;

    /* renamed from: e, reason: collision with root package name */
    public int f9014e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f9015f = 3;

    public b(Object obj, d dVar) {
        this.f9010a = obj;
        this.f9011b = dVar;
    }

    @Override // S3.d, S3.c
    public final boolean a() {
        boolean z8;
        synchronized (this.f9010a) {
            try {
                z8 = this.f9012c.a() || this.f9013d.a();
            } finally {
            }
        }
        return z8;
    }

    @Override // S3.c
    public final boolean b() {
        boolean z8;
        synchronized (this.f9010a) {
            try {
                z8 = this.f9014e == 3 && this.f9015f == 3;
            } finally {
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final d c() {
        d c10;
        synchronized (this.f9010a) {
            try {
                ?? r12 = this.f9011b;
                c10 = r12 != 0 ? r12.c() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10;
    }

    @Override // S3.c
    public final void clear() {
        synchronized (this.f9010a) {
            try {
                this.f9014e = 3;
                this.f9012c.clear();
                if (this.f9015f != 3) {
                    this.f9015f = 3;
                    this.f9013d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S3.c
    public final boolean d(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f9012c.d(bVar.f9012c) && this.f9013d.d(bVar.f9013d);
    }

    @Override // S3.c
    public final void e() {
        synchronized (this.f9010a) {
            try {
                if (this.f9014e != 1) {
                    this.f9014e = 1;
                    this.f9012c.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final boolean f(c cVar) {
        boolean z8;
        synchronized (this.f9010a) {
            ?? r12 = this.f9011b;
            z8 = (r12 == 0 || r12.f(this)) && cVar.equals(this.f9012c);
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final boolean g(c cVar) {
        boolean z8;
        int i7;
        synchronized (this.f9010a) {
            ?? r12 = this.f9011b;
            z8 = false;
            if (r12 == 0 || r12.g(this)) {
                if (this.f9014e != 5 ? cVar.equals(this.f9012c) : cVar.equals(this.f9013d) && ((i7 = this.f9015f) == 4 || i7 == 5)) {
                    z8 = true;
                }
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final boolean h(c cVar) {
        boolean z8;
        synchronized (this.f9010a) {
            ?? r02 = this.f9011b;
            z8 = r02 == 0 || r02.h(this);
        }
        return z8;
    }

    @Override // S3.c
    public final boolean i() {
        boolean z8;
        synchronized (this.f9010a) {
            try {
                z8 = this.f9014e == 4 || this.f9015f == 4;
            } finally {
            }
        }
        return z8;
    }

    @Override // S3.c
    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f9010a) {
            try {
                z8 = true;
                if (this.f9014e != 1 && this.f9015f != 1) {
                    z8 = false;
                }
            } finally {
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final void j(c cVar) {
        synchronized (this.f9010a) {
            try {
                if (cVar.equals(this.f9013d)) {
                    this.f9015f = 5;
                    ?? r32 = this.f9011b;
                    if (r32 != 0) {
                        r32.j(this);
                    }
                    return;
                }
                this.f9014e = 5;
                if (this.f9015f != 1) {
                    this.f9015f = 1;
                    this.f9013d.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final void k(c cVar) {
        synchronized (this.f9010a) {
            try {
                if (cVar.equals(this.f9012c)) {
                    this.f9014e = 4;
                } else if (cVar.equals(this.f9013d)) {
                    this.f9015f = 4;
                }
                ?? r42 = this.f9011b;
                if (r42 != 0) {
                    r42.k(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S3.c
    public final void pause() {
        synchronized (this.f9010a) {
            try {
                if (this.f9014e == 1) {
                    this.f9014e = 2;
                    this.f9012c.pause();
                }
                if (this.f9015f == 1) {
                    this.f9015f = 2;
                    this.f9013d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
