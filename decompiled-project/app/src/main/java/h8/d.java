package h8;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h3.H;
import j8.InterfaceC1387b;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final h7.h f17873a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17874b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1387b f17875c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f17876d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f17877e;

    public d(Context context, String str, Set set, InterfaceC1387b interfaceC1387b, Executor executor) {
        this.f17873a = new h7.h(1, context, str);
        this.f17876d = set;
        this.f17877e = executor;
        this.f17875c = interfaceC1387b;
        this.f17874b = context;
    }

    public final Task a() {
        if (!H.z(this.f17874b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f17877e, new c(this, 0));
    }

    public final void b() {
        if (this.f17876d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!H.z(this.f17874b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f17877e, new c(this, 1));
        }
    }
}
