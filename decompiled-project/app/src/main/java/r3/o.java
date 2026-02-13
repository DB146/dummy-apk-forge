package r3;

import androidx.work.impl.WorkDatabase;
import h3.z;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final q3.i f23685a;

    /* renamed from: b, reason: collision with root package name */
    public final i3.d f23686b;

    /* renamed from: c, reason: collision with root package name */
    public final q3.q f23687c;

    static {
        z.g("WMFgUpdater");
    }

    public o(WorkDatabase workDatabase, i3.d dVar, q3.i iVar) {
        this.f23686b = dVar;
        this.f23685a = iVar;
        this.f23687c = workDatabase.C();
    }
}
