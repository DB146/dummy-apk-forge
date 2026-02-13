package v7;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f25125b;

    public k(l lVar, long j) {
        this.f25125b = lVar;
        this.f25124a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f25124a);
        this.f25125b.k.j(bundle);
        return null;
    }
}
