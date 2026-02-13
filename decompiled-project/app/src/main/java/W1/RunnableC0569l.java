package W1;

import android.util.Log;

/* renamed from: W1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0569l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f10500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0571n f10501c;

    public /* synthetic */ RunnableC0569l(o0 o0Var, C0571n c0571n, int i7) {
        this.f10499a = i7;
        this.f10500b = o0Var;
        this.f10501c = c0571n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10499a) {
            case 0:
                o0 operation = this.f10500b;
                kotlin.jvm.internal.l.e(operation, "$operation");
                C0571n this$0 = this.f10501c;
                kotlin.jvm.internal.l.e(this$0, "this$0");
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(this$0);
                return;
            default:
                o0 operation2 = this.f10500b;
                kotlin.jvm.internal.l.e(operation2, "$operation");
                C0571n this$02 = this.f10501c;
                kotlin.jvm.internal.l.e(this$02, "this$0");
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation2 + " has completed");
                }
                operation2.c(this$02);
                return;
        }
    }
}
