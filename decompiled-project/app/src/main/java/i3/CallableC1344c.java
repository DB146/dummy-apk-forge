package i3;

import androidx.work.impl.WorkDatabase;
import ia.C1358d;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import q7.ScheduledExecutorServiceC1901e;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC1344c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18337a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18339c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18340d;

    public /* synthetic */ CallableC1344c(Object obj, Object obj2, Object obj3, int i7) {
        this.f18337a = i7;
        this.f18338b = obj;
        this.f18339c = obj2;
        this.f18340d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f18337a) {
            case 0:
                WorkDatabase workDatabase = ((d) this.f18338b).f18346e;
                q3.s D10 = workDatabase.D();
                String str = (String) this.f18340d;
                ((ArrayList) this.f18339c).addAll(D10.w(str));
                return workDatabase.C().h(str);
            default:
                ScheduledExecutorServiceC1901e scheduledExecutorServiceC1901e = (ScheduledExecutorServiceC1901e) this.f18338b;
                return scheduledExecutorServiceC1901e.f23532a.submit(new p5.j(5, (Callable) this.f18339c, (C1358d) this.f18340d));
        }
    }
}
