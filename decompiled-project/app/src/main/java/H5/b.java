package H5;

import F5.d;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C1003t;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import t8.C2034c;

/* loaded from: classes.dex */
public final class b extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final i f4893a = new i("ClientTelemetry.API", new A5.b(1), new Object());

    public final Task c(C1003t c1003t) {
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{zaf.zaa};
        builder.f15004b = false;
        builder.f15003a = new C2034c(c1003t, 18);
        return doBestEffortWrite(builder.a());
    }
}
