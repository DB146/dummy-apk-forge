package J7;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f5567a;

    @Override // J7.l
    public final void a(Map map) {
        boolean equals = ((String) map.get("s")).equals("ok");
        TaskCompletionSource taskCompletionSource = this.f5567a;
        if (equals) {
            taskCompletionSource.setResult(map.get("d"));
        } else {
            taskCompletionSource.setException(new Exception((String) map.get("d")));
        }
    }
}
