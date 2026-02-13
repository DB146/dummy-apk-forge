package m8;

import Y5.A;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k8.k;

/* renamed from: m8.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1643d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f20783d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f20784e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final k f20785a;

    /* renamed from: b, reason: collision with root package name */
    public long f20786b;

    /* renamed from: c, reason: collision with root package name */
    public int f20787c;

    public C1643d() {
        if (A.f11199w == null) {
            Pattern pattern = k.f19051c;
            A.f11199w = new A(15);
        }
        A a9 = A.f11199w;
        if (k.f19052d == null) {
            k.f19052d = new k(a9);
        }
        this.f20785a = k.f19052d;
    }

    public final synchronized boolean a() {
        boolean z8;
        if (this.f20787c != 0) {
            this.f20785a.f19053a.getClass();
            z8 = System.currentTimeMillis() > this.f20786b;
        }
        return z8;
    }

    public final synchronized void b(int i7) {
        long min;
        if ((i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404) {
            synchronized (this) {
                this.f20787c = 0;
            }
            return;
        }
        this.f20787c++;
        synchronized (this) {
            if (i7 == 429 || (i7 >= 500 && i7 < 600)) {
                double pow = Math.pow(2.0d, this.f20787c);
                this.f20785a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f20784e);
            } else {
                min = f20783d;
            }
            this.f20785a.f19053a.getClass();
            this.f20786b = System.currentTimeMillis() + min;
        }
        return;
    }
}
