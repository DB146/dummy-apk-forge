package S3;

/* loaded from: classes.dex */
public final class h implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9043a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9044b;

    /* renamed from: c, reason: collision with root package name */
    public volatile g f9045c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f9046d;

    /* renamed from: e, reason: collision with root package name */
    public int f9047e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f9048f = 3;
    public boolean g;

    public h(Object obj, d dVar) {
        this.f9044b = obj;
        this.f9043a = dVar;
    }

    @Override // S3.d, S3.c
    public final boolean a() {
        boolean z8;
        synchronized (this.f9044b) {
            try {
                z8 = this.f9046d.a() || this.f9045c.a();
            } finally {
            }
        }
        return z8;
    }

    @Override // S3.c
    public final boolean b() {
        boolean z8;
        synchronized (this.f9044b) {
            z8 = this.f9047e == 3;
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final d c() {
        d c10;
        synchronized (this.f9044b) {
            try {
                ?? r12 = this.f9043a;
                c10 = r12 != 0 ? r12.c() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10;
    }

    @Override // S3.c
    public final void clear() {
        synchronized (this.f9044b) {
            this.g = false;
            this.f9047e = 3;
            this.f9048f = 3;
            this.f9046d.clear();
            this.f9045c.clear();
        }
    }

    @Override // S3.c
    public final boolean d(c cVar) {
        if (!(cVar instanceof h)) {
            return false;
        }
        h hVar = (h) cVar;
        if (this.f9045c == null) {
            if (hVar.f9045c != null) {
                return false;
            }
        } else if (!this.f9045c.d(hVar.f9045c)) {
            return false;
        }
        if (this.f9046d == null) {
            if (hVar.f9046d != null) {
                return false;
            }
        } else if (!this.f9046d.d(hVar.f9046d)) {
            return false;
        }
        return true;
    }

    @Override // S3.c
    public final void e() {
        synchronized (this.f9044b) {
            try {
                this.g = true;
                try {
                    if (this.f9047e != 4 && this.f9048f != 1) {
                        this.f9048f = 1;
                        this.f9046d.e();
                    }
                    if (this.g && this.f9047e != 1) {
                        this.f9047e = 1;
                        this.f9045c.e();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final boolean f(c cVar) {
        boolean z8;
        synchronized (this.f9044b) {
            try {
                ?? r12 = this.f9043a;
                z8 = (r12 == 0 || r12.f(this)) && cVar.equals(this.f9045c) && this.f9047e != 2;
            } finally {
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final boolean g(c cVar) {
        boolean z8;
        synchronized (this.f9044b) {
            try {
                ?? r12 = this.f9043a;
                z8 = (r12 == 0 || r12.g(this)) && cVar.equals(this.f9045c) && !a();
            } finally {
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final boolean h(c cVar) {
        boolean z8;
        synchronized (this.f9044b) {
            try {
                ?? r12 = this.f9043a;
                z8 = (r12 == 0 || r12.h(this)) && (cVar.equals(this.f9045c) || this.f9047e != 4);
            } finally {
            }
        }
        return z8;
    }

    @Override // S3.c
    public final boolean i() {
        boolean z8;
        synchronized (this.f9044b) {
            z8 = this.f9047e == 4;
        }
        return z8;
    }

    @Override // S3.c
    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f9044b) {
            z8 = true;
            if (this.f9047e != 1) {
                z8 = false;
            }
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final void j(c cVar) {
        synchronized (this.f9044b) {
            try {
                if (!cVar.equals(this.f9045c)) {
                    this.f9048f = 5;
                    return;
                }
                this.f9047e = 5;
                ?? r32 = this.f9043a;
                if (r32 != 0) {
                    r32.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [S3.d, java.lang.Object] */
    @Override // S3.d
    public final void k(c cVar) {
        synchronized (this.f9044b) {
            try {
                if (cVar.equals(this.f9046d)) {
                    this.f9048f = 4;
                    return;
                }
                this.f9047e = 4;
                ?? r32 = this.f9043a;
                if (r32 != 0) {
                    r32.k(this);
                }
                if (!A3.c.b(this.f9048f)) {
                    this.f9046d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S3.c
    public final void pause() {
        synchronized (this.f9044b) {
            try {
                if (!A3.c.b(this.f9048f)) {
                    this.f9048f = 2;
                    this.f9046d.pause();
                }
                if (!A3.c.b(this.f9047e)) {
                    this.f9047e = 2;
                    this.f9045c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
