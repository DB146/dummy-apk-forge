package A8;

import A9.C0085f2;
import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import ea.C1108c;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import n5.C1707c;
import r4.C1931c;
import r4.C1934f;
import r4.C1941m;
import t2.C2017a;

/* loaded from: classes.dex */
public final class c0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f639a;

    /* renamed from: b, reason: collision with root package name */
    public Object f640b;

    public /* synthetic */ c0() {
        this.f639a = 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Hb.i backgroundDispatcher) {
        super(Looper.getMainLooper());
        this.f639a = 0;
        kotlin.jvm.internal.l.e(backgroundDispatcher, "backgroundDispatcher");
        this.f640b = backgroundDispatcher;
    }

    public c0(c2.t tVar) {
        this.f639a = 3;
        this.f640b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Looper looper, int i7) {
        super(looper);
        this.f639a = i7;
        this.f640b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fa A[ORIG_RETURN, RETURN] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message msg) {
        String str;
        E4.c cVar;
        Set set;
        int size;
        Q5.e[] eVarArr;
        E4.c cVar2 = null;
        switch (this.f639a) {
            case 0:
                kotlin.jvm.internal.l.e(msg, "msg");
                if (msg.what != 3) {
                    Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
                    super.handleMessage(msg);
                    return;
                }
                Bundle data = msg.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = "";
                }
                Log.d("SessionLifecycleClient", "Session update received.");
                cc.F.B(cc.F.b((Hb.i) this.f640b), null, 0, new b0(str, null), 3);
                return;
            case 1:
                if (msg.what == 1) {
                    C0085f2 c0085f2 = (C0085f2) this.f640b;
                    if (c0085f2.f1165K0) {
                        c0085f2.A0(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                E4.d dVar = (E4.d) this.f640b;
                dVar.getClass();
                int i7 = msg.what;
                if (i7 == 0) {
                    cVar = (E4.c) msg.obj;
                    try {
                        dVar.f3553a.queueInputBuffer(cVar.f3547a, 0, cVar.f3548b, cVar.f3550d, cVar.f3551e);
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference = dVar.f3556d;
                        while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            AtomicReference atomicReference2 = dVar.f3556d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                            while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                            }
                        } else {
                            dVar.f3557e.b();
                        }
                        if (cVar2 == null) {
                            ArrayDeque arrayDeque = E4.d.g;
                            synchronized (arrayDeque) {
                                arrayDeque.add(cVar2);
                            }
                            return;
                        }
                        return;
                    }
                    cVar = (E4.c) msg.obj;
                    int i10 = cVar.f3547a;
                    MediaCodec.CryptoInfo cryptoInfo = cVar.f3549c;
                    long j = cVar.f3550d;
                    int i11 = cVar.f3551e;
                    try {
                        synchronized (E4.d.f3552h) {
                            dVar.f3553a.queueSecureInputBuffer(i10, 0, cryptoInfo, j, i11);
                        }
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference3 = dVar.f3556d;
                        while (!atomicReference3.compareAndSet(null, e10) && atomicReference3.get() == null) {
                        }
                    }
                }
                cVar2 = cVar;
                if (cVar2 == null) {
                }
            case 3:
                if (msg.what == 1) {
                    c2.t tVar = (c2.t) this.f640b;
                    if (tVar.f14230x0) {
                        tVar.r0(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                int i12 = msg.what;
                if (i12 == -3 || i12 == -2 || i12 == -1) {
                    ((DialogInterface.OnClickListener) msg.obj).onClick((DialogInterface) ((WeakReference) this.f640b).get(), msg.what);
                    return;
                } else {
                    if (i12 != 1) {
                        return;
                    }
                    ((DialogInterface) msg.obj).dismiss();
                    return;
                }
            case 5:
                Pair pair = (Pair) msg.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i13 = msg.what;
                if (i13 != 0) {
                    if (i13 != 1) {
                        return;
                    }
                    C1931c c1931c = (C1931c) this.f640b;
                    if (obj == c1931c.f23730w && c1931c.h()) {
                        c1931c.f23730w = null;
                        if (obj2 instanceof Exception) {
                            c1931c.j((Exception) obj2, false);
                            return;
                        }
                        try {
                            byte[] j10 = c1931c.f23712b.j(c1931c.f23728u, (byte[]) obj2);
                            if (c1931c.f23729v != null && j10 != null && j10.length != 0) {
                                c1931c.f23729v = j10;
                            }
                            c1931c.f23722o = 4;
                            C1707c c1707c = c1931c.f23717h;
                            synchronized (c1707c.f21164a) {
                                set = c1707c.f21166c;
                            }
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                ((C1941m) it.next()).a();
                            }
                            return;
                        } catch (Exception e11) {
                            c1931c.j(e11, true);
                            return;
                        }
                    }
                    return;
                }
                C1931c c1931c2 = (C1931c) this.f640b;
                if (obj == c1931c2.f23731x) {
                    if (c1931c2.f23722o == 2 || c1931c2.h()) {
                        c1931c2.f23731x = null;
                        boolean z8 = obj2 instanceof Exception;
                        C1108c c1108c = c1931c2.f23713c;
                        if (z8) {
                            c1108c.j((Exception) obj2, false);
                            return;
                        }
                        try {
                            c1931c2.f23712b.l((byte[]) obj2);
                            c1108c.f16830b = null;
                            HashSet hashSet = (HashSet) c1108c.f16831c;
                            N6.H F10 = N6.H.F(hashSet);
                            hashSet.clear();
                            N6.F listIterator = F10.listIterator(0);
                            while (listIterator.hasNext()) {
                                C1931c c1931c3 = (C1931c) listIterator.next();
                                if (c1931c3.k()) {
                                    c1931c3.g(true);
                                }
                            }
                            return;
                        } catch (Exception e12) {
                            c1108c.j(e12, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                byte[] bArr = (byte[]) msg.obj;
                if (bArr == null) {
                    return;
                }
                Iterator it2 = ((C1934f) this.f640b).f23744m.iterator();
                while (it2.hasNext()) {
                    C1931c c1931c4 = (C1931c) it2.next();
                    c1931c4.m();
                    if (Arrays.equals(c1931c4.f23728u, bArr)) {
                        if (msg.what == 2 && c1931c4.f23722o == 4) {
                            int i14 = n5.D.f21141a;
                            c1931c4.g(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                if (msg.what != 1) {
                    super.handleMessage(msg);
                    return;
                }
                C2017a c2017a = (C2017a) this.f640b;
                do {
                    synchronized (c2017a.f24438b) {
                        try {
                            size = c2017a.f24440d.size();
                            if (size <= 0) {
                                return;
                            }
                            eVarArr = new Q5.e[size];
                            c2017a.f24440d.toArray(eVarArr);
                            c2017a.f24440d.clear();
                        } finally {
                        }
                    }
                } while (size <= 0);
                Q5.e eVar = eVarArr[0];
                throw null;
        }
    }
}
