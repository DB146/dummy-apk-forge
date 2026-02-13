package Ca;

import A9.S2;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class d extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3097a;

    public d(i iVar) {
        this.f3097a = iVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        i iVar = this.f3097a;
        iVar.f3114b1.post(new S2(iVar, 9));
    }
}
