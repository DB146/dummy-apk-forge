package B0;

import A0.AbstractC0017g;
import A0.C0011d;
import A0.C0018g0;
import I2.C0321j;
import I2.C0323l;
import I2.C0327p;
import I2.C0332v;
import I2.InterfaceC0319h;
import K2.InterfaceC0380b;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import c.C0853A;
import h0.C1218e;
import h0.C1221h;
import h0.C1229p;
import h0.EnumC1228o;
import hc.C1277e;
import java.util.concurrent.locks.ReentrantLock;
import u.C2047J;
import x0.AbstractC2256a;

/* renamed from: B0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0200s extends kotlin.jvm.internal.j implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1971a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0200s(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, i10, cls, obj, str, str2);
        this.f1971a = i11;
    }

    @Override // Rb.a
    public final Object invoke() {
        ContentCaptureSession a9;
        C0018g0 c0018g0;
        int i7;
        Db.q qVar = Db.q.f3365a;
        switch (this.f1971a) {
            case 0:
                D0.c cVar = null;
                View view = (View) this.receiver;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    D0.e.i(view);
                }
                if (i10 >= 29 && (a9 = D0.b.a(view)) != null) {
                    cVar = new D0.c(a9, view);
                }
                return cVar;
            case 1:
                D d10 = (D) this.receiver;
                if (d10.isFocused() || d10.hasFocus()) {
                    d10.clearFocus();
                } else if (d10.hasFocus()) {
                    View findFocus = d10.findFocus();
                    if (findFocus != null) {
                        findFocus.clearFocus();
                    }
                    d10.clearFocus();
                }
                return qVar;
            case 2:
                return ((D) this.receiver).x();
            case 3:
                I2.E e2 = (I2.E) this.receiver;
                C1277e c1277e = e2.f5026a;
                if (c1277e == null) {
                    kotlin.jvm.internal.l.j("coroutineScope");
                    throw null;
                }
                cc.F.i(c1277e, null);
                C0327p c0327p = e2.i().f5175i;
                if (c0327p != null && c0327p.f5188e.compareAndSet(false, true)) {
                    C0323l c0323l = c0327p.f5185b;
                    q3.c observer = c0327p.f5191i;
                    kotlin.jvm.internal.l.e(observer, "observer");
                    ReentrantLock reentrantLock = c0323l.f5172e;
                    reentrantLock.lock();
                    try {
                        C0332v c0332v = (C0332v) c0323l.f5171d.remove(observer);
                        if (c0332v != null) {
                            I2.c0 c0Var = c0323l.f5170c;
                            c0Var.getClass();
                            int[] tableIds = c0332v.f5207b;
                            kotlin.jvm.internal.l.e(tableIds, "tableIds");
                            if (c0Var.f5157h.o(tableIds)) {
                                Y6.b.v(new C0321j(c0323l, null));
                            }
                        }
                        try {
                            InterfaceC0319h interfaceC0319h = c0327p.g;
                            if (interfaceC0319h != null) {
                                interfaceC0319h.r(c0327p.j, c0327p.f5189f);
                            }
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
                        }
                        c0327p.f5186c.unbindService(c0327p.k);
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                I2.A a10 = e2.f5030e;
                if (a10 != null) {
                    ((InterfaceC0380b) a10.g).close();
                    return qVar;
                }
                kotlin.jvm.internal.l.j("connectionManager");
                throw null;
            case 4:
                ((C0853A) this.receiver).e();
                return qVar;
            case 5:
                ((C0853A) this.receiver).e();
                return qVar;
            case 6:
                C1218e c1218e = (C1218e) this.receiver;
                C1229p c1229p = (C1229p) c1218e.f17599c.get();
                C2047J c2047j = c1218e.f17600d;
                C2047J c2047j2 = c1218e.f17601e;
                if (c1229p == null) {
                    Object[] objArr = c2047j2.f24610b;
                    long[] jArr = c2047j2.f24609a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j = jArr[i11];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j & 255) < 128) {
                                        C0011d c0011d = (C0011d) objArr[(i11 << 3) + i13];
                                        EnumC1228o enumC1228o = EnumC1228o.f17627a;
                                        c0011d.q0();
                                        throw null;
                                    }
                                    j >>= 8;
                                }
                                if (i12 != 8) {
                                }
                            }
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    }
                } else if (c1229p.f14112B) {
                    if (c2047j.c(c1229p)) {
                        c1229p.s0();
                    }
                    c1229p.r0();
                    if (!c1229p.f14113a.f14112B) {
                        AbstractC2256a.b("visitAncestors called on an unattached node");
                    }
                    c0.l lVar = c1229p.f14113a;
                    A0.L t5 = AbstractC0017g.t(c1229p);
                    int i14 = 0;
                    while (t5 != null) {
                        if ((((c0.l) t5.f60S.f229f).f14116d & 5120) != 0) {
                            while (lVar != null) {
                                int i15 = lVar.f14115c;
                                if ((i15 & 5120) != 0) {
                                    if ((i15 & 1024) != 0) {
                                        i7 = 1;
                                        i14++;
                                    } else {
                                        i7 = 1;
                                    }
                                    if ((lVar instanceof C0011d) && c2047j2.c(lVar)) {
                                        if (i14 <= i7) {
                                            ((C0011d) lVar).q0();
                                            throw null;
                                        }
                                        EnumC1228o enumC1228o2 = EnumC1228o.f17627a;
                                        ((C0011d) lVar).q0();
                                        throw null;
                                    }
                                }
                                lVar = lVar.f14117e;
                            }
                        }
                        t5 = t5.t();
                        lVar = (t5 == null || (c0018g0 = t5.f60S) == null) ? null : (A0.B0) c0018g0.f228e;
                    }
                    Object[] objArr2 = c2047j2.f24610b;
                    long[] jArr2 = c2047j2.f24609a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j10 = jArr2[i16];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if ((j10 & 255) < 128) {
                                        C0011d c0011d2 = (C0011d) objArr2[(i16 << 3) + i18];
                                        EnumC1228o enumC1228o3 = EnumC1228o.f17627a;
                                        c0011d2.q0();
                                        throw null;
                                    }
                                    j10 >>= 8;
                                }
                                if (i17 != 8) {
                                }
                            }
                            if (i16 != length2) {
                                i16++;
                            }
                        }
                    }
                }
                c1218e.f17598b.invoke();
                c2047j.b();
                c2047j2.b();
                c1218e.f17602f = false;
                return qVar;
            case 7:
                C1221h c1221h = (C1221h) this.receiver;
                if (c1221h.j == null || c1221h.f17607d.r0() == EnumC1228o.f17630d) {
                    c1221h.f17605b.invoke();
                }
                return qVar;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((w7.c) this.receiver).getClass();
                String threadName = Thread.currentThread().getName();
                kotlin.jvm.internal.l.d(threadName, "threadName");
                return Boolean.valueOf(ac.g.b0(threadName, "Firebase Background Thread #"));
            case 9:
                ((w7.c) this.receiver).getClass();
                String threadName2 = Thread.currentThread().getName();
                kotlin.jvm.internal.l.d(threadName2, "threadName");
                return Boolean.valueOf(ac.g.b0(threadName2, "Firebase Blocking Thread #"));
            default:
                ((w7.c) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }
}
