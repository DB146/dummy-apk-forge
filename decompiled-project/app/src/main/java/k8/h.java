package k8;

import com.google.android.gms.tasks.TaskCompletionSource;
import l8.C1513b;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f19047a;

    public h(TaskCompletionSource taskCompletionSource) {
        this.f19047a = taskCompletionSource;
    }

    @Override // k8.j
    public final boolean a(C1513b c1513b) {
        int i7 = c1513b.f19601b;
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            return false;
        }
        this.f19047a.trySetResult(c1513b.f19600a);
        return true;
    }

    @Override // k8.j
    public final boolean b(Exception exc) {
        return false;
    }
}
