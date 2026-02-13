package A8;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import bc.C0849a;
import bc.EnumC0851c;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f672a;

    /* renamed from: b, reason: collision with root package name */
    public long f673b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f674c;

    public h0(Looper looper) {
        super(looper);
        this.f674c = new ArrayList();
    }

    public final void a() {
        Log.d("SessionLifecycleService", "Broadcasting new session");
        T t5 = (T) ((C0045i) ((InterfaceC0054s) Y6.i.e().c(InterfaceC0054s.class))).k.get();
        P p10 = ((Y) ((C0045i) ((InterfaceC0054s) Y6.i.e().c(InterfaceC0054s.class))).f684m.get()).f611e;
        if (p10 == null) {
            kotlin.jvm.internal.l.j("currentSession");
            throw null;
        }
        W w10 = (W) t5;
        w10.getClass();
        cc.F.B(cc.F.b(w10.f600e), null, 0, new U(w10, p10, null), 3);
        Iterator it = new ArrayList(this.f674c).iterator();
        while (it.hasNext()) {
            Messenger it2 = (Messenger) it.next();
            kotlin.jvm.internal.l.d(it2, "it");
            b(it2);
        }
    }

    public final void b(Messenger messenger) {
        try {
            if (this.f672a) {
                P p10 = ((Y) ((C0045i) ((InterfaceC0054s) Y6.i.e().c(InterfaceC0054s.class))).f684m.get()).f611e;
                if (p10 != null) {
                    d(messenger, p10.f574a);
                    return;
                } else {
                    kotlin.jvm.internal.l.j("currentSession");
                    throw null;
                }
            }
            C0057v c0057v = (C0057v) ((N) ((C0045i) ((InterfaceC0054s) Y6.i.e().c(InterfaceC0054s.class))).j.get()).f569c.get();
            String str = c0057v != null ? c0057v.f720a : null;
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
            if (str != null) {
                d(messenger, str);
            }
        } catch (IllegalStateException e2) {
            Log.w("SessionLifecycleService", "Failed to send session to client.", e2);
        }
    }

    public final void c() {
        try {
            Y y10 = (Y) ((C0045i) ((InterfaceC0054s) Y6.i.e().c(InterfaceC0054s.class))).f684m.get();
            int i7 = y10.f610d + 1;
            y10.f610d = i7;
            String a9 = i7 == 0 ? y10.f609c : y10.a();
            int i10 = y10.f610d;
            y10.f607a.getClass();
            y10.f611e = new P(a9, y10.f609c, i10, 1000 * System.currentTimeMillis());
            Log.d("SessionLifecycleService", "Generated new session.");
            a();
            N n6 = (N) ((C0045i) ((InterfaceC0054s) Y6.i.e().c(InterfaceC0054s.class))).j.get();
            P p10 = ((Y) ((C0045i) ((InterfaceC0054s) Y6.i.e().c(InterfaceC0054s.class))).f684m.get()).f611e;
            if (p10 == null) {
                kotlin.jvm.internal.l.j("currentSession");
                throw null;
            }
            String sessionId = p10.f574a;
            n6.getClass();
            kotlin.jvm.internal.l.e(sessionId, "sessionId");
            cc.F.B(cc.F.b(n6.f567a), null, 0, new M(n6, sessionId, null), 3);
        } catch (IllegalStateException e2) {
            Log.w("SessionLifecycleService", "Failed to generate new session.", e2);
        }
    }

    public final void d(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f674c.remove(messenger);
        } catch (Exception e2) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x010d, code lost:
    
        if (bc.C0849a.f(r8) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0124, code lost:
    
        if (bc.C0849a.f(r8) == false) goto L33;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message msg) {
        long M3;
        kotlin.jvm.internal.l.e(msg, "msg");
        if (this.f673b > msg.getWhen()) {
            Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.f673b + '.');
            return;
        }
        int i7 = msg.what;
        if (i7 != 1) {
            if (i7 == 2) {
                Log.d("SessionLifecycleService", "Activity backgrounding at " + msg.getWhen());
                this.f673b = msg.getWhen();
                return;
            }
            if (i7 != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
                super.handleMessage(msg);
                return;
            }
            ArrayList arrayList = this.f674c;
            arrayList.add(msg.replyTo);
            Messenger messenger = msg.replyTo;
            kotlin.jvm.internal.l.d(messenger, "msg.replyTo");
            b(messenger);
            Log.d("SessionLifecycleService", "Client " + msg.replyTo + " bound at " + msg.getWhen() + ". Clients: " + arrayList.size());
            return;
        }
        Log.d("SessionLifecycleService", "Activity foregrounding at " + msg.getWhen() + '.');
        if (this.f672a) {
            long when = msg.getWhen() - this.f673b;
            E8.j jVar = (E8.j) ((C0045i) ((InterfaceC0054s) Y6.i.e().c(InterfaceC0054s.class))).f681h.get();
            C0849a c10 = jVar.f3784a.c();
            if (c10 != null) {
                int i10 = C0849a.f13994d;
                M3 = c10.f13995a;
                if (M3 > 0) {
                }
            }
            C0849a c11 = jVar.f3785b.c();
            if (c11 != null) {
                int i11 = C0849a.f13994d;
                M3 = c11.f13995a;
                if (M3 > 0) {
                }
            }
            int i12 = C0849a.f13994d;
            M3 = Tb.a.M(30, EnumC0851c.f14000e);
            if (when > (((((int) M3) & 1) != 1 || C0849a.f(M3)) ? C0849a.g(M3, EnumC0851c.f13998c) : M3 >> 1)) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                c();
            }
        } else {
            Log.d("SessionLifecycleService", "Cold start detected.");
            this.f672a = true;
            c();
        }
        this.f673b = msg.getWhen();
    }
}
