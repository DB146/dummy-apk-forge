package E5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3699b;

    public /* synthetic */ l(m mVar, int i7) {
        this.f3698a = i7;
        this.f3699b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3698a) {
            case 0:
                break;
            case 1:
                m mVar = this.f3699b;
                synchronized (mVar) {
                    if (mVar.f3700a == 1) {
                        mVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.f3699b.a("Service disconnected");
                return;
        }
        while (true) {
            m mVar2 = this.f3699b;
            synchronized (mVar2) {
                try {
                    if (mVar2.f3700a != 2) {
                        return;
                    }
                    if (mVar2.f3703d.isEmpty()) {
                        mVar2.c();
                        return;
                    }
                    n nVar = (n) mVar2.f3703d.poll();
                    mVar2.f3704e.put(nVar.f3706a, nVar);
                    ((ScheduledExecutorService) mVar2.f3705f.f3714c).schedule(new k(1, mVar2, nVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(nVar)));
                    }
                    o oVar = mVar2.f3705f;
                    Messenger messenger = mVar2.f3701b;
                    int i7 = nVar.f3708c;
                    Context context = (Context) oVar.f3713b;
                    Message obtain = Message.obtain();
                    obtain.what = i7;
                    obtain.arg1 = nVar.f3706a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", nVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", nVar.f3709d);
                    obtain.setData(bundle);
                    try {
                        q3.e eVar = mVar2.f3702c;
                        Messenger messenger2 = (Messenger) eVar.f23376b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) eVar.f23377c;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.f3685a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e2) {
                        mVar2.a(e2.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
