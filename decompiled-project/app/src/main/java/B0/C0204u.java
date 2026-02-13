package B0;

import I2.C0323l;
import I2.C0327p;
import I2.C0332v;
import I2.InterfaceC0319h;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;
import android.view.FocusFinder;
import android.view.View;
import h0.AbstractC1217d;
import h0.C1216c;
import j0.AbstractC1362A;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import u.C2038A;
import u.C2042E;
import y.C2297e;

/* renamed from: B0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0204u extends kotlin.jvm.internal.j implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1982a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0204u(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, i10, cls, obj, str, str2);
        this.f1982a = i11;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f1982a) {
            case 0:
                Rb.a aVar = (Rb.a) obj;
                C2042E c2042e = ((D) this.receiver).f1591H0;
                if (c2042e.f(aVar) < 0) {
                    c2042e.a(aVar);
                }
                return Db.q.f3365a;
            case 1:
                int i7 = ((C1216c) obj).f17595a;
                D d10 = (D) this.receiver;
                d10.getClass();
                boolean z8 = false;
                if (!C1216c.a(i7, 7) && !C1216c.a(i7, 8)) {
                    Integer D10 = AbstractC1217d.D(i7);
                    if (D10 == null) {
                        throw new IllegalStateException("Invalid focus direction");
                    }
                    int intValue = D10.intValue();
                    i0.c x2 = d10.x();
                    Rect y10 = x2 != null ? AbstractC1362A.y(x2) : null;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View findNextFocus = y10 == null ? focusFinder.findNextFocus(d10, d10.findFocus(), intValue) : focusFinder.findNextFocusFromRect(d10, y10, intValue);
                    if (findNextFocus != null) {
                        z8 = AbstractC1217d.z(findNextFocus, Integer.valueOf(intValue), y10);
                    }
                }
                return Boolean.valueOf(z8);
            case 2:
                Set p02 = (Set) obj;
                kotlin.jvm.internal.l.e(p02, "p0");
                C0323l c0323l = (C0323l) this.receiver;
                ReentrantLock reentrantLock = c0323l.f5172e;
                reentrantLock.lock();
                try {
                    List<C0332v> s02 = Eb.o.s0(c0323l.f5171d.values());
                    reentrantLock.unlock();
                    for (C0332v c0332v : s02) {
                        c0332v.getClass();
                        int[] iArr = c0332v.f5207b;
                        int length = iArr.length;
                        Collection tables = Eb.x.f3893a;
                        if (length != 0) {
                            if (length != 1) {
                                Fb.i iVar = new Fb.i();
                                int length2 = iArr.length;
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < length2) {
                                    int i12 = i11 + 1;
                                    if (p02.contains(Integer.valueOf(iArr[i10]))) {
                                        iVar.add(c0332v.f5208c[i11]);
                                    }
                                    i10++;
                                    i11 = i12;
                                }
                                tables = O5.b.i(iVar);
                            } else if (p02.contains(Integer.valueOf(iArr[0]))) {
                                tables = c0332v.f5209d;
                            }
                        }
                        if (!tables.isEmpty()) {
                            q3.c cVar = c0332v.f5206a;
                            cVar.getClass();
                            kotlin.jvm.internal.l.e(tables, "tables");
                            C0327p c0327p = (C0327p) cVar.f23372c;
                            if (!c0327p.f5188e.get()) {
                                try {
                                    InterfaceC0319h interfaceC0319h = c0327p.g;
                                    if (interfaceC0319h != null) {
                                        interfaceC0319h.B(c0327p.f5189f, (String[]) tables.toArray(new String[0]));
                                    }
                                } catch (RemoteException e2) {
                                    Log.w("ROOM", "Cannot broadcast invalidation", e2);
                                }
                            }
                        }
                    }
                    return Db.q.f3365a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                y.r rVar = (y.r) this.receiver;
                if (booleanValue) {
                    rVar.t0();
                } else {
                    A.i iVar2 = rVar.f26511E;
                    C2038A c2038a = rVar.f26519N;
                    if (iVar2 != null) {
                        Object[] objArr = c2038a.f24563c;
                        long[] jArr = c2038a.f24561a;
                        int length3 = jArr.length - 2;
                        if (length3 >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j = jArr[i13];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8;
                                    int i15 = 8 - ((~(i13 - length3)) >>> 31);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        if ((255 & j) < 128) {
                                            cc.F.B(rVar.d0(), null, 0, new C2297e(rVar, (A.k) objArr[(i13 << 3) + i16], null), 3);
                                            i14 = 8;
                                        }
                                        j >>= i14;
                                    }
                                    if (i15 != i14) {
                                    }
                                }
                                if (i13 != length3) {
                                    i13++;
                                }
                            }
                        }
                    }
                    c2038a.a();
                }
                return Db.q.f3365a;
        }
    }
}
