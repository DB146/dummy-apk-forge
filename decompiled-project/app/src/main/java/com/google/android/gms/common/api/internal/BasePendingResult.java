package com.google.android.gms.common.api.internal;

import B0.C0178g0;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.InterfaceC0998n;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.r> extends com.google.android.gms.common.api.q {
    static final ThreadLocal zaa = new C0178g0(6);
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private Z resultGuardian;
    protected final HandlerC0965f zab;
    protected final WeakReference zac;
    private com.google.android.gms.common.api.s zah;
    private com.google.android.gms.common.api.r zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC0998n zao;
    private volatile Q zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.base.zau, com.google.android.gms.common.api.internal.f] */
    public BasePendingResult(com.google.android.gms.common.api.o oVar) {
        this.zab = new zau(oVar != null ? ((H) oVar).f14936b.getLooper() : Looper.getMainLooper());
        this.zac = new WeakReference(oVar);
    }

    public static void zal(com.google.android.gms.common.api.r rVar) {
    }

    public final com.google.android.gms.common.api.r a() {
        com.google.android.gms.common.api.r rVar;
        synchronized (this.zae) {
            com.google.android.gms.common.internal.G.i("Result has already been consumed.", !this.zal);
            com.google.android.gms.common.internal.G.i("Result is not ready.", isReady());
            rVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.common.internal.G.g(rVar);
        return rVar;
    }

    public final void addStatusListener(com.google.android.gms.common.api.p pVar) {
        com.google.android.gms.common.internal.G.a("Callback cannot be null.", pVar != null);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    pVar.a(this.zak);
                } else {
                    this.zag.add(pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final R await() {
        com.google.android.gms.common.internal.G.f("await must not be called on the UI thread");
        com.google.android.gms.common.internal.G.i("Result has already been consumed", !this.zal);
        com.google.android.gms.common.internal.G.i("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f14893f);
        }
        com.google.android.gms.common.internal.G.i("Result is not ready.", isReady());
        return (R) a();
    }

    @ResultIgnorabilityUnspecified
    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            com.google.android.gms.common.internal.G.f("await must not be called on the UI thread when time is greater than zero.");
        }
        com.google.android.gms.common.internal.G.i("Result has already been consumed.", !this.zal);
        com.google.android.gms.common.internal.G.i("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.f14895v);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f14893f);
        }
        com.google.android.gms.common.internal.G.i("Result is not ready.", isReady());
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.r rVar) {
        this.zaj = rVar;
        this.zak = rVar.getStatus();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.s sVar = this.zah;
            if (sVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(sVar, a());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((com.google.android.gms.common.api.p) arrayList.get(i7)).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            try {
                if (!this.zam && !this.zal) {
                    zal(this.zaj);
                    this.zam = true;
                    b(createFailedResult(Status.f14896w));
                }
            } finally {
            }
        }
    }

    public abstract com.google.android.gms.common.api.r createFailedResult(Status status);

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z8;
        synchronized (this.zae) {
            z8 = this.zam;
        }
        return z8;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(InterfaceC0998n interfaceC0998n) {
        synchronized (this.zae) {
        }
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r10);
                    return;
                }
                isReady();
                com.google.android.gms.common.internal.G.i("Results have already been set", !isReady());
                com.google.android.gms.common.internal.G.i("Result has already been consumed", !this.zal);
                b(r10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.s sVar) {
        synchronized (this.zae) {
            try {
                if (sVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z8 = true;
                com.google.android.gms.common.internal.G.i("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z8 = false;
                }
                com.google.android.gms.common.internal.G.i("Cannot set callbacks if then() has been called.", z8);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(sVar, a());
                } else {
                    this.zah = sVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.s sVar, long j, TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (sVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z8 = true;
                com.google.android.gms.common.internal.G.i("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z8 = false;
                }
                com.google.android.gms.common.internal.G.i("Cannot set callbacks if then() has been called.", z8);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(sVar, a());
                } else {
                    this.zah = sVar;
                    HandlerC0965f handlerC0965f = this.zab;
                    handlerC0965f.sendMessageDelayed(handlerC0965f.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <S extends com.google.android.gms.common.api.r> com.google.android.gms.common.api.u then(com.google.android.gms.common.api.t tVar) {
        Q q10;
        com.google.android.gms.common.internal.G.i("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                com.google.android.gms.common.internal.G.i("Cannot call then() twice.", this.zap == null);
                com.google.android.gms.common.internal.G.i("Cannot call then() if callbacks are set.", this.zah == null);
                com.google.android.gms.common.internal.G.i("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new Q(this.zac);
                Q q11 = this.zap;
                synchronized (q11.f14956b) {
                    q10 = new Q(q11.f14957c);
                    q11.f14955a = q10;
                }
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q10;
    }

    public final void zak() {
        boolean z8 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z8 = false;
        }
        this.zaq = z8;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.o) this.zac.get()) != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCanceled;
    }

    public final void zan(S s3) {
        this.zai.set(s3);
    }
}
