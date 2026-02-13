package k8;

import com.google.android.gms.tasks.TaskCompletionSource;
import l8.C1513b;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f19045a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f19046b;

    public g(k kVar, TaskCompletionSource taskCompletionSource) {
        this.f19045a = kVar;
        this.f19046b = taskCompletionSource;
    }

    @Override // k8.j
    public final boolean a(C1513b c1513b) {
        if (c1513b.f19601b != 4 || this.f19045a.a(c1513b)) {
            return false;
        }
        String str = c1513b.f19602c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f19046b.setResult(new C1433a(c1513b.f19604e, c1513b.f19605f, str));
        return true;
    }

    @Override // k8.j
    public final boolean b(Exception exc) {
        this.f19046b.trySetException(exc);
        return true;
    }
}
