package E6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class h extends F6.d {

    /* renamed from: a, reason: collision with root package name */
    public final D9.a f3740a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f3741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f3742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f3743d;

    public h(i iVar, TaskCompletionSource taskCompletionSource, String str) {
        this.f3743d = iVar;
        D9.a aVar = new D9.a("OnRequestInstallCallback");
        this.f3742c = iVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f3740a = aVar;
        this.f3741b = taskCompletionSource;
    }
}
