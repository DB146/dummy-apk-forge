package T5;

import android.app.PendingIntent;
import c2.q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class b extends zzq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9319a;

    public b(TaskCompletionSource taskCompletionSource) {
        this.f9319a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) {
        q.A(status, pendingIntent, this.f9319a);
    }
}
