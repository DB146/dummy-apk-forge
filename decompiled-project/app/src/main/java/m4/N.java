package m4;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import h7.C1257c;

/* loaded from: classes.dex */
public final class N implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public Uri f20112a;

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i7 = GenericIdpActivity.f15847P;
        Uri.Builder buildUpon = this.f20112a.buildUpon();
        if (task.isSuccessful()) {
            C1257c c1257c = (C1257c) task.getResult();
            Y6.k kVar = c1257c.f17833b;
            if (kVar != null) {
                Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(kVar)));
            }
            buildUpon.fragment("fac=" + c1257c.f17832a);
        } else {
            Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return buildUpon.build();
    }
}
