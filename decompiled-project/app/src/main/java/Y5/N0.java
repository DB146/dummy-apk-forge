package Y5;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0 f11479c;

    public N0(S0 s02, AtomicReference atomicReference, int i7) {
        this.f11477a = i7;
        switch (i7) {
            case 1:
                this.f11478b = atomicReference;
                Objects.requireNonNull(s02);
                this.f11479c = s02;
                return;
            case 2:
                this.f11478b = atomicReference;
                Objects.requireNonNull(s02);
                this.f11479c = s02;
                return;
            case 3:
                this.f11478b = atomicReference;
                Objects.requireNonNull(s02);
                this.f11479c = s02;
                return;
            case 4:
                this.f11478b = atomicReference;
                Objects.requireNonNull(s02);
                this.f11479c = s02;
                return;
            default:
                this.f11478b = atomicReference;
                Objects.requireNonNull(s02);
                this.f11479c = s02;
                return;
        }
    }

    public /* synthetic */ N0(S0 s02, AtomicReference atomicReference, int i7, boolean z8) {
        this.f11477a = i7;
        this.f11479c = s02;
        this.f11478b = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f11478b;
        synchronized (atomicReference) {
            try {
                try {
                    C0646q0 c0646q0 = (C0646q0) this.f11479c.f3094a;
                    atomicReference.set(Double.valueOf(c0646q0.f11910d.S(c0646q0.q().P(), F.f11317e0)));
                } finally {
                    this.f11478b.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11477a) {
            case 0:
                AtomicReference atomicReference = this.f11478b;
                synchronized (atomicReference) {
                    try {
                        try {
                            C0646q0 c0646q0 = (C0646q0) this.f11479c.f3094a;
                            atomicReference.set(Boolean.valueOf(c0646q0.f11910d.T(c0646q0.q().P(), F.f11305a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f11478b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C0646q0 c0646q02 = (C0646q0) this.f11479c.f3094a;
                            atomicReference2.set(c0646q02.f11910d.P(c0646q02.q().P(), F.f11308b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f11478b;
                synchronized (atomicReference3) {
                    try {
                        try {
                            C0646q0 c0646q03 = (C0646q0) this.f11479c.f3094a;
                            atomicReference3.set(Long.valueOf(c0646q03.f11910d.Q(c0646q03.q().P(), F.f11311c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.f11478b;
                synchronized (atomicReference4) {
                    try {
                        try {
                            C0646q0 c0646q04 = (C0646q0) this.f11479c.f3094a;
                            atomicReference4.set(Integer.valueOf(c0646q04.f11910d.R(c0646q04.q().P(), F.f11314d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 4:
                a();
                return;
            case 5:
                S0 s02 = this.f11479c;
                C0613f0 c0613f0 = ((C0646q0) s02.f3094a).f11911e;
                C0646q0.j(c0613f0);
                Bundle n6 = c0613f0.f11730B.n();
                C0632l1 o10 = ((C0646q0) s02.f3094a).o();
                o10.J();
                o10.K();
                o10.X(new L7.i(o10, this.f11478b, o10.Z(false), n6, 7, false));
                return;
            default:
                C0632l1 o11 = ((C0646q0) this.f11479c.f3094a).o();
                B1 t5 = B1.t(Y0.SGTM_CLIENT);
                o11.J();
                o11.K();
                o11.X(new L7.i(o11, this.f11478b, o11.Z(false), t5, 8, false));
                return;
        }
    }
}
