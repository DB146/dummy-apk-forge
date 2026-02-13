package E5;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Continuation, SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f3680b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d f3681c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f3682d = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3683a;

    public /* synthetic */ d(int i7) {
        this.f3683a = i7;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i7 = b.f3671h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? Tasks.forResult(bundle) : Tasks.forResult(null);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f3683a) {
            case 0:
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            default:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }
}
