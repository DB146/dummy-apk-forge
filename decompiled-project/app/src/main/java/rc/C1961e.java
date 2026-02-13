package rc;

import Y5.C0656w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: rc.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1961e extends J {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f23957h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f23958i;
    public static final long j;
    public static final long k;

    /* renamed from: l, reason: collision with root package name */
    public static C1961e f23959l;

    /* renamed from: e, reason: collision with root package name */
    public int f23960e;

    /* renamed from: f, reason: collision with root package name */
    public C1961e f23961f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f23957h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.l.d(newCondition, "newCondition(...)");
        f23958i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j10 = this.f23945c;
        boolean z8 = this.f23943a;
        if (j10 != 0 || z8) {
            ReentrantLock reentrantLock = f23957h;
            reentrantLock.lock();
            try {
                if (this.f23960e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f23960e = 1;
                C0656w.c(this, j10, z8);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f23957h;
        reentrantLock.lock();
        try {
            int i7 = this.f23960e;
            this.f23960e = 0;
            if (i7 != 1) {
                return i7 == 2;
            }
            C1961e c1961e = f23959l;
            while (c1961e != null) {
                C1961e c1961e2 = c1961e.f23961f;
                if (c1961e2 == this) {
                    c1961e.f23961f = this.f23961f;
                    this.f23961f = null;
                    return false;
                }
                c1961e = c1961e2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
