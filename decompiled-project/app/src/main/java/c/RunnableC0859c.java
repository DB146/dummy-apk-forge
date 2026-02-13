package c;

/* renamed from: c.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0859c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0867k f14021b;

    public /* synthetic */ RunnableC0859c(AbstractActivityC0867k abstractActivityC0867k, int i7) {
        this.f14020a = i7;
        this.f14021b = abstractActivityC0867k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14020a) {
            case 0:
                this.f14021b.invalidateOptionsMenu();
                return;
            default:
                try {
                    AbstractActivityC0867k.d(this.f14021b);
                    return;
                } catch (IllegalStateException e2) {
                    if (!kotlin.jvm.internal.l.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e10) {
                    if (!kotlin.jvm.internal.l.a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
        }
    }
}
